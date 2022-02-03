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

    //cria um cliente com endereço
    public Cliente(String nome, Endereco endereco, String CPF, String senha) {
        super(nome, endereco, senha);
        this.CPF = CPF;
        ClienteDados add = new ClienteDados();
        //adiciona ao arquivo onde é feita a armazenagem dos dados
        add.adicionar(this);

    }

    //cria cliente sem endereço
    public Cliente(String nome, String CPF, String senha) {
        super(nome, senha);
        this.CPF = CPF;
        ClienteDados add = new ClienteDados();
        //adiciona ao arquivo onde é feita a armazenagem dos dados
        add.adicionarSemEndereco(this);
    }

    public Cliente(String cpf, String nome, Endereco endereco, String senha) {
        super(nome, endereco, senha);
        this.CPF = cpf;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return CPF;
    }

    //verifica se o CPF do cliente é válido
    public static boolean verificaCPF(String CPF) {
        int j = 10, soma = 0;
        //soma os 9 primeiros dígitos do CPF com seus pesos respectivos
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        //se o valor da expressão 11 - (soma % 11) for maior do que 9, o 10° dígito é 0
        if (soma > 9) {
            soma = 0;
        }
        //se o valor da expressão 11 - (soma % 11) for menor ou igual a 9, o 10° dígito é o resultado da expressão
        //se o 10° dígito for diferente do obtido pela expressão, o CPF é inválido
        if (soma != Integer.parseInt(CPF.charAt(9) + "")) {
            return false;
        }
        j = 11;
        soma = 0;
        //soma os 10 primeiros dígitos do CPF com seus pesos respectivos
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        //se o valor da expressão 11 - (soma % 11) for maior do que 9, o 11° dígito é 0
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        //se o valor da expressão 11 - (soma % 11) for menor ou igual a 9, o 11° dígito é o resultado da expressão
        //se o 11° dígito for diferente do obtido pela expressão, o CPF é inválido, se não, ele é válido
        if (soma != Integer.parseInt(CPF.charAt(10) + "")) {
            return false;
        }
        return true;
    }

    @Override
    public String getNome() {
        ClienteDados cliente = new ClienteDados();
        return cliente.buscarNome(this.CPF);
    }

    @Override
    public String getSenha() {
        ClienteDados cliente = new ClienteDados();
        return cliente.buscarSenha(this.CPF);
    }
}
