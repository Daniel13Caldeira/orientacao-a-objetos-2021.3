/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.base;

import com.made_lavant.dados.ClienteDados;

/**
 *
 * @author Daniel
 */
public class Cliente extends Pessoa {

    public String CPF;

    public Cliente(String nome, Endereco endereco, String CPF) {
        super(nome, endereco);
        this.CPF = CPF;
        ClienteDados add = new ClienteDados();
        add.adicionar(this);

    }

    public Cliente(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
        ClienteDados add = new ClienteDados();
        add.adicionarSemEndereco(this);
    }

    public void remove() {
        ClienteDados remove = new ClienteDados();
        remove.remover(this);
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
        ClienteDados altera = new ClienteDados();
        altera.alterar(this);
    }

    public String getCPF() {
        return CPF;
    }

    public static boolean verificaCPF(String CPF) {
        int j = 10, soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        if (soma != Integer.parseInt(CPF.charAt(9) + "")) {
            return true;
        }
        j = 11;
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        if (soma != Integer.parseInt(CPF.charAt(10) + "")) {
            return true;
        }
        return true;
    }
}
