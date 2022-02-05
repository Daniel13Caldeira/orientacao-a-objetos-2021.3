
package com.made_lavant.view;

public class ConfirmacaoGerente extends javax.swing.JFrame {


    public ConfirmacaoGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CONG = new javax.swing.JLabel();
        lavantLB_CONG = new javax.swing.JLabel();
        sairBTN_CONG = new javax.swing.JButton();
        topicoNomeProdLB_CONG = new javax.swing.JLabel();
        topicoCodLB_CONG = new javax.swing.JLabel();
        topicoPrecoLB_CONG = new javax.swing.JLabel();
        nomeProdLB_CONG = new javax.swing.JLabel();
        codigoLB_CONG = new javax.swing.JLabel();
        precoLB_CONG = new javax.swing.JLabel();
        topicoTotalLB_CONG = new javax.swing.JLabel();
        totalLB_CONG = new javax.swing.JLabel();
        topicoNomeClienteLB_CONG = new javax.swing.JLabel();
        nomeClienteLB_CONG = new javax.swing.JLabel();
        topicoNumCarrinhoLB_CONG = new javax.swing.JLabel();
        numCarrinhoLB_CONG = new javax.swing.JLabel();
        topicoQuantidadeLB_CONG = new javax.swing.JLabel();
        quantidadeLB_CONG = new javax.swing.JLabel();
        confirmarBTN_CONG = new javax.swing.JButton();
        alterarCarrinhoBTN_CONG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CONG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CONG.setText("MADE");
        madeLB_CONG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CONG.setText("Lavant");

        sairBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CONG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CONG.setText("Sair");
        sairBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CONGActionPerformed(evt);
            }
        });

        topicoNomeProdLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeProdLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeProdLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeProdLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeProdLB_CONG.setText("Nome");

        topicoCodLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_CONG.setText("Código");

        topicoPrecoLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoPrecoLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_CONG.setText("Preço");

        nomeProdLB_CONG.setBackground(new java.awt.Color(255, 255, 255));
        nomeProdLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeProdLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        nomeProdLB_CONG.setText("Nome");

        codigoLB_CONG.setBackground(new java.awt.Color(255, 255, 255));
        codigoLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codigoLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        codigoLB_CONG.setText("000");

        precoLB_CONG.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        precoLB_CONG.setText("00,00");

        topicoTotalLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CONG.setText("Total");

        totalLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        totalLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CONG.setText("0000,00");

        topicoNomeClienteLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        topicoNomeClienteLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CONG.setText("Nome Do Cliente");

        nomeClienteLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        nomeClienteLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CONG.setText("Nome");

        topicoNumCarrinhoLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNumCarrinhoLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        topicoNumCarrinhoLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumCarrinhoLB_CONG.setText("Nº Do Carrinho");

        numCarrinhoLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        numCarrinhoLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        numCarrinhoLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        numCarrinhoLB_CONG.setText("000");

        topicoQuantidadeLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoQuantidadeLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantidadeLB_CONG.setText("Quantidade");

        quantidadeLB_CONG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        quantidadeLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        quantidadeLB_CONG.setText("00");

        confirmarBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CONG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CONG.setText("Confirmar Carrinho");
        confirmarBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CONGActionPerformed(evt);
            }
        });

        alterarCarrinhoBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        alterarCarrinhoBTN_CONG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        alterarCarrinhoBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        alterarCarrinhoBTN_CONG.setText("Alterar Carrinho");
        alterarCarrinhoBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCarrinhoBTN_CONGActionPerformed(evt);
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
                        .addComponent(topicoNomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_CONG)
                        .addGap(258, 258, 258)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNumCarrinhoLB_CONG)
                        .addGap(18, 18, 18)
                        .addComponent(numCarrinhoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoTotalLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeProdLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoNomeProdLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topicoCodLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topicoQuantidadeLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantidadeLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(precoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoPrecoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarBTN_CONG)
                        .addGap(18, 18, 18)
                        .addComponent(alterarCarrinhoBTN_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_CONG))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_CONG)
                    .addComponent(totalLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumCarrinhoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCarrinhoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarBTN_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarCarrinhoBTN_CONG))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoNomeProdLB_CONG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoPrecoLB_CONG)
                        .addComponent(topicoCodLB_CONG)
                        .addComponent(topicoQuantidadeLB_CONG)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProdLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
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

    private void sairBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CONGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CONGActionPerformed

    private void confirmarBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CONGActionPerformed
        this.setVisible(false);
        new InicioGerente().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_confirmarBTN_CONGActionPerformed

    private void alterarCarrinhoBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCarrinhoBTN_CONGActionPerformed
        this.setVisible(false);
        new CrudCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_alterarCarrinhoBTN_CONGActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCarrinhoBTN_CON;
    private javax.swing.JButton alterarCarrinhoBTN_CONG;
    private javax.swing.JLabel codigoLB_CON;
    private javax.swing.JLabel codigoLB_CONG;
    private javax.swing.JButton confirmarBTN_CON;
    private javax.swing.JButton confirmarBTN_CONG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lavantLB_CON;
    private javax.swing.JLabel lavantLB_CONG;
    private javax.swing.JLabel madeLB_CON;
    private javax.swing.JLabel madeLB_CONG;
    private javax.swing.JLabel nomeClienteLB_CON;
    private javax.swing.JLabel nomeClienteLB_CONG;
    private javax.swing.JLabel nomeProdLB_CON;
    private javax.swing.JLabel nomeProdLB_CONG;
    private javax.swing.JLabel numCarrinhoLB_CON;
    private javax.swing.JLabel numCarrinhoLB_CONG;
    private javax.swing.JLabel precoLB_CON;
    private javax.swing.JLabel precoLB_CONG;
    private javax.swing.JLabel quantidadeLB_CON;
    private javax.swing.JLabel quantidadeLB_CONG;
    private javax.swing.JButton sairBTN_CON;
    private javax.swing.JButton sairBTN_CONG;
    private javax.swing.JLabel topicoCodLB_CON;
    private javax.swing.JLabel topicoCodLB_CONG;
    private javax.swing.JLabel topicoNomeClienteLB_CON;
    private javax.swing.JLabel topicoNomeClienteLB_CONG;
    private javax.swing.JLabel topicoNomeProdLB_CON;
    private javax.swing.JLabel topicoNomeProdLB_CONG;
    private javax.swing.JLabel topicoNumCarrinhoLB_CON;
    private javax.swing.JLabel topicoNumCarrinhoLB_CONG;
    private javax.swing.JLabel topicoPrecoLB_CON;
    private javax.swing.JLabel topicoPrecoLB_CONG;
    private javax.swing.JLabel topicoQuantidadeLB_CON;
    private javax.swing.JLabel topicoQuantidadeLB_CONG;
    private javax.swing.JLabel topicoTotalLB_CON;
    private javax.swing.JLabel topicoTotalLB_CONG;
    private javax.swing.JLabel totalLB_CON;
    private javax.swing.JLabel totalLB_CONG;
    // End of variables declaration//GEN-END:variables
}
