package com.made_lavant.dados;

import com.made_lavant.base.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ProdutoDados {

    private static void erro(File arquivo) {
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "erro");
            }
        }
    }

    //separa o dado que deseja pegar da String de dados completa do produto
    public static String separa(String linha, int info) {
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
    public static void adicionar(Produto produto) {
        //cria uma String com os dados do produto no formato padrão que está sendo utilizado
        String info = String.valueOf(produto.getCodigo()) + ';' + produto.getNome() + ';' + produto.getPreco() + ';' + String.valueOf(produto.getValidade()) + ';' + produto.getQuantidade() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        } else {
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
            erro(arquivo);
        }

    }

    //remove um produto do arquivo de salvamento
    public static void remover(int cod) {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        ArrayList<String> salvar = new ArrayList<>();//armazena as linhas que não serão apagadas
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(separa(linha, 0).equalsIgnoreCase(String.valueOf(cod)))) {//procura pelas linhas que não serão apagadas e as adiciona no array
                    salvar.add(linha);
                }
                linha = leitor.readLine();//pega proxima linha
            }
            leitor.close();
            leitura.close();
        } catch (IOException ex) {
            erro(arquivo);
        }
        try {
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();
        } catch (IOException ex) {
            erro(arquivo);
        }
        try {
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
            erro(arquivo);
        }
    }
    //busca uma linha

    private static String buscar(int cod) {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(String.valueOf(cod))) {//procura pela linha requerida
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (Exception ex) {
            erro(arquivo);
        }
        return null;
    }

    //busca o nome de um produto
    public static String buscarNome(int produto) {
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
    public static String buscarCodigo(int produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }

    //semelhante a buscarNome
    public static String buscarQuantidade(int produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }

    //semelhante a buscarNome
    public static String buscarValidade(int produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }

    //semelhante a buscarNome
    public static String buscarPreco(int produto) {
        String aux = buscar(produto);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }
    //altera os dados de um produto

    public static void alterar(Produto produto) {
        //busca um produto
        if (buscar(produto.getCodigo()) != null) {
            //remove o produto do arquivo de salvamento
            remover(produto.getCodigo());
            //adiciona o produto ao arquivo de salvamento com os novos dados
            adicionar(produto);
        }
    }

    private static boolean verificaDataAnteriorAtual(String dataProd) {
        Date data = new Date();
        int dia = Integer.parseInt(dataProd.charAt(0) + "" + dataProd.charAt(1));
        int mes = Integer.parseInt(dataProd.charAt(3) + "" + dataProd.charAt(4));
        int ano = Integer.parseInt(dataProd.charAt(6) + "" + dataProd.charAt(7) + "" + dataProd.charAt(8) + "" + dataProd.charAt(9));
        String atual = data + "";
        //Fri Jan 14 1 5 : 0 0 : 2 9 B R T  2022
        //012 456 89 1112131415161718192021 23242526
        int anoAtual = Integer.parseInt(atual.charAt(24) + "") * 1000 + Integer.parseInt(atual.charAt(25) + "") * 100 + Integer.parseInt(atual.charAt(26) + "") * 10 + Integer.parseInt(atual.charAt(27) + "");
        if (anoAtual > ano) {
            return true;
        }
        if (anoAtual < ano) {
            return false;
        }
        String mesAtualAux = atual.substring(4, 7);
        int mesAtual = 0;
        if (mesAtualAux.equalsIgnoreCase("jan")) {
            mesAtual = 1;
        } else {
            if (mesAtualAux.equalsIgnoreCase("feb")) {
                mesAtual = 2;
            } else {
                if (mesAtualAux.equalsIgnoreCase("mar")) {
                    mesAtual = 3;
                } else {
                    if (mesAtualAux.equalsIgnoreCase("apr")) {
                        mesAtual = 4;
                    } else {
                        if (mesAtualAux.equalsIgnoreCase("may")) {
                            mesAtual = 5;
                        } else {
                            if (mesAtualAux.equalsIgnoreCase("jun")) {
                                mesAtual = 6;
                            } else {
                                if (mesAtualAux.equalsIgnoreCase("jul")) {
                                    mesAtual = 7;
                                } else {
                                    if (mesAtualAux.equalsIgnoreCase("aug")) {
                                        mesAtual = 8;
                                    } else {
                                        if (mesAtualAux.equalsIgnoreCase("sep")) {
                                            mesAtual = 9;
                                        } else {
                                            if (mesAtualAux.equalsIgnoreCase("oct")) {
                                                mesAtual = 10;
                                            } else {
                                                if (mesAtualAux.equalsIgnoreCase("nov")) {
                                                    mesAtual = 11;
                                                } else {
                                                    if (mesAtualAux.equalsIgnoreCase("dec")) {
                                                        mesAtual = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (mesAtual > mes) {
            return true;
        }
        if (mesAtual < mes) {
            return false;
        }
        int diaAtual = Integer.parseInt(atual.charAt(8) + "") * 10 + Integer.parseInt(atual.charAt(9) + "");
        if (diaAtual > dia) {
            return true;
        }
        return false;
    }

    public static void verificaValidade() {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (verificaDataAnteriorAtual(buscarValidade(Integer.parseInt(separa(linha, 0))))) {//procura pela linha requerida
                    remover(Integer.parseInt(separa(linha, 0)));
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (Exception ex) {
            erro(arquivo);
        }
    }
}
