package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.FuncionarioDados;

public class Funcionario extends Pessoa {

    protected String cod;

    //cria um funcionário com endereço
    public Funcionario(String nome, Endereco endereco, String senha, String identificador) {
        super(nome, endereco, senha);
        if (identificador.equals("A")) {
            //cria gerente
            this.cod = "A" + Codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.cod = "B" + Codigos.buscaFuncionario();
        }
        //altera o código do próximo funcionário a ser criado
        Codigos.alterarFuncionario();
        FuncionarioDados.adicionar(this);
    }

    //cria funcionário sem endereço
    public Funcionario(String nome, String senha, String identificador) {
        super(nome, senha);
        if (identificador.equals("A")) {
            //cria gerente
            this.cod = "A" + Codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.cod = "B" + Codigos.buscaFuncionario();
        }
        //altera o código do próximo funcionário a ser criado
        Codigos.alterarFuncionario();
        FuncionarioDados.adicionarSemEndereco(this);
    }

    public Funcionario(String cod, String nome, Endereco endereco, String senha) {
        //Construtor que auxilia na edição com ordem de parametros diferente dos construtores de cadastro
        super(nome, endereco, senha);
        this.cod = cod;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    public String getCod() {
        return cod;
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
