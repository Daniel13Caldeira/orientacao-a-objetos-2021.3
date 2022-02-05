package com.made_lavant.view;

public class InicioFuncionario extends javax.swing.JFrame {

    public InicioFuncionario() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        produtosBTN_IF = new javax.swing.JButton();
        carrinhosBTN_IF = new javax.swing.JButton();
        madeLB_IF = new javax.swing.JLabel();
        lavantLB_IF = new javax.swing.JLabel();
        sairBTN_IF = new javax.swing.JButton();
        perfilBTN_IF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Início - Funcionários");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(84, 83, 83));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(getMaximizedBounds());

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        produtosBTN_IF.setBackground(new java.awt.Color(255, 253, 130));
        produtosBTN_IF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        produtosBTN_IF.setForeground(new java.awt.Color(232, 72, 85));
        produtosBTN_IF.setText("Produtos");
        produtosBTN_IF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosBTN_IFActionPerformed(evt);
            }
        });

        carrinhosBTN_IF.setBackground(new java.awt.Color(255, 253, 130));
        carrinhosBTN_IF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        carrinhosBTN_IF.setForeground(new java.awt.Color(232, 72, 85));
        carrinhosBTN_IF.setText("Carrinhos");
        carrinhosBTN_IF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhosBTN_IFActionPerformed(evt);
            }
        });

        madeLB_IF.setBackground(new java.awt.Color(84, 83, 83));
        madeLB_IF.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        madeLB_IF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_IF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        madeLB_IF.setText("MADE");

        lavantLB_IF.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        lavantLB_IF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_IF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lavantLB_IF.setText("Lavant");

        sairBTN_IF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_IF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_IF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_IF.setText("Sair");
        sairBTN_IF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_IFActionPerformed(evt);
            }
        });

        perfilBTN_IF.setBackground(new java.awt.Color(255, 253, 130));
        perfilBTN_IF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        perfilBTN_IF.setForeground(new java.awt.Color(232, 72, 85));
        perfilBTN_IF.setText("Perfil");
        perfilBTN_IF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBTN_IFActionPerformed(evt);
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
                        .addComponent(sairBTN_IF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(228, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(carrinhosBTN_IF, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(produtosBTN_IF, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(perfilBTN_IF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sairBTN_IF)
                .addGap(18, 92, Short.MAX_VALUE)
                .addComponent(madeLB_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lavantLB_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produtosBTN_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carrinhosBTN_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(perfilBTN_IF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrinhosBTN_IFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhosBTN_IFActionPerformed
        //vai para o crud de carrinhos
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_carrinhosBTN_IFActionPerformed

    private void produtosBTN_IFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosBTN_IFActionPerformed
        //vai para o crud de produtos
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_produtosBTN_IFActionPerformed

    private void sairBTN_IFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_IFActionPerformed
        //vai para o login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_IFActionPerformed

    private void perfilBTN_IFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBTN_IFActionPerformed
        this.setVisible(false);
        new PerfilFuncionario().setVisible(true);
    }//GEN-LAST:event_perfilBTN_IFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrinhosBTN_IF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_IF;
    private javax.swing.JLabel madeLB_IF;
    private javax.swing.JButton perfilBTN_IF;
    private javax.swing.JButton produtosBTN_IF;
    private javax.swing.JButton sairBTN_IF;
    // End of variables declaration//GEN-END:variables

}
