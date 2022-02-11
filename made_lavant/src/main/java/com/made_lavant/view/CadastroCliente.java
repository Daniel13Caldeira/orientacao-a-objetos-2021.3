package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.base.Cliente;
import com.made_lavant.base.Endereco;
import com.made_lavant.dados.ClienteDados;
import javax.swing.JTextField;

public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
        //Colocando o jframe em tela cheia
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
        setTitle("Cadastro ");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        titleLB_CC.setFont(titleLB_CC.getFont().deriveFont(titleLB_CC.getFont().getStyle() | java.awt.Font.BOLD, titleLB_CC.getFont().getSize()+25));
        titleLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CC.setText("Cadastro do Cliente");
        titleLB_CC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoNomeLB_CC.setFont(topicoNomeLB_CC.getFont().deriveFont(topicoNomeLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_CC.getFont().getSize()+7));
        topicoNomeLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CC.setText("Nome");

        topicoCidadeLB_CC.setFont(topicoCidadeLB_CC.getFont().deriveFont(topicoCidadeLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_CC.getFont().getSize()+7));
        topicoCidadeLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_CC.setText("Cidade");

        topicoRuaLB_CC.setFont(topicoRuaLB_CC.getFont().deriveFont(topicoRuaLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_CC.getFont().getSize()+7));
        topicoRuaLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_CC.setText("Rua");

        confirmarBTN_CC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CC.setFont(confirmarBTN_CC.getFont().deriveFont(confirmarBTN_CC.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CC.getFont().getSize()+7));
        confirmarBTN_CC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CC.setText("Confirmar");
        confirmarBTN_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CCActionPerformed(evt);
            }
        });

        topicoBairroLB_CC.setFont(topicoBairroLB_CC.getFont().deriveFont(topicoBairroLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_CC.getFont().getSize()+7));
        topicoBairroLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_CC.setText("Bairro");

        topicoNumeroLB_CC.setFont(topicoNumeroLB_CC.getFont().deriveFont(topicoNumeroLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_CC.getFont().getSize()+7));
        topicoNumeroLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_CC.setText("Número");

        topicoUfLB_CC.setFont(topicoUfLB_CC.getFont().deriveFont(topicoUfLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_CC.getFont().getSize()+7));
        topicoUfLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_CC.setText("UF");

        topicoCepLB_CC.setFont(topicoCepLB_CC.getFont().deriveFont(topicoCepLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_CC.getFont().getSize()+7));
        topicoCepLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_CC.setText("CEP");

        topicoCpfLB_CC.setFont(topicoCpfLB_CC.getFont().deriveFont(topicoCpfLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCpfLB_CC.getFont().getSize()+7));
        topicoCpfLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoCpfLB_CC.setText("CPF");

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

        cepTF_CC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_CCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_CCKeyTyped(evt);
            }
        });

        madeLB_CC.setFont(madeLB_CC.getFont().deriveFont(madeLB_CC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CC.getFont().getSize()+13));
        madeLB_CC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CC.setText("MADE");

        lavantLB_CC.setFont(lavantLB_CC.getFont().deriveFont(lavantLB_CC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CC.getFont().getSize()+13));
        lavantLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CC.setText("Lavant");
        lavantLB_CC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        sairBTN_CC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CC.setFont(sairBTN_CC.getFont().deriveFont(sairBTN_CC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CC.getFont().getSize()+3));
        sairBTN_CC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CC.setText("Sair");
        sairBTN_CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CCActionPerformed(evt);
            }
        });

        utilityLB_CC.setFont(utilityLB_CC.getFont().deriveFont(utilityLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, utilityLB_CC.getFont().getSize()+7));
        utilityLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_CC.setText("Cliente já cadastrado");

        topicoSenhaLB_CC.setFont(topicoSenhaLB_CC.getFont().deriveFont(topicoSenhaLB_CC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoSenhaLB_CC.getFont().getSize()+7));
        topicoSenhaLB_CC.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_CC.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(utilityLB_CC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmarBTN_CC)
                        .addGap(20, 20, 20))
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
                                        .addGap(0, 163, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNumeroLB_CC)
                                    .addComponent(topicoCepLB_CC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cepTF_CC, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
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
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(topicoSenhaLB_CC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senhaTF_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(madeLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavantLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CC)
                .addGap(18, 18, 18)
                .addComponent(titleLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(madeLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
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
                if (ClienteDados.buscarCPF(cpfTF_CC.getText()) != null) {
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
            //Criando o carrinho do novo cliente
            new Carrinho(cliente);
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CCActionPerformed

    private void cpfTF_CCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfTF_CCKeyReleased
        mascaraCPF();
    }//GEN-LAST:event_cpfTF_CCKeyReleased

    private void mascaraCPF() {
        //Máscara que aceita apenas 11 números
        String texto = cpfTF_CC.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 11 caracteres e se o último caractere digitado é um número
            if (texto.length() > 11 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
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
        //Máscara que aceita apenas 2 letras
        String texto = ufTF_CC.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 2 caracteres e se o último caractere digitado é uma letra
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_CC.setText(texto);
    }

    private void mascaraCEP() {
        //Máscara que aceita apenas 8 letras
        String texto = cepTF_CC.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 8 caracteres e se o último caractere digitado é um número
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_CC.setText(texto);
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
