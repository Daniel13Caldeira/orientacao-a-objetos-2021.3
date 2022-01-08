/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class Codigos {

    public int buscaCarrinho() {
        File arquivo = new File("dados\\codigos.txt");
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            return Integer.parseInt(leitor.readLine());//primeira linha
        } catch (Exception ex) {
        }
        return 0;
    }

    public int buscaProduto() {
        File arquivo = new File("dados\\codigos.txt");
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            return Integer.parseInt(leitor.readLine());//primeira linha
        } catch (Exception ex) {
        }
        return 0;
    }

    public void alterarCarrinho() {
        int codCarrinho = buscaCarrinho() + 1;
        int codProduto = buscaProduto();
        apagar();
        escreve(codCarrinho, codProduto);
    }

    public void alterarPrduto() {
        int codCarrinho = buscaCarrinho();
        int codProduto = buscaProduto() + 1;
        apagar();
        escreve(codCarrinho, codProduto);
    }

    public void escreve(int codCarrinho, int codProduto) {
        File arquivo = new File("dados\\codigos.txt");
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            escritor.write(codCarrinho + "");
            escritor.newLine();
            escritor.write(codProduto + "");
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException ex) {

        }
    }

    public void apagar() {
        FileWriter escritaAux = null;
        try {
            File arquivo = new File("dados\\codigos.txt");
            escritaAux = new FileWriter(arquivo, false); //apaga todo o arquivo
            escritaAux.close();
        } catch (IOException ex) {
            Logger.getLogger(Codigos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritaAux.close();
            } catch (IOException ex) {
                Logger.getLogger(Codigos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
