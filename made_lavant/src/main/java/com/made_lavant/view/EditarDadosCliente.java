
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

        titleLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDC.setText("Editar Cliente");
        titleLB_EDC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoUfLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoUfLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_EDC.setText("UF");

        topicoCepLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCepLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_EDC.setText("CEP");

        confirmarBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDC.setText("Confirmar");
        confirmarBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDCActionPerformed(evt);
            }
        });

        topicoCidadeLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
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

        topicoRuaLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoRuaLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_EDC.setText("Rua");

        madeLB_EDC.setFont(new java.awt.Font("Colonna MT", 0, 18)); // NOI18N
        madeLB_EDC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDC.setText("MADE");

        numeroTF_EDC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_EDCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_EDCKeyTyped(evt);
            }
        });

        topicoBairroLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoBairroLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_EDC.setText("Bairro");

        lavantLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
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

        topicoNumeroLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNumeroLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_EDC.setText("Número");

        sairBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDC.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDC.setText("Sair");
        sairBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDCActionPerformed(evt);
            }
        });

        voltarBTN_EDC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDC.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        voltarBTN_EDC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDC.setText("Voltar");
        voltarBTN_EDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDCActionPerformed(evt);
            }
        });

        topicoSenhaLB_EDC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoSenhaLB_EDC.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_EDC.setText("Senha");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLB_EDC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_EDC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(voltarBTN_EDC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavantLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(madeLB_EDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(topicoRuaLB_EDC)
                                .addGap(25, 25, 25)
                                .addComponent(ruaTF_EDC))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(topicoCidadeLB_EDC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidadeTF_EDC))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                                        .addComponent(topicoUfLB_EDC)
                                        .addGap(35, 35, 35)
                                        .addComponent(ufTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelLayout.createSequentialGroup()
                                        .addComponent(topicoBairroLB_EDC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bairroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNumeroLB_EDC)
                                    .addComponent(topicoCepLB_EDC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTF_EDC, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(numeroTF_EDC)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                                .addComponent(topicoSenhaLB_EDC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senhaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmarBTN_EDC)))
                        .addContainerGap(89, Short.MAX_VALUE))))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(madeLB_EDC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_EDC))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBTN_EDC)
                            .addComponent(voltarBTN_EDC))))
                .addGap(15, 15, 15)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(titleLB_EDC)
                        .addGap(36, 36, 36)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoCidadeLB_EDC)
                            .addComponent(cidadeTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoRuaLB_EDC)
                            .addComponent(ruaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoBairroLB_EDC)
                            .addComponent(bairroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoNumeroLB_EDC)
                            .addComponent(numeroTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cepTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoCepLB_EDC)
                            .addComponent(ufTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoUfLB_EDC))
                        .addGap(18, 18, 18)
                        .addComponent(confirmarBTN_EDC))
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoSenhaLB_EDC)
                        .addComponent(senhaTF_EDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
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
