package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class Carrinho {

    //Cliente ao qual pertence o carrinho
    private Cliente cliente;
    private String codigo;

    //Constroi um carrinho para adicionar no CRUD de carrinhos
    public Carrinho(String codigo) {
        this.codigo = codigo;
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
