package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.Date;
import javax.swing.JOptionPane;

public class VendaProntaEntrega implements Venda {

    String carrinho;
    Date data;

    public VendaProntaEntrega( String carrinho) {
        this.carrinho = carrinho;
        this.data = new Date();
    }

    @Override
    public void efetuaVenda() {
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nAguarde o cliente " + ClienteDados.buscarNome(this.carrinho)
                + " vir buscar seus produtos", "VENDA", JOptionPane.INFORMATION_MESSAGE);
        CarrinhoDados.limparCarrinhoConfirmar(this.carrinho);
    }

    @Override
    public void cancelaVenda() {
        CarrinhoDados.limparCarrinhoCancelar(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nLista de produtos do carrinho do cliente "
                + ClienteDados.buscarNome(this.carrinho) + " pode ser desfeita!", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
