/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.base;

import java.util.Date;

/**
 *
 * @author ewe88
 */
public abstract class Venda {

    protected Date data;
    protected Funcionario funcionario;
    protected int carrinho;

    public Venda(Funcionario funcionario, int carrinho) {
        this.data = new Date();
        this.funcionario = funcionario;
        this.carrinho = carrinho;
    }

    public abstract void efetuaVenda();

    public abstract void cancelaVenda();
}
