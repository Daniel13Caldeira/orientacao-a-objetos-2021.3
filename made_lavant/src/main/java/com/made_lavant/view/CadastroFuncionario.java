package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.Codigos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    public CadastroFuncionario() {
        initComponents();
        //Colocando o jframe em tela cheia
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
        setTitle("Cadastro");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CF.setFont(madeLB_CF.getFont().deriveFont(madeLB_CF.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CF.getFont().getSize()+13));
        madeLB_CF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CF.setText("MADE");

        topicoBairroLB_CF.setFont(topicoBairroLB_CF.getFont().deriveFont(topicoBairroLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_CF.getFont().getSize()+7));
        topicoBairroLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_CF.setText("Bairro");

        lavantLB_CF.setFont(lavantLB_CF.getFont().deriveFont(lavantLB_CF.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CF.getFont().getSize()+13));
        lavantLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CF.setText("Lavant");
        lavantLB_CF.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        topicoNumeroLB_CF.setFont(topicoNumeroLB_CF.getFont().deriveFont(topicoNumeroLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_CF.getFont().getSize()+7));
        topicoNumeroLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_CF.setText("Número");

        titleLB_CF.setFont(titleLB_CF.getFont().deriveFont(titleLB_CF.getFont().getStyle() | java.awt.Font.BOLD, titleLB_CF.getFont().getSize()+25));
        titleLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CF.setText("Cadastro do Funcionário");
        titleLB_CF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoUfLB_CF.setFont(topicoUfLB_CF.getFont().deriveFont(topicoUfLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_CF.getFont().getSize()+7));
        topicoUfLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_CF.setText("UF");

        topicoNomeLB_CF.setFont(topicoNomeLB_CF.getFont().deriveFont(topicoNomeLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_CF.getFont().getSize()+7));
        topicoNomeLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CF.setText("Nome");

        topicoCepLB_CF.setFont(topicoCepLB_CF.getFont().deriveFont(topicoCepLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_CF.getFont().getSize()+7));
        topicoCepLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_CF.setText("CEP");

        topicoCidadeLB_CF.setFont(topicoCidadeLB_CF.getFont().deriveFont(topicoCidadeLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_CF.getFont().getSize()+7));
        topicoCidadeLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_CF.setText("Cidade");

        topicoRuaLB_CF.setFont(topicoRuaLB_CF.getFont().deriveFont(topicoRuaLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_CF.getFont().getSize()+7));
        topicoRuaLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_CF.setText("Rua");

        numeroTF_CF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_CFKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_CFKeyTyped(evt);
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

        confirmarBTN_CF.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CF.setFont(confirmarBTN_CF.getFont().deriveFont(confirmarBTN_CF.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CF.getFont().getSize()+7));
        confirmarBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CF.setText("Confirmar");
        confirmarBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CFActionPerformed(evt);
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
        voltarBTN_CF.setFont(voltarBTN_CF.getFont().deriveFont(voltarBTN_CF.getFont().getStyle() & ~java.awt.Font.BOLD, 18));
        voltarBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CF.setText("Voltar");
        voltarBTN_CF.setMaximumSize(new java.awt.Dimension(109, 31));
        voltarBTN_CF.setMinimumSize(new java.awt.Dimension(109, 31));
        voltarBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CFActionPerformed(evt);
            }
        });

        sairBTN_CF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CF.setFont(sairBTN_CF.getFont().deriveFont(sairBTN_CF.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CF.getFont().getSize()+7));
        sairBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CF.setText("Sair");
        sairBTN_CF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CFActionPerformed(evt);
            }
        });

        gerenteBTN_CF.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(gerenteBTN_CF);
        gerenteBTN_CF.setFont(gerenteBTN_CF.getFont().deriveFont(gerenteBTN_CF.getFont().getStyle() & ~java.awt.Font.BOLD, gerenteBTN_CF.getFont().getSize()+1));
        gerenteBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        gerenteBTN_CF.setText("Gerente");

        funcionarioBTN_CF.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(funcionarioBTN_CF);
        funcionarioBTN_CF.setFont(funcionarioBTN_CF.getFont().deriveFont(funcionarioBTN_CF.getFont().getStyle() & ~java.awt.Font.BOLD, funcionarioBTN_CF.getFont().getSize()+1));
        funcionarioBTN_CF.setForeground(new java.awt.Color(232, 72, 85));
        funcionarioBTN_CF.setText("Funcionario");

        utilityLB_CF.setFont(utilityLB_CF.getFont().deriveFont(utilityLB_CF.getFont().getStyle() & ~java.awt.Font.BOLD, utilityLB_CF.getFont().getSize()+1));
        utilityLB_CF.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_CF.setText("Marque se é um funcionário ou um gerente que está sendo cadastrado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltarBTN_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoUfLB_CF)
                            .addComponent(topicoBairroLB_CF)
                            .addComponent(topicoNomeLB_CF)
                            .addComponent(topicoCidadeLB_CF)
                            .addComponent(topicoRuaLB_CF))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
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
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(ufTF_CF)
                                        .addGap(37, 37, 37)
                                        .addComponent(topicoCepLB_CF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cepTF_CF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(confirmarBTN_CF, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(titleLB_CF)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(madeLB_CF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lavantLB_CF, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(gerenteBTN_CF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funcionarioBTN_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(utilityLB_CF))
                            .addComponent(sairBTN_CF))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CF)
                .addGap(12, 12, 12)
                .addComponent(titleLB_CF)
                .addGap(27, 27, 27)
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
                        .addGap(57, 57, 57)
                        .addComponent(madeLB_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmarBTN_CF)
                            .addComponent(voltarBTN_CF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))))
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
            //Verifica se o tipo do funcionário
            if (identificador.equals("A")) {
                //Popup que avisa que a senha é padrão, e mostra o login do funcionário
                JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!\n"
                        + "Login: " + "A" + (Codigos.buscaFuncionario() - 1) + "\n"
                        + "Senha(Padrão): madeLavant");
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\n"
                        + "Login: " + "B" + (Codigos.buscaFuncionario() - 1) + "\n"
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
        //Máscara que aceita apenas 2 letras
        String texto = ufTF_CF.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 2 caracteres e se o último caractere digitado é uma letra
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_CF.setText(texto);
    }

    private void mascaraCEP() {
        //Máscara que aceita apenas 8 letras
        String texto = cepTF_CF.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 8 caracteres e se o último caractere digitado é um número
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_CF.setText(texto);
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
