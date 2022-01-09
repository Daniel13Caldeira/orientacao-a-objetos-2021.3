package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.ProdutoDados;
import java.util.Date;

public class Produto {

    protected String nome;
    protected int codigo;
    protected double preco;
    protected Date validade;
    protected double quantidade;

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        ProdutoDados altera = new ProdutoDados();
        altera.alterar(this);
    }

    public Date getValidade() {
        return validade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
        ProdutoDados altera = new ProdutoDados();
        altera.alterar(this);
    }

    public Produto(String nome, double preco, Date validade, double quantidade) {
        Codigos codigos = new Codigos();
        this.nome = nome;
        this.codigo = codigos.buscaProduto();
        codigos.alterarPrduto();
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
        ProdutoDados add = new ProdutoDados();
        add.adicionar(this);
    }

    public Produto(String nome, double preco, double quantidade) {
        Codigos codigos = new Codigos();
        this.nome = nome;
        this.codigo = codigos.buscaProduto();
        codigos.alterarPrduto();
        this.preco = preco;
        this.quantidade = quantidade;
        ProdutoDados add = new ProdutoDados();
        add.adicionar(this);
    }

    public void remove() {
        ProdutoDados remove = new ProdutoDados();
        remove.remover(this);
    }

}
