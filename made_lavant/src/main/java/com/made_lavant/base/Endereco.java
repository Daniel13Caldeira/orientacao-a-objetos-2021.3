package com.made_lavant.base;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class Endereco {

    //Componentes do endereço de uma pessoa
    private String cidade;
    private String cep;
    private String uf;
    private String bairro;
    private String rua;
    private String numero;

    //Retorna a cidade
    public String getCidade() {
        return cidade;
    }

    //Retorna o CEP
    public String getCep() {
        return cep;
    }

    public Endereco() {
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
