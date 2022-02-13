package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.FuncionarioDados;
import javax.swing.JTextField;

public class EditarDadosFuncionario extends javax.swing.JFrame {

    public EditarDadosFuncionario() {
        initComponents();
        //Preenche os text fields com as informações que foram cadastradas
        senhaTF_EDF.setText(FuncionarioDados.buscarSenha(Login.getCodigo()));
        //verifica se tem um endereço cadastrado
        if (!FuncionarioDados.buscarBairro(Login.getCodigo()).equals("null")) {
            bairroTF_EDF.setText(FuncionarioDados.buscarBairro(Login.getCodigo()));
            cidadeTF_EDF.setText(FuncionarioDados.buscarCidade(Login.getCodigo()));
            ruaTF_EDF.setText(FuncionarioDados.buscarRua(Login.getCodigo()));
            ufTF_EDF.setText(FuncionarioDados.buscarUF(Login.getCodigo()));
            numeroTF_EDF.setText(FuncionarioDados.buscarNumero(Login.getCodigo()));
            cepTF_EDF.setText(FuncionarioDados.buscarCEP(Login.getCodigo()));
        }
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bairroTF_EDF = new javax.swing.JTextField();
        topicoRuaLB_EDF = new javax.swing.JLabel();
        cepTF_EDF = new javax.swing.JTextField();
        topicoCidadeLB_EDF = new javax.swing.JLabel();
        ruaTF_EDF = new javax.swing.JTextField();
        confirmarBTN_EDF = new javax.swing.JButton();
        topicoNumeroLB_EDF = new javax.swing.JLabel();
        ufTF_EDF = new javax.swing.JTextField();
        topicoCepLB_EDF = new javax.swing.JLabel();
        topicoUfLB_EDF = new javax.swing.JLabel();
        titleLB_EDF = new javax.swing.JLabel();
        topicoBairroLB_EDF = new javax.swing.JLabel();
        numeroTF_EDF = new javax.swing.JTextField();
        sairBTN_EDF = new javax.swing.JButton();
        voltarBTN_EDF = new javax.swing.JButton();
        senhaTF_EDF = new javax.swing.JTextField();
        topicoSenhaLB_EDF = new javax.swing.JLabel();
        cidadeTF_EDF = new javax.swing.JTextField();
        madeLB_EDF = new javax.swing.JLabel();
        lavantLB_EDF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoRuaLB_EDF.setFont(topicoRuaLB_EDF.getFont().deriveFont(topicoRuaLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_EDF.getFont().getSize()+5));
        topicoRuaLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_EDF.setText("Rua");

        cepTF_EDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_EDFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_EDFKeyTyped(evt);
            }
        });

        topicoCidadeLB_EDF.setFont(topicoCidadeLB_EDF.getFont().deriveFont(topicoCidadeLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_EDF.getFont().getSize()+5));
        topicoCidadeLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_EDF.setText("Cidade");

        confirmarBTN_EDF.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_EDF.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDF.setText("Confirmar");
        confirmarBTN_EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDFActionPerformed(evt);
            }
        });

        topicoNumeroLB_EDF.setFont(topicoNumeroLB_EDF.getFont().deriveFont(topicoNumeroLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_EDF.getFont().getSize()+5));
        topicoNumeroLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_EDF.setText("Número");

        ufTF_EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufTF_EDFActionPerformed(evt);
            }
        });
        ufTF_EDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_EDFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_EDFKeyTyped(evt);
            }
        });

        topicoCepLB_EDF.setFont(topicoCepLB_EDF.getFont().deriveFont(topicoCepLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_EDF.getFont().getSize()+5));
        topicoCepLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_EDF.setText("CEP");

        topicoUfLB_EDF.setFont(topicoUfLB_EDF.getFont().deriveFont(topicoUfLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_EDF.getFont().getSize()+7));
        topicoUfLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_EDF.setText("UF");

        titleLB_EDF.setFont(titleLB_EDF.getFont().deriveFont(titleLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_EDF.getFont().getSize()+25));
        titleLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDF.setText("Editar Funcionário");
        titleLB_EDF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoBairroLB_EDF.setFont(topicoBairroLB_EDF.getFont().deriveFont(topicoBairroLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_EDF.getFont().getSize()+5));
        topicoBairroLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_EDF.setText("Bairro");

        numeroTF_EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTF_EDFActionPerformed(evt);
            }
        });
        numeroTF_EDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_EDFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_EDFKeyTyped(evt);
            }
        });

        sairBTN_EDF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDF.setFont(sairBTN_EDF.getFont().deriveFont(sairBTN_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_EDF.getFont().getSize()+7));
        sairBTN_EDF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDF.setText("Sair");
        sairBTN_EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDFActionPerformed(evt);
            }
        });

        voltarBTN_EDF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDF.setFont(voltarBTN_EDF.getFont().deriveFont(voltarBTN_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_EDF.getFont().getSize()+7));
        voltarBTN_EDF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDF.setText("Voltar");
        voltarBTN_EDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDFActionPerformed(evt);
            }
        });

        topicoSenhaLB_EDF.setFont(topicoSenhaLB_EDF.getFont().deriveFont(topicoSenhaLB_EDF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoSenhaLB_EDF.getFont().getSize()+5));
        topicoSenhaLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_EDF.setText("Senha");

        madeLB_EDF.setFont(madeLB_EDF.getFont().deriveFont(madeLB_EDF.getFont().getStyle() | java.awt.Font.BOLD, madeLB_EDF.getFont().getSize()+7));
        madeLB_EDF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDF.setText("MADE");

        lavantLB_EDF.setFont(lavantLB_EDF.getFont().deriveFont(lavantLB_EDF.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_EDF.getFont().getSize()+7));
        lavantLB_EDF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_EDF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_EDF.setText("Lavant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLB_EDF)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_EDF)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoSenhaLB_EDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(topicoCepLB_EDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(topicoCidadeLB_EDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(topicoRuaLB_EDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(topicoBairroLB_EDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(senhaTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(confirmarBTN_EDF))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cepTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(topicoNumeroLB_EDF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numeroTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(topicoUfLB_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ufTF_EDF))
                                    .addComponent(ruaTF_EDF)
                                    .addComponent(cidadeTF_EDF)
                                    .addComponent(bairroTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 49, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(voltarBTN_EDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lavantLB_EDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(madeLB_EDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(madeLB_EDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_EDF))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_EDF)
                        .addComponent(voltarBTN_EDF)))
                .addGap(15, 15, 15)
                .addComponent(titleLB_EDF)
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_EDF)
                    .addComponent(cidadeTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_EDF)
                    .addComponent(ruaTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_EDF)
                    .addComponent(bairroTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCepLB_EDF)
                    .addComponent(topicoNumeroLB_EDF)
                    .addComponent(cepTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoUfLB_EDF)
                    .addComponent(ufTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTF_EDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoSenhaLB_EDF)
                    .addComponent(confirmarBTN_EDF))
                .addGap(35, 35, 35))
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

    private void confirmarBTN_EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_EDFActionPerformed
        //diz se a edição pode ou não ser feita
        boolean edicao = true;
        if (senhaTF_EDF.getText().equals("") || senhaTF_EDF.getText().equals("Campo obrigatório")) {
            senhaTF_EDF.setText("Campo obrigatório");
            edicao = false;
        }
        //verifica se algum campo referente ao endereço foi preenchido, se um deles for preenchido, todos devem ser preenchidos
        if (!(cidadeTF_EDF.getText().equals("") && ruaTF_EDF.getText().equals("") && bairroTF_EDF.getText().equals("") && numeroTF_EDF.getText().equals("") && ufTF_EDF.getText().equals("") && cepTF_EDF.getText().equals(""))) {
            if (cidadeTF_EDF.getText().equals("") || cidadeTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (bairroTF_EDF.getText().equals("") || bairroTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ruaTF_EDF.getText().equals("") || ruaTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ufTF_EDF.getText().equals("") || ufTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (numeroTF_EDF.getText().equals("") || numeroTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (cepTF_EDF.getText().equals("") || cepTF_EDF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_EDF.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (edicao) {
                FuncionarioDados.alterar(new Funcionario(Login.getCodigo(), FuncionarioDados.buscarNome(Login.getCodigo()), new Endereco(cidadeTF_EDF.getText(), cepTF_EDF.getText(), ufTF_EDF.getText(), bairroTF_EDF.getText(), ruaTF_EDF.getText(), numeroTF_EDF.getText()), senhaTF_EDF.getText()));
                this.setVisible(false);
                new PerfilFuncionario().setVisible(true);
            }
        } else {
            //se nenhum campo de endereço estiver preenchido, a edição será feita sem o endereço
            if (edicao) {
                FuncionarioDados FuncionarioDados = new FuncionarioDados();
                FuncionarioDados.alterar(new Funcionario(Login.getCodigo(), FuncionarioDados.buscarNome(Login.getCodigo()), new Endereco("null", "null", "null", "null", "null", "null"), senhaTF_EDF.getText()));
                this.setVisible(false);
                new PerfilFuncionario().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmarBTN_EDFActionPerformed

    private void sairBTN_EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_EDFActionPerformed
        //volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_EDFActionPerformed

    private void voltarBTN_EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_EDFActionPerformed
        //volta para o perfil do funcionario
        this.setVisible(false);
        new PerfilFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_EDFActionPerformed

    private void ufTF_EDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDFKeyReleased
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDFKeyReleased

    private void ufTF_EDFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDFKeyTyped
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDFKeyTyped

    private void cepTF_EDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDFKeyReleased
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDFKeyReleased

    private void cepTF_EDFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDFKeyTyped
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDFKeyTyped

    private void numeroTF_EDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDFKeyReleased
        mascaraInt(numeroTF_EDF);
    }//GEN-LAST:event_numeroTF_EDFKeyReleased

    private void numeroTF_EDFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDFKeyTyped
        mascaraInt(numeroTF_EDF);
    }//GEN-LAST:event_numeroTF_EDFKeyTyped

    private void numeroTF_EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTF_EDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTF_EDFActionPerformed

    private void ufTF_EDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufTF_EDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufTF_EDFActionPerformed

    private void mascaraUF() {
        //Máscara que aceita apenas 2 letras
        String texto = ufTF_EDF.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 2 caracteres e se o último caractere digitado é uma letra
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_EDF.setText(texto);
    }

    private void mascaraCEP() {
        //Máscara que aceita apenas 8 letras
        String texto = cepTF_EDF.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 8 caracteres e se o último caractere digitado é um número
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_EDF.setText(texto);
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
    private javax.swing.JTextField bairroTF_EDF;
    private javax.swing.JTextField cepTF_EDF;
    private javax.swing.JTextField cidadeTF_EDF;
    private javax.swing.JButton confirmarBTN_EDF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_EDF;
    private javax.swing.JLabel madeLB_EDF;
    private javax.swing.JTextField numeroTF_EDF;
    private javax.swing.JTextField ruaTF_EDF;
    private javax.swing.JButton sairBTN_EDF;
    private javax.swing.JTextField senhaTF_EDF;
    private javax.swing.JLabel titleLB_EDF;
    private javax.swing.JLabel topicoBairroLB_EDF;
    private javax.swing.JLabel topicoCepLB_EDF;
    private javax.swing.JLabel topicoCidadeLB_EDF;
    private javax.swing.JLabel topicoNumeroLB_EDF;
    private javax.swing.JLabel topicoRuaLB_EDF;
    private javax.swing.JLabel topicoSenhaLB_EDF;
    private javax.swing.JLabel topicoUfLB_EDF;
    private javax.swing.JTextField ufTF_EDF;
    private javax.swing.JButton voltarBTN_EDF;
    // End of variables declaration//GEN-END:variables
}
