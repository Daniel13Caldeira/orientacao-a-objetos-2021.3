
package com.made_lavant.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DetalheCarrinho extends javax.swing.JFrame {
    
    protected static String total;
    protected static float soma;

    protected static String getTotal() {
        return DetalheCarrinho.total;
    }
    public DetalheCarrinho() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        lerArquivo();
    }
    
    public void lerArquivo(){
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\a.txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//a.txt");
        }
        try {
            FileReader fr = new FileReader(arquivo); //define o escritor
            BufferedReader br = new BufferedReader(fr);//buffer de escrita
            //insere o produto e adiciona uma nova linha
            
            String aux;
            String dados[];
            DefaultTableModel model = (DefaultTableModel) jTDetalhe.getModel();
            //Object[] linha;  //alguma linha
                    
            while (br.ready()) {
                aux = br.readLine();
                dados = aux.split(";");
                Object[] linha = {dados[1],dados[0],dados[4],dados[3],dados[2]};
                model.addRow(linha);
                String valor = dados[2];
                soma  += Float.parseFloat(valor);
                total = String.valueOf(soma);
                
            }

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

        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_DC = new javax.swing.JLabel();
        madeLB_DC = new javax.swing.JLabel();
        lavantLB_DC = new javax.swing.JLabel();
        voltarBTN_DC = new javax.swing.JButton();
        totalLB_DC = new javax.swing.JLabel();
        sairBTN_DC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalhe = new javax.swing.JTable();

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 253, 130));
        jLabel18.setText("000");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 253, 130));
        jLabel20.setText("dd/mm/aaaa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_DC.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_DC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_DC.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_DC.setText("Total");

        madeLB_DC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DC.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_DC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DC.setText("MADE");
        madeLB_DC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_DC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DC.setText("Lavant");

        voltarBTN_DC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_DC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DC.setText("Voltar");
        voltarBTN_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DCActionPerformed(evt);
            }
        });

        totalLB_DC.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_DC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        totalLB_DC.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_DC.setText("000");

        sairBTN_DC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_DC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DC.setText("Sair");
        sairBTN_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DCActionPerformed(evt);
            }
        });

        jTDetalhe.setBackground(new java.awt.Color(45, 48, 71));
        jTDetalhe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTDetalhe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_DC))
                        .addGap(0, 500, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_DC)
                        .addGap(18, 18, 18)
                        .addComponent(voltarBTN_DC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicoTotalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_DC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_DC)
                    .addComponent(totalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBTN_DC))
                .addGap(43, 43, 43)
                .addComponent(madeLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        totalLB_DC.setText(DetalheCarrinho.getTotal());

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

    private void voltarBTN_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DCActionPerformed
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DCActionPerformed

    private void sairBTN_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DCActionPerformed
       this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDetalhe;
    private javax.swing.JLabel lavantLB_DC;
    private javax.swing.JLabel madeLB_DC;
    private javax.swing.JButton sairBTN_DC;
    private javax.swing.JLabel topicoTotalLB_DC;
    private javax.swing.JLabel totalLB_DC;
    private javax.swing.JButton voltarBTN_DC;
    // End of variables declaration//GEN-END:variables
}
