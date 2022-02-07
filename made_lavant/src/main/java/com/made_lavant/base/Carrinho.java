
package com.made_lavant.base;

import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;


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
        add.criar(cliente.getCpf());
    }


}
