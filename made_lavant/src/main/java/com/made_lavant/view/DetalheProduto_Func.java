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
        topicoQuantiDispLB_DPF = new javax.swing.JLabel();
        precoLB_DPF = new javax.swing.JLabel();
        quantiDispLB_DPF = new javax.swing.JLabel();
        nomeLB_DPF = new javax.swing.JLabel();
        sairBTN_DPF = new javax.swing.JButton();
        madeLB_DPF = new javax.swing.JLabel();
        topicoNomeLB_DPF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        lavantLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 45)); // NOI18N
        lavantLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DPF.setText("Lavant");

        voltarBTN_DPF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DPF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_DPF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DPF.setText("Voltar");
        voltarBTN_DPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DPFActionPerformed(evt);
            }
        });

        topicoCodLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoCodLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCodLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCodLB_DPF.setText("Código");

        codLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        codLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        codLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        topicoValLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoValLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoValLB_DPF.setText("Validade");

        valLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        valLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        valLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        topicoPrecoLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoPrecoLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoPrecoLB_DPF.setText("Preço");

        topicoQuantiDispLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoQuantiDispLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiDispLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoQuantiDispLB_DPF.setText("Quantidade disponível");

        precoLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        precoLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        precoLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        quantiDispLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        quantiDispLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        quantiDispLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        nomeLB_DPF.setBackground(new java.awt.Color(255, 255, 255));
        nomeLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        nomeLB_DPF.setForeground(new java.awt.Color(255, 253, 130));

        sairBTN_DPF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DPF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_DPF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DPF.setText("Sair");
        sairBTN_DPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DPFActionPerformed(evt);
            }
        });

        madeLB_DPF.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DPF.setFont(new java.awt.Font("Colonna MT", 0, 45)); // NOI18N
        madeLB_DPF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DPF.setText("MADE");
        madeLB_DPF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_DPF.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_DPF.setFont(new java.awt.Font("Colonna MT", 1, 16)); // NOI18N
        topicoNomeLB_DPF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_DPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoNomeLB_DPF.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madeLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavantLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_DPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoValLB_DPF)
                            .addComponent(topicoQuantiDispLB_DPF)
                            .addComponent(topicoCodLB_DPF)
                            .addComponent(topicoPrecoLB_DPF)
                            .addComponent(topicoNomeLB_DPF))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(precoLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantiDispLB_DPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarBTN_DPF)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarBTN_DPF)
                    .addComponent(sairBTN_DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_DPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DPF)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNomeLB_DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_DPF)
                    .addComponent(precoLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCodLB_DPF)
                    .addComponent(codLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoValLB_DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiDispLB_DPF)
                    .addComponent(quantiDispLB_DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        quantiDispLB_DPF.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutos.getCodigo())));
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_DPF;
    private javax.swing.JLabel madeLB_DPF;
    private javax.swing.JLabel nomeLB_DPF;
    private javax.swing.JLabel precoLB_DPF;
    private javax.swing.JLabel quantiDispLB_DPF;
    private javax.swing.JButton sairBTN_DPF;
    private javax.swing.JLabel topicoCodLB_DPF;
    private javax.swing.JLabel topicoNomeLB_DPF;
    private javax.swing.JLabel topicoPrecoLB_DPF;
    private javax.swing.JLabel topicoQuantiDispLB_DPF;
    private javax.swing.JLabel topicoValLB_DPF;
    private javax.swing.JLabel valLB_DPF;
    private javax.swing.JButton voltarBTN_DPF;
    // End of variables declaration//GEN-END:variables
}
