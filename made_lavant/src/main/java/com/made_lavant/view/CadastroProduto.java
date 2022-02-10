
package com.made_lavant.view;

import com.made_lavant.base.Produto;
import java.util.Date;
import javax.swing.JTextField;


public class CadastroProduto extends javax.swing.JFrame {


    public CadastroProduto() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CP = new javax.swing.JLabel();
        topicoQuantiLB_CP = new javax.swing.JLabel();
        lavantLB_CP = new javax.swing.JLabel();
        topicoValLB_CP = new javax.swing.JLabel();
        voltarBTN_CP = new javax.swing.JButton();
        titleLB_CP = new javax.swing.JLabel();
        topicoNomeLB_CP = new javax.swing.JLabel();
        topicoPrecoLB_CP = new javax.swing.JLabel();
        quantidadeTF_CP = new javax.swing.JTextField();
        nomeTF_CP = new javax.swing.JTextField();
        validadeTF_CP = new javax.swing.JTextField();
        precoTF_CP = new javax.swing.JTextField();
        confirmarBTN_CP = new javax.swing.JButton();
        sairBTN_CP = new javax.swing.JButton();
        utilityLB_CP = new javax.swing.JLabel();
        utilityLB_CP.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CP.setFont(madeLB_CP.getFont().deriveFont(madeLB_CP.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CP.getFont().getSize()+13));
        madeLB_CP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CP.setText("MADE");

        topicoQuantiLB_CP.setFont(topicoQuantiLB_CP.getFont().deriveFont(topicoQuantiLB_CP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoQuantiLB_CP.getFont().getSize()+7));
        topicoQuantiLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantiLB_CP.setText("Quantidade");

        lavantLB_CP.setFont(lavantLB_CP.getFont().deriveFont(lavantLB_CP.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CP.getFont().getSize()+13));
        lavantLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CP.setText("Lavant");

        topicoValLB_CP.setFont(topicoValLB_CP.getFont().deriveFont(topicoValLB_CP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoValLB_CP.getFont().getSize()+7));
        topicoValLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        topicoValLB_CP.setText("Validade");

