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
        String msg = "Cidade: " + ClienteDados.buscarCidade(this.carrinho) + "\nRua: " + ClienteDados.buscarRua(this.carrinho)
                + "\nBairro: " + ClienteDados.buscarBairro(this.carrinho) + "\nNúmero: " + ClienteDados.buscarNumero(this.carrinho) + "\nCEP: "
                + ClienteDados.buscarCEP(this.carrinho) + "\nUF:" + ClienteDados.buscarUF(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nA entrega do cliente " + ClienteDados.buscarNome(this.carrinho) + " deve ser realizada no seguinte Endereço:\n"
                + msg, "VENDA", JOptionPane.INFORMATION_MESSAGE);
        CarrinhoDados.limparCarrinhoConfirmar(this.carrinho);
    }

    @Override
    public void cancelaVenda() {
        CarrinhoDados limpa = new CarrinhoDados();
        CarrinhoDados.limparCarrinhoCancelar(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nCarrinho do cliente "
                + ClienteDados.buscarNome(this.carrinho) + " foi limpo com sucesso.", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
