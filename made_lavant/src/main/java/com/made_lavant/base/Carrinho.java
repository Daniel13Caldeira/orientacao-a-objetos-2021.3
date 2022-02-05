/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.Codigos;
import java.util.ArrayList;

/**
 *
 * @author matheusreis
 */
public class Carrinho {

    protected Cliente cliente;
    protected ArrayList<Produto> produtos = new ArrayList<>();
    protected double preco;

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        //altera o código do próximo funcionário a ser criado
        CarrinhoDados add = new CarrinhoDados();
        //adicona o funcionário ao arquivo onde ficará salvo
        add.criar(this);
    }

    public void adicionarProduto(int produto, double quantidade) {
        CarrinhoDados add = new CarrinhoDados();
        add.adicionarProduto(this.cliente.getCPF(), produto, quantidade);
    }

    public void removerProduto(int produto) {
        CarrinhoDados remove = new CarrinhoDados();
        remove.removerProduto(this.cliente.getCPF(), produto);
    }

    public ArrayList<Produto> getProdutos() {
        CarrinhoDados busca = new CarrinhoDados();
        this.produtos = busca.getProdutos(this.cliente.getCPF());
        return this.produtos;
    }

    public void enviar() {

    }

    public void excluir() {

    }

    public double calcularPreco() {
        double total = 0;
        //codigo
        return total;
    }

}
