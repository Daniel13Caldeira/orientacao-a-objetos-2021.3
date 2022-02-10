package com.made_lavant.base;

import com.made_lavant.dados.ClienteDados;

public class Cliente extends Pessoa {

    //CPF do cliente
    public String cpf;

    //Constroi um cliente com endereço
    public Cliente(String nome, Endereco endereco, String cpf, String senha) {
        //construtor da classe Pessoa
        super(nome, endereco, senha);
        this.cpf = cpf;
        //Cria um cliente
        ClienteDados.adicionar(this);
    }

    //Constroi cliente sem endereço
    public Cliente(String nome, String cpf, String senha) {
        //construtor da classe Pessoa
        super(nome, senha);
        this.cpf = cpf;
        //Cria um cliente
        ClienteDados.adicionarSemEndereco(this);
    }

    //Constroi um cliente. Este construtor auxilia na edição com ordem de parametros diferente dos construtores de cadastro
    public Cliente(String cpf, String nome, Endereco endereco, String senha) {
        super(nome, endereco, senha);
        this.cpf = cpf;
    }

    //Retorna o endereço do cliente
    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    //Retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    //verifica se o cpf do cliente é válido
    public static boolean verificaCpf(String cpf) {
        int j = 10, soma = 0;
        //soma os 9 primeiros dígitos do cpf com seus pesos respectivos
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        //se o valor da expressão 11 - (soma % 11) for maior do que 9, o 10° dígito é 0
        if (soma > 9) {
            soma = 0;
        }
        //se o valor da expressão 11 - (soma % 11) for menor ou igual a 9, o 10° dígito é o resultado da expressão
        //se o 10° dígito for diferente do obtido pela expressão, o cpf é inválido
        if (soma != Integer.parseInt(cpf.charAt(9) + "")) {
            return false;
        }
        j = 11;
        soma = 0;
        //soma os 10 primeiros dígitos do cpf com seus pesos respectivos
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(cpf.charAt(i) + "") * j;
            j--;
        }
        //se o valor da expressão 11 - (soma % 11) for maior do que 9, o 11° dígito é 0
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        //se o valor da expressão 11 - (soma % 11) for menor ou igual a 9, o 11° dígito é o resultado da expressão
        //se o 11° dígito for diferente do obtido pela expressão, o cpf é inválido, se não, ele é válido
        if (soma != Integer.parseInt(cpf.charAt(10) + "")) {
            return false;
        }
        return true;
    }

    //Retorna o nome do cliente
    @Override
    public String getNome() {
        return this.nome;
    }

    //Retorna a senha do cliente
    @Override
    public String getSenha() {
        return this.senha;
    }
}
