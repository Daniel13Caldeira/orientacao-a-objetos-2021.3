package com.made_lavant.base;

public class Endereco {

    protected String cidade;
    protected String cep;
    protected String uf;
    protected String bairro;
    protected String rua;
    protected String numero;

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco(String cidade, String cep, String uf, String bairro, String rua, String numero) {
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

}
