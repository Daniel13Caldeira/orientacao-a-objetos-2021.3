
package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.FuncionarioDados;
import javax.swing.JTextField;

public class EditarDadosGerente extends javax.swing.JFrame {


    public EditarDadosGerente() {
        initComponents();
        senhaTF_EDG.setText(FuncionarioDados.buscarSenha(Login.getCodigo()));
        if (!FuncionarioDados.buscarBairro(Login.getCodigo()).equals("null")) {
            bairroTF_EDG.setText(FuncionarioDados.buscarBairro(Login.getCodigo()));
            cidadeTF_EDG.setText(FuncionarioDados.buscarCidade(Login.getCodigo()));
            ruaTF_EDG.setText(FuncionarioDados.buscarRua(Login.getCodigo()));
            ufTF_EDG.setText(FuncionarioDados.buscarUF(Login.getCodigo()));
            numeroTF_EDG.setText(FuncionarioDados.buscarNumero(Login.getCodigo()));
            cepTF_EDG.setText(FuncionarioDados.buscarCEP(Login.getCodigo()));
        }
        setExtendedState(MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        senhaTF_EDG = new javax.swing.JTextField();
        topicoCepLB_EDG = new javax.swing.JLabel();
        topicoUfLB_EDG = new javax.swing.JLabel();
        madeLB_EDG = new javax.swing.JLabel();
        lavantLB_EDG = new javax.swing.JLabel();
        topicoSenhaLB_EDG = new javax.swing.JLabel();
        bairroTF_EDG = new javax.swing.JTextField();
        titleLB_EDG = new javax.swing.JLabel();
        topicoRuaLB_EDG = new javax.swing.JLabel();
        cidadeTF_EDG = new javax.swing.JTextField();
        cepTF_EDG = new javax.swing.JTextField();
        topicoBairroLB_EDG = new javax.swing.JLabel();
        topicoCidadeLB_EDG = new javax.swing.JLabel();
        numeroTF_EDG = new javax.swing.JTextField();
        ruaTF_EDG = new javax.swing.JTextField();
        sairBTN_EDG = new javax.swing.JButton();
        confirmarBTN_EDG = new javax.swing.JButton();
        voltarBTN_EDG = new javax.swing.JButton();
        topicoNumeroLB_EDG = new javax.swing.JLabel();
        ufTF_EDG = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoCepLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCepLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_EDG.setText("CEP");

        topicoUfLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoUfLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_EDG.setText("UF");

        madeLB_EDG.setFont(new java.awt.Font("Colonna MT", 0, 18)); // NOI18N
        madeLB_EDG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_EDG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_EDG.setText("MADE");

        lavantLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        lavantLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_EDG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_EDG.setText("Lavant");

        topicoSenhaLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoSenhaLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_EDG.setText("Senha");

        titleLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_EDG.setText("Editar Funcionário");
        titleLB_EDG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titleLB_EDG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoRuaLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoRuaLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_EDG.setText("Rua");

        cepTF_EDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_EDGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_EDGKeyTyped(evt);
            }
        });

        topicoBairroLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoBairroLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_EDG.setText("Bairro");

        topicoCidadeLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCidadeLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_EDG.setText("Cidade");

        numeroTF_EDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_EDGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_EDGKeyTyped(evt);
            }
        });

        sairBTN_EDG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_EDG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_EDG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_EDG.setText("Sair");
        sairBTN_EDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_EDGActionPerformed(evt);
            }
        });

        confirmarBTN_EDG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_EDG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_EDG.setText("Confirmar");
        confirmarBTN_EDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_EDGActionPerformed(evt);
            }
        });

        voltarBTN_EDG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_EDG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        voltarBTN_EDG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_EDG.setText("Voltar");
        voltarBTN_EDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_EDGActionPerformed(evt);
            }
        });

        topicoNumeroLB_EDG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNumeroLB_EDG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_EDG.setText("Número");

        ufTF_EDG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_EDGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_EDGKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLB_EDG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_EDG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_EDG)
                        .addGap(396, 396, 396)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavantLB_EDG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(madeLB_EDG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confirmarBTN_EDG))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(topicoRuaLB_EDG)
                                .addGap(25, 25, 25)
                                .addComponent(ruaTF_EDG))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(topicoCidadeLB_EDG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidadeTF_EDG))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(topicoBairroLB_EDG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bairroTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(topicoUfLB_EDG)
                                            .addComponent(topicoSenhaLB_EDG))
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ufTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(senhaTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNumeroLB_EDG)
                                    .addComponent(topicoCepLB_EDG))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTF_EDG)
                                    .addComponent(numeroTF_EDG))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(madeLB_EDG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_EDG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBTN_EDG)
                            .addComponent(voltarBTN_EDG))))
                .addGap(15, 15, 15)
                .addComponent(titleLB_EDG)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_EDG)
                    .addComponent(cidadeTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_EDG)
                    .addComponent(ruaTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_EDG)
                    .addComponent(bairroTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumeroLB_EDG)
                    .addComponent(numeroTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoCepLB_EDG)
                    .addComponent(ufTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoUfLB_EDG))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmarBTN_EDG)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(senhaTF_EDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(topicoSenhaLB_EDG)))
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

    private void sairBTN_EDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_EDGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_EDGActionPerformed

    private void confirmarBTN_EDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_EDGActionPerformed
        //diz se a edição pode ou não ser feita
        boolean edicao = true;
        if (senhaTF_EDG.getText().equals("") || senhaTF_EDG.getText().equals("Campo obrigatório")) {
            senhaTF_EDG.setText("Campo obrigatório");
            edicao = false;
        }
        //verifica se algum campo referente ao endereço foi preenchido, se um deles for preenchido, todos devem ser preenchidos
        if (!(cidadeTF_EDG.getText().equals("") && ruaTF_EDG.getText().equals("") && bairroTF_EDG.getText().equals("") && numeroTF_EDG.getText().equals("") && ufTF_EDG.getText().equals("") && cepTF_EDG.getText().equals(""))) {
            if (cidadeTF_EDG.getText().equals("") || cidadeTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (bairroTF_EDG.getText().equals("") || bairroTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ruaTF_EDG.getText().equals("") || ruaTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (ufTF_EDG.getText().equals("") || ufTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (numeroTF_EDG.getText().equals("") || numeroTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (cepTF_EDG.getText().equals("") || cepTF_EDG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_EDG.setText("Campo obrigatório se for cadastrar o endereço");
                edicao = false;
            }
            if (edicao) {
                FuncionarioDados funcionario = new FuncionarioDados();
                //String cod, String nome, Endereco endereco, String senha
                funcionario.alterar(new Funcionario(Login.getCodigo(), funcionario.buscarNome(Login.getCodigo()), new Endereco(cidadeTF_EDG.getText(), cepTF_EDG.getText(), ufTF_EDG.getText(), bairroTF_EDG.getText(), ruaTF_EDG.getText(), numeroTF_EDG.getText()), senhaTF_EDG.getText()));
                this.setVisible(false);
                new PerfilGerente().setVisible(true);
            }
        } else {
            //se nenhum campo de endereço estiver cadastrado, o cadastro será feito sem o endereço
            if (edicao) {
                //String cod, String nome, Endereco endereco, String senha
                FuncionarioDados.alterar(new Funcionario(Login.getCodigo(), FuncionarioDados.buscarNome(Login.getCodigo()), new Endereco("null", "null", "null", "null", "null", "null"), senhaTF_EDG.getText()));
                this.setVisible(false);
                new PerfilGerente().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmarBTN_EDGActionPerformed

    private void voltarBTN_EDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_EDGActionPerformed
        this.setVisible(false);
        new PerfilGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_EDGActionPerformed

    private void ufTF_EDGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDGKeyReleased
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDGKeyReleased

    private void ufTF_EDGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_EDGKeyTyped
        mascaraUF();
    }//GEN-LAST:event_ufTF_EDGKeyTyped

    private void cepTF_EDGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDGKeyReleased
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDGKeyReleased

    private void cepTF_EDGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_EDGKeyTyped
        mascaraCEP();
    }//GEN-LAST:event_cepTF_EDGKeyTyped

    private void numeroTF_EDGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDGKeyReleased
        mascaraInt(numeroTF_EDG);
    }//GEN-LAST:event_numeroTF_EDGKeyReleased

    private void numeroTF_EDGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_EDGKeyTyped
        mascaraInt(numeroTF_EDG);
    }//GEN-LAST:event_numeroTF_EDGKeyTyped

    private void mascaraUF() {
        String texto = ufTF_EDG.getText();
        if (texto.length() > 0) {
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_EDG.setText(texto);
    }

    private void mascaraCEP() {
        String texto = cepTF_EDG.getText();
        if (texto.length() > 0) {
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_EDG.setText(texto);
    }

    private void mascaraInt(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTF_EDG;
    private javax.swing.JTextField cepTF_EDG;
    private javax.swing.JTextField cidadeTF_EDG;
    private javax.swing.JButton confirmarBTN_EDG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_EDG;
    private javax.swing.JLabel madeLB_EDG;
    private javax.swing.JTextField numeroTF_EDG;
    private javax.swing.JTextField ruaTF_EDG;
    private javax.swing.JButton sairBTN_EDG;
    private javax.swing.JTextField senhaTF_EDG;
    private javax.swing.JLabel titleLB_EDG;
    private javax.swing.JLabel topicoBairroLB_EDG;
    private javax.swing.JLabel topicoCepLB_EDG;
    private javax.swing.JLabel topicoCidadeLB_EDG;
    private javax.swing.JLabel topicoNumeroLB_EDG;
    private javax.swing.JLabel topicoRuaLB_EDG;
    private javax.swing.JLabel topicoSenhaLB_EDG;
    private javax.swing.JLabel topicoUfLB_EDG;
    private javax.swing.JTextField ufTF_EDG;
    private javax.swing.JButton voltarBTN_EDG;
    // End of variables declaration//GEN-END:variables
}
