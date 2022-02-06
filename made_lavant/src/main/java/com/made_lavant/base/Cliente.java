
package com.made_lavant.base;

import com.made_lavant.dados.ClienteDados;


public class Cliente extends Pessoa {

    public String cpf;

    //cria um cliente com endereço
    public Cliente(String nome, Endereco endereco, String cpf, String senha) {
        super(nome, endereco, senha);
        System.out.println(nome + " " + senha);
        this.cpf = cpf;
        ClienteDados add = new ClienteDados();
        //adiciona ao arquivo onde é feita a armazenagem dos dados
        add.adicionar(this);

    }

    //cria cliente sem endereço
    public Cliente(String nome, String cpf, String senha) {
        super(nome, senha);
        this.cpf = cpf;
        ClienteDados add = new ClienteDados();
        //adiciona ao arquivo onde é feita a armazenagem dos dados
        add.adicionarSemEndereco(this);
    }

    public Cliente(String cpf, String nome, Endereco endereco, String senha) {
        //Construtor que auxilia na edição com ordem de parametros diferente dos construtores de cadastro
        super(nome, endereco, senha);
        this.cpf = cpf;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

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

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }
}
