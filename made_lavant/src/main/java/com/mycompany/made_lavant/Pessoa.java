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
public class Pessoa {

    protected String nome;
    protected Endereço endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Endereço endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

}
