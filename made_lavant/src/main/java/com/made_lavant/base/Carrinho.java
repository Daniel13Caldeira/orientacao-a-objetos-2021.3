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
    protected ArrayList<String> produtos = new ArrayList<>();
    protected double preco;
    protected int cod;

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        Codigos codigos = new Codigos();
        this.cod = codigos.buscaCarrinho();
        //altera o código do próximo funcionário a ser criado
        codigos.alterarCarrinho();
        CarrinhoDados add = new CarrinhoDados();
        //adicona o funcionário ao arquivo onde ficará salvo
        add.criar(this);
    }

    public int getCod() {
        return cod;
    }

    public void adicionarProduto(int produto, double quantidade) {
        CarrinhoDados add = new CarrinhoDados();
        add.adicionarProduto(this.cod, produto, quantidade);
    }

    public void removerProduto(int produto) {
        CarrinhoDados remove = new CarrinhoDados();
        remove.removerProduto(this.cod, produto);
    }

    public ArrayList<String> getProdutos() {
        CarrinhoDados busca = new CarrinhoDados();
        this.produtos = busca.getProdutos(this.cod);
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
