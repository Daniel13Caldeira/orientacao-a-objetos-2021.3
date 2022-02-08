package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaProntaEntrega implements Venda {

    String funcionario;
    int carrinho;
    Date data;

    public VendaProntaEntrega(String funcionario, int carrinho) {
        this.funcionario = funcionario;
        this.carrinho = carrinho;
        this.data = new Date();
    }

    @Override
    public void efetuaVenda(String cpfCliente) {
        CarrinhoDados limpa = new CarrinhoDados();
        ClienteDados cliente = new ClienteDados();
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nAguarde o cliente " + cliente.buscarNome(cpfCliente)
                + " vir buscar seus produtos", "VENDA", JOptionPane.INFORMATION_MESSAGE);
        limpa.limparCarrinhoConfirmar(cpfCliente);
    }

    @Override
    public void cancelaVenda(String cpfCliente) {
        ClienteDados cliente = new ClienteDados();
        CarrinhoDados limpa = new CarrinhoDados();
        limpa.limparCarrinhoCancelar(cpfCliente);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nLista de produtos do carrinho do cliente "
                + cliente.buscarNome(cpfCliente) + " pode ser desfeita!", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
