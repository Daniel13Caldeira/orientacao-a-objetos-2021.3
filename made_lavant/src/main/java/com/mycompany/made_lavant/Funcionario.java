/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.made_lavant;

/**
 *
 * @author Daniel
 */
public class Funcionario extends Pessoa {

    protected String cod;

    public Funcionario(String nome, Endereco endereco, String cod) {
        super(nome, endereco);
        this.cod = cod;
    }

    public Funcionario(String nome, String cod) {
        super(nome);
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }
}
