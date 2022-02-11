package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaDelivery implements Venda {
    //Atributos da venda
    private String carrinho;
    private Date data;

    //Construtor da venda
    public VendaDelivery( String carrinho) {
        this.carrinho = carrinho;
        this.data = new Date();
    }
    //Efetua uma venda delivery
    @Override
    public void efetuaVenda() {
        //Endereço que será exibido na mensagem que será exibida para o funcionário
        String endereco = "Cidade: " + ClienteDados.buscarCidade(this.carrinho) + "\nRua: " + ClienteDados.buscarRua(this.carrinho)
                + "\nBairro: " + ClienteDados.buscarBairro(this.carrinho) + "\nNúmero: " + ClienteDados.buscarNumero(this.carrinho) + "\nCEP: "
                + ClienteDados.buscarCEP(this.carrinho) + "\nUF:" + ClienteDados.buscarUF(this.carrinho);
        //Abre um JOptionPane para exibir a mensagem para o funcionário
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nA entrega do cliente " + ClienteDados.buscarNome(this.carrinho) + " deve ser realizada no seguinte Endereço:\n"
                + endereco, "VENDA", JOptionPane.INFORMATION_MESSAGE);
        //Limpa o carrinho
        CarrinhoDados.limparCarrinhoConfirmar(this.carrinho);
    }

    //Cancela a venda
    @Override
    public void cancelaVenda() {
        //limpa o carrinho retornando os produtos para o comércio
        CarrinhoDados.limparCarrinhoCancelar(this.carrinho);
        //Abre um JOptionPane para exibir a mensagem para o funcionário
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nCarrinho do cliente "
                + ClienteDados.buscarNome(this.carrinho) + " foi limpo com sucesso.", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
