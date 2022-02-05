package com.made_lavant.view;

import com.made_lavant.dados.ProdutoDados;
import com.made_lavant.base.Produto;

public class DetalheProduto extends javax.swing.JFrame {

    public DetalheProduto() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoPrecoLB_DP = new javax.swing.JLabel();
        precoLB_DP = new javax.swing.JLabel();
        nomeLB_DP = new javax.swing.JLabel();
        madeLB_DP = new javax.swing.JLabel();
        topicoNomeLB_DP = new javax.swing.JLabel();
        lavantLB_DP = new javax.swing.JLabel();
        voltarBTN_DP = new javax.swing.JButton();
        topicoCodLB_DP = new javax.swing.JLabel();
        codigoLB_DP = new javax.swing.JLabel();
        topicoValLB_DP = new javax.swing.JLabel();
        valLB_DP = new javax.swing.JLabel();
        topicoQuantiDispLB_DP = new javax.swing.JLabel();
        quantiDispLB_DP = new javax.swing.JLabel();
        sairBTN_DP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoPrecoLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoPrecoLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DP.setText("Preço");

        precoLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        precoLB_DP.setText("00,00");

        nomeLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        nomeLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        nomeLB_DP.setText("Nome");

        madeLB_DP.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DP.setFont(new java.awt.Font("Colonna MT", 0, 45)); // NOI18N
        madeLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DP.setText("MADE");
        madeLB_DP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_DP.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoNomeLB_DP.setText("Nome");

        lavantLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 45)); // NOI18N
        lavantLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DP.setText("Lavant");

        voltarBTN_DP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DP.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_DP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DP.setText("Voltar");
        voltarBTN_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPActionPerformed(evt);
            }
        });

        topicoCodLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DP.setText("Código");

        codigoLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        codigoLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codigoLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        codigoLB_DP.setText("000");

        topicoValLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoValLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DP.setText("Validade");

        valLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        valLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        valLB_DP.setText("dd/mm/aaaa");

        topicoQuantiDispLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoQuantiDispLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiDispLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoQuantiDispLB_DP.setText("Quantidade disponível");

        quantiDispLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        quantiDispLB_DP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        quantiDispLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        quantiDispLB_DP.setText("00");

        sairBTN_DP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DP.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_DP.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DP.setText("Sair");
        sairBTN_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(madeLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_DP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(voltarBTN_DP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(topicoValLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoQuantiDispLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(topicoCodLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNomeLB_DP)
                                    .addComponent(topicoPrecoLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantiDispLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lavantLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBTN_DP)
                    .addComponent(sairBTN_DP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_DP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DP)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_DP)
                    .addComponent(nomeLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_DP)
                    .addComponent(precoLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoCodLB_DP)
                    .addComponent(codigoLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoValLB_DP)
                    .addComponent(valLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiDispLB_DP)
                    .addComponent(quantiDispLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );

        ProdutoDados ProdutoDados = new ProdutoDados();
        precoLB_DP.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        nomeLB_DP.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        codigoLB_DP.setText(ProdutoDados.buscarCodigo(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        valLB_DP.setText(ProdutoDados.buscarValidade(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        quantiDispLB_DP.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));

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

    private void voltarBTN_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DPActionPerformed
        this.setVisible(false);
        new CrudProdutos_Cliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DPActionPerformed

    private void sairBTN_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DPActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoLB_DP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DP;
    private javax.swing.JLabel madeLB_DP;
    private javax.swing.JLabel nomeLB_DP;
    private javax.swing.JLabel precoLB_DP;
    private javax.swing.JLabel quantiDispLB_DP;
    private javax.swing.JButton sairBTN_DP;
    private javax.swing.JLabel topicoCodLB_DP;
    private javax.swing.JLabel topicoNomeLB_DP;
    private javax.swing.JLabel topicoPrecoLB_DP;
    private javax.swing.JLabel topicoQuantiDispLB_DP;
    private javax.swing.JLabel topicoValLB_DP;
    private javax.swing.JLabel valLB_DP;
    private javax.swing.JButton voltarBTN_DP;
    // End of variables declaration//GEN-END:variables
}
