package com.made_lavant.view;

import com.made_lavant.dados.ClienteDados;
import com.made_lavant.dados.FuncionarioDados;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        return Login.codigo;
    }

    public Login() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmarBTN_LO = new javax.swing.JButton();
        topicoLoginLB_LO = new javax.swing.JLabel();
        madeLB_LO = new javax.swing.JLabel();
        lavantLB_LO = new javax.swing.JLabel();
        topicoSenhaLB_LO = new javax.swing.JLabel();
        loginTF_LO = new javax.swing.JTextField();
        senhaPF_LO = new javax.swing.JPasswordField();
        cadastrarBTN_LO = new javax.swing.JButton();
        utilityLB_LO = new javax.swing.JLabel();
        utilityLB_LO.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        confirmarBTN_LO.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_LO.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_LO.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_LO.setText("Confirmar");
        confirmarBTN_LO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_LOActionPerformed(evt);
            }
        });

        topicoLoginLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        topicoLoginLB_LO.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        topicoLoginLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        topicoLoginLB_LO.setText("Login");

        madeLB_LO.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_LO.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        madeLB_LO.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_LO.setText("MADE");

        lavantLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        lavantLB_LO.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        lavantLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_LO.setText("Lavant");

        topicoSenhaLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_LO.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        topicoSenhaLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_LO.setText("Senha");

        cadastrarBTN_LO.setBackground(new java.awt.Color(255, 253, 130));
        cadastrarBTN_LO.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        cadastrarBTN_LO.setForeground(new java.awt.Color(232, 72, 85));
        cadastrarBTN_LO.setText("Cadastrar");
        cadastrarBTN_LO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBTN_LOActionPerformed(evt);
            }
        });

        utilityLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        utilityLB_LO.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        utilityLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_LO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utilityLB_LO.setText("Usuário Não Cadastrado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrarBTN_LO)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoSenhaLB_LO)
                                    .addComponent(topicoLoginLB_LO))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senhaPF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loginTF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(madeLB_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lavantLB_LO))
                            .addComponent(confirmarBTN_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utilityLB_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(181, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(madeLB_LO)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lavantLB_LO)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoLoginLB_LO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoSenhaLB_LO)
                    .addComponent(senhaPF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(utilityLB_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(confirmarBTN_LO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(cadastrarBTN_LO)
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

    private void confirmarBTN_LOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_LOActionPerformed
        boolean flag = true;
        if (loginTF_LO.getText().equals("") || loginTF_LO.getText().equals("Campo Obrigatório!")) {
            loginTF_LO.setText("Campo Obrigatório!");
            flag = false;
        }
        if (senhaPF_LO.getText().equals("") || senhaPF_LO.getText().equals("Campo Obrigatório!")) {
            utilityLB_LO.setText("Campo De Senha Obrigatório!");
            utilityLB_LO.setVisible(true);
            flag = false;
        }
        if (flag) {
            if (loginTF_LO.getText().charAt(0) == 'A' || loginTF_LO.getText().charAt(0) == 'B') {
                FuncionarioDados func = new FuncionarioDados();
                String cod = func.buscarCodigo(loginTF_LO.getText());
                if (cod == null) {
                    utilityLB_LO.setText("Usuário Não Cadastrado!");
                    utilityLB_LO.setVisible(true);
                    flag = false;
                } else {
                    utilityLB_LO.setVisible(false);
                    String senha = func.buscarSenha(cod);
                    if (senha.equals(senhaPF_LO.getText())) {
                        Login.codigo = loginTF_LO.getText();
                        if (loginTF_LO.getText().charAt(0) == 'A') {
                            if (func.buscarSenha(loginTF_LO.getText()).equals("madeLavant")) {
                                JOptionPane.showMessageDialog(null, "Senha padrão detectada!\nRedirecionando para tela de edição.");
                                this.setVisible(false);
                                new EditarDadosGerente().setVisible(true);
                            } else {
                                this.setVisible(false);
                                new InicioGerente().setVisible(true);

                            }
                        } else {
                            if (func.buscarSenha(loginTF_LO.getText()).equals("madeLavant")) {
                                JOptionPane.showMessageDialog(null, "Senha padrão detectada!\nRedirecionando para tela de edição.");
                                this.setVisible(false);
                                new EditarDadosFuncionario().setVisible(true);
                            } else {
                                this.setVisible(false);
                                new InicioFuncionario().setVisible(true);
                            }
                        }
                    } else {
                        utilityLB_LO.setText("Senha Incorreta!");
                        utilityLB_LO.setVisible(true);
                    }
                }
            } else {
                if (loginTF_LO.getText().charAt(0) >= '0' && loginTF_LO.getText().charAt(0) <= '9') {
                    ClienteDados cliente = new ClienteDados();
                    String cod = cliente.buscarCPF(loginTF_LO.getText());
                    if (cod == null) {
                        utilityLB_LO.setText("Usuário Não Cadastrado!");
                        utilityLB_LO.setVisible(true);
                        flag = false;
                    } else {
                        utilityLB_LO.setVisible(false);
                        String senha = cliente.buscarSenha(cod);
                        if (senha.equals(senhaPF_LO.getText())) {
                            Login.codigo = loginTF_LO.getText();
                            this.setVisible(false);
                            new InicioCliente().setVisible(true);
                        } else {
                            utilityLB_LO.setText("Senha Incorreta!");
                            utilityLB_LO.setVisible(true);
                        }
                    }
                } else {
                    utilityLB_LO.setText("Usuário Não Cadastrado!");
                    utilityLB_LO.setVisible(true);
                    flag = false;
                }
            }
        }
    }//GEN-LAST:event_confirmarBTN_LOActionPerformed

    private void cadastrarBTN_LOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBTN_LOActionPerformed
        this.setVisible(false);
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_cadastrarBTN_LOActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (vazio()) {
                    new CadastroGerente().setVisible(true);
                } else {
                    new Login().setVisible(true);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBTN_LO;
    private javax.swing.JButton confirmarBTN_LO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_LO;
    private javax.swing.JTextField loginTF_LO;
    private javax.swing.JLabel madeLB_LO;
    private javax.swing.JPasswordField senhaPF_LO;
    private javax.swing.JLabel topicoLoginLB_LO;
    private javax.swing.JLabel topicoSenhaLB_LO;
    private javax.swing.JLabel utilityLB_LO;
    // End of variables declaration//GEN-END:variables

    private static boolean vazio() {
        FuncionarioDados func = new FuncionarioDados();
        if (func.vazio() == null) {
            return true;
        }
        return false;
    }
}
