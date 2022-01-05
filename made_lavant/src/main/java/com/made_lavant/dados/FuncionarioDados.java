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
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class FuncionarioDados {
    //codigo;nome;cidade;rua;bairro;numero;UF;CEP;

    public String separa(String linha, int info) {
        String resultado = linha.substring(0, linha.indexOf(';'));
        String resto = linha.substring(linha.indexOf(';') + 1);
        if (info == 0) {
            return resultado;
        }
        resultado = separa(resto, info - 1);
        return resultado;
    }

    public void adicionar(String cod, String nome, String cidade, String rua, String bairro, String numero, String UF, String CEP) {
        String info = cod + ';' + nome + ';' + cidade + ';' + rua + ';' + bairro + ';' + numero + ';' + UF + ';' + CEP + ';';
        File arquivo = new File("dados\\funcionario.txt");
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException ex) {

        }

    }

    public void remover(String cod) {
        File arquivo = new File("dados\\funcionario.txt");
        ArrayList<String> salvar = new ArrayList<>();//armazena as linhas que não serão apagadas
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(separa(linha, 0).equalsIgnoreCase(cod))) {//procura pelas linhas que não serão apagadas e as adiciona no array
                    salvar.add(linha);
                }
                linha = leitor.readLine();//pega proxima linha
            }
            leitor.close();
            leitura.close();
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();
            FileWriter escrita = new FileWriter(arquivo, true);//define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            for (int i = 0; i < salvar.size(); i++) {//escreve o que estava no array no arquivo
                escritor.write(salvar.get(i));
                escritor.newLine();
                escritor.flush();
            }
            escrita.close();
            escritor.close();

        } catch (IOException ex) {

        }
    }

    private String buscar(String cod) {
        File arquivo = new File("dados\\funcionario.txt");
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(cod)) {//procura pelas linhas que não serão apagadas e as adiciona no array
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (Exception ex) {
        }
        return null;
    }

    public String buscarNome(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 1);
        }
        return null;
    }

    public String buscarCodigo(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }

    public String buscarRua(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }

    public String buscarBairro(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }

    public String buscarCidade(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }

    public String buscarNumero(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 5);
        }
        return null;
    }

    public String buscarUF(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 6);
        }
        return null;
    }

    public String buscarCEP(String cod) {
        String aux = buscar(cod);
        if (aux != null) {
            return separa(aux, 7);
        }
        return null;
    }

    public void alterar(String cod, String nome, String cidade, String rua, String bairro, String numero, String UF, String CEP) {
        if (buscar(cod)!=null) {
            remover(cod);
            adicionar(cod, nome, cidade, rua, bairro, numero, UF, CEP);
        }
    }
}
