package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaProntaEntrega implements Venda {

    //Atributos da venda
    private String carrinho;
    private Date data;

    //Construtor da venda
    public VendaProntaEntrega(String carrinho) {
        this.carrinho = carrinho;
        this.data = new Date();
    }

    //Efetua uma venda delivery
    @Override
    public void efetuaVenda() {
        //Abre um JOptionPane para exibir a mensagem para o funcionário
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nAguarde o cliente " + ClienteDados.buscarNome(this.carrinho)
                + " vir buscar seus produtos", "VENDA", JOptionPane.INFORMATION_MESSAGE);
        //Limpa o carrinho
        CarrinhoDados.limparCarrinhoConfirmar(this.carrinho);
    }

    //Cancela a venda
    @Override
    public void cancelaVenda() {
        //limpa o carrinho retornando os produtos para o comércio
        CarrinhoDados.limparCarrinhoCancelar(this.carrinho);
        //Abre um JOptionPane para exibir a mensagem para o funcionário
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nLista de produtos do carrinho do cliente "
                + ClienteDados.buscarNome(this.carrinho) + " pode ser desfeita!", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
