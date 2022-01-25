/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.made_lavant.view;

/**
 *
 * @author Marcio
 */
public class DetalheCarrinhoGerente extends javax.swing.JFrame {

    /**
     * Creates new form DetalheCarrinhoGerente
     */
    public DetalheCarrinhoGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_DCG = new javax.swing.JLabel();
        madeLB_DCG = new javax.swing.JLabel();
        lavantLB_DCG = new javax.swing.JLabel();
        voltarBTN_DCG = new javax.swing.JButton();
        totalLB_DCG = new javax.swing.JLabel();
        sairBTN_DCG = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalheGerente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_DCG.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_DCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_DCG.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_DCG.setText("Total");

        madeLB_DCG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DCG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_DCG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DCG.setText("MADE");
        madeLB_DCG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DCG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_DCG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DCG.setText("Lavant");

        voltarBTN_DCG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_DCG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DCG.setText("Voltar");
        voltarBTN_DCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DCGActionPerformed(evt);
            }
        });

        totalLB_DCG.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_DCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        totalLB_DCG.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_DCG.setText("000");

        sairBTN_DCG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_DCG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DCG.setText("Sair");
        sairBTN_DCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DCGActionPerformed(evt);
            }
        });

        jTDetalheGerente.setBackground(new java.awt.Color(45, 48, 71));
        jTDetalheGerente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTDetalheGerente);

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
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_DCG))
                        .addGap(0, 512, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_DCG)
                        .addGap(18, 18, 18)
                        .addComponent(voltarBTN_DCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicoTotalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_DCG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_DCG)
                    .addComponent(totalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBTN_DCG))
                .addGap(43, 43, 43)
                .addComponent(madeLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void voltarBTN_DCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DCGActionPerformed
        this.setVisible(false);
        new CrudCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DCGActionPerformed

    private void sairBTN_DCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DCGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DCGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDetalheGerente;
    private javax.swing.JLabel lavantLB_DCG;
    private javax.swing.JLabel madeLB_DCG;
    private javax.swing.JButton sairBTN_DCG;
    private javax.swing.JLabel topicoTotalLB_DCG;
    private javax.swing.JLabel totalLB_DCG;
    private javax.swing.JButton voltarBTN_DCG;
    // End of variables declaration//GEN-END:variables
}
