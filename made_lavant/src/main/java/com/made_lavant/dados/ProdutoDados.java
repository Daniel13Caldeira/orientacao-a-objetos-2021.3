/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.dados;

import com.made_lavant.base.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class ProdutoDados {

    //separa o dado que deseja pegar da String de dados completa do produto
    public String separa(String linha, int info) {
        //separa a primeira parte da String até o ;
        String resultado = linha.substring(0, linha.indexOf(';'));
        //armazena o restante da string
        String resto = linha.substring(linha.indexOf(';') + 1);
        //verifica se o resultado era o pretendido
        if (info == 0) {
            //retorna o resultado
            return resultado;
        }
        //chama novamente essa função com o resto da separação anterior
        resultado = separa(resto, info - 1);
        return resultado;
    }

    //adiciona um produto sem endereço ao arquivo de salvamento
    public void adicionar(Produto produto) {
        //cria uma String com os dados do produto no formato padrão que está sendo utilizado
        String info = String.valueOf(produto.getCodigo()) + ';' + produto.getNome() + ';' + produto.getPreco() + ';' + String.valueOf(produto.getValidade()) + ';' + produto.getQuantidade() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //insere o produto e adiciona uma nova linha
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException ex) {

        }

    }

    //remove um produto do arquivo de salvamento
    public void remover(Produto produto) {
        String cod = produto.getCodigo() + "";
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
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

    //busca uma linha
    private String buscar(String produto) {
        String cod = produto ;
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(cod)) {//procura pela linha requerida
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (Exception ex) {
        }
        return null;
    }

    //busca o nome de um produto
    public String buscarNome(String produto) {
        //busca o produto
        String aux = buscar(produto);
        //se encontrar um produto, o nome é separado e retornado
        if (aux != null) {
            return separa(aux, 1);
        }
        //se não for encontrado retorna null
        return null;
    }
    //semelhante a buscarNome
    public String buscarCodigo(String produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarQuantidade(String produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarValidade(String produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarPreco(String produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }
    //altera os dados de um produto
    public void alterar(Produto produto) {
        //busca um produto
        if (buscar(produto) != null) {
            //remove o produto do arquivo de salvamento
            remover(produto);
            //adiciona o produto ao arquivo de salvamento com os novos dados
            adicionar(produto);
        }
    }
}
