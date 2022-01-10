/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.made_lavant.dados;

import com.made_lavant.base.Funcionario;
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
        String info = funcionario.getCod() + ';' + funcionario.getNome() + ';' + null + ';' + null + ';' + null + ';' + null + ';' + null + ';' + null + ';';
        //define o arquivo de salvamento
        File arquivo = new File("dados\\funcionario.txt");
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

        }
    }
    //semelhante ao adicionarSemEndereço
    public void adicionar(Funcionario funcionario) {
        String info = funcionario.getCod() + ';' + funcionario.getNome() + ';' + funcionario.getEndereco().getCidade() + ';' + funcionario.getEndereco().getRua() + ';' + funcionario.getEndereco().getBairro() + ';' + funcionario.getEndereco().getNumero() + ';' + funcionario.getEndereco().getUf() + ';' + funcionario.getEndereco().getCep() + ';';
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
    //remove um funcionário do arquivo de salvamento
    public void remover(Funcionario funcionario) {
        String cod = funcionario.getCod();
        //define o arquivo onde a remoção será feita
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
    //busca uma linha
    private String buscar(Funcionario funcionario) {
        String cod = funcionario.getCod();
        File arquivo = new File("dados\\funcionario.txt");
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

    //busca o nome de um funcionário
    public String buscarNome(Funcionario funcionario) {
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
    public String buscarCodigo(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarRua(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarBairro(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarCidade(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarNumero(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 5);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarUF(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 6);
        }
        return null;
    }
    //semelhante a buscarNome
    public String buscarCEP(Funcionario funcionario) {
        String aux = buscar(funcionario);
        if (aux != null) {
            return separa(aux, 7);
        }
        return null;
    }
    //edita os dados de um funcionário
    public void alterar(Funcionario funcionario) {
        //verifica se o funcionário existe
        if (buscar(funcionario) != null) {
            //remove o funcionário do arquivo de salvamento
            remover(funcionario);
            //adiciona o funcionário ao arquivo de salvamento com os novos dados
            adicionar(funcionario);
        }
    }
    //semelhante a alterar
    public void alterarSemEndereco(Funcionario funcionario) {
        if (buscar(funcionario) != null) {
            remover(funcionario);
            adicionarSemEndereco(funcionario);
        }
    }
}
