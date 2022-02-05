package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.ProdutoDados;
import javax.swing.JTextField;

public class EditarProdutoGerente extends javax.swing.JFrame {

    public EditarProdutoGerente() {
        initComponents();
        ProdutoDados prod = new ProdutoDados();
        nomeLB_EDPG.setText(prod.buscarNome(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        quantiTF_EDPG.setText(prod.buscarQuantidade(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        precoTF_EDPG.setText(prod.buscarPreco(Integer.parseInt(CrudProdutosGerente.getCodigo())));
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoNomeLB_EDPG = new javax.swing.JLabel();
        madeLB_EDPG = new javax.swing.JLabel();
        titleLB_EDPG = new javax.swing.JLabel();
        precoTF_EDPG = new javax.swing.JTextField();
        lavantLB_EDPG = new javax.swing.JLabel();
        confirmarBTN_EDPG = new javax.swing.JButton();
        quantiTF_EDPG = new javax.swing.JTextField();
        topicoPrecoLB_EDPG = new javax.swing.JLabel();
        sairBTN_EDPG = new javax.swing.JButton();
        topicoQuantiLB_EDPG = new javax.swing.JLabel();
        voltarBTN_EDPG = new javax.swing.JButton();
        nomeLB_EDPG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoNomeLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNomeLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_EDPG.setText("Nome");

        madeLB_EDPG.setFont(new java.awt.Font("Colonna MT", 0, 18)); // NOI18N
        madeLB_EDPG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDPG.setText("MADE");

        titleLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDPG.setText("Editar Produto");
        titleLB_EDPG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDPG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        precoTF_EDPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTF_EDPGActionPerformed(evt);
            }
        });
        precoTF_EDPG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoTF_EDPGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoTF_EDPGKeyTyped(evt);
            }
        });

        lavantLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        lavantLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_EDPG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_EDPG.setText("Lavant");

        confirmarBTN_EDPG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDPG.setText("Confirmar");
        confirmarBTN_EDPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDPGActionPerformed(evt);
            }
        });

        quantiTF_EDPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiTF_EDPGActionPerformed(evt);
            }
        });
        quantiTF_EDPG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantiTF_EDPGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantiTF_EDPGKeyTyped(evt);
            }
        });

        topicoPrecoLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoPrecoLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_EDPG.setText("Preço");

        sairBTN_EDPG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDPG.setText("Sair");
        sairBTN_EDPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDPGActionPerformed(evt);
            }
        });

        topicoQuantiLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoQuantiLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiLB_EDPG.setText("Quantidade");

        voltarBTN_EDPG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        voltarBTN_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDPG.setText("Voltar");
        voltarBTN_EDPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDPGActionPerformed(evt);
            }
        });

        nomeLB_EDPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        nomeLB_EDPG.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_EDPG.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_EDPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBTN_EDPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_EDPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(madeLB_EDPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB_EDPG)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topicoQuantiLB_EDPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoPrecoLB_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precoTF_EDPG)
                            .addComponent(quantiTF_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(confirmarBTN_EDPG)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNomeLB_EDPG)
                        .addGap(39, 39, 39)
                        .addComponent(nomeLB_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madeLB_EDPG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_EDPG)
                        .addComponent(voltarBTN_EDPG)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_EDPG)
                .addGap(7, 7, 7)
                .addComponent(titleLB_EDPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topicoNomeLB_EDPG)
                    .addComponent(nomeLB_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_EDPG)
                    .addComponent(precoTF_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiLB_EDPG)
                    .addComponent(quantiTF_EDPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(confirmarBTN_EDPG)
                .addGap(59, 59, 59))
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

    private void precoTF_EDPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTF_EDPGActionPerformed
    }//GEN-LAST:event_precoTF_EDPGActionPerformed

    private void confirmarBTN_EDPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_EDPGActionPerformed
        boolean edicao = true;
        if (precoTF_EDPG.getText().equals("") || precoTF_EDPG.getText().equals("Campo obrigatório")) {
            precoTF_EDPG.setText("Campo obrigatório");
            edicao = false;
        }
        if (quantiTF_EDPG.getText().equals("") || quantiTF_EDPG.getText().equals("Campo obrigatório")) {
            quantiTF_EDPG.setText("Campo obrigatório");
            edicao = false;
        }
        if (edicao) {
            ProdutoDados prod = new ProdutoDados();
            prod.alterar(new Produto((Integer.parseInt(CrudProdutos.getCodigo())), (Double.parseDouble(precoTF_EDPG.getText())), (Double.parseDouble(quantiTF_EDPG.getText()))));
            this.setVisible(false);
            new DetalheProduto_Gerente().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_EDPGActionPerformed

    private void quantiTF_EDPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiTF_EDPGActionPerformed
    }//GEN-LAST:event_quantiTF_EDPGActionPerformed

    private void sairBTN_EDPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_EDPGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_EDPGActionPerformed

    private void voltarBTN_EDPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_EDPGActionPerformed
        this.setVisible(false);
        new CrudProdutosGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_EDPGActionPerformed

    private void precoTF_EDPGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_EDPGKeyReleased
        mascaraDouble(precoTF_EDPG);
    }//GEN-LAST:event_precoTF_EDPGKeyReleased

    private void precoTF_EDPGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_EDPGKeyTyped
        mascaraDouble(precoTF_EDPG);
    }//GEN-LAST:event_precoTF_EDPGKeyTyped

    private void quantiTF_EDPGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantiTF_EDPGKeyReleased
        mascaraDouble(quantiTF_EDPG);
    }//GEN-LAST:event_quantiTF_EDPGKeyReleased

    private void quantiTF_EDPGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantiTF_EDPGKeyTyped
        mascaraDouble(quantiTF_EDPG);
    }//GEN-LAST:event_quantiTF_EDPGKeyTyped
    private void mascaraDouble(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (!(texto.charAt(texto.length() - 1) == '.' || (texto.charAt(texto.length() - 1) >= '0' && texto.charAt(texto.length() - 1) <= '9'))) {
                texto = texto.substring(0, texto.length() - 1);
            }
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == '.') {
                    cont++;
                }
            }
            if (cont > 1) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_EDPG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_EDPG;
    private javax.swing.JLabel madeLB_EDPG;
    private javax.swing.JLabel nomeLB_EDPG;
    private javax.swing.JTextField precoTF_EDPG;
    private javax.swing.JTextField quantiTF_EDPG;
    private javax.swing.JButton sairBTN_EDPG;
    private javax.swing.JLabel titleLB_EDPG;
    private javax.swing.JLabel topicoNomeLB_EDPG;
    private javax.swing.JLabel topicoPrecoLB_EDPG;
    private javax.swing.JLabel topicoQuantiLB_EDPG;
    private javax.swing.JButton voltarBTN_EDPG;
    // End of variables declaration//GEN-END:variables
}
