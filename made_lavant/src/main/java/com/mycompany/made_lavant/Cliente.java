/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.made_lavant;

/**
 *
 * @author Daniel
 */
public class Cliente extends Pessoa {

    protected String CPF;

    public Cliente(String nome, Endereço endereco, String CPF) {
        super(nome, endereco);
        if (verificaCPF(CPF)) {
            this.CPF = CPF;
        }
    }

    public Cliente(String nome, String CPF) {
        super(nome);
        if (verificaCPF(CPF)) {
            this.CPF = CPF;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public static boolean verificaCPF(String CPF) {
        int j = 10, soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        if (soma != Integer.parseInt(CPF.charAt(9) + "")) {
            return false;
        }
        j = 11;
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(CPF.charAt(i) + "") * j;
            j--;
        }
        soma = 11 - (soma % 11);
        if (soma > 9) {
            soma = 0;
        }
        if (soma != Integer.parseInt(CPF.charAt(10) + "")) {
            return false;
        }
        return true;
    }
}
