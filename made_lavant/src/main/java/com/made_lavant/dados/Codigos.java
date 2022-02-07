
package com.made_lavant.dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Codigos {

    //busca o código do próximo produto a ser adicionado
    public int buscaProduto() {
        //arquivo onde será feita a leitura
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\codigos.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//codigos.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            //retorna a linha 1, onde está o código do produto
            return Integer.parseInt(leitor.readLine());//primeira linha
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);

        }
        //se a linha estiver vazia retorna o valor 0
        return 0;
    }

    //busca o código do próximo funcionário a ser adicionado
    public int buscaFuncionario() {
        //arquivo onde vai ser feita a leitura
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\codigos.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//codigos.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            //retorna a linha 2, onde está o código do funcionário
            return Integer.parseInt(leitor.readLine());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);
        }
        //se a linha estiver vazia retorna o valor 0
        return 0;
    }

    public void alterarFuncionario() {
        //pega o código do carrinho, do produto e do funcionário
        int codProduto = buscaProduto();
        int codFuncionario = buscaFuncionario() + 1;//adiciona 1 no funcionário
        //apaga todo o arquivo
        apagar();
        //insere os códigos atualizados
        escreve(codProduto, codFuncionario);
    }

    public void alterarCarrinho() {
        //pega o código do carrinho, do produto e do funcionário
        int codProduto = buscaProduto();
        int codFuncionario = buscaFuncionario();
        //apaga todo o arquivo
        apagar();
        //insere os códigos atualizados
        escreve(codProduto, codFuncionario);
    }

    public void alterarPrduto() {
        //pega o código do carrinho, do produto e do funcionário
        int codProduto = buscaProduto() + 1;//adiciona 1 no produto
        int codFuncionario = buscaFuncionario();
        //apaga todo o arquivo
        apagar();
        //insere os códigos atualizados
        escreve(codProduto, codFuncionario);
    }

    public void escreve(int codProduto, int codFuncionario) {
        //arquivo onde será feita a escrita
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\codigos.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//codigos.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //insere os códigos
            escritor.write(codProduto + "");
            escritor.newLine();
            escritor.write(codFuncionario + "");
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
        }
    }

    public void apagar() {
        FileWriter escrita = null;
        try {
            //arquivo que será apagado
            File arquivo;
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                //File arquivo = new File("caminho win");
                arquivo = new File("dados\\codigos.txt");
            } else {
                //File arquivo = new File("caminho linux");
                arquivo = new File("dados//codigos.txt");
            }
            escrita = new FileWriter(arquivo, false); //apaga todo o arquivo
            escrita.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
        }
    }
}
