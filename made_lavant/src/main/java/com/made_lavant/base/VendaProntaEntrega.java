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
        CarrinhoDados limpa = new CarrinhoDados();
        ClienteDados cliente = new ClienteDados();
        JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso!\nAguarde o cliente " + cliente.buscarNome(this.carrinho)
                + " vir buscar seus produtos", "VENDA", JOptionPane.INFORMATION_MESSAGE);
        limpa.limparCarrinhoConfirmar(this.carrinho);
    }

    @Override
    public void cancelaVenda() {
        ClienteDados cliente = new ClienteDados();
        CarrinhoDados limpa = new CarrinhoDados();
        limpa.limparCarrinhoCancelar(this.carrinho);
        JOptionPane.showMessageDialog(null, "Venda Cancelada!\nLista de produtos do carrinho do cliente "
                + cliente.buscarNome(this.carrinho) + " pode ser desfeita!", "VENDA", JOptionPane.INFORMATION_MESSAGE);

    }
}
