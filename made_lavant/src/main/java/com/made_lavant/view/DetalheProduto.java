package com.made_lavant.view;

import com.made_lavant.dados.ProdutoDados;

public class DetalheProduto extends javax.swing.JFrame {

    public DetalheProduto() {
        initComponents();
        //Coloca o JFrame em tela cheia
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
        topicoEstoqueLB_DP = new javax.swing.JLabel();
        estoqueLB_DP = new javax.swing.JLabel();
        sairBTN_DP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoPrecoLB_DP.setFont(topicoPrecoLB_DP.getFont().deriveFont(topicoPrecoLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoPrecoLB_DP.getFont().getSize()+7));
        topicoPrecoLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DP.setText("Preço");

        precoLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DP.setFont(precoLB_DP.getFont().deriveFont(precoLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, precoLB_DP.getFont().getSize()+7));
        precoLB_DP.setForeground(new java.awt.Color(255, 253, 130));

        nomeLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        nomeLB_DP.setFont(nomeLB_DP.getFont().deriveFont(nomeLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_DP.getFont().getSize()+7));
        nomeLB_DP.setForeground(new java.awt.Color(255, 253, 130));

        madeLB_DP.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DP.setFont(madeLB_DP.getFont().deriveFont(madeLB_DP.getFont().getStyle() | java.awt.Font.BOLD, madeLB_DP.getFont().getSize()+34));
        madeLB_DP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DP.setText("MADE");
        madeLB_DP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_DP.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DP.setFont(topicoNomeLB_DP.getFont().deriveFont(topicoNomeLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_DP.getFont().getSize()+7));
        topicoNomeLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_DP.setText("Nome");

        lavantLB_DP.setFont(lavantLB_DP.getFont().deriveFont(lavantLB_DP.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_DP.getFont().getSize()+34));
        lavantLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DP.setText("Lavant");

        voltarBTN_DP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DP.setFont(voltarBTN_DP.getFont().deriveFont(voltarBTN_DP.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_DP.getFont().getSize()+7));
        voltarBTN_DP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DP.setText("Voltar");
        voltarBTN_DP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPActionPerformed(evt);
            }
        });

        topicoCodLB_DP.setFont(topicoCodLB_DP.getFont().deriveFont(topicoCodLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCodLB_DP.getFont().getSize()+7));
        topicoCodLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DP.setText("Código");

        codigoLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        codigoLB_DP.setFont(codigoLB_DP.getFont().deriveFont(codigoLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, codigoLB_DP.getFont().getSize()+7));
        codigoLB_DP.setForeground(new java.awt.Color(255, 253, 130));

        topicoValLB_DP.setFont(topicoValLB_DP.getFont().deriveFont(topicoValLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoValLB_DP.getFont().getSize()+7));
        topicoValLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DP.setText("Validade");

        valLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DP.setFont(valLB_DP.getFont().deriveFont(valLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, valLB_DP.getFont().getSize()+7));
        valLB_DP.setForeground(new java.awt.Color(255, 253, 130));

        topicoEstoqueLB_DP.setFont(topicoEstoqueLB_DP.getFont().deriveFont(topicoEstoqueLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoEstoqueLB_DP.getFont().getSize()+7));
        topicoEstoqueLB_DP.setForeground(new java.awt.Color(232, 72, 85));
        topicoEstoqueLB_DP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoEstoqueLB_DP.setText("Estoque");

        estoqueLB_DP.setBackground(new java.awt.Color(255, 255, 255));
        estoqueLB_DP.setFont(estoqueLB_DP.getFont().deriveFont(estoqueLB_DP.getFont().getStyle() & ~java.awt.Font.BOLD, estoqueLB_DP.getFont().getSize()+7));
        estoqueLB_DP.setForeground(new java.awt.Color(255, 253, 130));

        sairBTN_DP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DP.setFont(sairBTN_DP.getFont().deriveFont(sairBTN_DP.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_DP.getFont().getSize()+7));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_DP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBTN_DP)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(madeLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(topicoValLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoEstoqueLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoCodLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(topicoPrecoLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(topicoNomeLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precoLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estoqueLB_DP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLB_DP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
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
                .addGap(79, 79, 79)
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
                    .addComponent(topicoEstoqueLB_DP)
                    .addComponent(estoqueLB_DP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );

        //Adiciona o preço do produto na label
        precoLB_DP.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        //Adiciona o nome do produto na label
        nomeLB_DP.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        //Adiciona o código do produto na label
        codigoLB_DP.setText(ProdutoDados.buscarCodigo(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));
        //Adiciona a validade do produto na label
        String val = ProdutoDados.buscarValidade(Integer.parseInt(CrudProdutos_Cliente.getCodigo()));
        if (!val.equals("null")){
            valLB_DP.setText(val);
        }else valLB_DP.setText("Indeterminado");
        //Adiciona o quantidade do produto na label
        estoqueLB_DP.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutos_Cliente.getCodigo())));

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
        //volta para o crud de produtos
        this.setVisible(false);
        new CrudProdutos_Cliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DPActionPerformed

    private void sairBTN_DPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DPActionPerformed
        //voltar pra tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoLB_DP;
    private javax.swing.JLabel estoqueLB_DP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DP;
    private javax.swing.JLabel madeLB_DP;
    private javax.swing.JLabel nomeLB_DP;
    private javax.swing.JLabel precoLB_DP;
    private javax.swing.JButton sairBTN_DP;
    private javax.swing.JLabel topicoCodLB_DP;
    private javax.swing.JLabel topicoEstoqueLB_DP;
    private javax.swing.JLabel topicoNomeLB_DP;
    private javax.swing.JLabel topicoPrecoLB_DP;
    private javax.swing.JLabel topicoValLB_DP;
    private javax.swing.JLabel valLB_DP;
    private javax.swing.JButton voltarBTN_DP;
    // End of variables declaration//GEN-END:variables
}
