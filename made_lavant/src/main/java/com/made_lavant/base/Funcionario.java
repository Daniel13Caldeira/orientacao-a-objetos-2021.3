/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.FuncionarioDados;

/**
 *
 * @author Daniel
 */
public class Funcionario extends Pessoa {

    protected String cod;

    //cria um funcionário com endereço
    public Funcionario(String nome, Endereco endereco, String senha, String identificador) {
        super(nome, endereco, senha);
        Codigos codigos = new Codigos();
        if (identificador.equals("A")) {
            //cria gerente
            this.cod = "A" + codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.cod = "B" + codigos.buscaFuncionario();
        }
        //altera o código do próximo funcionário a ser criado
        codigos.alterarFuncionario();
        FuncionarioDados add = new FuncionarioDados();
        //adicona o funcionário ao arquivo onde ficará salvo
        add.adicionar(this);
    }

    //cria funcionário sem endereço
    public Funcionario(String nome, String senha, String identificador) {
        super(nome, senha);
        Codigos codigos = new Codigos();
        if (identificador.equals("A")) {
            //cria gerente
            this.cod = "A" + codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.cod = "B" + codigos.buscaFuncionario();
        }
        //altera o código do próximo funcionário a ser criado
        codigos.alterarFuncionario();
        FuncionarioDados add = new FuncionarioDados();
        //adicona o funcionário ao arquivo onde ficará salvo
        add.adicionarSemEndereco(this);
    }

    public Funcionario(String cod, String nome, Endereco endereco, String senha) {
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
        FuncionarioDados funcionario = new FuncionarioDados();
        return funcionario.buscarNome(this.cod);
    }

    @Override
    public String getSenha() {
        FuncionarioDados funcionario = new FuncionarioDados();
        return funcionario.buscarSenha(this.cod);
    }
}