        voltarBTN_CP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CP.setFont(voltarBTN_CP.getFont().deriveFont(voltarBTN_CP.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CP.getFont().getSize()+7));
        voltarBTN_CP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CP.setText("Voltar");
        voltarBTN_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CPActionPerformed(evt);
            }
        });

        titleLB_CP.setFont(titleLB_CP.getFont().deriveFont(titleLB_CP.getFont().getStyle() | java.awt.Font.BOLD, titleLB_CP.getFont().getSize()+25));
        titleLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        titleLB_CP.setText("Cadastro de Produto");
        titleLB_CP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        topicoNomeLB_CP.setFont(topicoNomeLB_CP.getFont().deriveFont(topicoNomeLB_CP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_CP.getFont().getSize()+7));
        topicoNomeLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeLB_CP.setText("Nome");

        topicoPrecoLB_CP.setFont(topicoPrecoLB_CP.getFont().deriveFont(topicoPrecoLB_CP.getFont().getStyle() & ~java.awt.Font.BOLD, topicoPrecoLB_CP.getFont().getSize()+7));
        topicoPrecoLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        topicoPrecoLB_CP.setText("Preço");

        quantidadeTF_CP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeTF_CPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeTF_CPKeyTyped(evt);
            }
        });

        validadeTF_CP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validadeTF_CPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validadeTF_CPKeyTyped(evt);
            }
        });

        precoTF_CP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoTF_CPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoTF_CPKeyTyped(evt);
            }
        });

        confirmarBTN_CP.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CP.setFont(confirmarBTN_CP.getFont().deriveFont(confirmarBTN_CP.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CP.getFont().getSize()+7));
        confirmarBTN_CP.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CP.setText("Confirmar");
        confirmarBTN_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CPActionPerformed(evt);
            }
        });

        sairBTN_CP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CP.setFont(sairBTN_CP.getFont().deriveFont(sairBTN_CP.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CP.getFont().getSize()+7));
        sairBTN_CP.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CP.setText("Sair");
        sairBTN_CP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CPActionPerformed(evt);
            }
        });

        utilityLB_CP.setFont(utilityLB_CP.getFont().deriveFont(utilityLB_CP.getFont().getStyle() & ~java.awt.Font.BOLD, utilityLB_CP.getFont().getSize()+7));
        utilityLB_CP.setForeground(new java.awt.Color(232, 72, 85));
        utilityLB_CP.setText("Data inválida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topicoQuantiLB_CP)
                    .addComponent(topicoNomeLB_CP)
                    .addComponent(topicoPrecoLB_CP)
                    .addComponent(topicoValLB_CP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(utilityLB_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(confirmarBTN_CP))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleLB_CP)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeTF_CP, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(quantidadeTF_CP)
                            .addComponent(precoTF_CP)
                            .addComponent(validadeTF_CP))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairBTN_CP)
                    .addComponent(voltarBTN_CP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_CP, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(madeLB_CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CP)
                .addGap(39, 39, 39)
                .addComponent(titleLB_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_CP)
                    .addComponent(nomeTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoQuantiLB_CP)
                    .addComponent(quantidadeTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoPrecoLB_CP)
                    .addComponent(precoTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoValLB_CP)
                    .addComponent(validadeTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(utilityLB_CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarBTN_CP)
                .addGap(49, 49, 49)
                .addComponent(madeLB_CP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CP)
                .addGap(75, 75, 75)
                .addComponent(voltarBTN_CP)
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

    private void voltarBTN_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CPActionPerformed
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CPActionPerformed

    private void sairBTN_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CPActionPerformed
        //retorna para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CPActionPerformed

    private void confirmarBTN_CPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CPActionPerformed
        //diz se o cadastro pode ser realizado
        boolean cadastro = true;
        //verifica se todos os campos obrigatórios foram preenchidos, se não, o cadastro não pode ser feito
        if (nomeTF_CP.getText().equals("") || nomeTF_CP.getText().equals("Campo obrigatório")) {
            nomeTF_CP.setText("Campo obrigatório");
            cadastro = false;
        }
        if (precoTF_CP.getText().equals("") || precoTF_CP.getText().equals("Campo obrigatório")) {
            precoTF_CP.setText("Campo obrigatório");
            cadastro = false;
        }
        if (quantidadeTF_CP.getText().equals("") || quantidadeTF_CP.getText().equals("Campo obrigatório")) {
            quantidadeTF_CP.setText("Campo obrigatório");
            cadastro = false;
        }
        if (cadastro) {
            //verifica se o campo de validade foi preenchido
            if (validadeTF_CP.getText().equals("")) {
                //se não estiver preenchido o produto é cadastrado sem a validade
                new Produto(nomeTF_CP.getText(), Double.parseDouble(precoTF_CP.getText()), Double.parseDouble(quantidadeTF_CP.getText()));
            } else {

                String validade = validadeTF_CP.getText();
                //verifica se a data é válida
                if (verificaDataValida(validade)) {
                    //adiciona um produto com a validade
                    new Produto(nomeTF_CP.getText(), Double.parseDouble(precoTF_CP.getText()), validade, Double.parseDouble(quantidadeTF_CP.getText()));
                } else {
                    //se a data for inválida o cadastro não pode ser feito
                    utilityLB_CP.setVisible(true);
                    cadastro = false;
                }
            }
            //se o cadastro foi realizado retorna para o crud de produtos
            if (cadastro) {
                this.setVisible(false);
                new CrudProdutos().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmarBTN_CPActionPerformed

    private void mascaraData() {
        String texto = validadeTF_CP.getText();
        if (texto.length() > 0) {
            if (texto.length() > 10 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
            if (texto.length() == 2 || texto.length() == 5) {
                texto += "/";
            }
        }
        validadeTF_CP.setText(texto);
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

    private void validadeTF_CPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeTF_CPKeyReleased
        mascaraData();
    }//GEN-LAST:event_validadeTF_CPKeyReleased

    private void validadeTF_CPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeTF_CPKeyTyped
        mascaraData();
    }//GEN-LAST:event_validadeTF_CPKeyTyped

    private void quantidadeTF_CPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTF_CPKeyReleased
        mascaraDouble(quantidadeTF_CP);
    }//GEN-LAST:event_quantidadeTF_CPKeyReleased

    private void quantidadeTF_CPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTF_CPKeyTyped
        mascaraDouble(quantidadeTF_CP);
    }//GEN-LAST:event_quantidadeTF_CPKeyTyped

    private void precoTF_CPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_CPKeyReleased
        mascaraDouble(precoTF_CP);
    }//GEN-LAST:event_precoTF_CPKeyReleased

    private void precoTF_CPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTF_CPKeyTyped
        mascaraDouble(precoTF_CP);
    }//GEN-LAST:event_precoTF_CPKeyTyped
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CP;
    private javax.swing.JLabel madeLB_CP;
    private javax.swing.JTextField nomeTF_CP;
    private javax.swing.JTextField precoTF_CP;
    private javax.swing.JTextField quantidadeTF_CP;
    private javax.swing.JButton sairBTN_CP;
    private javax.swing.JLabel titleLB_CP;
    private javax.swing.JLabel topicoNomeLB_CP;
    private javax.swing.JLabel topicoPrecoLB_CP;
    private javax.swing.JLabel topicoQuantiLB_CP;
    private javax.swing.JLabel topicoValLB_CP;
    private javax.swing.JLabel utilityLB_CP;
    private javax.swing.JTextField validadeTF_CP;
    private javax.swing.JButton voltarBTN_CP;
    // End of variables declaration//GEN-END:variables
}
