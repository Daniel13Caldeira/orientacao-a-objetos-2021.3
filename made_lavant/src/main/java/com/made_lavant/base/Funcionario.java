/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.base;

import com.made_lavant.dados.FuncionarioDados;

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

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(String bairro, String cep, String cidade, String numero, String rua, String uf) {
        this.endereco.setBairro(bairro);
        this.endereco.setCep(cep);
        this.endereco.setCidade(cidade);
        this.endereco.setNumero(numero);
        this.endereco.setRua(rua);
        this.endereco.setUf(uf);
        FuncionarioDados altera = new FuncionarioDados();
        //altera.alterar(this);
    }

    public String getCod() {
        return cod;
    }

    public void remove() {

    }
}
