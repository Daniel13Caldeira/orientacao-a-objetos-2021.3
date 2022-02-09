package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;

public class Carrinho {

    protected Cliente cliente;
    protected ArrayList<Produto> produtos;

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho(Cliente cliente,ArrayList<Produto> produtos) {
        this.cliente = cliente;
        //altera o código do próximo funcionário a ser criado
        CarrinhoDados.criar(cliente.getCpf());
    }

    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        //altera o código do próximo funcionário a ser criado
        CarrinhoDados.criar(cliente.getCpf());
    }

}
