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
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String bairro,String cep, String cidade, int numero, String rua, String uf) {
        this.endereco.setBairro(bairro);
        this.endereco.setCep(cep);
        this.endereco.setCidade(cidade);
        this.endereco.setNumero(numero);
        this.endereco.setRua(rua);
        this.endereco.setUf(uf);
    }

}
