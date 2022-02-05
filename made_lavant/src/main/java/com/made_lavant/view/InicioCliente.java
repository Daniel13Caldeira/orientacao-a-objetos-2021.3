
package com.made_lavant.view;


public class InicioCliente extends javax.swing.JFrame {


    public InicioCliente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        sairBTN_IC = new javax.swing.JButton();
        madeLB_IC = new javax.swing.JLabel();
        lavantLB_IC = new javax.swing.JLabel();
        carrinhoBTN_IC = new javax.swing.JButton();
        produtosBTN_IC = new javax.swing.JButton();
        perfilBTN_IC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaCliente");

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));
        jPanel2.setToolTipText("TelaCliente");
        jPanel2.setFont(new java.awt.Font("Colonna MT", 0, 18)); // NOI18N
        jPanel2.setName("TelaCliente"); // NOI18N

        sairBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_IC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_IC.setText("Sair");
        sairBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        madeLB_IC.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        madeLB_IC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_IC.setText("MADE");
        madeLB_IC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lavantLB_IC.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        lavantLB_IC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_IC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_IC.setText("Lavant");
        lavantLB_IC.setToolTipText("");

        carrinhoBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        carrinhoBTN_IC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        carrinhoBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        carrinhoBTN_IC.setText("Carrinho");
        carrinhoBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        produtosBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        produtosBTN_IC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        produtosBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        produtosBTN_IC.setText("Produtos");
        produtosBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosBTN_ICActionPerformed(evt);
            }
        });

        perfilBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        perfilBTN_IC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        perfilBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        perfilBTN_IC.setText("Perfil");
        perfilBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_IC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(madeLB_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lavantLB_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(perfilBTN_IC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carrinhoBTN_IC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produtosBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(madeLB_IC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_IC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lavantLB_IC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carrinhoBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produtosBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(perfilBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //vai para o perfil do cliente
        this.setVisible(false);
        new PerfilCliente().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //vai para o carrinho
        this.setVisible(false);
        new TelaCarrinho().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //retorna para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void produtosBTN_ICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosBTN_ICActionPerformed
        //vai para o crud de produtos
        this.setVisible(false);
        new CrudProdutos_Cliente().setVisible(true);
    }//GEN-LAST:event_produtosBTN_ICActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrinhoBTN_IC;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lavantLB_IC;
    private javax.swing.JLabel madeLB_IC;
    private javax.swing.JButton perfilBTN_IC;
    private javax.swing.JButton produtosBTN_IC;
    private javax.swing.JButton sairBTN_IC;
    // End of variables declaration//GEN-END:variables
}
