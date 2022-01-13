/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.dados;

import com.made_lavant.base.Carrinho;
import com.made_lavant.base.Cliente;
import com.made_lavant.base.Produto;
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
public class CarrinhoDados {

    //adiciona um cliente com endereço no arquivo de salvamento
    public void criar(Carrinho carrinho) {
        //cria um arquivo para salvar o carrinho, o nome do arquivo é o codigo do carrinho e a primeira linha é o CPF do cliente
        File arquivo = new File("dados\\carrinhos\\" + carrinho.getCod() + ".txt");
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escritaq
            //escreve o CPF do cliente e vai pra próxima linha
            escritor.write(carrinho.getCliente().getCPF());
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {

        }
    }

    public void adicionarProduto(Carrinho carrinho, Produto produto) {
        //abre o arquivo para salvar produto
        File arquivo = new File("dados\\carrinhos\\" + carrinho.getCod() + ".txt");
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escritaq
            //escreve o CPF do cliente e vai pra próxima linha
            escritor.write(produto.getCodigo() + "");
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
        }
    }

    public void removerProduto(Carrinho carrinho, Produto produto) {
        //abre o arquivo para salvar produto
        File arquivo = new File("dados\\carrinhos\\" + carrinho.getCod() + ".txt");
        ArrayList<String> salvar = new ArrayList<>();//armazena as linhas que não serão apagadas
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(linha.equals(produto.getCodigo() + ""))) {//procura pelas linhas que não serão apagadas e as adiciona no array
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

    public ArrayList<String> getProdutos(Carrinho carrinho) {
        //abre o arquivo para salvar produto
        File arquivo = new File("dados\\carrinhos\\" + carrinho.getCod() + ".txt");
        ArrayList<String> produtos = new ArrayList<>();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();//pula a linha com o cpf do cliente
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {
                produtos.add(linha);//adiciona o codigo do produto na lista
                linha = leitor.readLine();//próxima linha
            }
        } catch (Exception ex) {
        }
        //retorna a lista de códigos de produtos
        return produtos;
    }
}
