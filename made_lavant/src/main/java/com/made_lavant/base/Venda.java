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
public class Venda {

    protected Date data;
    protected Funcionario funcionario;
    protected Carrinho carrinho;

    public Venda(Funcionario funcionario, Carrinho carrinho /*int codCarrinho*/) {
        this.data = new Date();
        this.funcionario = funcionario;
        this.carrinho = carrinho;
    }

    public void efetuaVenda() {

    }

    public void cancelaVenda() {

    }
}