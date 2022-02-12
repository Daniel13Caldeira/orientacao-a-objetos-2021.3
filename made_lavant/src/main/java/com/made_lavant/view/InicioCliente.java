
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
        perfilBTN_IC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));
        jPanel2.setToolTipText("TelaCliente");
        jPanel2.setFont(new java.awt.Font("Colonna MT", 0, 18)); // NOI18N
        jPanel2.setName("TelaCliente"); // NOI18N

        sairBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_IC.setFont(sairBTN_IC.getFont().deriveFont(sairBTN_IC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_IC.getFont().getSize()+7));
        sairBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_IC.setText("Sair");
        sairBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairInicioClineteBTNActionPerformed(evt);
            }
        });

        madeLB_IC.setFont(madeLB_IC.getFont().deriveFont(madeLB_IC.getFont().getStyle() & ~java.awt.Font.BOLD, madeLB_IC.getFont().getSize()+54));
        madeLB_IC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_IC.setText("MADE");
        madeLB_IC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lavantLB_IC.setFont(lavantLB_IC.getFont().deriveFont(lavantLB_IC.getFont().getStyle() & ~java.awt.Font.BOLD, lavantLB_IC.getFont().getSize()+54));
        lavantLB_IC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_IC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_IC.setText("Lavant");
        lavantLB_IC.setToolTipText("");

        carrinhoBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        carrinhoBTN_IC.setFont(carrinhoBTN_IC.getFont().deriveFont(carrinhoBTN_IC.getFont().getStyle() & ~java.awt.Font.BOLD, carrinhoBTN_IC.getFont().getSize()+7));
        carrinhoBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        carrinhoBTN_IC.setText("Carrinho");
        carrinhoBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBTNActionPerformed(evt);
            }
        });

        perfilBTN_IC.setBackground(new java.awt.Color(255, 253, 130));
        perfilBTN_IC.setFont(perfilBTN_IC.getFont().deriveFont(perfilBTN_IC.getFont().getStyle() & ~java.awt.Font.BOLD, perfilBTN_IC.getFont().getSize()+7));
        perfilBTN_IC.setForeground(new java.awt.Color(232, 72, 85));
        perfilBTN_IC.setText("Perfil");
        perfilBTN_IC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilClienteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_IC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madeLB_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavantLB_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(perfilBTN_IC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carrinhoBTN_IC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_IC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(madeLB_IC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_IC)))
                .addGap(34, 34, 34)
                .addComponent(carrinhoBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(perfilBTN_IC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void sairInicioClineteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairInicioClineteBTNActionPerformed
        //retorna para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairInicioClineteBTNActionPerformed

    private void carrinhoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoBTNActionPerformed
        //vai para o carrinho
        this.setVisible(false);
        new TelaCarrinho().setVisible(true);
    }//GEN-LAST:event_carrinhoBTNActionPerformed

    private void perfilClienteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilClienteBTNActionPerformed
        //vai para o perfil do cliente
        this.setVisible(false);
        new PerfilCliente().setVisible(true);
    }//GEN-LAST:event_perfilClienteBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrinhoBTN_IC;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lavantLB_IC;
    private javax.swing.JLabel madeLB_IC;
    private javax.swing.JButton perfilBTN_IC;
    private javax.swing.JButton sairBTN_IC;
    // End of variables declaration//GEN-END:variables
}
