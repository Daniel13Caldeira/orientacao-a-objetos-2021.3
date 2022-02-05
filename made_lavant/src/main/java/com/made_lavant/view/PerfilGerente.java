
package com.made_lavant.view;

import com.made_lavant.dados.FuncionarioDados;


public class PerfilGerente extends javax.swing.JFrame {


    public PerfilGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bairroLB_PG = new javax.swing.JLabel();
        topicoNumeroLB_PG = new javax.swing.JLabel();
        topicoNomeLB_PG = new javax.swing.JLabel();
        topicoCidadeLB_PG = new javax.swing.JLabel();
        topicoBairroLB_PG = new javax.swing.JLabel();
        titleLB_PG = new javax.swing.JLabel();
        madeLB_PG = new javax.swing.JLabel();
        ufLB_PG = new javax.swing.JLabel();
        ruaLB_PG = new javax.swing.JLabel();
        sairBTN_PG = new javax.swing.JButton();
        idLB_PG = new javax.swing.JLabel();
        topicoUfLB_PG = new javax.swing.JLabel();
        voltarBTN_PG = new javax.swing.JButton();
        nomeLB_PG = new javax.swing.JLabel();
        topicoRuaLB_PG = new javax.swing.JLabel();
        cepLB_PG = new javax.swing.JLabel();
        topicoIdLB_PG = new javax.swing.JLabel();
        lavantLB_PG = new javax.swing.JLabel();
        numeroLB_PG = new javax.swing.JLabel();
        topicoCepLB_PG = new javax.swing.JLabel();
        cidadeLB_PG = new javax.swing.JLabel();
        editarBTN_PG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        bairroLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        bairroLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLB_PG.setText("Nome Bairoo");
        bairroLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoNumeroLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PG.setText("Número:");

        topicoNomeLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoNomeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PG.setText("Nome:");

        topicoCidadeLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoCidadeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PG.setText("Cidade:");

        topicoBairroLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoBairroLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PG.setText("Bairro:");

        titleLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        titleLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB_PG.setText("Endereço");

        madeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PG.setText("MADE");
        madeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ufLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ufLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PG.setText("UF");
        ufLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ruaLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ruaLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PG.setText("Nome Rua");
        ruaLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sairBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PG.setText("Sair");
        sairBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PGActionPerformed(evt);
            }
        });

        idLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        idLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        idLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        idLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLB_PG.setText("123456789-10");
        idLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoUfLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoUfLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PG.setText("UF:");

        voltarBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PG.setText("Voltar");
        voltarBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PGActionPerformed(evt);
            }
        });

        nomeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        nomeLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PG.setText("Nome Funcionário");
        nomeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoRuaLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoRuaLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PG.setText("Rua:");
        topicoRuaLB_PG.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PG.setMinimumSize(new java.awt.Dimension(73, 22));

        cepLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cepLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PG.setText("00000-000");
        cepLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoIdLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoIdLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoIdLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoIdLB_PG.setText("ID:");
        topicoIdLB_PG.setPreferredSize(new java.awt.Dimension(73, 22));

        lavantLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PG.setText("Lavant");

        numeroLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        numeroLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PG.setText("Numero");
        numeroLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoCepLB_PG.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoCepLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PG.setText("CEP:");

        cidadeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PG.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cidadeLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cidadeLB_PG.setText("Nome Cidade");
        cidadeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        editarBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_PG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        editarBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_PG.setText("Editar");
        editarBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_PGActionPerformed(evt);
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
                        .addComponent(sairBTN_PG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarBTN_PG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(madeLB_PG)
                            .addComponent(lavantLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 164, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(topicoUfLB_PG)
                                        .addComponent(topicoBairroLB_PG)
                                        .addComponent(topicoCepLB_PG)
                                        .addComponent(topicoRuaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(topicoNumeroLB_PG)
                                        .addComponent(topicoCidadeLB_PG))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cidadeLB_PG)
                                        .addComponent(ufLB_PG)
                                        .addComponent(bairroLB_PG)
                                        .addComponent(cepLB_PG)
                                        .addComponent(ruaLB_PG)
                                        .addComponent(numeroLB_PG)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLB_PG)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(topicoIdLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(idLB_PG))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(topicoNomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeLB_PG)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(voltarBTN_PG)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_PG)
                        .addComponent(editarBTN_PG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(madeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(voltarBTN_PG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoIdLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(titleLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoUfLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCepLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNumeroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        FuncionarioDados FuncionarioDados = new FuncionarioDados();
        bairroLB_PG.setText(FuncionarioDados.buscarBairro(Login.getCodigo()));
        ufLB_PG.setText(FuncionarioDados.buscarUF(Login.getCodigo()));
        ruaLB_PG.setText(FuncionarioDados.buscarRua(Login.getCodigo()));
        idLB_PG.setText(Login.getCodigo());
        nomeLB_PG.setText(FuncionarioDados.buscarNome(Login.getCodigo()));
        cepLB_PG.setText(FuncionarioDados.buscarCEP(Login.getCodigo()));
        numeroLB_PG.setText(FuncionarioDados.buscarNumero(Login.getCodigo()));
        cidadeLB_PG.setText(FuncionarioDados.buscarCidade(Login.getCodigo()));

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

    private void sairBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PGActionPerformed

    private void voltarBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PGActionPerformed
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PGActionPerformed

    private void editarBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_PGActionPerformed
        this.setVisible(false);
        new EditarDadosGerente().setVisible(true);
    }//GEN-LAST:event_editarBTN_PGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PG;
    private javax.swing.JLabel cepLB_PG;
    private javax.swing.JLabel cidadeLB_PG;
    private javax.swing.JButton editarBTN_PG;
    private javax.swing.JLabel idLB_PG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_PG;
    private javax.swing.JLabel madeLB_PG;
    private javax.swing.JLabel nomeLB_PG;
    private javax.swing.JLabel numeroLB_PG;
    private javax.swing.JLabel ruaLB_PG;
    private javax.swing.JButton sairBTN_PG;
    private javax.swing.JLabel titleLB_PG;
    private javax.swing.JLabel topicoBairroLB_PG;
    private javax.swing.JLabel topicoCepLB_PG;
    private javax.swing.JLabel topicoCidadeLB_PG;
    private javax.swing.JLabel topicoIdLB_PG;
    private javax.swing.JLabel topicoNomeLB_PG;
    private javax.swing.JLabel topicoNumeroLB_PG;
    private javax.swing.JLabel topicoRuaLB_PG;
    private javax.swing.JLabel topicoUfLB_PG;
    private javax.swing.JLabel ufLB_PG;
    private javax.swing.JButton voltarBTN_PG;
    // End of variables declaration//GEN-END:variables
}
