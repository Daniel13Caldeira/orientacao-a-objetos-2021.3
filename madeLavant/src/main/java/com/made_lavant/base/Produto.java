package com.made_lavant.base;

import com.made_lavant.dados.Codigos;
import com.made_lavant.dados.ProdutoDados;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class Produto {

    //Atributos do produto
    private String nome;
    private int codigo;
    private double preco;
    private String validade;
    private double quantidade;

    //Retorna o nome do produto
    public String getNome() {
        return this.nome;
    }

    //Retorna o código do produto
    public int getCodigo() {
        return codigo;
    }

    //Retorna o preço do produto
    public double getPreco() {
        return this.preco;
    }

    //Retorna a validade do produto
    public String getValidade() {
        return this.validade;
    }

    //Retorna a quantidade de produtos
    public double getQuantidade() {
        return this.quantidade;
    }

    //Construtor que auxilia na edição com validade com ordem de parametros diferente dos construtores de cadastro
    public Produto(String nome, int codigo, double preco, String validade, double quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
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

    //Construtor que auxilia na edição sem validade com ordem de parametros diferente dos construtores de cadastro
    public Produto(int codigo, double preco, double quantidade) {
        this.codigo = codigo;
        this.nome = ProdutoDados.buscarNome(codigo);
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
