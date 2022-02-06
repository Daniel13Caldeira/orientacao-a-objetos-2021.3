
package com.made_lavant.base;


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
