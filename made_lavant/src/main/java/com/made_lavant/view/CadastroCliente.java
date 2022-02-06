package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.base.Cliente;
import com.made_lavant.base.Endereco;
import com.made_lavant.dados.ClienteDados;
import javax.swing.JTextField;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        titleLB_CC = new javax.swing.JLabel();
        topicoNomeLB_CC = new javax.swing.JLabel();
        topicoCidadeLB_CC = new javax.swing.JLabel();
        topicoRuaLB_CC = new javax.swing.JLabel();
        nomeTF_CC = new javax.swing.JTextField();
        cidadeTF_CC = new javax.swing.JTextField();
        ruaTF_CC = new javax.swing.JTextField();
        confirmarBTN_CC = new javax.swing.JButton();
        topicoBairroLB_CC = new javax.swing.JLabel();
        topicoNumeroLB_CC = new javax.swing.JLabel();
        topicoUfLB_CC = new javax.swing.JLabel();
        topicoCepLB_CC = new javax.swing.JLabel();
        topicoCpfLB_CC = new javax.swing.JLabel();
        bairroTF_CC = new javax.swing.JTextField();
        numeroTF_CC = new javax.swing.JTextField();
        ufTF_CC = new javax.swing.JTextField();
        cpfTF_CC = new javax.swing.JTextField();
        cepTF_CC = new javax.swing.JTextField();
        madeLB_CC = new javax.swing.JLabel();
        lavantLB_CC = new javax.swing.JLabel();
        sairBTN_CC = new javax.swing.JButton();
        utilityLB_CC = new javax.swing.JLabel();
        utilityLB_CC.setVisible(false);
        topicoSenhaLB_CC = new javax.swing.JLabel();
        senhaTF_CC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        titleLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CC.setText("Cadastro do Cliente");
        titleLB_CC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoNomeLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNomeLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CC.setText("Nome");

        topicoCidadeLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCidadeLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_CC.setText("Cidade");

        topicoRuaLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoRuaLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_CC.setText("Rua");

        nomeTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTF_CCActionPerformed(evt);
            }
        });

        cidadeTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTF_CCActionPerformed(evt);
            }
        });

        ruaTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTF_CCActionPerformed(evt);
            }
        });

        confirmarBTN_CC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CC.setText("Confirmar");
        confirmarBTN_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CCActionPerformed(evt);
            }
        });

        topicoBairroLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoBairroLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_CC.setText("Bairro");

        topicoNumeroLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNumeroLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_CC.setText("Número");

        topicoUfLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoUfLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_CC.setText("UF");

        topicoCepLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCepLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_CC.setText("CEP");

        topicoCpfLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCpfLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCpfLB_CC.setText("CPF");

        numeroTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTF_CCActionPerformed(evt);
            }
        });
        numeroTF_CC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_CCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_CCKeyTyped(evt);
            }
        });

        ufTF_CC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_CCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_CCKeyTyped(evt);
            }
        });

        cpfTF_CC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfTF_CCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfTF_CCKeyTyped(evt);
            }
        });

        cepTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTF_CCActionPerformed(evt);
            }
        });
        cepTF_CC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_CCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_CCKeyTyped(evt);
            }
        });

        madeLB_CC.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        madeLB_CC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CC.setText("MADE");

        lavantLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lavantLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CC.setText("Lavant");

        sairBTN_CC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CC.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_CC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CC.setText("Sair");
        sairBTN_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CCActionPerformed(evt);
            }
        });

        utilityLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        utilityLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_CC.setText("Cliente já cadastrado");

        topicoSenhaLB_CC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoSenhaLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_CC.setText("Senha");

        senhaTF_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTF_CCActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoBairroLB_CC)
                                    .addComponent(topicoUfLB_CC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ufTF_CC)
                                        .addGap(18, 18, 18)
                                        .addComponent(topicoCpfLB_CC)
                                        .addGap(12, 12, 12)
                                        .addComponent(cpfTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bairroTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNumeroLB_CC)
                                    .addComponent(topicoCepLB_CC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTF_CC)
                                    .addComponent(numeroTF_CC)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sairBTN_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoCidadeLB_CC)
                                    .addComponent(topicoNomeLB_CC)
                                    .addComponent(topicoRuaLB_CC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ruaTF_CC)
                                    .addComponent(nomeTF_CC)
                                    .addComponent(cidadeTF_CC)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(titleLB_CC)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(madeLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_CC)
                        .addGap(258, 258, 258)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(utilityLB_CC)
                .addGap(110, 110, 110)
                .addComponent(confirmarBTN_CC)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topicoSenhaLB_CC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CC)
                .addGap(28, 28, 28)
                .addComponent(titleLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_CC)
                    .addComponent(nomeTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_CC)
                    .addComponent(cidadeTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_CC)
                    .addComponent(ruaTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_CC)
                    .addComponent(bairroTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumeroLB_CC)
                    .addComponent(numeroTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoCepLB_CC)
                    .addComponent(cpfTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoCpfLB_CC)
                    .addComponent(ufTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoUfLB_CC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoSenhaLB_CC)
                    .addComponent(senhaTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utilityLB_CC)
                    .addComponent(confirmarBTN_CC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(madeLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addComponent(lavantLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTF_CCActionPerformed
    }//GEN-LAST:event_nomeTF_CCActionPerformed

    private void cidadeTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTF_CCActionPerformed
    }//GEN-LAST:event_cidadeTF_CCActionPerformed

    private void ruaTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTF_CCActionPerformed
    }//GEN-LAST:event_ruaTF_CCActionPerformed

    private void cepTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTF_CCActionPerformed
    }//GEN-LAST:event_cepTF_CCActionPerformed

    private void sairBTN_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CCActionPerformed
        //deixa de mostrar a tela atual e mostra a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CCActionPerformed

    private void confirmarBTN_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CCActionPerformed
        //diz se o cadastro pode ou não ser realizado
        boolean cadastro = true;
        //verifica se o campo de CPF está preenchido
        if (cpfTF_CC.getText().equals("")) {
            //se não estiver o cadastro não pode ser realizado
            cpfTF_CC.setText("Campo obrigatório");
            cadastro = false;
        } else {
            //verfica se o cpf é válido, se não for ele não pode ser cadastrado
            cadastro = Cliente.verificaCpf(cpfTF_CC.getText());
            if (!cadastro) {
                cpfTF_CC.setText("CPF inválido");
            } else {
                //verifica se o cliente já está cadastrado, se ele já estiver, não pode ser cadastrado novamente
                ClienteDados cliendeDados = new ClienteDados();
                if (cliendeDados.buscarCPF(cpfTF_CC.getText()) != null) {
                    cadastro = false;
                    utilityLB_CC.setVisible(true);
                } else {
                    utilityLB_CC.setVisible(false);
                }
            }
        }
        //verifica se o campo de nome está preenchido
        if (nomeTF_CC.getText().equals("") || nomeTF_CC.getText().equals("Campo obrigatório")) {
            //se não estiver o cadastro não pode ser realizado
            nomeTF_CC.setText("Campo obrigatório");
            cadastro = false;
        }
        //verifica se o campo senha foi preenchido
        if (senhaTF_CC.getText().equals("") || senhaTF_CC.getText().equals("Campo obrigatório")) {
            //se não estiver o cadastro não pode ser realizado
            senhaTF_CC.setText("Campo obrigatório");
            cadastro = false;
        }
        Cliente cliente = null;
        //verifica se algum campo referente ao endereço foi cadastrado, se um deles for cadastrado, todos devem ser cadastrados
        if (!(cidadeTF_CC.getText().equals("") && ruaTF_CC.getText().equals("") && bairroTF_CC.getText().equals("") && numeroTF_CC.getText().equals("") && ufTF_CC.getText().equals("") && cepTF_CC.getText().equals(""))) {
            if (cidadeTF_CC.getText().equals("") || cidadeTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (bairroTF_CC.getText().equals("") || bairroTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ruaTF_CC.getText().equals("") || ruaTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ufTF_CC.getText().equals("") || ufTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (numeroTF_CC.getText().equals("") || numeroTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cepTF_CC.getText().equals("") || cepTF_CC.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_CC.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cadastro) {
                //com todos os campos de endereço preenchidos, o cadastro será feito com o endereço
                Endereco endereco = new Endereco(cidadeTF_CC.getText(), cepTF_CC.getText(), ufTF_CC.getText(), bairroTF_CC.getText(), ruaTF_CC.getText(), numeroTF_CC.getText());
                cliente = new Cliente(nomeTF_CC.getText(), endereco, cpfTF_CC.getText(), senhaTF_CC.getText());
            }
            //se nenhum campo de endereço estiver cadastrado, o cadastro será feito sem o endereço
        } else {
            if (cadastro) {
                cliente = new Cliente(nomeTF_CC.getText(), cpfTF_CC.getText(), senhaTF_CC.getText());
            }
        }
        //retorna para a tela de login se o cadastro foi realizado
        if (cadastro) {
            new Carrinho(cliente);
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CCActionPerformed

    private void numeroTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTF_CCActionPerformed
    }//GEN-LAST:event_numeroTF_CCActionPerformed

    private void senhaTF_CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTF_CCActionPerformed

    }//GEN-LAST:event_senhaTF_CCActionPerformed

    private void cpfTF_CCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfTF_CCKeyReleased

        mascaraCPF();
    }//GEN-LAST:event_cpfTF_CCKeyReleased

    private void mascaraCPF() {
        String texto = cpfTF_CC.getText();
        if (texto.length() > 0) {
            if (texto.length() > 11 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cpfTF_CC.setText(texto);
    }

    private void cpfTF_CCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfTF_CCKeyTyped
        mascaraCPF();
    }//GEN-LAST:event_cpfTF_CCKeyTyped

    private void numeroTF_CCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CCKeyReleased
        mascaraInt(numeroTF_CC);
    }//GEN-LAST:event_numeroTF_CCKeyReleased

    private void numeroTF_CCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CCKeyTyped
        mascaraInt(numeroTF_CC);
    }//GEN-LAST:event_numeroTF_CCKeyTyped

    private void cepTF_CCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CCKeyReleased
        mascaraCEP();
    }//GEN-LAST:event_cepTF_CCKeyReleased

    private void cepTF_CCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CCKeyTyped
        mascaraCEP();
    }//GEN-LAST:event_cepTF_CCKeyTyped

    private void ufTF_CCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CCKeyTyped
        mascaraUF();
    }//GEN-LAST:event_ufTF_CCKeyTyped

    private void ufTF_CCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CCKeyReleased
        mascaraUF();
    }//GEN-LAST:event_ufTF_CCKeyReleased

    private void mascaraUF() {
        String texto = ufTF_CC.getText();
        if (texto.length() > 0) {
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_CC.setText(texto);
    }

    private void mascaraCEP() {
        String texto = cepTF_CC.getText();
        if (texto.length() > 0) {
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_CC.setText(texto);
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
    private javax.swing.JTextField bairroTF_CC;
    private javax.swing.JTextField cepTF_CC;
    private javax.swing.JTextField cidadeTF_CC;
    private javax.swing.JButton confirmarBTN_CC;
    private javax.swing.JTextField cpfTF_CC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lavantLB_CC;
    private javax.swing.JLabel madeLB_CC;
    private javax.swing.JTextField nomeTF_CC;
    private javax.swing.JTextField numeroTF_CC;
    private javax.swing.JTextField ruaTF_CC;
    private javax.swing.JButton sairBTN_CC;
    private javax.swing.JTextField senhaTF_CC;
    private javax.swing.JLabel titleLB_CC;
    private javax.swing.JLabel topicoBairroLB_CC;
    private javax.swing.JLabel topicoCepLB_CC;
    private javax.swing.JLabel topicoCidadeLB_CC;
    private javax.swing.JLabel topicoCpfLB_CC;
    private javax.swing.JLabel topicoNomeLB_CC;
    private javax.swing.JLabel topicoNumeroLB_CC;
    private javax.swing.JLabel topicoRuaLB_CC;
    private javax.swing.JLabel topicoSenhaLB_CC;
    private javax.swing.JLabel topicoUfLB_CC;
    private javax.swing.JTextField ufTF_CC;
    private javax.swing.JLabel utilityLB_CC;
    // End of variables declaration//GEN-END:variables
}
