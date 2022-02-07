
package com.made_lavant.base;

import java.util.Date;


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
    public void efetuaVenda() {

    }


}
