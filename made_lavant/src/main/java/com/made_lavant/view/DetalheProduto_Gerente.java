package com.made_lavant.view;

import com.made_lavant.dados.ProdutoDados;

public class DetalheProduto_Gerente extends javax.swing.JFrame {

    public DetalheProduto_Gerente() {
        initComponents();
        //Deixa o JFrame em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        precoLB_DPG = new javax.swing.JLabel();
        topicoEstoqueLB_DPG = new javax.swing.JLabel();
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
        estoqueLB_DPG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalhe do Produto");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        precoLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_DPG.setForeground(new java.awt.Color(255, 253, 130));

        topicoEstoqueLB_DPG.setFont(topicoEstoqueLB_DPG.getFont().deriveFont(topicoEstoqueLB_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoEstoqueLB_DPG.getFont().getSize()+7));
        topicoEstoqueLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoEstoqueLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoEstoqueLB_DPG.setText("Estoque");

        topicoPrecoLB_DPG.setFont(topicoPrecoLB_DPG.getFont().deriveFont(topicoPrecoLB_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoPrecoLB_DPG.getFont().getSize()+7));
        topicoPrecoLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DPG.setText("Preço");

        valLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        valLB_DPG.setForeground(new java.awt.Color(255, 253, 130));

        topicoValLB_DPG.setFont(topicoValLB_DPG.getFont().deriveFont(topicoValLB_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoValLB_DPG.getFont().getSize()+7));
        topicoValLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DPG.setText("Validade");

        codLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        codLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codLB_DPG.setForeground(new java.awt.Color(255, 253, 130));

        topicoCodLB_DPG.setFont(topicoCodLB_DPG.getFont().deriveFont(topicoCodLB_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCodLB_DPG.getFont().getSize()+7));
        topicoCodLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DPG.setText("Código");

        topicoNomeLB_DPG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DPG.setFont(topicoNomeLB_DPG.getFont().deriveFont(topicoNomeLB_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_DPG.getFont().getSize()+7));
        topicoNomeLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_DPG.setText("Nome");

        voltarBTN_DPG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DPG.setFont(voltarBTN_DPG.getFont().deriveFont(voltarBTN_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_DPG.getFont().getSize()+7));
        voltarBTN_DPG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DPG.setText("Voltar");
        voltarBTN_DPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPGActionPerformed(evt);
            }
        });

        madeLB_DPG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DPG.setFont(madeLB_DPG.getFont().deriveFont(madeLB_DPG.getFont().getStyle() | java.awt.Font.BOLD, madeLB_DPG.getFont().getSize()+34));
        madeLB_DPG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DPG.setText("MADE");
        madeLB_DPG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DPG.setFont(lavantLB_DPG.getFont().deriveFont(lavantLB_DPG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_DPG.getFont().getSize()+34));
        lavantLB_DPG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DPG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DPG.setText("Lavant");

        sairBTN_DPG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DPG.setFont(sairBTN_DPG.getFont().deriveFont(sairBTN_DPG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_DPG.getFont().getSize()+7));
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

        estoqueLB_DPG.setBackground(new java.awt.Color(255, 255, 255));
        estoqueLB_DPG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        estoqueLB_DPG.setForeground(new java.awt.Color(255, 253, 130));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_DPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBTN_DPG)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topicoEstoqueLB_DPG)
                            .addComponent(topicoValLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoNomeLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoPrecoLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoCodLB_DPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(precoLB_DPG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeLB_DPG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codLB_DPG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estoqueLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(madeLB_DPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lavantLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBTN_DPG)
                    .addComponent(sairBTN_DPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estoqueLB_DPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoEstoqueLB_DPG))
                .addGap(158, 158, 158))
        );

        //Adiciona o preço do produto na label
        precoLB_DPG.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        //Adiciona a validade do produto na label
        String val = ProdutoDados.buscarValidade(Integer.parseInt(CrudProdutosGerente.getCodigo()));
        if (!val.equals("null")){
            valLB_DPG.setText(val);
        }else valLB_DPG.setText("Indeterminado");
        //Adiciona o nome do produto na label
        codLB_DPG.setText(ProdutoDados.buscarCodigo(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        //Adiciona o nome do produto na label
        nomeLB_DPG.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        //Adiciona a quantidade do produto na label
        estoqueLB_DPG.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutosGerente.getCodigo())));

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
        //volta para o CRUD de produtos
        this.setVisible(false);
        new CrudProdutosGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DPGActionPerformed

    private void sairBTN_DPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DPGActionPerformed
        //volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DPGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLB_DPG;
    private javax.swing.JLabel estoqueLB_DPG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DPG;
    private javax.swing.JLabel madeLB_DPG;
    private javax.swing.JLabel nomeLB_DPG;
    private javax.swing.JLabel precoLB_DPG;
    private javax.swing.JButton sairBTN_DPG;
    private javax.swing.JLabel topicoCodLB_DPG;
    private javax.swing.JLabel topicoEstoqueLB_DPG;
    private javax.swing.JLabel topicoNomeLB_DPG;
    private javax.swing.JLabel topicoPrecoLB_DPG;
    private javax.swing.JLabel topicoValLB_DPG;
    private javax.swing.JLabel valLB_DPG;
    private javax.swing.JButton voltarBTN_DPG;
    // End of variables declaration//GEN-END:variables
}
