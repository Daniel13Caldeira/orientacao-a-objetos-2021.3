package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.ProdutoDados;
import javax.swing.JTextField;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class EditarProduto extends javax.swing.JFrame {

    public EditarProduto() {
        initComponents();
        //Preenche os text fields com as informações que foram cadastradas
        nomeLB_EDP.setText(ProdutoDados.buscarNome(Integer.parseInt(CrudProdutos.getCodigo())));
        quantiTF_EDP.setText(ProdutoDados.buscarQuantidade(Integer.parseInt(CrudProdutos.getCodigo())));
        precoTF_EDP.setText(ProdutoDados.buscarPreco(Integer.parseInt(CrudProdutos.getCodigo())));
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoQuantiLB_EDP = new javax.swing.JLabel();
        sairBTN_EDP = new javax.swing.JButton();
        topicoPrecoLB_EDP = new javax.swing.JLabel();
        quantiTF_EDP = new javax.swing.JTextField();
        confirmarBTN_EDP = new javax.swing.JButton();
        lavantLB_EDP = new javax.swing.JLabel();
        precoTF_EDP = new javax.swing.JTextField();
        titleLB_EDP = new javax.swing.JLabel();
        madeLB_EDP = new javax.swing.JLabel();
        topicoNomeLB_EDP = new javax.swing.JLabel();
        nomeLB_EDP = new javax.swing.JLabel();
        voltarBTN_EDP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Produto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoQuantiLB_EDP.setFont(topicoQuantiLB_EDP.getFont().deriveFont(topicoQuantiLB_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoQuantiLB_EDP.getFont().getSize()+7));
        topicoQuantiLB_EDP.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiLB_EDP.setText("Quantidade");

        sairBTN_EDP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDP.setFont(sairBTN_EDP.getFont().deriveFont(sairBTN_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_EDP.getFont().getSize()+7));
        sairBTN_EDP.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDP.setText("Sair");
        sairBTN_EDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDPActionPerformed(evt);
            }
        });

        topicoPrecoLB_EDP.setFont(topicoPrecoLB_EDP.getFont().deriveFont(topicoPrecoLB_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoPrecoLB_EDP.getFont().getSize()+7));
        topicoPrecoLB_EDP.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_EDP.setText("Preço");

        quantiTF_EDP.setFont(quantiTF_EDP.getFont());
        quantiTF_EDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantiTF_EDPActionPerformed(evt);
            }
        });
        quantiTF_EDP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantiTF_EDPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantiTF_EDPKeyTyped(evt);
            }
        });

        confirmarBTN_EDP.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDP.setFont(confirmarBTN_EDP.getFont().deriveFont(confirmarBTN_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_EDP.getFont().getSize()+7));
        confirmarBTN_EDP.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDP.setText("Confirmar");
        confirmarBTN_EDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDPActionPerformed(evt);
            }
        });

        lavantLB_EDP.setFont(lavantLB_EDP.getFont().deriveFont(lavantLB_EDP.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_EDP.getFont().getSize()+7));
        lavantLB_EDP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_EDP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_EDP.setText("Lavant");

        precoTF_EDP.setFont(precoTF_EDP.getFont());
        precoTF_EDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTF_EDPActionPerformed(evt);
            }
        });
        precoTF_EDP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoTF_EDPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoTF_EDPKeyTyped(evt);
            }
        });

        titleLB_EDP.setFont(titleLB_EDP.getFont().deriveFont(titleLB_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_EDP.getFont().getSize()+25));
        titleLB_EDP.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDP.setText("Editar Produto");
        titleLB_EDP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        madeLB_EDP.setFont(madeLB_EDP.getFont().deriveFont(madeLB_EDP.getFont().getStyle() | java.awt.Font.BOLD, madeLB_EDP.getFont().getSize()+7));
        madeLB_EDP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDP.setText("MADE");

        topicoNomeLB_EDP.setFont(topicoNomeLB_EDP.getFont().deriveFont(topicoNomeLB_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_EDP.getFont().getSize()+7));
        topicoNomeLB_EDP.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_EDP.setText("Nome");

        nomeLB_EDP.setFont(nomeLB_EDP.getFont().deriveFont(nomeLB_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_EDP.getFont().getSize()+7));
        nomeLB_EDP.setForeground(new java.awt.Color(232, 72, 85));

        voltarBTN_EDP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDP.setFont(voltarBTN_EDP.getFont().deriveFont(voltarBTN_EDP.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_EDP.getFont().getSize()+7));
        voltarBTN_EDP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDP.setText("Voltar");
        voltarBTN_EDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_EDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voltarBTN_EDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_EDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(madeLB_EDP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB_EDP)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNomeLB_EDP)
                        .addGap(39, 39, 39)
                        .addComponent(nomeLB_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmarBTN_EDP)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(topicoQuantiLB_EDP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(topicoPrecoLB_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(precoTF_EDP)
                                .addComponent(quantiTF_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madeLB_EDP)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_EDP)
                        .addComponent(voltarBTN_EDP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_EDP)
                .addGap(7, 7, 7)
                .addComponent(titleLB_EDP)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topicoNomeLB_EDP)
                    .addComponent(nomeLB_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_EDP)
                    .addComponent(precoTF_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiLB_EDP)
                    .addComponent(quantiTF_EDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(confirmarBTN_EDP)
                .addContainerGap())
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

    private void sairBTN_EDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_EDPActionPerformed
        //Volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_EDPActionPerformed

    private void confirmarBTN_EDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_EDPActionPerformed
        //verifica se a edição pode ser feita
        boolean edicao = true;
        //verifica os campos obrigatórios
        if (precoTF_EDP.getText().equals("") || precoTF_EDP.getText().equals("Campo obrigatório")) {
            precoTF_EDP.setText("Campo obrigatório");
            edicao = false;
        }
        if (quantiTF_EDP.getText().equals("") || quantiTF_EDP.getText().equals("Campo obrigatório")) {
            quantiTF_EDP.setText("Campo obrigatório");
            edicao = false;
        }
        //edita o produto
        if (edicao) {
            ProdutoDados.alterar(new Produto((Integer.parseInt(CrudProdutos.getCodigo())), (Double.parseDouble(precoTF_EDP.getText())), (Double.parseDouble(quantiTF_EDP.getText()))));
            this.setVisible(false);
            new DetalheProduto_Func().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_EDPActionPerformed

    private void precoTF_EDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTF_EDPActionPerformed
    }//GEN-LAST:event_precoTF_EDPActionPerformed

    private void voltarBTN_EDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_EDPActionPerformed
        //volta para o crud de produtos
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_voltarBTN_EDPActionPerformed

    private void precoTF_EDPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_EDPKeyReleased
        mascaraDouble(precoTF_EDP);
    }//GEN-LAST:event_precoTF_EDPKeyReleased

    private void precoTF_EDPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_EDPKeyTyped
        mascaraDouble(precoTF_EDP);
    }//GEN-LAST:event_precoTF_EDPKeyTyped

    private void quantiTF_EDPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantiTF_EDPKeyReleased
        mascaraDouble(quantiTF_EDP);
    }//GEN-LAST:event_quantiTF_EDPKeyReleased

    private void quantiTF_EDPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantiTF_EDPKeyTyped
        mascaraDouble(quantiTF_EDP);
    }//GEN-LAST:event_quantiTF_EDPKeyTyped

    private void quantiTF_EDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantiTF_EDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantiTF_EDPActionPerformed

    private void mascaraDouble(JTextField textField) {
        //Verifica se o número digitado é um valor do tipo double
        String texto = textField.getText();
        if (texto.length() > 0) {
            //Verifica o separador decimal e se é um número
            if (!(texto.charAt(texto.length() - 1) == '.' || (texto.charAt(texto.length() - 1) >= '0' && texto.charAt(texto.length() - 1) <= '9'))) {
                //Apaga o último caractere
                texto = texto.substring(0, texto.length() - 1);
            }
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                //Verifica se há mais de um Ponto
                if (texto.charAt(i) == '.') {
                    cont++;
                }
            }
            if (cont > 1) {
                //Apaga o último caractere
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_EDP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_EDP;
    private javax.swing.JLabel madeLB_EDP;
    private javax.swing.JLabel nomeLB_EDP;
    private javax.swing.JTextField precoTF_EDP;
    private javax.swing.JTextField quantiTF_EDP;
    private javax.swing.JButton sairBTN_EDP;
    private javax.swing.JLabel titleLB_EDP;
    private javax.swing.JLabel topicoNomeLB_EDP;
    private javax.swing.JLabel topicoPrecoLB_EDP;
    private javax.swing.JLabel topicoQuantiLB_EDP;
    private javax.swing.JButton voltarBTN_EDP;
    // End of variables declaration//GEN-END:variables
}
