package com.made_lavant.dados;

import com.made_lavant.base.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CarrinhoDados {

    private void erro(File arquivo) {
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "erro");
            }
        }
    }

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
    public void criar(String cliente) {
        //cria um arquivo para salvar o carrinho, o nome do arquivo é o CPF do cliente
        File arquivo = null;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + cliente + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + cliente + ".txt");
        }
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            erro(arquivo);
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escritaq
            //escreve o CPF do cliente e vai pra próxima linha
            escritor.write("false");
            escritor.newLine();
            escritor.flush();
            escritor.write("busca");
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            erro(arquivo);
        }
    }

    //apaga todos os produtos do carrinho
    public void limparCarrinho(String carrinho) {
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
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();
        } catch (IOException ex) {
            erro(arquivo);
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true);//define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            escritor.write("false");
            escritor.newLine();
            escritor.flush();
            escritor.write("busca");
            escritor.newLine();
            escritor.flush();
            escrita.close();
            escritor.close();
        } catch (IOException ex) {
            erro(arquivo);
        }
    }

    public void adicionarProduto(String carrinho, int produto, double quantidade) {
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
            erro(arquivo);
        }
    }

    public void removerProduto(String carrinho, int produto) {
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
            salvar.add(leitor.readLine());
            salvar.add(leitor.readLine());
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(separa(linha, 0).equals(produto + ""))) {//procura pelas linhas que não serão apagadas e as adiciona no array
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

    public ArrayList<Produto> getProdutos(String carrinho) {
        //abre o arquivo para salvar produto
        File arquivo;
        ProdutoDados pd = new ProdutoDados();
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //Filearquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt ");
        }
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            leitor.readLine();
            String linha = leitor.readLine();//primeira linha com produto
            while (linha != null) {
                produtos.add(new Produto(pd.buscarNome(Integer.parseInt(separa(linha, 0))), Integer.parseInt(separa(linha, 0)), Double.parseDouble(pd.buscarPreco(Integer.parseInt(separa(linha, 0)))), pd.buscarValidade(Integer.parseInt(separa(linha, 0))), Double.parseDouble(separa(linha, 1))));//adiciona o produto na lista
                linha = leitor.readLine();//próxima linha
            }
        } catch (IOException ex) {
            erro(arquivo);
        }
        //retorna a lista de códigos de produtos
        return produtos;
    }

    private String buscar(String codigo) {
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
            leitor.readLine();
            String linha = leitor.readLine();//primeira linha com produto
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(codigo)) {//procura pelas linha requerida
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (IOException ex) {
            erro(arquivo);
        }
        //retorna null se não for encontrado
        return null;
    }

    public String getTipoVenda(String carrinho) {
        File arquivo;
        ProdutoDados pd = new ProdutoDados();
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //Filearquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt ");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            leitor.readLine();
            return leitor.readLine();
        } catch (IOException ex) {
            erro(arquivo);
        }
        //retorna null se não for encontrado
        return null;
    }

    public void setTipoVenda(String carrinho, String tipo) {
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

            salvar.add(leitor.readLine());//pronto
            leitor.readLine();//tipo
            String linha = leitor.readLine();//primeira linha com produto
            while (linha != null) {//linha null = final do arquivo
                salvar.add(linha);
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
            escritor.write(salvar.get(0));
            escritor.newLine();
            escritor.flush();
            escritor.write(tipo);
            escritor.newLine();
            escritor.flush();
            for (int i = 1; i < salvar.size(); i++) {//escreve o que estava no array no arquivo
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

    public void setPronto(String carrinho, boolean flag) {
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
            leitor.readLine();//pronto
            String linha = leitor.readLine();//tipo
            while (linha != null) {//linha null = final do arquivo
                salvar.add(linha);
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
            escritor.write(String.valueOf(flag));
            escritor.newLine();
            escritor.flush();
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

    public boolean getPronto(String carrinho) {
        File arquivo;
        ProdutoDados pd = new ProdutoDados();
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //Filearquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\" + carrinho + ".txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//" + carrinho + ".txt ");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            if (leitor.readLine().equals("true")) {
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            erro(arquivo);
        }
        //retorna null se não for encontrado
        return false;
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
