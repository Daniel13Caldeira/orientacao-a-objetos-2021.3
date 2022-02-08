
package com.made_lavant.view;

import com.made_lavant.dados.FuncionarioDados;


public class PerfilFuncionario extends javax.swing.JFrame {


    public PerfilFuncionario() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoRuaLB_PF = new javax.swing.JLabel();
        topicoIdLB_PF = new javax.swing.JLabel();
        numeroLB_PF = new javax.swing.JLabel();
        cidadeLB_PF = new javax.swing.JLabel();
        topicoNumeroLB_PF = new javax.swing.JLabel();
        topicoCidadeLB_PF = new javax.swing.JLabel();
        titleLB_PF = new javax.swing.JLabel();
        ufLB_PF = new javax.swing.JLabel();
        sairBTN_PF = new javax.swing.JButton();
        topicoUfLB_PF = new javax.swing.JLabel();
        nomeLB_PF = new javax.swing.JLabel();
        cepLB_PF = new javax.swing.JLabel();
        lavantLB_PF = new javax.swing.JLabel();
        topicoCepLB_PF = new javax.swing.JLabel();
        bairroLB_PF = new javax.swing.JLabel();
        topicoNomeLB_PF = new javax.swing.JLabel();
        topicoBairroLB_PF = new javax.swing.JLabel();
        madeLB_PF = new javax.swing.JLabel();
        ruaLB_PF = new javax.swing.JLabel();
        idLB_PF = new javax.swing.JLabel();
        voltarBTN_PF = new javax.swing.JButton();
        editarBTN_PF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil Funcionário");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));
        jPanel1.setToolTipText("");

        topicoRuaLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoRuaLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PF.setText("Rua:");
        topicoRuaLB_PF.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PF.setMinimumSize(new java.awt.Dimension(73, 22));

        topicoIdLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoIdLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoIdLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoIdLB_PF.setText("ID:");
        topicoIdLB_PF.setPreferredSize(new java.awt.Dimension(73, 22));

        numeroLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        numeroLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PF.setText("Numero");
        numeroLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cidadeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cidadeLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cidadeLB_PF.setText("Nome Cidade");
        cidadeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoNumeroLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PF.setText("Número:");

        topicoCidadeLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoCidadeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PF.setText("Cidade:");

        titleLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        titleLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB_PF.setText("Endereço");

        ufLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ufLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PF.setText("UF");
        ufLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sairBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PF.setText("Sair");
        sairBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PFActionPerformed(evt);
            }
        });

        topicoUfLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoUfLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PF.setText("UF:");

        nomeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        nomeLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PF.setText("Nome Funcionário");
        nomeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cepLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cepLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PF.setText("00000-000");
        cepLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PF.setText("Lavant");

        topicoCepLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoCepLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PF.setText("CEP:");

        bairroLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        bairroLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLB_PF.setText("Nome Bairoo");
        bairroLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoNomeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PF.setText("Nome:");

        topicoBairroLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoBairroLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PF.setText("Bairro:");

        madeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PF.setText("MADE");
        madeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ruaLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ruaLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PF.setText("Nome Rua");
        ruaLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        idLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        idLB_PF.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        idLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        idLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLB_PF.setText("123456789-10");
        idLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        voltarBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PF.setText("Voltar");
        voltarBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PFActionPerformed(evt);
            }
        });

        editarBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_PF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        editarBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_PF.setText("Editar");
        editarBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_PFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_PF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarBTN_PF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(madeLB_PF)
                            .addComponent(lavantLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 160, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(topicoUfLB_PF)
                                        .addComponent(topicoBairroLB_PF)
                                        .addComponent(topicoCepLB_PF)
                                        .addComponent(topicoRuaLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(topicoNumeroLB_PF)
                                        .addComponent(topicoCidadeLB_PF))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cidadeLB_PF)
                                        .addComponent(ufLB_PF)
                                        .addComponent(bairroLB_PF)
                                        .addComponent(cepLB_PF)
                                        .addComponent(ruaLB_PF)
                                        .addComponent(numeroLB_PF)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLB_PF)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(topicoIdLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(idLB_PF))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(topicoNomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeLB_PF)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(voltarBTN_PF)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_PF)
                        .addComponent(editarBTN_PF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(madeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(voltarBTN_PF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoIdLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(titleLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoUfLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCepLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNumeroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        numeroLB_PF.setText(FuncionarioDados.buscarNumero(Login.getCodigo()));
        cidadeLB_PF.setText(FuncionarioDados.buscarCidade(Login.getCodigo()));
        ufLB_PF.setText(FuncionarioDados.buscarUF(Login.getCodigo()));
        nomeLB_PF.setText(FuncionarioDados.buscarNome(Login.getCodigo()));
        cepLB_PF.setText(FuncionarioDados.buscarCEP(Login.getCodigo()));
        bairroLB_PF.setText(FuncionarioDados.buscarBairro(Login.getCodigo()));
        ruaLB_PF.setText(FuncionarioDados.buscarRua(Login.getCodigo()));
        idLB_PF.setText(Login.getCodigo());

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

    private void sairBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PFActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PFActionPerformed

    private void voltarBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PFActionPerformed
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PFActionPerformed

    private void editarBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_PFActionPerformed
        this.setVisible(false);
        new EditarDadosFuncionario().setVisible(true);
    }//GEN-LAST:event_editarBTN_PFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PF;
    private javax.swing.JLabel cepLB_PF;
    private javax.swing.JLabel cidadeLB_PF;
    private javax.swing.JButton editarBTN_PF;
    private javax.swing.JLabel idLB_PF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_PF;
    private javax.swing.JLabel madeLB_PF;
    private javax.swing.JLabel nomeLB_PF;
    private javax.swing.JLabel numeroLB_PF;
    private javax.swing.JLabel ruaLB_PF;
    private javax.swing.JButton sairBTN_PF;
    private javax.swing.JLabel titleLB_PF;
    private javax.swing.JLabel topicoBairroLB_PF;
    private javax.swing.JLabel topicoCepLB_PF;
    private javax.swing.JLabel topicoCidadeLB_PF;
    private javax.swing.JLabel topicoIdLB_PF;
    private javax.swing.JLabel topicoNomeLB_PF;
    private javax.swing.JLabel topicoNumeroLB_PF;
    private javax.swing.JLabel topicoRuaLB_PF;
    private javax.swing.JLabel topicoUfLB_PF;
    private javax.swing.JLabel ufLB_PF;
    private javax.swing.JButton voltarBTN_PF;
    // End of variables declaration//GEN-END:variables
}
