package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaDelivery implements Venda {

    String carrinho;
    Date data;

    public VendaDelivery( String carrinho) {
        this.carrinho = carrinho;
        this.data = new Date();
    }

    @Override
    public void efetuaVenda() {
        CarrinhoDados limpa = new CarrinhoDados();
        ClienteDados cliente = new ClienteDados();
        String msg = "Cidade: " + cliente.buscarCidade(this.carrinho) + "\nRua: " + cliente.buscarRua(this.carrinho)
                + "\nBairro: " + cliente.buscarBairro(this.carrinho) + "\nNúmero: " + cliente.buscarNumero(this.carrinho) + "\nCEP: "
                + cliente.buscarCEP(this.carrinho) + "\nUF:" + cliente.buscarUF(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nA entrega do cliente " + cliente.buscarNome(this.carrinho) + " deve ser realizada no seguinte Endereço:\n"
                + msg, "VENDA", JOptionPane.INFORMATION_MESSAGE);
        limpa.limparCarrinhoConfirmar(this.carrinho);
    }

    @Override
    public void cancelaVenda() {
        ClienteDados cliente = new ClienteDados();
        CarrinhoDados limpa = new CarrinhoDados();
        limpa.limparCarrinhoCancelar(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nCarrinho do cliente "
                + cliente.buscarNome(this.carrinho) + " foi limpo com sucesso.", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
