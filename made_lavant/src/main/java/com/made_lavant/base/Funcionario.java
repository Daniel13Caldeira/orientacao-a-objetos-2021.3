package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.FuncionarioDados;

public class Funcionario extends Pessoa {

    protected String cod;

    //cria um funcionário com endereço
    public Funcionario(String nome, Endereco endereco, String senha, String identificador) {
        //Construtor da classe Pessoa com endereço
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
        //Construtor da classe Pessoa sem endereço
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
    
    //Construtor que auxilia na edição com ordem de parametros diferente dos construtores de cadastro
    public Funcionario(String cod, String nome, Endereco endereco, String senha) {
        super(nome, endereco, senha);
        this.cod = cod;
    }

    //Retorna o endereço do funcionário
    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    //Retorna o código do funcionário
    public String getCod() {
        return cod;
    }

    //Retorna o nome do funcionário
    @Override
    public String getNome() {
        return this.nome;
    }

    //Retorna a senha do funcionário
    @Override
    public String getSenha() {
        return this.senha;
    }
}
