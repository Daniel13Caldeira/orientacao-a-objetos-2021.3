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
public abstract class Pessoa {

    protected String nome, senha;
    protected Endereco endereco;

    public abstract String getNome();

    public abstract String getSenha();

    public abstract Endereco getEndereco();

    public Pessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Pessoa(String nome, Endereco endereco, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }
}
