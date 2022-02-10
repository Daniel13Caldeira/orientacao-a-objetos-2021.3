package com.made_lavant.base;

public class Endereco {
    //Componentes do endereço de uma pessoa
    protected String cidade;
    protected String cep;
    protected String uf;
    protected String bairro;
    protected String rua;
    protected String numero;

    //Retorna a cidade
    public String getCidade() {
        return cidade;
    }

    //Retorna o CEP
    public String getCep() {
        return cep;
    }

    //Retorna a UF
    public String getUf() {
        return uf;
    }

    //Retorna o bairro
    public String getBairro() {
        return bairro;
    }

    //Retorna a rua
    public String getRua() {
        return rua;
    }

    //Retorna o número
    public String getNumero() {
        return numero;
    }

    //Constroi um endereço
    public Endereco(String cidade, String cep, String uf, String bairro, String rua, String numero) {
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

}
