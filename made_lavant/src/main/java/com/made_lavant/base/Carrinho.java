package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;

public class Carrinho {

    //Cliente ao qual pertence o carrinho
    private Cliente cliente;
    private String codigo;


    //Constroi um carrinho para adicionar no CRUD de carrinhos
    public Carrinho(String codigo) {
        this.codigo=codigo;
    }

    //Controi um carrinho
    public Carrinho(Cliente cliente) {
        this.cliente = cliente;
        CarrinhoDados.criar(cliente.getCpf());
    }

    public String getCodigo() {
        return codigo;
    }

}
