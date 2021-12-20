/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.made_lavant;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author matheusreis
 */
public class Comercio {
    
    protected Endereco endereco;
    protected String codigo;
    protected Date horarioAbertura;
    protected Date horarioFechamento;
    protected Funcionario gerente;

    protected boolean verificaFuncionamento() {

        Date horaAtual = new Date();
        String hora = new SimpleDateFormat("HH:mm:ss").format(horaAtual);

        if (horaAtual.before(horarioFechamento) && horaAtual.after(horarioAbertura )) {
            return true;
        } else {
            return false;
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
