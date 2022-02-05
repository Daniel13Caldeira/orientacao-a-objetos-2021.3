package com.made_lavant.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCarrinho extends javax.swing.JFrame {

    Hashtable<String, String> ht;

    public TelaCarrinho() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        ht = new Hashtable<>();
        lerArquivo();
    }

    public void lerArquivo() {
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\a.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//a.txt");
        }
        try {
            FileReader fr = new FileReader(arquivo); //define o escritor
            BufferedReader br = new BufferedReader(fr);//buffer de escrita
            //insere o produto e adiciona uma nova linha

            String aux;
            String dados[];
            DefaultTableModel model = (DefaultTableModel) jTCarrinho.getModel();
            //Object[] linha;  //alguma linha

            while (br.ready()) {
                aux = br.readLine();
                dados = aux.split(";");
                Object[] linha = {dados[1], dados[0], dados[2], dados[3], dados[4]};
                model.addRow(linha);
                ht.put(dados[0], aux);

            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);

        }
    }

    public void remover(String cod) {
        //String cod = produto.getCodigo() + "";
        System.out.println("cod: " + cod);
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\a.txt");
        } else {
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//a.txt");
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

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);

        }
    }

    public String separa(String linha, int info) {

        return linha.split(";")[info];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_TC = new javax.swing.JLabel();
        totalLB_TC = new javax.swing.JLabel();
        madeLB_TC = new javax.swing.JLabel();
        lavantLB_TC = new javax.swing.JLabel();
        sairBTN_TC = new javax.swing.JButton();
        addProdBTN_TC = new javax.swing.JButton();
        removerBTN_TC = new javax.swing.JButton();
        voltarBTN_TC = new javax.swing.JButton();
        visualizarBTN_TC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrinho");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_TC.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_TC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_TC.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_TC.setText("Total");

        totalLB_TC.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        totalLB_TC.setForeground(new java.awt.Color(255, 255, 255));
        totalLB_TC.setText("jLabel11");

        madeLB_TC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_TC.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_TC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_TC.setText("MADE");
        madeLB_TC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_TC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_TC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_TC.setText("Lavant");

        sairBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_TC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_TC.setText("Sair");
        sairBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_TCActionPerformed(evt);
            }
        });

        addProdBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        addProdBTN_TC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        addProdBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        addProdBTN_TC.setText("Adicionar Produto");
        addProdBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTN_TCActionPerformed(evt);
            }
        });

        removerBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_TC.setText("Remover");
        removerBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_TCActionPerformed(evt);
            }
        });

        voltarBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_TC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_TC.setText("Voltar");
        voltarBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_TCActionPerformed(evt);
            }
        });

        visualizarBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        visualizarBTN_TC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        visualizarBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        visualizarBTN_TC.setText("Vizualizar carrinho");
        visualizarBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBTN_TCActionPerformed(evt);
            }
        });

        jTCarrinho.setBackground(new java.awt.Color(45, 48, 71));
        jTCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTCarrinho);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_TC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(voltarBTN_TC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(addProdBTN_TC)
                        .addGap(67, 67, 67)
                        .addComponent(topicoTotalLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(removerBTN_TC)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_TC))
                        .addGap(0, 561, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(visualizarBTN_TC)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_TC)
                    .addComponent(totalLB_TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_TC)
                    .addComponent(addProdBTN_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(madeLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(removerBTN_TC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualizarBTN_TC)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_TCActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_TCActionPerformed

    private void addProdBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTN_TCActionPerformed
        this.setVisible(false);
        new CrudProdutos_Cliente().setVisible(true);
    }//GEN-LAST:event_addProdBTN_TCActionPerformed

    private void voltarBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_TCActionPerformed
        this.setVisible(false);
        new InicioCliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_TCActionPerformed

    private void visualizarBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBTN_TCActionPerformed

        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_visualizarBTN_TCActionPerformed

    private void removerBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_TCActionPerformed
        if (jTCarrinho.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTCarrinho.getModel();
            String cod = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 1).toString();
            dtmProdutos.removeRow(jTCarrinho.getSelectedRow());
            remover(cod);
        } else {

            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }
    }//GEN-LAST:event_removerBTN_TCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProdBTN_TC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JLabel lavantLB_TC;
    private javax.swing.JLabel madeLB_TC;
    private javax.swing.JButton removerBTN_TC;
    private javax.swing.JButton sairBTN_TC;
    private javax.swing.JLabel topicoTotalLB_TC;
    private javax.swing.JLabel totalLB_TC;
    private javax.swing.JButton visualizarBTN_TC;
    private javax.swing.JButton voltarBTN_TC;
    // End of variables declaration//GEN-END:variables
}
