
package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.Codigos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CadastroFuncionario extends javax.swing.JFrame {


    public CadastroFuncionario() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoFuncionario_btnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        madeLB_CF = new javax.swing.JLabel();
        topicoBairroLB_CF = new javax.swing.JLabel();
        lavantLB_CF = new javax.swing.JLabel();
        topicoNumeroLB_CF = new javax.swing.JLabel();
        titleLB_CF = new javax.swing.JLabel();
        topicoUfLB_CF = new javax.swing.JLabel();
        topicoNomeLB_CF = new javax.swing.JLabel();
        topicoCepLB_CF = new javax.swing.JLabel();
        topicoCidadeLB_CF = new javax.swing.JLabel();
        topicoRuaLB_CF = new javax.swing.JLabel();
        bairroTF_CF = new javax.swing.JTextField();
        nomeTF_CF = new javax.swing.JTextField();
        numeroTF_CF = new javax.swing.JTextField();
        cidadeTF_CF = new javax.swing.JTextField();
        ufTF_CF = new javax.swing.JTextField();
        ruaTF_CF = new javax.swing.JTextField();
        confirmarBTN_CF = new javax.swing.JButton();
        cepTF_CF = new javax.swing.JTextField();
        voltarBTN_CF = new javax.swing.JButton();
        sairBTN_CF = new javax.swing.JButton();
        gerenteBTN_CF = new javax.swing.JRadioButton();
        funcionarioBTN_CF = new javax.swing.JRadioButton();
        utilityLB_CF = new javax.swing.JLabel();
        utilityLB_CF.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcioario");

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CF.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        madeLB_CF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CF.setText("MADE");

        topicoBairroLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoBairroLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_CF.setText("Bairro");

        lavantLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lavantLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CF.setText("Lavant");

        topicoNumeroLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNumeroLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_CF.setText("Número");

        titleLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CF.setText("Cadastro do Funcionário");
        titleLB_CF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoUfLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoUfLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_CF.setText("UF");

        topicoNomeLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNomeLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CF.setText("Nome");

        topicoCepLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCepLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_CF.setText("CEP");

        topicoCidadeLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCidadeLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_CF.setText("Cidade");

        topicoRuaLB_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoRuaLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_CF.setText("Rua");

        nomeTF_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTF_CFActionPerformed(evt);
            }
        });

        numeroTF_CF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_CFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_CFKeyTyped(evt);
            }
        });

        cidadeTF_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTF_CFActionPerformed(evt);
            }
        });

        ufTF_CF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_CFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_CFKeyTyped(evt);
            }
        });

        ruaTF_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTF_CFActionPerformed(evt);
            }
        });

        confirmarBTN_CF.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CF.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CF.setText("Confirmar");
        confirmarBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CFActionPerformed(evt);
            }
        });

        cepTF_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTF_CFActionPerformed(evt);
            }
        });
        cepTF_CF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_CFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_CFKeyTyped(evt);
            }
        });

        voltarBTN_CF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CF.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        voltarBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CF.setText("Voltar");
        voltarBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CFActionPerformed(evt);
            }
        });

        sairBTN_CF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CF.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CF.setText("Sair");
        sairBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CFActionPerformed(evt);
            }
        });

        gerenteBTN_CF.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(gerenteBTN_CF);
        gerenteBTN_CF.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        gerenteBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        gerenteBTN_CF.setText("Gerente");
        gerenteBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenteBTN_CFActionPerformed(evt);
            }
        });

        funcionarioBTN_CF.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(funcionarioBTN_CF);
        funcionarioBTN_CF.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        funcionarioBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        funcionarioBTN_CF.setText("Funcionario");
        funcionarioBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioBTN_CFActionPerformed(evt);
            }
        });

        utilityLB_CF.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        utilityLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_CF.setText("Marque se é um funcionário ou um gerente que está sendo cadastrado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltarBTN_CF)
                            .addComponent(topicoUfLB_CF)
                            .addComponent(topicoBairroLB_CF)
                            .addComponent(topicoNomeLB_CF)
                            .addComponent(topicoCidadeLB_CF)
                            .addComponent(topicoRuaLB_CF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTF_CF)
                            .addComponent(cidadeTF_CF)
                            .addComponent(ruaTF_CF)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bairroTF_CF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topicoNumeroLB_CF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTF_CF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(titleLB_CF)
                                .addGap(0, 210, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ufTF_CF)
                                        .addGap(37, 37, 37)
                                        .addComponent(topicoCepLB_CF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lavantLB_CF)
                                            .addComponent(madeLB_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTF_CF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmarBTN_CF, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(sairBTN_CF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(gerenteBTN_CF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funcionarioBTN_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(utilityLB_CF)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLB_CF)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_CF)
                    .addComponent(nomeTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_CF)
                    .addComponent(cidadeTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_CF)
                    .addComponent(ruaTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_CF)
                    .addComponent(bairroTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumeroLB_CF)
                    .addComponent(numeroTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoCepLB_CF)
                    .addComponent(ufTF_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoUfLB_CF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gerenteBTN_CF)
                            .addComponent(funcionarioBTN_CF)
                            .addComponent(utilityLB_CF))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(voltarBTN_CF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(madeLB_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lavantLB_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(confirmarBTN_CF)
                        .addGap(45, 45, 45)))
                .addGap(53, 53, 53))
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

    private void nomeTF_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTF_CFActionPerformed
    }//GEN-LAST:event_nomeTF_CFActionPerformed

    private void cidadeTF_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTF_CFActionPerformed
    }//GEN-LAST:event_cidadeTF_CFActionPerformed

    private void ruaTF_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTF_CFActionPerformed
    }//GEN-LAST:event_ruaTF_CFActionPerformed

    private void cepTF_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTF_CFActionPerformed
    }//GEN-LAST:event_cepTF_CFActionPerformed

    private void voltarBTN_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CFActionPerformed
        //volta para o crud de funcionários
        this.setVisible(false);
        new CrudFuncionarios().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CFActionPerformed

    private void sairBTN_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CFActionPerformed
        //volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CFActionPerformed

    private void gerenteBTN_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenteBTN_CFActionPerformed
    }//GEN-LAST:event_gerenteBTN_CFActionPerformed

    private void funcionarioBTN_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioBTN_CFActionPerformed
    }//GEN-LAST:event_funcionarioBTN_CFActionPerformed

    private void confirmarBTN_CFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CFActionPerformed
        //diz se o cadastro pode ou não ser feito
        boolean cadastro = true;
        //identifica se está sendo cadastrado um funcionário ou um gerente
        String identificador = null;
        //se o nome não foi escrito o cadastro não pode ser realizado
        if (nomeTF_CF.getText().equals("") || nomeTF_CF.getText().equals("Campo obrigatório")) {
            nomeTF_CF.setText("Campo obrigatório");
            cadastro = false;
        }
        //se nenhuma opção foi escolhida o cadastro não pode ser realizado
        if (!funcionarioBTN_CF.isSelected() && !gerenteBTN_CF.isSelected()) {
            cadastro = false;
            utilityLB_CF.setVisible(true);
        } else {
            utilityLB_CF.setVisible(false);
            //define o objeto criado como gerente
            if (gerenteBTN_CF.isSelected()) {
                identificador = "A";
            } else {
                //define o objeto criado como funcionário
                identificador = "B";
            }
        }
        //verifica se algum campo referente ao endereço foi cadastrado, se um deles for cadastrado, todos devem ser cadastrados
        if (!(cidadeTF_CF.getText().equals("") && ruaTF_CF.getText().equals("") && bairroTF_CF.getText().equals("") && numeroTF_CF.getText().equals("") && ufTF_CF.getText().equals("") && cepTF_CF.getText().equals(""))) {
            if (cidadeTF_CF.getText().equals("") || cidadeTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (bairroTF_CF.getText().equals("") || bairroTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ruaTF_CF.getText().equals("") || ruaTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ufTF_CF.getText().equals("") || ufTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (numeroTF_CF.getText().equals("") || numeroTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cepTF_CF.getText().equals("") || cepTF_CF.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_CF.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cadastro) {
                //com todos os campos de endereço preenchidos, o cadastro será feito com o endereço
                Endereco endereco = new Endereco(cidadeTF_CF.getText(), cepTF_CF.getText(), ufTF_CF.getText(), bairroTF_CF.getText(), ruaTF_CF.getText(), numeroTF_CF.getText());
                Funcionario funcionario = new Funcionario(nomeTF_CF.getText(), endereco, "madeLavant", identificador);
            }
        } else {
            //se nenhum campo de endereço estiver cadastrado, o cadastro será feito sem o endereço
            if (cadastro) {
                Funcionario funcionario = new Funcionario(nomeTF_CF.getText(), "madeLavant", identificador);
            }
        }
        //retorna para a tela de crud de funcionários se o cadastro foi realizado
        if (cadastro) {
            if (identificador.equals("A")) {
                Codigos cod = new Codigos();
                JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!\n"
                        + "Login: " + "A" + (cod.buscaFuncionario() - 1) + "\n"
                        + "Senha(Padrão): madeLavant");
            } else {
                Codigos cod = new Codigos();
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\n"
                        + "Login: " + "B" + (cod.buscaFuncionario() - 1) + "\n"
                        + "Senha(Padrão): madeLavant");
            }
            this.setVisible(false);
            new CrudFuncionarios().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CFActionPerformed

    private void numeroTF_CFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CFKeyReleased
        mascaraInt(numeroTF_CF);
    }//GEN-LAST:event_numeroTF_CFKeyReleased

    private void numeroTF_CFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CFKeyTyped
        mascaraInt(numeroTF_CF);
    }//GEN-LAST:event_numeroTF_CFKeyTyped

    private void cepTF_CFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CFKeyReleased
        mascaraCEP();
    }//GEN-LAST:event_cepTF_CFKeyReleased

    private void cepTF_CFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CFKeyTyped
        mascaraCEP();
    }//GEN-LAST:event_cepTF_CFKeyTyped

    private void ufTF_CFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CFKeyTyped
        mascaraUF();
    }//GEN-LAST:event_ufTF_CFKeyTyped

    private void ufTF_CFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CFKeyReleased
        mascaraUF();
    }//GEN-LAST:event_ufTF_CFKeyReleased

    private void mascaraUF() {
        String texto = ufTF_CF.getText();
        if (texto.length() > 0) {
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_CF.setText(texto);
    }

    private void mascaraCEP() {
        String texto = cepTF_CF.getText();
        if (texto.length() > 0) {
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_CF.setText(texto);
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
    private javax.swing.JTextField bairroTF_CF;
    private javax.swing.JTextField cepTF_CF;
    private javax.swing.JTextField cidadeTF_CF;
    private javax.swing.JButton confirmarBTN_CF;
    private javax.swing.JRadioButton funcionarioBTN_CF;
    private javax.swing.JRadioButton gerenteBTN_CF;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lavantLB_CF;
    private javax.swing.JLabel madeLB_CF;
    private javax.swing.JTextField nomeTF_CF;
    private javax.swing.JTextField numeroTF_CF;
    private javax.swing.JTextField ruaTF_CF;
    private javax.swing.JButton sairBTN_CF;
    private javax.swing.ButtonGroup tipoFuncionario_btnGroup;
    private javax.swing.JLabel titleLB_CF;
    private javax.swing.JLabel topicoBairroLB_CF;
    private javax.swing.JLabel topicoCepLB_CF;
    private javax.swing.JLabel topicoCidadeLB_CF;
    private javax.swing.JLabel topicoNomeLB_CF;
    private javax.swing.JLabel topicoNumeroLB_CF;
    private javax.swing.JLabel topicoRuaLB_CF;
    private javax.swing.JLabel topicoUfLB_CF;
    private javax.swing.JTextField ufTF_CF;
    private javax.swing.JLabel utilityLB_CF;
    private javax.swing.JButton voltarBTN_CF;
    // End of variables declaration//GEN-END:variables
}
