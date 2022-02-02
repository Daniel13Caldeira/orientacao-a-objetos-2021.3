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
import java.io.FileNotFoundException;
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
public class CarrinhoDados {

    //separa o dado que deseja pegar da String de dados completa do cliente
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

    //adiciona um cliente com endereço no arquivo de salvamento
    public void criar(Carrinho carrinho) {
        //cria um arquivo para salvar o carrinho, o nome do arquivo é o codigo do carrinho e a primeira linha é o CPF do cliente
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho.getCod() + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho.getCod() + ".txt");
        }
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

    //apaga todos os produtos do carrinho
    public void limparCarrinho(int carrinho) {
        //abre o arquivo para salvar produto
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            leitor.close();
            leitura.close();
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();
            FileWriter escrita = new FileWriter(arquivo, true);//define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            escritor.write(linha);
            escritor.newLine();
            escritor.flush();
            escrita.close();
            escritor.close();
        } catch (IOException ex) {
        }
    }

    public void adicionarProduto(int carrinho, int produto, double quantidade) {
        //abre o arquivo para salvar produto
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escritaq
            //escreve o CPF do cliente e vai pra próxima linha
            escritor.write(produto + ";" + quantidade + ";");
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
        }
    }

    public void removerProduto(int carrinho, int produto) {
        //abre o arquivo para salvar produto
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt");
        }
        ArrayList<String> salvar = new ArrayList<>();//armazena as linhas que não serão apagadas
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(linha.equals(produto + ""))) {//procura pelas linhas que não serão apagadas e as adiciona no array
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

    public ArrayList<String> getProdutos(int carrinho) {
        //abre o arquivo para salvar produto
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //Filearquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt ");
        }
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

    private String buscar(String cpf) {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\cliente.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//cliente.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            String linha = leitor.readLine();//primeira linha com produto
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(cpf)) {//procura pelas linha requerida
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (Exception ex) {
        }
        //retorna null se não for encontrado
        return null;
    }

    public String getCliente() {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\cliente.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//cliente.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            return leitor.readLine();
        } catch (Exception ex) {

        }
        return null;
    }

    //busca o nome de um cliente
    public String buscarProduto(String produto) {
        //busca o cliente
        String aux = buscar(produto);
        //se encontrar um cliente, o nome é separado e retornado
        if (aux != null) {
            return separa(aux, 0);
        }
        //se não for encontrado retorna null
        return null;
    }

    //semelhante a buscarNome
    public String buscarQuantidade(String produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 1);
        }
        return null;
    }
}
