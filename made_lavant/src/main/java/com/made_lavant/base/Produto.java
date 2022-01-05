
package com.made_lavant.base;

import java.util.Date;

public class Produto {
    
    protected String nome;
    protected int codigo;
    private static int codAtual=1; 
    protected double preco;
    protected Date validade;
    protected double quantidade;

    protected String getNome() {
        return nome;
    }

    protected int getCodigo() {
        return codigo;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected Date getValidade() {
        return validade;
    }

    protected double getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, Date validade, double quantidade) {
        this.nome = nome;
        this.codigo = codAtual;
        codAtual++;
        this.preco = preco;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.codigo = codAtual;
        codAtual++;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void remove(){
        
    }
    
    
    
}
