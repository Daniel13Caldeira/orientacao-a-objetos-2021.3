package com.made_lavant.view;

import com.made_lavant.dados.ProdutoDados;

public class DetalheProduto_Func extends javax.swing.JFrame {

    public DetalheProduto_Func() {
        initComponents();
        //Deixa o JFrame em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lavantLB_DPF = new javax.swing.JLabel();
        voltarBTN_DPF = new javax.swing.JButton();
        topicoCodLB_DPF = new javax.swing.JLabel();
        codLB_DPF = new javax.swing.JLabel();
        topicoValLB_DPF = new javax.swing.JLabel();
        valLB_DPF = new javax.swing.JLabel();
        topicoPrecoLB_DPF = new javax.swing.JLabel();
        topicoEstoqueLB_DPF = new javax.swing.JLabel();
        precoLB_DPF = new javax.swing.JLabel();
        estoqueLB_DPF = new javax.swing.JLabel();
        nomeLB_DPF = new javax.swing.JLabel();
        sairBTN_DPF = new javax.swing.JButton();
        madeLB_DPF = new javax.swing.JLabel();
        topicoNomeLB_DPF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalhe do Produto");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        lavantLB_DPF.setFont(lavantLB_DPF.getFont().deriveFont(lavantLB_DPF.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_DPF.getFont().getSize()+34));
        lavantLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DPF.setText("Lavant");

        voltarBTN_DPF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DPF.setFont(voltarBTN_DPF.getFont().deriveFont(voltarBTN_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_DPF.getFont().getSize()+7));
        voltarBTN_DPF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DPF.setText("Voltar");
        voltarBTN_DPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPFActionPerformed(evt);
            }
        });

        topicoCodLB_DPF.setFont(topicoCodLB_DPF.getFont().deriveFont(topicoCodLB_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCodLB_DPF.getFont().getSize()+7));
        topicoCodLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DPF.setText("Código");

        codLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        codLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        topicoValLB_DPF.setFont(topicoValLB_DPF.getFont().deriveFont(topicoValLB_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoValLB_DPF.getFont().getSize()+7));
        topicoValLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DPF.setText("Validade");

        valLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        valLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        topicoPrecoLB_DPF.setFont(topicoPrecoLB_DPF.getFont().deriveFont(topicoPrecoLB_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoPrecoLB_DPF.getFont().getSize()+7));
        topicoPrecoLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DPF.setText("Preço");

        topicoEstoqueLB_DPF.setFont(topicoEstoqueLB_DPF.getFont().deriveFont(topicoEstoqueLB_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoEstoqueLB_DPF.getFont().getSize()+7));
        topicoEstoqueLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoEstoqueLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoEstoqueLB_DPF.setText("Estoque");

        precoLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        estoqueLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        estoqueLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        estoqueLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        nomeLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        nomeLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        sairBTN_DPF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DPF.setFont(sairBTN_DPF.getFont().deriveFont(sairBTN_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_DPF.getFont().getSize()+7));
        sairBTN_DPF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DPF.setText("Sair");
        sairBTN_DPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DPFActionPerformed(evt);
            }
        });

        madeLB_DPF.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DPF.setFont(madeLB_DPF.getFont().deriveFont(madeLB_DPF.getFont().getStyle() | java.awt.Font.BOLD, madeLB_DPF.getFont().getSize()+34));
        madeLB_DPF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DPF.setText("MADE");
        madeLB_DPF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_DPF.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DPF.setFont(topicoNomeLB_DPF.getFont().deriveFont(topicoNomeLB_DPF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_DPF.getFont().getSize()+7));
        topicoNomeLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_DPF.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(madeLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lavantLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_DPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBTN_DPF)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topicoNomeLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoPrecoLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLB_DPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topicoEstoqueLB_DPF)
                            .addComponent(topicoValLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoCodLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(estoqueLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sairBTN_DPF)
                    .addComponent(voltarBTN_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_DPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DPF)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topicoNomeLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(topicoPrecoLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precoLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoCodLB_DPF)
                    .addComponent(codLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoValLB_DPF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valLB_DPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(estoqueLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topicoEstoqueLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );

        //Adiciona o código do produto na label
        codLB_DPF.setText(ProdutoDados.buscarCodigo(Integer.parseInt(CrudProdutos.getCodigo())));
        //Adiciona a validade do produto na label
        String val = ProdutoDados.buscarValidade(Integer.parseInt(CrudProdutos.getCodigo()));
        if (!val.equals("null")){
            valLB_DPF.setText(val);
        }else valLB_DPF.setText("Indeterminado");
        //Adiciona o preço do produto na label
        precoLB_DPF.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutos.getCodigo())));
        //Adiciona a quantidade do produto na label
        estoqueLB_DPF.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutos.getCodigo())));
        //Adiciona o nome do produto na label
        nomeLB_DPF.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutos.getCodigo())));

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

    private void voltarBTN_DPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DPFActionPerformed
        //volta para o CRUD de produtos
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DPFActionPerformed

    private void sairBTN_DPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DPFActionPerformed
        //volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DPFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codLB_DPF;
    private javax.swing.JLabel estoqueLB_DPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DPF;
    private javax.swing.JLabel madeLB_DPF;
    private javax.swing.JLabel nomeLB_DPF;
    private javax.swing.JLabel precoLB_DPF;
    private javax.swing.JButton sairBTN_DPF;
    private javax.swing.JLabel topicoCodLB_DPF;
    private javax.swing.JLabel topicoEstoqueLB_DPF;
    private javax.swing.JLabel topicoNomeLB_DPF;
    private javax.swing.JLabel topicoPrecoLB_DPF;
    private javax.swing.JLabel topicoValLB_DPF;
    private javax.swing.JLabel valLB_DPF;
    private javax.swing.JButton voltarBTN_DPF;
    // End of variables declaration//GEN-END:variables
}
