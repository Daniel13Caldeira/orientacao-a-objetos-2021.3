package com.made_lavant.view;

public class CrudCarrinho extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        return codigo;
    }

    public CrudCarrinho() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomeClienteLB_CRC = new javax.swing.JLabel();
        codigoCarrinhoLB_CRC = new javax.swing.JLabel();
        totalLB_CRC = new javax.swing.JLabel();
        madeLB_CRC = new javax.swing.JLabel();
        confirmarBTN_CRC = new javax.swing.JButton();
        lavantLB_CRC = new javax.swing.JLabel();
        descricaoBTN_CRC = new javax.swing.JButton();
        sairBTN_CRC = new javax.swing.JButton();
        topicoNomeClienteLB_CRC = new javax.swing.JLabel();
        topicoCodigoCarrinhoLB_CRC = new javax.swing.JLabel();
        topicoTotalLB_CRC = new javax.swing.JLabel();
        voltarBTN_CRC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Carrinhos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        nomeClienteLB_CRC.setBackground(new java.awt.Color(255, 255, 255));
        nomeClienteLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeClienteLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CRC.setText("Nome");

        codigoCarrinhoLB_CRC.setBackground(new java.awt.Color(255, 255, 255));
        codigoCarrinhoLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codigoCarrinhoLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        codigoCarrinhoLB_CRC.setText("000");

        totalLB_CRC.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        totalLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CRC.setText("00,00");

        madeLB_CRC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setFont(new java.awt.Font("Colonna MT", 0, 36)); // NOI18N
        madeLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRC.setText("MADE");
        madeLB_CRC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        confirmarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRC.setText("Confirmar venda");
        confirmarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCActionPerformed(evt);
            }
        });

        lavantLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        lavantLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRC.setText("Lavant");

        descricaoBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRC.setText("Descrição");
        descricaoBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCActionPerformed(evt);
            }
        });

        sairBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRC.setText("Sair");
        sairBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCActionPerformed(evt);
            }
        });

        topicoNomeClienteLB_CRC.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeClienteLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoNomeClienteLB_CRC.setText("Cliente");

        topicoCodigoCarrinhoLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodigoCarrinhoLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodigoCarrinhoLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoCodigoCarrinhoLB_CRC.setText("Código");

        topicoTotalLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoTotalLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CRC.setText("Preço Total");

        voltarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRC.setText("Voltar");
        voltarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(madeLB_CRC))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 56, Short.MAX_VALUE)
                                        .addComponent(codigoCarrinhoLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(topicoCodigoCarrinhoLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeClienteLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoNomeClienteLB_CRC))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CRC)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(totalLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(confirmarBTN_CRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descricaoBTN_CRC))
                            .addComponent(topicoTotalLB_CRC))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRC)
                    .addComponent(voltarBTN_CRC))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lavantLB_CRC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(madeLB_CRC)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoTotalLB_CRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmarBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNomeClienteLB_CRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeClienteLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoCodigoCarrinhoLB_CRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoCarrinhoLB_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRCActionPerformed
        this.setVisible(false);
        new DetalheCarrinho().setVisible(true);
    }//GEN-LAST:event_descricaoBTN_CRCActionPerformed

    private void sairBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCActionPerformed

    private void confirmarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCActionPerformed
        this.setVisible(false);
        new Confirmacao().setVisible(true);
    }//GEN-LAST:event_confirmarBTN_CRCActionPerformed

    private void voltarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCActionPerformed
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoCarrinhoLB_CRC;
    private javax.swing.JButton confirmarBTN_CRC;
    private javax.swing.JButton descricaoBTN_CRC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CRC;
    private javax.swing.JLabel madeLB_CRC;
    private javax.swing.JLabel nomeClienteLB_CRC;
    private javax.swing.JButton sairBTN_CRC;
    private javax.swing.JLabel topicoCodigoCarrinhoLB_CRC;
    private javax.swing.JLabel topicoNomeClienteLB_CRC;
    private javax.swing.JLabel topicoTotalLB_CRC;
    private javax.swing.JLabel totalLB_CRC;
    private javax.swing.JButton voltarBTN_CRC;
    // End of variables declaration//GEN-END:variables
}
