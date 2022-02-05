
package com.made_lavant.view;

import com.made_lavant.base.Endereco;
import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.Codigos;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroGerente extends javax.swing.JFrame {

    public CadastroGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ufTF_CG = new javax.swing.JTextField();
        titleLB_CG = new javax.swing.JLabel();
        ruaTF_CG = new javax.swing.JTextField();
        topicoUfLB_CG = new javax.swing.JLabel();
        confirmarBTN_CG = new javax.swing.JButton();
        topicoNomeLB_CG = new javax.swing.JLabel();
        cepTF_CG = new javax.swing.JTextField();
        topicoCepLB_CG = new javax.swing.JLabel();
        topicoCidadeLB_CG = new javax.swing.JLabel();
        topicoRuaLB_CG = new javax.swing.JLabel();
        bairroTF_CG = new javax.swing.JTextField();
        madeLB_CG = new javax.swing.JLabel();
        nomeTF_CG = new javax.swing.JTextField();
        topicoBairroLB_CG = new javax.swing.JLabel();
        numeroTF_CG = new javax.swing.JTextField();
        lavantLB_CG = new javax.swing.JLabel();
        cidadeTF_CG = new javax.swing.JTextField();
        topicoNumeroLB_CG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do Gerente");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        ufTF_CG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ufTF_CGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ufTF_CGKeyTyped(evt);
            }
        });

        titleLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CG.setText("Cadastro do Gerente");
        titleLB_CG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ruaTF_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTF_CGActionPerformed(evt);
            }
        });

        topicoUfLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoUfLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoUfLB_CG.setText("UF");

        confirmarBTN_CG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CG.setText("Confirmar");
        confirmarBTN_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CGActionPerformed(evt);
            }
        });

        topicoNomeLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNomeLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CG.setText("Nome");

        cepTF_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTF_CGActionPerformed(evt);
            }
        });
        cepTF_CG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepTF_CGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepTF_CGKeyTyped(evt);
            }
        });

        topicoCepLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCepLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCepLB_CG.setText("CEP");

        topicoCidadeLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoCidadeLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoCidadeLB_CG.setText("Cidade");

        topicoRuaLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoRuaLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoRuaLB_CG.setText("Rua");

        madeLB_CG.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        madeLB_CG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CG.setText("MADE");

        nomeTF_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTF_CGActionPerformed(evt);
            }
        });

        topicoBairroLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoBairroLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoBairroLB_CG.setText("Bairro");

        numeroTF_CG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroTF_CGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroTF_CGKeyTyped(evt);
            }
        });

        lavantLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lavantLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CG.setText("Lavant");

        cidadeTF_CG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTF_CGActionPerformed(evt);
            }
        });

        topicoNumeroLB_CG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNumeroLB_CG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNumeroLB_CG.setText("Número");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoUfLB_CG)
                    .addComponent(topicoBairroLB_CG)
                    .addComponent(topicoNomeLB_CG)
                    .addComponent(topicoCidadeLB_CG)
                    .addComponent(topicoRuaLB_CG))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTF_CG)
                    .addComponent(cidadeTF_CG)
                    .addComponent(ruaTF_CG)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairroTF_CG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topicoNumeroLB_CG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroTF_CG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLB_CG)
                        .addGap(0, 195, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ufTF_CG)
                                .addGap(37, 37, 37)
                                .addComponent(topicoCepLB_CG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lavantLB_CG)
                                    .addComponent(madeLB_CG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cepTF_CG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmarBTN_CG, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titleLB_CG)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoNomeLB_CG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_CG)
                    .addComponent(cidadeTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_CG)
                    .addComponent(ruaTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_CG)
                    .addComponent(bairroTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoNumeroLB_CG)
                    .addComponent(numeroTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoCepLB_CG)
                    .addComponent(ufTF_CG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoUfLB_CG))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(madeLB_CG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_CG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarBTN_CG)
                        .addGap(45, 45, 45)))
                .addGap(53, 53, 53))
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

    private void ruaTF_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTF_CGActionPerformed
    }//GEN-LAST:event_ruaTF_CGActionPerformed

    private void confirmarBTN_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CGActionPerformed
        //diz se o cadastro pode ou não ser feito
        boolean cadastro = true;
        //identifica se está sendo cadastrado um funcionário ou um gerente
        //se o nome não foi escrito o cadastro não pode ser realizado
        if (nomeTF_CG.getText().equals("") || nomeTF_CG.getText().equals("Campo obrigatório")) {
            nomeTF_CG.setText("Campo obrigatório");
            cadastro = false;
        }
        //verifica se algum campo referente ao endereço foi cadastrado, se um deles for cadastrado, todos devem ser cadastrados
        if (!(cidadeTF_CG.getText().equals("") && ruaTF_CG.getText().equals("") && bairroTF_CG.getText().equals("") && numeroTF_CG.getText().equals("") && ufTF_CG.getText().equals("") && cepTF_CG.getText().equals(""))) {
            if (cidadeTF_CG.getText().equals("") || cidadeTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cidadeTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (bairroTF_CG.getText().equals("") || bairroTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                bairroTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ruaTF_CG.getText().equals("") || ruaTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ruaTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (ufTF_CG.getText().equals("") || ufTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                ufTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (numeroTF_CG.getText().equals("") || numeroTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                numeroTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cepTF_CG.getText().equals("") || cepTF_CG.getText().equals("Campo obrigatório se for cadastrar o endereço")) {
                cepTF_CG.setText("Campo obrigatório se for cadastrar o endereço");
                cadastro = false;
            }
            if (cadastro) {
                //com todos os campos de endereço preenchidos, o cadastro será feito com o endereço
                Endereco endereco = new Endereco(cidadeTF_CG.getText(), cepTF_CG.getText(), ufTF_CG.getText(), bairroTF_CG.getText(), ruaTF_CG.getText(), numeroTF_CG.getText());
                Funcionario funcionario = new Funcionario(nomeTF_CG.getText(), endereco, "madeLavant", "A");
            }
        } else {
            //se nenhum campo de endereço estiver cadastrado, o cadastro será feito sem o endereço
            if (cadastro) {
                Funcionario funcionario = new Funcionario(nomeTF_CG.getText(), "madeLavant", "A");
            }
        }
        //retorna para a tela de crud de funcionários se o cadastro foi realizado
        if (cadastro) {
            Codigos cod = new Codigos();
            JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso\n"
                    + "Login: " + "A" + (cod.buscaFuncionario() - 1) + "\n"
                    + "Senha(Padrão): madeLavant");
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CGActionPerformed

    private void cepTF_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTF_CGActionPerformed
    }//GEN-LAST:event_cepTF_CGActionPerformed

    private void nomeTF_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTF_CGActionPerformed
    }//GEN-LAST:event_nomeTF_CGActionPerformed

    private void cidadeTF_CGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTF_CGActionPerformed
        mascaraInt(numeroTF_CG);
    }//GEN-LAST:event_cidadeTF_CGActionPerformed

    private void numeroTF_CGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CGKeyReleased
        mascaraInt(numeroTF_CG);
    }//GEN-LAST:event_numeroTF_CGKeyReleased

    private void numeroTF_CGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroTF_CGKeyTyped
    }//GEN-LAST:event_numeroTF_CGKeyTyped

    private void cepTF_CGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CGKeyReleased
        mascaraCEP();    }//GEN-LAST:event_cepTF_CGKeyReleased

    private void cepTF_CGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepTF_CGKeyTyped
        mascaraCEP();    }//GEN-LAST:event_cepTF_CGKeyTyped

    private void ufTF_CGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CGKeyReleased
        mascaraUF();    }//GEN-LAST:event_ufTF_CGKeyReleased

    private void ufTF_CGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ufTF_CGKeyTyped
        mascaraUF();    }//GEN-LAST:event_ufTF_CGKeyTyped

    private void mascaraUF() {
        String texto = ufTF_CG.getText();
        if (texto.length() > 0) {
            if (!(texto.length() <= 2 && ((texto.charAt(texto.length() - 1) >= 'a' && texto.charAt(texto.length() - 1) <= 'z') || (texto.charAt(texto.length() - 1) >= 'A' && texto.charAt(texto.length() - 1) <= 'Z')))) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        ufTF_CG.setText(texto);
    }

    private void mascaraCEP() {
        String texto = cepTF_CG.getText();
        if (texto.length() > 0) {
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        cepTF_CG.setText(texto);
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
    private javax.swing.JTextField bairroTF_CG;
    private javax.swing.JTextField cepTF_CG;
    private javax.swing.JTextField cidadeTF_CG;
    private javax.swing.JButton confirmarBTN_CG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CG;
    private javax.swing.JLabel madeLB_CG;
    private javax.swing.JTextField nomeTF_CG;
    private javax.swing.JTextField numeroTF_CG;
    private javax.swing.JTextField ruaTF_CG;
    private javax.swing.JLabel titleLB_CG;
    private javax.swing.JLabel topicoBairroLB_CG;
    private javax.swing.JLabel topicoCepLB_CG;
    private javax.swing.JLabel topicoCidadeLB_CG;
    private javax.swing.JLabel topicoNomeLB_CG;
    private javax.swing.JLabel topicoNumeroLB_CG;
    private javax.swing.JLabel topicoRuaLB_CG;
    private javax.swing.JLabel topicoUfLB_CG;
    private javax.swing.JTextField ufTF_CG;
    // End of variables declaration//GEN-END:variables
}
