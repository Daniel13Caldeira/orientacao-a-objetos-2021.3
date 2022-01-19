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
        setExtendedState(MAXIMIZED_BOTH);
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
        produtoBTN_IG = new javax.swing.JButton();
        carrinhoBTN_IG = new javax.swing.JButton();
        madeLB_IG = new javax.swing.JLabel();
        lavantLB_IG = new javax.swing.JLabel();
        sairBTN_IG = new javax.swing.JButton();
        funcionariosBTN_IG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Início - Gerente");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        produtoBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        produtoBTN_IG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        produtoBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        produtoBTN_IG.setText("Produtos");
        produtoBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoBTN_IGActionPerformed(evt);
            }
        });

        carrinhoBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        carrinhoBTN_IG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        carrinhoBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        carrinhoBTN_IG.setText("Carrinho");
        carrinhoBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBTN_IGActionPerformed(evt);
            }
        });

        madeLB_IG.setBackground(new java.awt.Color(84, 83, 83));
        madeLB_IG.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        madeLB_IG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_IG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        madeLB_IG.setText("MADE");

        lavantLB_IG.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        lavantLB_IG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_IG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lavantLB_IG.setText("Lavant");

        sairBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_IG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_IG.setText("Sair");
        sairBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_IGActionPerformed(evt);
            }
        });

        funcionariosBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        funcionariosBTN_IG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        funcionariosBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        funcionariosBTN_IG.setText("Funcionários");
        funcionariosBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariosBTN_IGActionPerformed(evt);
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
                        .addComponent(sairBTN_IG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(250, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funcionariosBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carrinhoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sairBTN_IG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(madeLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lavantLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produtoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carrinhoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funcionariosBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void produtoBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoBTN_IGActionPerformed
        //vai para o crud de produtos
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_produtoBTN_IGActionPerformed

    private void carrinhoBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoBTN_IGActionPerformed
        //vai para o crud de carrinhos
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_carrinhoBTN_IGActionPerformed

    private void sairBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_IGActionPerformed
        //vai para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_IGActionPerformed

    private void funcionariosBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionariosBTN_IGActionPerformed
        //vai para o crud de funcionários
        this.setVisible(false);
        new CrudFuncionarios().setVisible(true);
    }//GEN-LAST:event_funcionariosBTN_IGActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrinhoBTN_IG;
    private javax.swing.JButton funcionariosBTN_IG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_IG;
    private javax.swing.JLabel madeLB_IG;
    private javax.swing.JButton produtoBTN_IG;
    private javax.swing.JButton sairBTN_IG;
    // End of variables declaration//GEN-END:variables
}
