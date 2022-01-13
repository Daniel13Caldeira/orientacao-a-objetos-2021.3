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

    //muda o preço do produto
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

    //muda a quantidade do produto
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
        ProdutoDados altera = new ProdutoDados();
        altera.alterar(this);
    }

    //cria um produto com validade
    public Produto(String nome, double preco, Date validade, double quantidade) {
        Codigos codigos = new Codigos();
        this.nome = nome;
        this.codigo = codigos.buscaProduto();
        //muda o código do próximo produto cadastrado
        codigos.alterarPrduto();
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
        ProdutoDados add = new ProdutoDados();
        //adiciona um produto ao arquivo onde ficará salvo
        add.adicionar(this);
    }

    //cria um produto sem validade
    public Produto(String nome, double preco, double quantidade) {
        Codigos codigos = new Codigos();
        this.nome = nome;
        this.codigo = codigos.buscaProduto();
        //muda o código do próximo produto cadastrado
        codigos.alterarPrduto();
        this.preco = preco;
        this.quantidade = quantidade;
        ProdutoDados add = new ProdutoDados();
        //adiciona um produto ao arquivo onde ficará salvo
        add.adicionar(this);
    }

    //apaga um produto
    public void remove() {
        ProdutoDados remove = new ProdutoDados();
        remove.remover(this);
    }

}
