package com.made_lavant.base;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public abstract class Pessoa {

    //Nome e senha da pessoa
    protected String nome, senha;
    //Endereço da pessoa
    protected Endereco endereco;

    //Retorna o nome da pessoa
    public abstract String getNome();

    //Retorna a senha da pessoa
    public abstract String getSenha();

    //Retorna o endereço da pessoa
    public abstract Endereco getEndereco();

    //Constroi uma pessoa sem endereço cadastrado
    public Pessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Constroi uma pessoa com endereço cadastrado
    public Pessoa(String nome, Endereco endereco, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
    }
}
