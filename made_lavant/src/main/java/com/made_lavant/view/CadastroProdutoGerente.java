
package com.made_lavant.view;

import com.made_lavant.base.Produto;
import java.util.Date;
import javax.swing.JTextField;

public class CadastroProdutoGerente extends javax.swing.JFrame {

    public CadastroProdutoGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmarBTN_CPG = new javax.swing.JButton();
        lavantLB_CPG = new javax.swing.JLabel();
        sairBTN_CPG = new javax.swing.JButton();
        topicoValLB_CPG = new javax.swing.JLabel();
        utilityLB_CPG = new javax.swing.JLabel();
        utilityLB_CPG.setVisible(false);
        voltarBTN_CPG = new javax.swing.JButton();
        titleLB_CPG = new javax.swing.JLabel();
        topicoNomeLB_CPG = new javax.swing.JLabel();
        topicoPrecoLB_CPG = new javax.swing.JLabel();
        quantidadeTF_CPG = new javax.swing.JTextField();
        nomeTF_CPG = new javax.swing.JTextField();
        validadeTF_CPG = new javax.swing.JTextField();
        madeLB_CPG = new javax.swing.JLabel();
        precoTF_CPG = new javax.swing.JTextField();
        topicoQuantiLB_CPG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        confirmarBTN_CPG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CPG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CPG.setText("Confirmar");
        confirmarBTN_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CPGActionPerformed(evt);
            }
        });

        lavantLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        lavantLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CPG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CPG.setText("Lavant");

        sairBTN_CPG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CPG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        sairBTN_CPG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CPG.setText("Sair");
        sairBTN_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CPGActionPerformed(evt);
            }
        });

        topicoValLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoValLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_CPG.setText("Validade");

        utilityLB_CPG.setText("Data inválida");

        voltarBTN_CPG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CPG.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        voltarBTN_CPG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CPG.setText("Voltar");
        voltarBTN_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CPGActionPerformed(evt);
            }
        });

        titleLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        titleLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CPG.setText("Cadastro de Produto");
        titleLB_CPG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoNomeLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoNomeLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CPG.setText("Nome");

        topicoPrecoLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoPrecoLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_CPG.setText("Preço");

        quantidadeTF_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTF_CPGActionPerformed(evt);
            }
        });
        quantidadeTF_CPG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeTF_CPGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeTF_CPGKeyTyped(evt);
            }
        });

        nomeTF_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTF_CPGActionPerformed(evt);
            }
        });

        validadeTF_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeTF_CPGActionPerformed(evt);
            }
        });
        validadeTF_CPG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validadeTF_CPGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validadeTF_CPGKeyTyped(evt);
            }
        });

        madeLB_CPG.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        madeLB_CPG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CPG.setText("MADE");

        precoTF_CPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTF_CPGActionPerformed(evt);
            }
        });
        precoTF_CPG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoTF_CPGKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoTF_CPGKeyTyped(evt);
            }
        });

        topicoQuantiLB_CPG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoQuantiLB_CPG.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiLB_CPG.setText("Quantidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CPG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(madeLB_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lavantLB_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoQuantiLB_CPG)
                    .addComponent(topicoNomeLB_CPG)
                    .addComponent(topicoPrecoLB_CPG)
                    .addComponent(topicoValLB_CPG))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(utilityLB_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(confirmarBTN_CPG))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLB_CPG)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTF_CPG, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(quantidadeTF_CPG)
                            .addComponent(precoTF_CPG)
                            .addComponent(validadeTF_CPG))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarBTN_CPG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(madeLB_CPG)
                    .addComponent(sairBTN_CPG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CPG)
                .addGap(7, 7, 7)
                .addComponent(titleLB_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_CPG)
                    .addComponent(nomeTF_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiLB_CPG)
                    .addComponent(quantidadeTF_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_CPG)
                    .addComponent(precoTF_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoValLB_CPG)
                    .addComponent(validadeTF_CPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(utilityLB_CPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarBTN_CPG)
                .addGap(184, 184, 184)
                .addComponent(voltarBTN_CPG)
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

    private void confirmarBTN_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CPGActionPerformed
        //diz se o cadastro pode ser realizado
        boolean cadastro = true;
        //verifica se todos os campos obrigatórios foram preenchidos, se não, o cadastro não pode ser feito
        if (nomeTF_CPG.getText().equals("") || nomeTF_CPG.getText().equals("Campo obrigatório")) {
            nomeTF_CPG.setText("Campo obrigatório");
            cadastro = false;
        }
        if (precoTF_CPG.getText().equals("") || precoTF_CPG.getText().equals("Campo obrigatório")) {
            precoTF_CPG.setText("Campo obrigatório");
            cadastro = false;
        }
        if (quantidadeTF_CPG.getText().equals("") || quantidadeTF_CPG.getText().equals("Campo obrigatório")) {
            quantidadeTF_CPG.setText("Campo obrigatório");
            cadastro = false;
        }
        if (cadastro) {
            //verifica se o campo de validade foi preenchido
            if (validadeTF_CPG.getText().equals("")) {
                //se não estiver preenchido o produto é cadastrado sem a validade
                new Produto(nomeTF_CPG.getText(), Double.parseDouble(precoTF_CPG.getText()), Double.parseDouble(quantidadeTF_CPG.getText()));
            } else {

                String validade = validadeTF_CPG.getText();
                //verifica se a data é válida
                if (verificaDataValida(validade)) {
                    //adiciona um produto com a validade
                    new Produto(nomeTF_CPG.getText(), Double.parseDouble(precoTF_CPG.getText()), validade, Double.parseDouble(quantidadeTF_CPG.getText()));
                } else {
                    //se a data for inválida o cadastro não pode ser feito
                    utilityLB_CPG.setVisible(true);
                    cadastro = false;
                }
            }
            //se o cadastro foi realizado retorna para o crud de produtos
            if (cadastro) {
                this.setVisible(false);
                new CrudProdutos().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmarBTN_CPGActionPerformed

    private void sairBTN_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CPGActionPerformed
        //retorna para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CPGActionPerformed

    private void voltarBTN_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CPGActionPerformed
        this.setVisible(false);
        new CrudProdutosGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CPGActionPerformed

    private void quantidadeTF_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTF_CPGActionPerformed
    }//GEN-LAST:event_quantidadeTF_CPGActionPerformed

    private void quantidadeTF_CPGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTF_CPGKeyReleased
        mascaraDouble(quantidadeTF_CPG);
    }//GEN-LAST:event_quantidadeTF_CPGKeyReleased

    private void quantidadeTF_CPGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTF_CPGKeyTyped
        mascaraDouble(quantidadeTF_CPG);
    }//GEN-LAST:event_quantidadeTF_CPGKeyTyped

    private void nomeTF_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTF_CPGActionPerformed
    }//GEN-LAST:event_nomeTF_CPGActionPerformed

    private void validadeTF_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeTF_CPGActionPerformed
    }//GEN-LAST:event_validadeTF_CPGActionPerformed

    private void validadeTF_CPGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeTF_CPGKeyReleased
        mascaraData();
    }//GEN-LAST:event_validadeTF_CPGKeyReleased

    private void validadeTF_CPGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeTF_CPGKeyTyped
        mascaraData();
    }//GEN-LAST:event_validadeTF_CPGKeyTyped

    private void precoTF_CPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTF_CPGActionPerformed
    }//GEN-LAST:event_precoTF_CPGActionPerformed

    private void precoTF_CPGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_CPGKeyReleased
        mascaraDouble(precoTF_CPG);
    }//GEN-LAST:event_precoTF_CPGKeyReleased

    private void precoTF_CPGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_CPGKeyTyped
        mascaraDouble(precoTF_CPG);
    }//GEN-LAST:event_precoTF_CPGKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CPG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CPG;
    private javax.swing.JLabel madeLB_CPG;
    private javax.swing.JTextField nomeTF_CPG;
    private javax.swing.JTextField precoTF_CPG;
    private javax.swing.JTextField quantidadeTF_CPG;
    private javax.swing.JButton sairBTN_CPG;
    private javax.swing.JLabel titleLB_CPG;
    private javax.swing.JLabel topicoNomeLB_CPG;
    private javax.swing.JLabel topicoPrecoLB_CPG;
    private javax.swing.JLabel topicoQuantiLB_CPG;
    private javax.swing.JLabel topicoValLB_CPG;
    private javax.swing.JLabel utilityLB_CPG;
    private javax.swing.JTextField validadeTF_CPG;
    private javax.swing.JButton voltarBTN_CPG;
    // End of variables declaration//GEN-END:variables

    private boolean verificaDataValida(String data) {
        //dd/mm/yyyy
        //01/34/6789
        //separa o dia, o mês e o ano da data
        if (data.length() != 10) {
            return false;
        }
        int dia = Integer.parseInt(data.charAt(0) + "") * 10 + Integer.parseInt(data.charAt(1) + "");
        if (dia < 1 || dia > 31) {
            return false;
        }
        int mes = Integer.parseInt(data.charAt(3) + "") * 10 + Integer.parseInt(data.charAt(4) + "");
        if (mes < 0 || mes > 12) {
            return false;
        }
        int ano = Integer.parseInt(data.charAt(6) + "") * 1000 + Integer.parseInt(data.charAt(7) + "") * 100 + Integer.parseInt(data.charAt(8) + "") * 10 + Integer.parseInt(data.charAt(9) + "");
        int maxDias = 0;
        //verifica qual o máximo de dias que pode ter de acordo com o mês e o ano da validade
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                maxDias = 31;
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11: {
                maxDias = 30;
            }
            default: {
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
        }
        //verifica se o dia inserido é válido
        if (dia > maxDias || maxDias == 0) {
            return false;
        }
        return verificaDataAnteriorAtual(dia, mes, ano);
    }

    private boolean verificaDataAnteriorAtual(int dia, int mes, int ano) {
        Date data = new Date();
        String atual = data + "";
        //Fri Jan 14 1 5 : 0 0 : 2 9 B R T  2022
        //012 456 89 1112131415161718192021 23242526
        int anoAtual = Integer.parseInt(atual.charAt(24) + "") * 1000 + Integer.parseInt(atual.charAt(25) + "") * 100 + Integer.parseInt(atual.charAt(26) + "") * 10 + Integer.parseInt(atual.charAt(27) + "");
        if (anoAtual > ano) {
            return false;
        }
        if (anoAtual < ano) {
            return true;
        }
        String mesAtualAux = atual.substring(4, 7);
        int mesAtual = 0;
        if (mesAtualAux.equalsIgnoreCase("jan")) {
            mesAtual = 1;
        } else {
            if (mesAtualAux.equalsIgnoreCase("feb")) {
                mesAtual = 2;
            } else {
                if (mesAtualAux.equalsIgnoreCase("mar")) {
                    mesAtual = 3;
                } else {
                    if (mesAtualAux.equalsIgnoreCase("apr")) {
                        mesAtual = 4;
                    } else {
                        if (mesAtualAux.equalsIgnoreCase("may")) {
                            mesAtual = 5;
                        } else {
                            if (mesAtualAux.equalsIgnoreCase("jun")) {
                                mesAtual = 6;
                            } else {
                                if (mesAtualAux.equalsIgnoreCase("jul")) {
                                    mesAtual = 7;
                                } else {
                                    if (mesAtualAux.equalsIgnoreCase("aug")) {
                                        mesAtual = 8;
                                    } else {
                                        if (mesAtualAux.equalsIgnoreCase("sep")) {
                                            mesAtual = 9;
                                        } else {
                                            if (mesAtualAux.equalsIgnoreCase("oct")) {
                                                mesAtual = 10;
                                            } else {
                                                if (mesAtualAux.equalsIgnoreCase("nov")) {
                                                    mesAtual = 11;
                                                } else {
                                                    if (mesAtualAux.equalsIgnoreCase("dec")) {
                                                        mesAtual = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (mesAtual > mes) {
            return false;
        }
        if (mesAtual < mes) {
            return true;
        }
        int diaAtual = Integer.parseInt(atual.charAt(8) + "") * 10 + Integer.parseInt(atual.charAt(9) + "");
        if (diaAtual >= dia) {
            return false;
        }
        return true;
    }

    private void mascaraData() {
        String texto = validadeTF_CPG.getText();
        if (texto.length() > 0) {
            if (texto.length() > 10 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
            if (texto.length() == 2 || texto.length() == 5) {
                texto += "/";
            }
        }
        validadeTF_CPG.setText(texto);
    }

    private void mascaraDouble(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (!(texto.charAt(texto.length() - 1) == '.' || (texto.charAt(texto.length() - 1) >= '0' && texto.charAt(texto.length() - 1) <= '9'))) {
                texto = texto.substring(0, texto.length() - 1);
            }
            int cont = 0;
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == '.') {
                    cont++;
                }
            }
            if (cont > 1) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }
}
