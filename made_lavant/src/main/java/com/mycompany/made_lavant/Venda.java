/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.made_lavant;

import java.util.Date;

/**
 *
 * @author ewe88
 */
public class Venda {
    
    protected Date data;
    protected Funcionario funcionario;
    //protected Carrinho carrinho;

    public Venda(Date data, Funcionario funcionario) {
        this.data = data;
        this.funcionario = funcionario;
        //this.carrinho = carrinho;
    }
    
    public void efetuaVenda(){
        
        
    }
    
    public void cancelaVenda(){
        
        
    }
}
