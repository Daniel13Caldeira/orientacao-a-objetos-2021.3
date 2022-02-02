/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.base;

import java.util.Date;

/**
 *
 * @author danie
 */
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

    @Override
    public void cancelaVenda() {

    }

}
