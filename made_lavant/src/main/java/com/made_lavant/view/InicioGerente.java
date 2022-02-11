
package com.made_lavant.view;


public class InicioGerente extends javax.swing.JFrame {


    public InicioGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


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
        perfilBTN_IG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Início - Gerente");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        produtoBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        produtoBTN_IG.setFont(produtoBTN_IG.getFont().deriveFont(produtoBTN_IG.getFont().getStyle() & ~java.awt.Font.BOLD, produtoBTN_IG.getFont().getSize()+7));
        produtoBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        produtoBTN_IG.setText("Produtos");
        produtoBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoBTN_IGActionPerformed(evt);
            }
        });

        carrinhoBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        carrinhoBTN_IG.setFont(carrinhoBTN_IG.getFont().deriveFont(carrinhoBTN_IG.getFont().getStyle() & ~java.awt.Font.BOLD, carrinhoBTN_IG.getFont().getSize()+7));
        carrinhoBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        carrinhoBTN_IG.setText("Carrinho");
        carrinhoBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBTN_IGActionPerformed(evt);
            }
        });

        madeLB_IG.setBackground(new java.awt.Color(84, 83, 83));
        madeLB_IG.setFont(madeLB_IG.getFont().deriveFont(madeLB_IG.getFont().getSize()+54f));
        madeLB_IG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_IG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_IG.setText("MADE");

        lavantLB_IG.setFont(lavantLB_IG.getFont().deriveFont(lavantLB_IG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_IG.getFont().getSize()+54));
        lavantLB_IG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_IG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_IG.setText("Lavant");

        sairBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_IG.setFont(sairBTN_IG.getFont().deriveFont(sairBTN_IG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_IG.getFont().getSize()+7));
        sairBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_IG.setText("Sair");
        sairBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_IGActionPerformed(evt);
            }
        });

        funcionariosBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        funcionariosBTN_IG.setFont(funcionariosBTN_IG.getFont().deriveFont(funcionariosBTN_IG.getFont().getStyle() & ~java.awt.Font.BOLD, funcionariosBTN_IG.getFont().getSize()+7));
        funcionariosBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        funcionariosBTN_IG.setText("Funcionários");
        funcionariosBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionariosBTN_IGActionPerformed(evt);
            }
        });

        perfilBTN_IG.setBackground(new java.awt.Color(255, 253, 130));
        perfilBTN_IG.setFont(perfilBTN_IG.getFont().deriveFont(perfilBTN_IG.getFont().getStyle() & ~java.awt.Font.BOLD, perfilBTN_IG.getFont().getSize()+7));
        perfilBTN_IG.setForeground(new java.awt.Color(232, 72, 85));
        perfilBTN_IG.setText("Perfil");
        perfilBTN_IG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBTN_IGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_IG)
                .addContainerGap(695, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(funcionariosBTN_IG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carrinhoBTN_IG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtoBTN_IG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perfilBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lavantLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(madeLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sairBTN_IG)
                .addGap(36, 36, 36)
                .addComponent(madeLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lavantLB_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produtoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carrinhoBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funcionariosBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(perfilBTN_IG, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void produtoBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoBTN_IGActionPerformed
        //vai para o crud de produtos
        this.setVisible(false);
        new CrudProdutosGerente().setVisible(true);
    }//GEN-LAST:event_produtoBTN_IGActionPerformed

    private void carrinhoBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoBTN_IGActionPerformed
        //vai para o crud de carrinhos
        this.setVisible(false);
        new CrudCarrinhoGerente().setVisible(true);
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

    private void perfilBTN_IGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBTN_IGActionPerformed
        this.setVisible(false);
        new PerfilGerente().setVisible(true);
    }//GEN-LAST:event_perfilBTN_IGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrinhoBTN_IG;
    private javax.swing.JButton funcionariosBTN_IG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_IG;
    private javax.swing.JLabel madeLB_IG;
    private javax.swing.JButton perfilBTN_IG;
    private javax.swing.JButton produtoBTN_IG;
    private javax.swing.JButton sairBTN_IG;
    // End of variables declaration//GEN-END:variables
}
