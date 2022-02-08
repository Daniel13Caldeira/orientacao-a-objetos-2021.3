package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.ProdutoDados;

public class Produto {

    protected String nome;
    protected int codigo;
    protected double preco;
    protected String validade;
    protected double quantidade;

    public String getNome() {
        return this.nome;
    }

    public Produto(String nome, int codigo, double preco, String validade, double quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getValidade() {
        return this.validade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    //cria um produto com validade
    public Produto(String nome, double preco, String validade, double quantidade) {
        this.nome = nome;
        this.validade = validade;
        this.codigo = Codigos.buscaProduto();
        //muda o código do próximo produto cadastrado
        Codigos.alterarPrduto();
        this.preco = preco;
        this.quantidade = quantidade;
        ProdutoDados.adicionar(this);
    }

    //cria um produto sem validade
    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.codigo = Codigos.buscaProduto();
        //muda o código do próximo produto cadastrado
        Codigos.alterarPrduto();
        this.preco = preco;
        this.quantidade = quantidade;
        ProdutoDados.adicionar(this);
    }

    public Produto(int cod, double preco, double quantidade) {
        this.codigo = cod;
        this.nome = ProdutoDados.buscarNome(cod);
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
