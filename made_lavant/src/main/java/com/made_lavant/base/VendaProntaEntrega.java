
package com.made_lavant.base;

import java.util.Date;

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
    public void efetuaVenda() {

    }

    @Override
    public void cancelaVenda() {

    }
}
