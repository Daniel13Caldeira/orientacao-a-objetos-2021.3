package com.made_lavant.view;

import com.made_lavant.dados.ProdutoDados;

public class DetalheProduto_Gerente extends javax.swing.JFrame {

    public DetalheProduto_Gerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        precoLB_DPG = new javax.swing.JLabel();
        topicoQuantiDispLB_DPG = new javax.swing.JLabel();
        topicoPrecoLB_DPG = new javax.swing.JLabel();
        valLB_DPG = new javax.swing.JLabel();
        topicoValLB_DPG = new javax.swing.JLabel();
        codLB_DPG = new javax.swing.JLabel();
        topicoCodLB_DPG = new javax.swing.JLabel();
        topicoNomeLB_DPG = new javax.swing.JLabel();
        voltarBTN_DPG = new javax.swing.JButton();
        madeLB_DPG = new javax.swing.JLabel();
        lavantLB_DPG = new javax.swing.JLabel();
        sairBTN_DPG = new javax.swing.JButton();
        nomeLB_DPG = new javax.swing.JLabel();
        quantiDispLB_DPG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        precoLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        precoLB_DPG.setText("00,00");

        topicoQuantiDispLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoQuantiDispLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiDispLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoQuantiDispLB_DPG.setText("Quantidade disponível");

        topicoPrecoLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoPrecoLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DPG.setText("Preço");

        valLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        valLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        valLB_DPG.setText("dd/mm/aaaa");

        topicoValLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoValLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DPG.setText("Validade");

        codLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        codLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        codLB_DPG.setText("000");

        topicoCodLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DPG.setText("Código");

        topicoNomeLB_DPG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoNomeLB_DPG.setText("Nome");

        voltarBTN_DPG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_DPG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DPG.setText("Voltar");
        voltarBTN_DPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPGActionPerformed(evt);
            }
        });

        madeLB_DPG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DPG.setFont(new java.awt.Font("Colonna MT", 0, 45)); // NOI18N
        madeLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DPG.setText("MADE");
        madeLB_DPG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 45)); // NOI18N
        lavantLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DPG.setText("Lavant");

        sairBTN_DPG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_DPG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DPG.setText("Sair");
        sairBTN_DPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DPGActionPerformed(evt);
            }
        });

        nomeLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        nomeLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        nomeLB_DPG.setText("Nome");

        quantiDispLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        quantiDispLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        quantiDispLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        quantiDispLB_DPG.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_DPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topicoQuantiDispLB_DPG)
                            .addComponent(topicoValLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoCodLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoPrecoLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoNomeLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precoLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantiDispLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valLB_DPG))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarBTN_DPG)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(madeLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lavantLB_DPG)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBTN_DPG)
                    .addComponent(sairBTN_DPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_DPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DPG)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNomeLB_DPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_DPG)
                    .addComponent(precoLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCodLB_DPG)
                    .addComponent(codLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoValLB_DPG)
                    .addComponent(valLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiDispLB_DPG)
                    .addComponent(quantiDispLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );

        precoLB_DPG.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        valLB_DPG.setText(ProdutoDados.buscarValidade(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        codLB_DPG.setText(ProdutoDados.buscarCodigo(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        nomeLB_DPG.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        quantiDispLB_DPG.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutosGerente.getCodigo())));

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

    private void voltarBTN_DPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DPGActionPerformed
        this.setVisible(false);
        new CrudProdutosGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DPGActionPerformed

    private void sairBTN_DPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DPGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DPGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLB_DPG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DPG;
    private javax.swing.JLabel madeLB_DPG;
    private javax.swing.JLabel nomeLB_DPG;
    private javax.swing.JLabel precoLB_DPG;
    private javax.swing.JLabel quantiDispLB_DPG;
    private javax.swing.JButton sairBTN_DPG;
    private javax.swing.JLabel topicoCodLB_DPG;
    private javax.swing.JLabel topicoNomeLB_DPG;
    private javax.swing.JLabel topicoPrecoLB_DPG;
    private javax.swing.JLabel topicoQuantiDispLB_DPG;
    private javax.swing.JLabel topicoValLB_DPG;
    private javax.swing.JLabel valLB_DPG;
    private javax.swing.JButton voltarBTN_DPG;
    // End of variables declaration//GEN-END:variables
}
