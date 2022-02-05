
package com.made_lavant.view;


public  class Confirmacao extends javax.swing.JFrame {


    public Confirmacao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CON = new javax.swing.JLabel();
        lavantLB_CON = new javax.swing.JLabel();
        sairBTN_CON = new javax.swing.JButton();
        topicoNomeProdLB_CON = new javax.swing.JLabel();
        topicoCodLB_CON = new javax.swing.JLabel();
        topicoPrecoLB_CON = new javax.swing.JLabel();
        nomeProdLB_CON = new javax.swing.JLabel();
        codigoLB_CON = new javax.swing.JLabel();
        precoLB_CON = new javax.swing.JLabel();
        topicoTotalLB_CON = new javax.swing.JLabel();
        totalLB_CON = new javax.swing.JLabel();
        topicoNomeClienteLB_CON = new javax.swing.JLabel();
        nomeClienteLB_CON = new javax.swing.JLabel();
        topicoNumCarrinhoLB_CON = new javax.swing.JLabel();
        numCarrinhoLB_CON = new javax.swing.JLabel();
        topicoQuantidadeLB_CON = new javax.swing.JLabel();
        quantidadeLB_CON = new javax.swing.JLabel();
        confirmarBTN_CON = new javax.swing.JButton();
        alterarCarrinhoBTN_CON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmacao de Venda");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CON.setText("MADE");
        madeLB_CON.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CON.setText("Lavant");

        sairBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CON.setText("Sair");
        sairBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CONActionPerformed(evt);
            }
        });

        topicoNomeProdLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeProdLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeProdLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeProdLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeProdLB_CON.setText("Nome");

        topicoCodLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_CON.setText("Código");

        topicoPrecoLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoPrecoLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_CON.setText("Preço");

        nomeProdLB_CON.setBackground(new java.awt.Color(255, 255, 255));
        nomeProdLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeProdLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        nomeProdLB_CON.setText("Nome");

        codigoLB_CON.setBackground(new java.awt.Color(255, 255, 255));
        codigoLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codigoLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        codigoLB_CON.setText("000");

        precoLB_CON.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        precoLB_CON.setText("00,00");

        topicoTotalLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CON.setText("Total");

        totalLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        totalLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CON.setText("0000,00");

        topicoNomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        topicoNomeClienteLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CON.setText("Nome Do Cliente");

        nomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        nomeClienteLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setText("Nome");

        topicoNumCarrinhoLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoNumCarrinhoLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        topicoNumCarrinhoLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumCarrinhoLB_CON.setText("Nº Do Carrinho");

        numCarrinhoLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        numCarrinhoLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        numCarrinhoLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        numCarrinhoLB_CON.setText("000");

        topicoQuantidadeLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoQuantidadeLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantidadeLB_CON.setText("Quantidade");

        quantidadeLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        quantidadeLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        quantidadeLB_CON.setText("00");

        confirmarBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CON.setText("Confirmar Carrinho");
        confirmarBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CONActionPerformed(evt);
            }
        });

        alterarCarrinhoBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        alterarCarrinhoBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        alterarCarrinhoBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        alterarCarrinhoBTN_CON.setText("Alterar Carrinho");
        alterarCarrinhoBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCarrinhoBTN_CONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_CON)
                        .addGap(258, 258, 258)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNumCarrinhoLB_CON)
                        .addGap(18, 18, 18)
                        .addComponent(numCarrinhoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeProdLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoNomeProdLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topicoCodLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topicoQuantidadeLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantidadeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoPrecoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarBTN_CON)
                        .addGap(18, 18, 18)
                        .addComponent(alterarCarrinhoBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_CON))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_CON)
                    .addComponent(totalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumCarrinhoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCarrinhoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarCarrinhoBTN_CON))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoNomeProdLB_CON)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoPrecoLB_CON)
                        .addComponent(topicoCodLB_CON)
                        .addComponent(topicoQuantidadeLB_CON)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CONActionPerformed
       this.setVisible(false);
       new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CONActionPerformed

    private void confirmarBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CONActionPerformed
       this.setVisible(false);
       new InicioFuncionario().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_confirmarBTN_CONActionPerformed

    private void alterarCarrinhoBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCarrinhoBTN_CONActionPerformed
       this.setVisible(false);
       new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_alterarCarrinhoBTN_CONActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCarrinhoBTN_CON;
    private javax.swing.JLabel codigoLB_CON;
    private javax.swing.JButton confirmarBTN_CON;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CON;
    private javax.swing.JLabel madeLB_CON;
    private javax.swing.JLabel nomeClienteLB_CON;
    private javax.swing.JLabel nomeProdLB_CON;
    private javax.swing.JLabel numCarrinhoLB_CON;
    private javax.swing.JLabel precoLB_CON;
    private javax.swing.JLabel quantidadeLB_CON;
    private javax.swing.JButton sairBTN_CON;
    private javax.swing.JLabel topicoCodLB_CON;
    private javax.swing.JLabel topicoNomeClienteLB_CON;
    private javax.swing.JLabel topicoNomeProdLB_CON;
    private javax.swing.JLabel topicoNumCarrinhoLB_CON;
    private javax.swing.JLabel topicoPrecoLB_CON;
    private javax.swing.JLabel topicoQuantidadeLB_CON;
    private javax.swing.JLabel topicoTotalLB_CON;
    private javax.swing.JLabel totalLB_CON;
    // End of variables declaration//GEN-END:variables
}
