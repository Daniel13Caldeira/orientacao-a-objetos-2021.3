
package com.mycompany.made_lavant;

public class Endereco {
    protected  String cidade;
    protected  String cep;
    protected  String uf;
    protected  String bairro;
    protected  String rua;
    protected  String pais;
    protected  int numero;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco(String cidade, String cep, String uf, String bairro, String rua, String pais, int numero) {
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.pais = pais;
        this.numero = numero;
    }
     
    
    
    
}
