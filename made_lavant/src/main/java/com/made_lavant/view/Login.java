package com.made_lavant.view;

import com.made_lavant.dados.ClienteDados;
import com.made_lavant.dados.FuncionarioDados;
import com.made_lavant.dados.ProdutoDados;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        return Login.codigo;
    }

    public Login() {
        ProdutoDados.verificaValidade();
        initComponents();
        //Deixa a tela do JFrame em tela cheia
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
        //o label é criado invisível
        utilityLB_LO.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        confirmarBTN_LO.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_LO.setFont(confirmarBTN_LO.getFont().deriveFont(confirmarBTN_LO.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_LO.getFont().getSize()+7));
        confirmarBTN_LO.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_LO.setText("Confirmar");
        confirmarBTN_LO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_LOActionPerformed(evt);
            }
        });

        topicoLoginLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        topicoLoginLB_LO.setFont(topicoLoginLB_LO.getFont().deriveFont(topicoLoginLB_LO.getFont().getStyle() | java.awt.Font.BOLD, topicoLoginLB_LO.getFont().getSize()+25));
        topicoLoginLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        topicoLoginLB_LO.setText("Login");

        madeLB_LO.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_LO.setFont(madeLB_LO.getFont().deriveFont(madeLB_LO.getFont().getStyle() | java.awt.Font.BOLD, madeLB_LO.getFont().getSize()+54));
        madeLB_LO.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_LO.setText("MADE");

        lavantLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        lavantLB_LO.setFont(lavantLB_LO.getFont().deriveFont(lavantLB_LO.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_LO.getFont().getSize()+54));
        lavantLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_LO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_LO.setText("Lavant");

        topicoSenhaLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_LO.setFont(topicoSenhaLB_LO.getFont().deriveFont(topicoSenhaLB_LO.getFont().getStyle() | java.awt.Font.BOLD, topicoSenhaLB_LO.getFont().getSize()+25));
        topicoSenhaLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        topicoSenhaLB_LO.setText("Senha");

        cadastrarBTN_LO.setBackground(new java.awt.Color(255, 253, 130));
        cadastrarBTN_LO.setFont(cadastrarBTN_LO.getFont().deriveFont(cadastrarBTN_LO.getFont().getStyle() & ~java.awt.Font.BOLD, cadastrarBTN_LO.getFont().getSize()+13));
        cadastrarBTN_LO.setForeground(new java.awt.Color(232, 72, 85));
        cadastrarBTN_LO.setText("Cadastrar");
        cadastrarBTN_LO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBTN_LOActionPerformed(evt);
            }
        });

        utilityLB_LO.setBackground(new java.awt.Color(232, 72, 85));
        utilityLB_LO.setFont(utilityLB_LO.getFont().deriveFont(utilityLB_LO.getFont().getStyle() & ~java.awt.Font.BOLD, utilityLB_LO.getFont().getSize()+7));
        utilityLB_LO.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_LO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utilityLB_LO.setText("Usuário Não Cadastrado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(madeLB_LO, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(lavantLB_LO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(confirmarBTN_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(topicoSenhaLB_LO)
                                .addComponent(topicoLoginLB_LO))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senhaPF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginTF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(utilityLB_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarBTN_LO)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(madeLB_LO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_LO)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoLoginLB_LO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoSenhaLB_LO)
                    .addComponent(senhaPF_LO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(utilityLB_LO, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmarBTN_LO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
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
        //diz se o login pode ser feito
        boolean flag = true;
        //verifica se os campos obrigatórios foram preenchidos
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
            //se o primeiro caractere do login for 'A' o usuário é um gerente, se for 'B' é um funcionário, então suas informações estão armazenadas num arquivo txt de funcionários
            if (loginTF_LO.getText().charAt(0) == 'A' || loginTF_LO.getText().charAt(0) == 'B') {
                //busca o código passado no arquivo txt
                String codigo = FuncionarioDados.buscarCodigo(loginTF_LO.getText());
                //verifica se o usuário foi cadastrado
                if (codigo == null) {
                    utilityLB_LO.setText("Usuário Não Cadastrado!");
                    utilityLB_LO.setVisible(true);
                    flag = false;
                } else {
                    utilityLB_LO.setVisible(false);
                    //busca a senha do usuário
                    String senha = FuncionarioDados.buscarSenha(codigo);
                    //verifica se a senha está correta
                    if (senha.equals(senhaPF_LO.getText())) {
                        //muda o valor do atributo código para o código do usuário
                        Login.codigo = loginTF_LO.getText();
                        //verifica o tipo de funcionário que está fazendo login
                        if (loginTF_LO.getText().charAt(0) == 'A') {
                            //verifica se a senha cadastrada é a senha default
                            if (FuncionarioDados.buscarSenha(loginTF_LO.getText()).equals("madeLavant")) {
                                //avisa que a senha cadastrada é a default
                                JOptionPane.showMessageDialog(null, "Senha padrão detectada!\nRedirecionando para tela de edição.");
                                this.setVisible(false);
                                //redireciona para a tela de editar gerente
                                new EditarDadosGerente().setVisible(true);
                            } else {
                                this.setVisible(false);
                                //redireciona para a tela de inicio do gerente
                                new InicioGerente().setVisible(true);
                            }
                        } else {
                            //verifica se a senha cadastrada é a senha default
                            if (FuncionarioDados.buscarSenha(loginTF_LO.getText()).equals("madeLavant")) {
                                //avisa que a senha cadastrada é a default
                                JOptionPane.showMessageDialog(null, "Senha padrão detectada!\nRedirecionando para tela de edição.");
                                this.setVisible(false);
                                //redireciona para a tela de editar funcionário
                                new EditarDadosFuncionario().setVisible(true);
                            } else {
                                //redireciona para a tela de inicio do gerente
                                this.setVisible(false);
                                new InicioFuncionario().setVisible(true);
                            }
                        }
                    } else {
                        //avisa que a senha está errada
                        utilityLB_LO.setText("Senha Incorreta!");
                        utilityLB_LO.setVisible(true);
                    }
                }
                //o usuário é um cliente
            } else {
                //verifica se o primeiro caractere é um número, se não for, o cpf é inválido
                if (loginTF_LO.getText().charAt(0) >= '0' && loginTF_LO.getText().charAt(0) <= '9') {
                    //busca o cpf do cliente no arquivo txt
                    String cod = ClienteDados.buscarCPF(loginTF_LO.getText());
                    if (cod == null) {
                        utilityLB_LO.setText("Usuário Não Cadastrado!");
                        utilityLB_LO.setVisible(true);
                        flag = false;
                    } else {
                        //busca a senha do clinete no arquivo txt
                        utilityLB_LO.setVisible(false);
                        String senha = ClienteDados.buscarSenha(cod);
                        //verifica se a senha está correta
                        if (senha.equals(senhaPF_LO.getText())) {
                            Login.codigo = loginTF_LO.getText();
                            //redireciona a para o início do cliente
                            this.setVisible(false);
                            new InicioCliente().setVisible(true);
                        } else {
                            //avisa que a senha est´incorreta
                            utilityLB_LO.setText("Senha Incorreta!");
                            utilityLB_LO.setVisible(true);
                        }
                    }
                } else {
                    //usuário não cadastrado
                    utilityLB_LO.setText("Usuário Não Cadastrado!");
                    utilityLB_LO.setVisible(true);
                    flag = false;
                }
            }
        }
    }//GEN-LAST:event_confirmarBTN_LOActionPerformed

    private void cadastrarBTN_LOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBTN_LOActionPerformed
        //redireciona para a tela de cadastro de cliente
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
                //verifica se tem algum funcionário cadastrado
                if (vazio()) {
                    //redireciona para o cadastro de gerente
                    new CadastroGerente().setVisible(true);
                } else {
                    //redireciona para a tela de login
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
        //verifica se há algum funcionário cadastrado
        if (FuncionarioDados.vazio() == null) {
            return true;
        }
        return false;
    }
}
