package com.made_lavant.dados;

import com.made_lavant.base.Funcionario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDados {

    //codigo;nome;cidade;rua;bairro;numero;UF;CEP;
    private void erro(File arquivo) {
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex1) {
                JOptionPane.showMessageDialog(null, "erro");
            }
        }
    }

    //separa o dado que deseja pegar da String de dados completa do funcionário
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

    //adiciona um funcionario sem endereço ao arquivo de salvamento
    public void adicionarSemEndereco(Funcionario funcionario) {
        //cria uma String com os dados do funcionário no formato padrão que está sendo utilizado
        String info = funcionario.getCod() + ';' + funcionario.getNome() + ';' + null + ';' + null + ';' + null + ';' + null + ';' + null + ';' + null + ';' + funcionario.getSenha() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\funcionario.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//funcionario.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve e vai pra proxima linha
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            erro(arquivo);
        }
    }

    //semelhante ao adicionarSemEndereço
    public void adicionar(Funcionario funcionario) {
        String info = funcionario.getCod() + ';' + funcionario.getNome() + ';' + funcionario.getEndereco().getCidade() + ';' + funcionario.getEndereco().getRua() + ';' + funcionario.getEndereco().getBairro() + ';' + funcionario.getEndereco().getNumero() + ';' + funcionario.getEndereco().getUf() + ';' + funcionario.getEndereco().getCep() + ';' + funcionario.getSenha() + ';';
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\funcionario.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//funcionario.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException ex) {
            erro(arquivo);
        }

    }

    //remove um funcionário do arquivo de salvamento
    public void remover(String cod) {
        //define o arquivo onde a remoção será feita
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\funcionario.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//funcionario.txt");
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

    private String buscar(String cod) {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\funcionario.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//funcionario.txt");
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
        } catch (IOException ex) {
            erro(arquivo);
        }
        return null;
    }

    //busca o nome de um funcionário
    public String buscarNome(String funcionario) {
        //busca o funcionario
        String aux = buscar(funcionario);
        //se encontrar um funcionário, o nome é separado e retornado
        if (aux != null) {
            return separa(aux, 1);
        }
        //se não for encontrado retorna null
        return null;
    }

    //semelhante a buscarNome
    public String buscarCodigo(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarRua(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarBairro(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarCidade(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarNumero(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 5);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarUF(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 6);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarCEP(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 7);
        }
        return null;
    }
//semelhante a buscarNome

    public String buscarSenha(String funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 8);
        }
        return null;
    }

    //edita os dados de um funcionário
    public void alterar(Funcionario funcionario) {
        //verifica se o funcionário existe
        if (buscar(funcionario.getCod()) != null) {
            //remove o funcionário do arquivo de salvamento
            remover(funcionario.getCod());
            //adiciona o funcionário ao arquivo de salvamento com os novos dados
            adicionar(funcionario);
        }
    }

    //semelhante a alterar
    public void alterarSemEndereco(Funcionario funcionario) {
        if (buscar(funcionario.getCod()) != null) {
            remover(funcionario.getCod());
            adicionarSemEndereco(funcionario);
        }
    }

    public String vazio() {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\funcionario.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//funcionario.txt");
        }
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            return leitor.readLine();//primeira linha}
        } catch (IOException ex) {
            erro(arquivo);
        }
        return null;
    }
}
