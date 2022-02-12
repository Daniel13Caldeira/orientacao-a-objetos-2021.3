
package com.made_lavant.view;

import com.made_lavant.base.Cliente;
import com.made_lavant.base.Endereco;
import com.made_lavant.dados.ClienteDados;
import javax.swing.JTextField;


public class EditarDadosCliente extends javax.swing.JFrame {


    public EditarDadosCliente() {
        initComponents();
        //Preenche os text fields com as informações que foram cadastradas
        senhaTF_EDC.setText(ClienteDados.buscarSenha(Login.getCodigo()));
        //verifica se tem um endereço cadastrado
        if (!ClienteDados.buscarBairro(Login.getCodigo()).equals("null")) {
            bairroTF_EDC.setText(ClienteDados.buscarBairro(Login.getCodigo()));
            cidadeTF_EDC.setText(ClienteDados.buscarCidade(Login.getCodigo()));
            ruaTF_EDC.setText(ClienteDados.buscarRua(Login.getCodigo()));
            ufTF_EDC.setText(ClienteDados.buscarUF(Login.getCodigo()));
            numeroTF_EDC.setText(ClienteDados.buscarNumero(Login.getCodigo()));
            cepTF_EDC.setText(ClienteDados.buscarCEP(Login.getCodigo()));
        }
        //Deixa o JFrame em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        JPanel = new javax.swing.JPanel();
        titleLB_EDC = new javax.swing.JLabel();
        topicoUfLB_EDC = new javax.swing.JLabel();
        topicoCepLB_EDC = new javax.swing.JLabel();
        confirmarBTN_EDC = new javax.swing.JButton();
        topicoCidadeLB_EDC = new javax.swing.JLabel();
        cepTF_EDC = new javax.swing.JTextField();
        topicoRuaLB_EDC = new javax.swing.JLabel();
        bairroTF_EDC = new javax.swing.JTextField();
        madeLB_EDC = new javax.swing.JLabel();
        numeroTF_EDC = new javax.swing.JTextField();
        topicoBairroLB_EDC = new javax.swing.JLabel();
        cidadeTF_EDC = new javax.swing.JTextField();
        lavantLB_EDC = new javax.swing.JLabel();
        ufTF_EDC = new javax.swing.JTextField();
        topicoNumeroLB_EDC = new javax.swing.JLabel();
        ruaTF_EDC = new javax.swing.JTextField();
        sairBTN_EDC = new javax.swing.JButton();
        voltarBTN_EDC = new javax.swing.JButton();
        topicoSenhaLB_EDC = new javax.swing.JLabel();
        senhaTF_EDC = new javax.swing.JTextField();

        jButton2.setBackground(new java.awt.Color(255, 253, 130));
        jButton2.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(232, 72, 85));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Cliente");

        JPanel.setBackground(new java.awt.Color(45, 48, 71));

        titleLB_EDC.setFont(titleLB_EDC.getFont().deriveFont(titleLB_EDC.getFont().getStyle() | java.awt.Font.BOLD, titleLB_EDC.getFont().getSize()+25));
        titleLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDC.setText("Editar Cliente");
        titleLB_EDC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoUfLB_EDC.setFont(topicoUfLB_EDC.getFont().deriveFont(topicoUfLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_EDC.getFont().getSize()+5));
        topicoUfLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_EDC.setText("UF");

        topicoCepLB_EDC.setFont(topicoCepLB_EDC.getFont().deriveFont(topicoCepLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_EDC.getFont().getSize()+5));
        topicoCepLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_EDC.setText("CEP");

        confirmarBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDC.setFont(confirmarBTN_EDC.getFont().deriveFont(confirmarBTN_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_EDC.getFont().getSize()+7));
        confirmarBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDC.setText("Confirmar");
        confirmarBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDCActionPerformed(evt);
            }
        });

        topicoCidadeLB_EDC.setFont(topicoCidadeLB_EDC.getFont().deriveFont(topicoCidadeLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_EDC.getFont().getSize()+5));
        topicoCidadeLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_EDC.setText("Cidade");

        cepTF_EDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_EDCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_EDCKeyTyped(evt);
            }
        });

        topicoRuaLB_EDC.setFont(topicoRuaLB_EDC.getFont().deriveFont(topicoRuaLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_EDC.getFont().getSize()+5));
        topicoRuaLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_EDC.setText("Rua");

        madeLB_EDC.setFont(madeLB_EDC.getFont().deriveFont(madeLB_EDC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_EDC.getFont().getSize()+7));
        madeLB_EDC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDC.setText("MADE");

        numeroTF_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTF_EDCActionPerformed(evt);
            }
        });
        numeroTF_EDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_EDCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_EDCKeyTyped(evt);
            }
        });

        topicoBairroLB_EDC.setFont(topicoBairroLB_EDC.getFont().deriveFont(topicoBairroLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_EDC.getFont().getSize()+5));
        topicoBairroLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_EDC.setText("Bairro");

        lavantLB_EDC.setFont(lavantLB_EDC.getFont().deriveFont(lavantLB_EDC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_EDC.getFont().getSize()+7));
        lavantLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_EDC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_EDC.setText("Lavant");

        ufTF_EDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_EDCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_EDCKeyTyped(evt);
            }
        });

        topicoNumeroLB_EDC.setFont(topicoNumeroLB_EDC.getFont().deriveFont(topicoNumeroLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_EDC.getFont().getSize()+5));
        topicoNumeroLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_EDC.setText("Número");

        sairBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDC.setFont(sairBTN_EDC.getFont().deriveFont(sairBTN_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_EDC.getFont().getSize()+7));
        sairBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDC.setText("Sair");
        sairBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDCActionPerformed(evt);
            }
        });

        voltarBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDC.setFont(voltarBTN_EDC.getFont().deriveFont(voltarBTN_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_EDC.getFont().getSize()+7));
        voltarBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDC.setText("Voltar");
        voltarBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDCActionPerformed(evt);
            }
        });

        topicoSenhaLB_EDC.setFont(topicoSenhaLB_EDC.getFont().deriveFont(topicoSenhaLB_EDC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoSenhaLB_EDC.getFont().getSize()+5));
        topicoSenhaLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_EDC.setText("Senha");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_EDC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarBTN_EDC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(madeLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB_EDC)
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addComponent(topicoSenhaLB_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(senhaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirmarBTN_EDC))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoRuaLB_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoCidadeLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(topicoBairroLB_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(topicoCepLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ruaTF_EDC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bairroTF_EDC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cidadeTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cepTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(133, 133, 133))
                                .addGroup(JPanelLayout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addComponent(topicoNumeroLB_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(topicoUfLB_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ufTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(madeLB_EDC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_EDC))
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_EDC)
                        .addComponent(voltarBTN_EDC)))
                .addGap(48, 48, 48)
                .addComponent(titleLB_EDC)
                .addGap(80, 80, 80)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_EDC)
                    .addComponent(cidadeTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_EDC)
                    .addComponent(ruaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_EDC)
                    .addComponent(bairroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoUfLB_EDC)
                        .addComponent(ufTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoNumeroLB_EDC)
                        .addComponent(topicoCepLB_EDC)
                        .addComponent(cepTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarBTN_EDC)
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(senhaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(topicoSenhaLB_EDC)))
                .addGap(158, 158, 158))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTN_EDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_EDCActionPerformed
        //volta para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_EDCActionPerformed

    private void confirmarBTN_EDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_EDCActionPerformed
        //diz se a edição pode ou não ser feita
        boolean edicao = true;
        if (senhaTF_EDC.getText().equals("") || senhaTF_EDC.getText().equals("Campo obrigatório")) {
            senhaTF_EDC.setText("Campo obrigatório");
            edicao = false;
        }
        //verifica se algum campo referente ao endereço foi preenchido, se um deles for preenchido, todos devem ser preenchidos
        if (!(cidadeTF_EDC.getText().equals("") && ruaTF_EDC.getText().equals("") && bairroTF_EDC.getText().equals("") && numeroTF_EDC.getText().equals("") && ufTF_EDC.getText().equals("") && cepTF_EDC.getText().equals(""))) {
            if (cidadeTF_EDC.getText().equals("") || cidadeTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (bairroTF_EDC.getText().equals("") || bairroTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ruaTF_EDC.getText().equals("") || ruaTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ufTF_EDC.getText().equals("") || ufTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (numeroTF_EDC.getText().equals("") || numeroTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (cepTF_EDC.getText().equals("") || cepTF_EDC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_EDC.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (edicao) {
                ClienteDados.alterar(new Cliente(Login.getCodigo(), ClienteDados.buscarNome(Login.getCodigo()), new Endereco(cidadeTF_EDC.getText(), cepTF_EDC.getText(), ufTF_EDC.getText(), bairroTF_EDC.getText(), ruaTF_EDC.getText(), numeroTF_EDC.getText()), senhaTF_EDC.getText()));
                this.setVisible(false);
                new PerfilCliente().setVisible(true);
            }
        } else {
            //se nenhum campo de endereço estiver preenchido, a edição será feita sem o endereço
            if (edicao) {
                ClienteDados.alterar(new Cliente(Login.getCodigo(), ClienteDados.buscarNome(Login.getCodigo()), new Endereco("null", "null", "null", "null", "null", "null"), senhaTF_EDC.getText()));
                this.setVisible(false);
                new PerfilCliente().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmarBTN_EDCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void voltarBTN_EDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_EDCActionPerformed
        //volta para o perfil do cliente
        this.setVisible(false);
        new PerfilCliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_EDCActionPerformed

    private void ufTF_EDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDCKeyReleased
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDCKeyReleased

    private void ufTF_EDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDCKeyTyped
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDCKeyTyped

    private void numeroTF_EDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDCKeyReleased
        mascaraInt(numeroTF_EDC);
    }//GEN-LAST:event_numeroTF_EDCKeyReleased

    private void numeroTF_EDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDCKeyTyped
        mascaraInt(numeroTF_EDC);
    }//GEN-LAST:event_numeroTF_EDCKeyTyped

    private void cepTF_EDCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDCKeyReleased
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDCKeyReleased

    private void cepTF_EDCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDCKeyTyped
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDCKeyTyped

    private void numeroTF_EDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTF_EDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTF_EDCActionPerformed

    private void mascaraUF() {
        //Máscara que aceita apenas 2 letras
        String texto = ufTF_EDC.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 2 caracteres e se o último caractere digitado é uma letra
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_EDC.setText(texto);
    }

    private void mascaraCEP() {
        //Máscara que aceita apenas 8 letras
        String texto = cepTF_EDC.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 8 caracteres e se o último caractere digitado é um número
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_EDC.setText(texto);
    }

    private void mascaraInt(JTextField textField) {
        //Máscara que aceita apenas números
        String texto = textField.getText();
        if (texto.length() > 0) {
            //Verifica se o último caractere digitado é um número
            if (texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JTextField bairroTF_EDC;
    private javax.swing.JTextField cepTF_EDC;
    private javax.swing.JTextField cidadeTF_EDC;
    private javax.swing.JButton confirmarBTN_EDC;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lavantLB_EDC;
    private javax.swing.JLabel madeLB_EDC;
    private javax.swing.JTextField numeroTF_EDC;
    private javax.swing.JTextField ruaTF_EDC;
    private javax.swing.JButton sairBTN_EDC;
    private javax.swing.JTextField senhaTF_EDC;
    private javax.swing.JLabel titleLB_EDC;
    private javax.swing.JLabel topicoBairroLB_EDC;
    private javax.swing.JLabel topicoCepLB_EDC;
    private javax.swing.JLabel topicoCidadeLB_EDC;
    private javax.swing.JLabel topicoNumeroLB_EDC;
    private javax.swing.JLabel topicoRuaLB_EDC;
    private javax.swing.JLabel topicoSenhaLB_EDC;
    private javax.swing.JLabel topicoUfLB_EDC;
    private javax.swing.JTextField ufTF_EDC;
    private javax.swing.JButton voltarBTN_EDC;
    // End of variables declaration//GEN-END:variables
}
