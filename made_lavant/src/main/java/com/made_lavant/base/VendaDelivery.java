package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaDelivery implements Venda {

    String funcionario;
    int carrinho;
    Date data;

    public VendaDelivery(String funcionario, int carrinho) {
        this.funcionario = funcionario;
        this.carrinho = carrinho;
        this.data = new Date();
    }

    @Override
    public void efetuaVenda(String cpfCliente) {
        CarrinhoDados limpa = new CarrinhoDados();
        ClienteDados cliente = new ClienteDados();
        String msg = "Cidade: " + cliente.buscarCidade(cpfCliente) + "\nRua: " + cliente.buscarRua(cpfCliente)
                + "\nBairro: " + cliente.buscarBairro(cpfCliente) + "\nNúmero: " + cliente.buscarNumero(cpfCliente) + "\nCEP: "
                + cliente.buscarCEP(cpfCliente) + "\nUF:" + cliente.buscarUF(cpfCliente);
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nA entrega do cliente " + cliente.buscarNome(cpfCliente) + " deve ser realizada no seguinte Endereço:\n"
                + msg, "VENDA", JOptionPane.INFORMATION_MESSAGE);
        limpa.limparCarrinhoConfirmar(cpfCliente);
    }

    @Override
    public void cancelaVenda(String cpfCliente) {
        ClienteDados cliente = new ClienteDados();
        CarrinhoDados limpa = new CarrinhoDados();
        limpa.limparCarrinhoCancelar(cpfCliente);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nCarrinho do cliente "
                + cliente.buscarNome(cpfCliente) + " foi limpo com sucesso.", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
