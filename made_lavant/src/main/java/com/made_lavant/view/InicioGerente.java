/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.made_lavant.view;

/**
 *
 * @author Daniel
 */
public class InicioGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerente
     */
    public InicioGerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        produtoGerente_btn1 = new javax.swing.JButton();
        carrinhoGerente_btn1 = new javax.swing.JButton();
        made_label = new javax.swing.JLabel();
        lavant_btn = new javax.swing.JLabel();
        Sair_btn = new javax.swing.JButton();
        funcionariosGerente_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Início - Gerente");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        produtoGerente_btn1.setBackground(new java.awt.Color(255, 253, 130));
        produtoGerente_btn1.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        produtoGerente_btn1.setForeground(new java.awt.Color(232, 72, 85));
        produtoGerente_btn1.setText("Produtos");
        produtoGerente_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoGerente_btn1ActionPerformed(evt);
            }
        });

        carrinhoGerente_btn1.setBackground(new java.awt.Color(255, 253, 130));
        carrinhoGerente_btn1.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        carrinhoGerente_btn1.setForeground(new java.awt.Color(232, 72, 85));
        carrinhoGerente_btn1.setText("Carrinho");
        carrinhoGerente_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoGerente_btn1ActionPerformed(evt);
            }
        });

        made_label.setBackground(new java.awt.Color(84, 83, 83));
        made_label.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        made_label.setForeground(new java.awt.Color(255, 253, 130));
        made_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        made_label.setText("MADE");

        lavant_btn.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        lavant_btn.setForeground(new java.awt.Color(232, 72, 85));
        lavant_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lavant_btn.setText("Lavant");

        Sair_btn.setBackground(new java.awt.Color(255, 253, 130));
        Sair_btn.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        Sair_btn.setForeground(new java.awt.Color(232, 72, 85));
        Sair_btn.setText("Sair");
        Sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_btnActionPerformed(evt);
            }
        });

        funcionariosGerente_btn.setBackground(new java.awt.Color(255, 253, 130));
        funcionariosGerente_btn.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        funcionariosGerente_btn.setForeground(new java.awt.Color(232, 72, 85));
        funcionariosGerente_btn.setText("Funcionários");
        funcionariosGerente_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariosGerente_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Sair_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(250, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(made_label, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funcionariosGerente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrinhoGerente_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoGerente_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Sair_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(made_label, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lavant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produtoGerente_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carrinhoGerente_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funcionariosGerente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void produtoGerente_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoGerente_btn1ActionPerformed
        //vai para o crud de produtos
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_produtoGerente_btn1ActionPerformed

    private void carrinhoGerente_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoGerente_btn1ActionPerformed
        //vai para o crud de carrinhos
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_carrinhoGerente_btn1ActionPerformed

    private void Sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_btnActionPerformed
        //vai para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_Sair_btnActionPerformed

    private void funcionariosGerente_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariosGerente_btnActionPerformed
        //vai para o crud de funcionários
        this.setVisible(false);
        new CrudFuncionarios().setVisible(true);
    }//GEN-LAST:event_funcionariosGerente_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair_btn;
    private javax.swing.JButton carrinhoGerente_btn1;
    private javax.swing.JButton funcionariosGerente_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavant_btn;
    private javax.swing.JLabel made_label;
    private javax.swing.JButton produtoGerente_btn1;
    // End of variables declaration//GEN-END:variables
}
