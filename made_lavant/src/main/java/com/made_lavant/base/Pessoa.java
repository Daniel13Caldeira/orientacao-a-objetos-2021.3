/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.base;

/**
 *
 * @author Daniel
 */
public class Pessoa {

    protected String nome;
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
}
