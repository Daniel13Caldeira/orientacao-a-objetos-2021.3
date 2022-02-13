package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.FuncionarioDados;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class Funcionario extends Pessoa {

    private String codigo;

    //cria um funcionário com endereço
    public Funcionario(String nome, Endereco endereco, String senha, String identificador) {
        //Construtor da classe Pessoa com endereço
        super(nome, endereco, senha);
        if (identificador.equals("A")) {
            //cria gerente
            this.codigo = "A" + Codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.codigo = "B" + Codigos.buscaFuncionario();
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
            this.codigo = "A" + Codigos.buscaFuncionario();
        } else {
            //cria funcionário
            this.codigo = "B" + Codigos.buscaFuncionario();
        }
        //altera o código do próximo funcionário a ser criado
        Codigos.alterarFuncionario();
        FuncionarioDados.adicionarSemEndereco(this);
    }

    //Construtor que auxilia na edição com ordem de parametros diferente dos construtores de cadastro
    public Funcionario(String codigo, String nome, Endereco endereco, String senha) {
        super(nome, endereco, senha);
        this.codigo = codigo;
    }

    //Retorna o endereço do funcionário
    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    //Retorna o código do funcionário
    public String getCodigo() {
        return codigo;
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
