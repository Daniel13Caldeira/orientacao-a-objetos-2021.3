
package com.made_lavant.dados;

import com.made_lavant.base.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClienteDados {

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

    //adiciona um cliente sem endereço ao arquivo de salvamento
    public void adicionarSemEndereco(Cliente cliente) {
        //cria uma String com os dados do cliente no formato padrão que está sendo utilizado
        String info = cliente.getCpf() + ';' + cliente.getNome() + ';' + "null" + ';' + "null" + ';' + "null" + ';' + "null" + ';' + "null" + ';' + "null" + ';' + cliente.getSenha() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\cliente.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//cliente.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
        }
    }

    //adiciona um cliente com endereço no arquivo de salvamento
    public void adicionar(Cliente cliente) {
        //cria uma String com os dados do cliente no formato padrão que está sendo utilizado
        String info = cliente.getCpf() + ';' + cliente.getNome() + ';' + cliente.getEndereco().getCidade() + ';' + cliente.getEndereco().getRua() + ';' + cliente.getEndereco().getBairro() + ';' + cliente.getEndereco().getNumero() + ';' + cliente.getEndereco().getUf() + ';' + cliente.getEndereco().getCep() + ';' + cliente.getSenha() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\cliente.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//cliente.txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //escreve no arquivo e vai pra próxima linha
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();//fecha o buffer
            escrita.close();//fecha o escritor
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
        }
    }

    //remove um cliente do arquivo de salvamento
    public void remover(String cpf) {
        //arquivo de onde ele será removido
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\cliente.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//cliente.txt");
        }
        //lista com os clientes que não serão removidos
        ArrayList<String> salvar = new ArrayList<>();//armazena as linhas que não serão apagadas
        try {
            FileReader leitura = new FileReader(arquivo);//define o leitor
            BufferedReader leitor = new BufferedReader(leitura);//cria um buffer de leitura
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (!(separa(linha, 0).equalsIgnoreCase(cpf))) {//procura pelas linhas que não serão apagadas e as adiciona no array
                    salvar.add(linha);
                }
                linha = leitor.readLine();//pega proxima linha
            }
            leitor.close();//fecha o buffer
            leitura.close();//fecha o leitor
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);
        }
        try {
            FileWriter escritaAux = new FileWriter(arquivo, false);//apaga todo o arquivo
            escritaAux.close();//fecha o escritot
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
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
            JOptionPane.showMessageDialog(null, "Não é possível escrever no arquivo no momento", "Erro", 0);
        }
    }

    //busca uma linha
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
            String linha = leitor.readLine();//primeira linha
            while (linha != null) {//linha null = final do arquivo
                if (separa(linha, 0).equalsIgnoreCase(cpf)) {//procura pelas linha requerida
                    return linha;
                }
                linha = leitor.readLine();//pega proxima linha
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);
        }
        //retorna null se não for encontrado
        return null;
    }

    //busca o nome de um cliente
    public String buscarNome(String cliente) {
        //busca o cliente
        String aux = buscar(cliente);
        //se encontrar um cliente, o nome é separado e retornado
        if (aux != null) {
            return separa(aux, 1);
        }
        //se não for encontrado retorna null
        return null;
    }

    //semelhante a buscarNome
    public String buscarCPF(String cpf) {
        String aux = buscar(cpf);
        if (aux != null) {
            return separa(aux, 0);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarRua(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 3);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarBairro(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 4);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarCidade(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 2);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarNumero(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 5);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarUF(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 6);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarCEP(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 7);
        }
        return null;
    }

    //semelhante a buscarNome
    public String buscarSenha(String cliente) {
        String aux = buscar(cliente);
        if (aux != null) {
            return separa(aux, 8);
        }
        return null;
    }

    //muda as informações de um cliente com endereço
    public void alterar(Cliente cliente) {
        //verifica se ele existe
        if (buscar(cliente.getCpf()) != null) {
            //remover o cliente do arquivo de salvamento
            remover(cliente.getCpf());
            //adiciona o cliente ao arquivo de salvamento com os novos dados
            adicionar(cliente);
        }
    }

    //semelhante ao alterar, mas sem o endereço
    public void alterarSemEndereco(Cliente cliente) {
        if (buscar(cliente.getCpf()) != null) {
            remover(cliente.getCpf());
            adicionarSemEndereco(cliente);
        }
    }
}
