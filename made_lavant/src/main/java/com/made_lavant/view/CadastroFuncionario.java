/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;

/**
 *
 * @author matheusreis
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form JanelaCadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoFuncionario_btnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bairro_cadastroFuncionario = new javax.swing.JTextField();
        nome_cadastroFuncionario = new javax.swing.JTextField();
        numero_cadastroFuncionario = new javax.swing.JTextField();
        cidade_cadastroFuncionario = new javax.swing.JTextField();
        uf_cadastroFuncionario = new javax.swing.JTextField();
        rua_cadastroFuncionario = new javax.swing.JTextField();
        btnConfirmar_cadastroFuncionario = new javax.swing.JButton();
        cep_cadastroFuncionario = new javax.swing.JTextField();
        btnVoltar_cadastroFuncionario = new javax.swing.JButton();
        btn_sairCadastroFuncionario = new javax.swing.JButton();
        BTNGerente_cadastroFuncionário = new javax.swing.JRadioButton();
        BTNFuncionario_cadastroFuncionário = new javax.swing.JRadioButton();
        tipoNaoSelecionado_cadastroFuncionário = new javax.swing.JLabel();
        tipoNaoSelecionado_cadastroFuncionário.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcioario");

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));

        jLabel10.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 253, 130));
        jLabel10.setText("MADE");

        jLabel5.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 72, 85));
        jLabel5.setText("Bairro");

        jLabel11.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 72, 85));
        jLabel11.setText("Lavant");

        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 72, 85));
        jLabel6.setText("Número");

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 72, 85));
        jLabel1.setText("Cadastro do Funcionário");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 72, 85));
        jLabel7.setText("UF");

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 72, 85));
        jLabel2.setText("Nome");

        jLabel8.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 72, 85));
        jLabel8.setText("CEP");

        jLabel3.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 72, 85));
        jLabel3.setText("Cidade");

        jLabel4.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 72, 85));
        jLabel4.setText("Rua");

        nome_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cadastroFuncionarioActionPerformed(evt);
            }
        });

        cidade_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidade_cadastroFuncionarioActionPerformed(evt);
            }
        });

        rua_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rua_cadastroFuncionarioActionPerformed(evt);
            }
        });

        btnConfirmar_cadastroFuncionario.setBackground(new java.awt.Color(255, 253, 130));
        btnConfirmar_cadastroFuncionario.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        btnConfirmar_cadastroFuncionario.setForeground(new java.awt.Color(232, 72, 85));
        btnConfirmar_cadastroFuncionario.setText("Confirmar");
        btnConfirmar_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar_cadastroFuncionarioActionPerformed(evt);
            }
        });

        cep_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cep_cadastroFuncionarioActionPerformed(evt);
            }
        });

        btnVoltar_cadastroFuncionario.setBackground(new java.awt.Color(255, 253, 130));
        btnVoltar_cadastroFuncionario.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        btnVoltar_cadastroFuncionario.setForeground(new java.awt.Color(232, 72, 85));
        btnVoltar_cadastroFuncionario.setText("Voltar");
        btnVoltar_cadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar_cadastroFuncionarioActionPerformed(evt);
            }
        });

        btn_sairCadastroFuncionario.setBackground(new java.awt.Color(255, 253, 130));
        btn_sairCadastroFuncionario.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        btn_sairCadastroFuncionario.setForeground(new java.awt.Color(232, 72, 85));
        btn_sairCadastroFuncionario.setText("Sair");
        btn_sairCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairCadastroFuncionarioActionPerformed(evt);
            }
        });

        BTNGerente_cadastroFuncionário.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(BTNGerente_cadastroFuncionário);
        BTNGerente_cadastroFuncionário.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        BTNGerente_cadastroFuncionário.setForeground(new java.awt.Color(232, 72, 85));
        BTNGerente_cadastroFuncionário.setText("Gerente");
        BTNGerente_cadastroFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGerente_cadastroFuncionárioActionPerformed(evt);
            }
        });

        BTNFuncionario_cadastroFuncionário.setBackground(new java.awt.Color(45, 48, 71));
        tipoFuncionario_btnGroup.add(BTNFuncionario_cadastroFuncionário);
        BTNFuncionario_cadastroFuncionário.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        BTNFuncionario_cadastroFuncionário.setForeground(new java.awt.Color(232, 72, 85));
        BTNFuncionario_cadastroFuncionário.setText("Funcionario");
        BTNFuncionario_cadastroFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNFuncionario_cadastroFuncionárioActionPerformed(evt);
            }
        });

        tipoNaoSelecionado_cadastroFuncionário.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tipoNaoSelecionado_cadastroFuncionário.setForeground(new java.awt.Color(232, 72, 85));
        tipoNaoSelecionado_cadastroFuncionário.setText("Marque se é um funcionário ou um gerente que está sendo cadastrado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVoltar_cadastroFuncionario)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_cadastroFuncionario)
                            .addComponent(cidade_cadastroFuncionario)
                            .addComponent(rua_cadastroFuncionario)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bairro_cadastroFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero_cadastroFuncionario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 210, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(uf_cadastroFuncionario)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cep_cadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfirmar_cadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btn_sairCadastroFuncionario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BTNGerente_cadastroFuncionário)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTNFuncionario_cadastroFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(tipoNaoSelecionado_cadastroFuncionário)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_sairCadastroFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cidade_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rua_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bairro_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(numero_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cep_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(uf_cadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNGerente_cadastroFuncionário)
                            .addComponent(BTNFuncionario_cadastroFuncionário)
                            .addComponent(tipoNaoSelecionado_cadastroFuncionário))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnVoltar_cadastroFuncionario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConfirmar_cadastroFuncionario)
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

    private void nome_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cadastroFuncionarioActionPerformed

    private void cidade_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidade_cadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidade_cadastroFuncionarioActionPerformed

    private void rua_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rua_cadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rua_cadastroFuncionarioActionPerformed

    private void cep_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cep_cadastroFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cep_cadastroFuncionarioActionPerformed

    private void btnVoltar_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar_cadastroFuncionarioActionPerformed
        //volta para o crud de funcionários
        this.setVisible(false);
        new CrudFuncionarios().setVisible(true);
    }//GEN-LAST:event_btnVoltar_cadastroFuncionarioActionPerformed

    private void btn_sairCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairCadastroFuncionarioActionPerformed
        //volta para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_sairCadastroFuncionarioActionPerformed

    private void BTNGerente_cadastroFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGerente_cadastroFuncionárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNGerente_cadastroFuncionárioActionPerformed

    private void BTNFuncionario_cadastroFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNFuncionario_cadastroFuncionárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNFuncionario_cadastroFuncionárioActionPerformed

    private void btnConfirmar_cadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar_cadastroFuncionarioActionPerformed
        //diz se o cadastro pode ou não ser feito
        boolean cadastro = true;
        //identifica se está sendo cadastrado um funcionário ou um gerente
        String identificador = null;
        //se o nome não foi escrito o cadastro não pode ser realizado
        if (nome_cadastroFuncionario.getText().equals("") || nome_cadastroFuncionario.getText().equals("Campo obrigatório")) {
            nome_cadastroFuncionario.setText("Campo obrigatório");
            cadastro = false;
        }
        //se nenhuma opção foi escolhida o cadastro não pode ser realizado
        if (!BTNFuncionario_cadastroFuncionário.isSelected() && !BTNGerente_cadastroFuncionário.isSelected()) {
            cadastro = false;
            tipoNaoSelecionado_cadastroFuncionário.setVisible(true);
        } else {
            tipoNaoSelecionado_cadastroFuncionário.setVisible(false);
            //define o objeto criado como gerente
            if (BTNGerente_cadastroFuncionário.isSelected()) {
                identificador = "A";
            } else {
                //define o objeto criado como funcionário
                identificador = "B";
            }
        }
            //verifica se algum campo referente ao endereço foi cadastrado, se um deles for cadastrado, todos devem ser cadastrados
            if (!(cidade_cadastroFuncionario.getText().equals("") && rua_cadastroFuncionario.getText().equals("") && bairro_cadastroFuncionario.getText().equals("") && numero_cadastroFuncionario.getText().equals("") && uf_cadastroFuncionario.getText().equals("") && cep_cadastroFuncionario.getText().equals(""))) {
                if (cidade_cadastroFuncionario.getText().equals("") || cidade_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    cidade_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (bairro_cadastroFuncionario.getText().equals("") || bairro_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    bairro_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (rua_cadastroFuncionario.getText().equals("") || rua_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    rua_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (uf_cadastroFuncionario.getText().equals("") || uf_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    uf_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (numero_cadastroFuncionario.getText().equals("") || numero_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    numero_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (cep_cadastroFuncionario.getText().equals("") || cep_cadastroFuncionario.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                    cep_cadastroFuncionario.setText("Campo obrigatório se for cadastrar o endereço");
                    cadastro = false;
                }
                if (cadastro) {
                    //com todos os campos de endereço preenchidos, o cadastro será feito com o endereço
                    Endereco endereco = new Endereco(cidade_cadastroFuncionario.getText(), cep_cadastroFuncionario.getText(), uf_cadastroFuncionario.getText(), bairro_cadastroFuncionario.getText(), rua_cadastroFuncionario.getText(), numero_cadastroFuncionario.getText());
                    new Funcionario(nome_cadastroFuncionario.getText(), endereco, "madeLavant", identificador);
                }
            } else {
                //se nenhum campo de endereço estiver cadastrado, o cadastro será feito sem o endereço
                if (cadastro) {
                    new Funcionario(nome_cadastroFuncionario.getText(), "madeLavant", identificador);
                }
            }
        //retorna para a tela de crud de funcionários se o cadastro foi realizado
        if (cadastro) {
            this.setVisible(false);
            new CrudFuncionarios().setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmar_cadastroFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BTNFuncionario_cadastroFuncionário;
    private javax.swing.JRadioButton BTNGerente_cadastroFuncionário;
    private javax.swing.JTextField bairro_cadastroFuncionario;
    private javax.swing.JButton btnConfirmar_cadastroFuncionario;
    private javax.swing.JButton btnVoltar_cadastroFuncionario;
    private javax.swing.JButton btn_sairCadastroFuncionario;
    private javax.swing.JTextField cep_cadastroFuncionario;
    private javax.swing.JTextField cidade_cadastroFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nome_cadastroFuncionario;
    private javax.swing.JTextField numero_cadastroFuncionario;
    private javax.swing.JTextField rua_cadastroFuncionario;
    private javax.swing.ButtonGroup tipoFuncionario_btnGroup;
    private javax.swing.JLabel tipoNaoSelecionado_cadastroFuncionário;
    private javax.swing.JTextField uf_cadastroFuncionario;
    // End of variables declaration//GEN-END:variables
}
