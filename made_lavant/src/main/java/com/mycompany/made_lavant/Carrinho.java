/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.made_lavant;

import java.util.ArrayList;

/**
 *
 * @author matheusreis
 */
public class Carrinho {

    protected Cliente cliente;
    protected ArrayList<Produto> produtos = new ArrayList<>();
    protected double preco;
    private static int codAtual=1;
    protected int cod;

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        cod=codAtual;
        codAtual++;
    }

    public int getCod() {
        return cod;
    }

    public void adicionarProduto(String cod) {

    }

    public void removerProduto(String cod) {

    }

    public void listarProduto() {

    }

    public void enviar() {

    }

    public void excluir() {

    }

    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < this.produtos.size(); i++) {
            total += this.produtos.get(i).getPreco();
        }
        return total;
    }

}
