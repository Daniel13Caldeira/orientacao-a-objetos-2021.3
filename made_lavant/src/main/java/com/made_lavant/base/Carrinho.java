package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;

public class Carrinho {

    //Cliente ao qual pertence o carrinho
    protected Cliente cliente;
    //Produtos que estão no carrinho
    protected ArrayList<Produto> produtos;

    //Retorna o cliente ao qual pertence o carrinho
    public Cliente getCliente() {
        return cliente;
    }

    //Constroi um carrinho para adicionar no CRUD de carrinhos
    public Carrinho(Cliente cliente, ArrayList<Produto> produtos) {
        this.cliente = cliente;
    }

    //Controi um carrinho
    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        CarrinhoDados.criar(cliente.getCpf());
    }

}
