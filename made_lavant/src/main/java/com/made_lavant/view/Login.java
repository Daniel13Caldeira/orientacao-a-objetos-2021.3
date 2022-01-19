/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.view;

import com.made_lavant.dados.ClienteDados;
import com.made_lavant.dados.FuncionarioDados;

/**
 *
 * @author ewe88
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    protected static String codigo;

    protected static String getCodigo() {
        return Login.codigo;
    }

    public Login() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        user_Login = new javax.swing.JTextField();
        senha_Login = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        naoCadastrado_Login = new javax.swing.JLabel();
        naoCadastrado_Login.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        jButton4.setBackground(new java.awt.Color(255, 253, 130));
        jButton4.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(232, 72, 85));
        jButton4.setText("Confirmar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(232, 72, 85));
        jLabel7.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 72, 85));
        jLabel7.setText("Login");

        jLabel6.setBackground(new java.awt.Color(255, 253, 130));
        jLabel6.setFont(new java.awt.Font("Colonna MT", 0, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 253, 130));
        jLabel6.setText("MADE");

        jLabel9.setBackground(new java.awt.Color(232, 72, 85));
        jLabel9.setFont(new java.awt.Font("Colonna MT", 1, 65)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 72, 85));
        jLabel9.setText("Lavant");

        jLabel8.setBackground(new java.awt.Color(232, 72, 85));
        jLabel8.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 72, 85));
        jLabel8.setText("Senha");

        jButton3.setBackground(new java.awt.Color(255, 253, 130));
        jButton3.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(232, 72, 85));
        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        naoCadastrado_Login.setBackground(new java.awt.Color(232, 72, 85));
        naoCadastrado_Login.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        naoCadastrado_Login.setForeground(new java.awt.Color(232, 72, 85));
        naoCadastrado_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naoCadastrado_Login.setText("Usuário Não Cadastrado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(senha_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(naoCadastrado_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(181, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(senha_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(naoCadastrado_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jButton3)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean flag = true;
        if (user_Login.getText().equals("") || user_Login.getText().equals("Campo Obrigatório!")) {
            user_Login.setText("Campo Obrigatório!");
            flag = false;
        }
        if (senha_Login.getText().equals("") || senha_Login.getText().equals("Campo Obrigatório!")) {
            naoCadastrado_Login.setText("Campo De Senha Obrigatório!");
            naoCadastrado_Login.setVisible(true);
            flag = false;
        }
        if (flag) {
            if (user_Login.getText().charAt(0) == 'A' || user_Login.getText().charAt(0) == 'B') {
                FuncionarioDados func = new FuncionarioDados();
                String cod = func.buscarCodigo(user_Login.getText());
                if (cod == null) {
                    naoCadastrado_Login.setText("Usuário Não Cadastrado!");
                    naoCadastrado_Login.setVisible(true);
                    flag = false;
                } else {
                    naoCadastrado_Login.setVisible(false);
                    String senha = func.buscarSenha(cod);
                    if (senha.equals(senha_Login.getText())) {
                        Login.codigo = user_Login.getText();
                        this.setVisible(false);
                        if (user_Login.getText().charAt(0) == 'A') {
                            new InicioGerente().setVisible(true);
                        } else {
                            new InicioFuncionario().setVisible(true);
                        }
                    } else {
                        naoCadastrado_Login.setText("Senha Incorreta!");
                        naoCadastrado_Login.setVisible(true);
                    }
                }
            } else {
                if (user_Login.getText().charAt(0) >= '0' && user_Login.getText().charAt(0) <= '9') {
                    ClienteDados cliente = new ClienteDados();
                    String cod = cliente.buscarCPF(user_Login.getText());
                    if (cod == null) {
                        naoCadastrado_Login.setText("Usuário Não Cadastrado!");
                        naoCadastrado_Login.setVisible(true);
                        flag = false;
                    } else {
                        naoCadastrado_Login.setVisible(false);
                        String senha = cliente.buscarSenha(cod);
                        if (senha.equals(senha_Login.getText())) {
                            Login.codigo = user_Login.getText();
                            this.setVisible(false);
                            new InicioCliente().setVisible(true);
                        } else {
                            naoCadastrado_Login.setText("Senha Incorreta!");
                            naoCadastrado_Login.setVisible(true);
                        }
                    }
                } else {
                    naoCadastrado_Login.setText("Usuário Não Cadastrado!");
                    naoCadastrado_Login.setVisible(true);
                    flag = false;
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel naoCadastrado_Login;
    private javax.swing.JPasswordField senha_Login;
    private javax.swing.JTextField user_Login;
    // End of variables declaration//GEN-END:variables

    private static boolean vazio() {
        FuncionarioDados func = new FuncionarioDados();
        if (func.vazio() == null) {
            return true;
        }
        return false;
    }
}
