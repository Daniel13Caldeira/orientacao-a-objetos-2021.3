package com.made_lavant.view;

public class CrudCarrinhoGerente extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        return codigo;
    }

    public CrudCarrinhoGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        descricaoBTN_CRCG = new javax.swing.JButton();
        sairBTN_CRCG = new javax.swing.JButton();
        topicoNomeClienteLB_CRCG = new javax.swing.JLabel();
        topicoCodigoCarrinhoLB_CRCG = new javax.swing.JLabel();
        topicoTotalLB_CRCG = new javax.swing.JLabel();
        nomeClienteLB_CRCG = new javax.swing.JLabel();
        voltarBTN_CRCG = new javax.swing.JButton();
        codigoCarrinhoLB_CRCG = new javax.swing.JLabel();
        totalLB_CRCG = new javax.swing.JLabel();
        madeLB_CRCG = new javax.swing.JLabel();
        confirmarBTN_CRCG = new javax.swing.JButton();
        lavantLB_CRCG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        descricaoBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRCG.setText("Descrição");
        descricaoBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCGActionPerformed(evt);
            }
        });

        sairBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRCG.setText("Sair");
        sairBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCGActionPerformed(evt);
            }
        });

        topicoNomeClienteLB_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeClienteLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoNomeClienteLB_CRCG.setText("Cliente");

        topicoCodigoCarrinhoLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodigoCarrinhoLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodigoCarrinhoLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoCodigoCarrinhoLB_CRCG.setText("Código");

        topicoTotalLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoTotalLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CRCG.setText("Preço Total");

        nomeClienteLB_CRCG.setBackground(new java.awt.Color(255, 255, 255));
        nomeClienteLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeClienteLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CRCG.setText("Nome");

        voltarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRCG.setText("Voltar");
        voltarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCGActionPerformed(evt);
            }
        });

        codigoCarrinhoLB_CRCG.setBackground(new java.awt.Color(255, 255, 255));
        codigoCarrinhoLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codigoCarrinhoLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        codigoCarrinhoLB_CRCG.setText("000");

        totalLB_CRCG.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        totalLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CRCG.setText("00,00");

        madeLB_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setFont(new java.awt.Font("Colonna MT", 0, 36)); // NOI18N
        madeLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRCG.setText("MADE");
        madeLB_CRCG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        confirmarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRCG.setText("Confirmar venda");
        confirmarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCGActionPerformed(evt);
            }
        });

        lavantLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        lavantLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRCG.setText("Lavant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(madeLB_CRCG))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoCarrinhoLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(topicoCodigoCarrinhoLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeClienteLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoNomeClienteLB_CRCG))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CRCG)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(totalLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(confirmarBTN_CRCG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descricaoBTN_CRCG))
                            .addComponent(topicoTotalLB_CRCG))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRCG)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRCG)
                    .addComponent(voltarBTN_CRCG))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lavantLB_CRCG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(madeLB_CRCG)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoTotalLB_CRCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmarBTN_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoBTN_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNomeClienteLB_CRCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeClienteLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoCodigoCarrinhoLB_CRCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoCarrinhoLB_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
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

    private void descricaoBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRCGActionPerformed
        this.setVisible(false);
        new DetalheCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_descricaoBTN_CRCGActionPerformed

    private void sairBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCGActionPerformed

    private void voltarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCGActionPerformed
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCGActionPerformed

    private void confirmarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCGActionPerformed
        this.setVisible(false);
        new ConfirmacaoGerente().setVisible(true);
    }//GEN-LAST:event_confirmarBTN_CRCGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoCarrinhoLB_CRCG;
    private javax.swing.JButton confirmarBTN_CRCG;
    private javax.swing.JButton descricaoBTN_CRCG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CRCG;
    private javax.swing.JLabel madeLB_CRCG;
    private javax.swing.JLabel nomeClienteLB_CRCG;
    private javax.swing.JButton sairBTN_CRCG;
    private javax.swing.JLabel topicoCodigoCarrinhoLB_CRCG;
    private javax.swing.JLabel topicoNomeClienteLB_CRCG;
    private javax.swing.JLabel topicoTotalLB_CRCG;
    private javax.swing.JLabel totalLB_CRCG;
    private javax.swing.JButton voltarBTN_CRCG;
    // End of variables declaration//GEN-END:variables
}
