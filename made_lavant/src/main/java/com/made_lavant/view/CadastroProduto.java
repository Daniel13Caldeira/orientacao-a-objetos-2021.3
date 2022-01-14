/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.made_lavant.view;

import com.made_lavant.base.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author ewe88
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_sairCadastroCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        quantidade_CadastroProdutoFunc = new javax.swing.JTextField();
        nome_CadastroProdutoFunc = new javax.swing.JTextField();
        validade_CadastroProdutoFunc = new javax.swing.JTextField();
        preco_CadastroProdutoFunc = new javax.swing.JTextField();
        BTNConfirmar_CadastroProdutoFunc = new javax.swing.JButton();
        btn_sairCadastroProdutoFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        jLabel10.setFont(new java.awt.Font("Colonna MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 253, 130));
        jLabel10.setText("MADE");

        jLabel5.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 72, 85));
        jLabel5.setText("Quantidade");

        jLabel11.setFont(new java.awt.Font("Colonna MT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 72, 85));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Lavant");

        jLabel6.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 72, 85));
        jLabel6.setText("Validade");

        btn_sairCadastroCliente.setBackground(new java.awt.Color(255, 253, 130));
        btn_sairCadastroCliente.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        btn_sairCadastroCliente.setForeground(new java.awt.Color(232, 72, 85));
        btn_sairCadastroCliente.setText("Voltar");
        btn_sairCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairCadastroClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 72, 85));
        jLabel1.setText("Cadastro de Produto");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 72, 85));
        jLabel2.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 72, 85));
        jLabel9.setText("Preço");

        quantidade_CadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidade_CadastroProdutoFuncActionPerformed(evt);
            }
        });

        nome_CadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_CadastroProdutoFuncActionPerformed(evt);
            }
        });

        validade_CadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validade_CadastroProdutoFuncActionPerformed(evt);
            }
        });

        preco_CadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preco_CadastroProdutoFuncActionPerformed(evt);
            }
        });

        BTNConfirmar_CadastroProdutoFunc.setBackground(new java.awt.Color(255, 253, 130));
        BTNConfirmar_CadastroProdutoFunc.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        BTNConfirmar_CadastroProdutoFunc.setForeground(new java.awt.Color(232, 72, 85));
        BTNConfirmar_CadastroProdutoFunc.setText("Confirmar");
        BTNConfirmar_CadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNConfirmar_CadastroProdutoFuncActionPerformed(evt);
            }
        });

        btn_sairCadastroProdutoFunc.setBackground(new java.awt.Color(255, 253, 130));
        btn_sairCadastroProdutoFunc.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        btn_sairCadastroProdutoFunc.setForeground(new java.awt.Color(232, 72, 85));
        btn_sairCadastroProdutoFunc.setText("Sair");
        btn_sairCadastroProdutoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairCadastroProdutoFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_sairCadastroProdutoFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTNConfirmar_CadastroProdutoFunc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nome_CadastroProdutoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                .addComponent(quantidade_CadastroProdutoFunc)
                                .addComponent(preco_CadastroProdutoFunc)
                                .addComponent(validade_CadastroProdutoFunc)))))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_sairCadastroCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btn_sairCadastroProdutoFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome_CadastroProdutoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quantidade_CadastroProdutoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(preco_CadastroProdutoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(validade_CadastroProdutoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTNConfirmar_CadastroProdutoFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(btn_sairCadastroCliente)
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

    private void btn_sairCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairCadastroClienteActionPerformed
        this.setVisible(false);
        new CrudProdutos().setVisible(true);
    }//GEN-LAST:event_btn_sairCadastroClienteActionPerformed

    private void nome_CadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_CadastroProdutoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_CadastroProdutoFuncActionPerformed

    private void preco_CadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preco_CadastroProdutoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preco_CadastroProdutoFuncActionPerformed

    private void validade_CadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validade_CadastroProdutoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validade_CadastroProdutoFuncActionPerformed

    private void quantidade_CadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidade_CadastroProdutoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidade_CadastroProdutoFuncActionPerformed

    private void btn_sairCadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairCadastroProdutoFuncActionPerformed
        //retorna para a tela de login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_sairCadastroProdutoFuncActionPerformed

    private void BTNConfirmar_CadastroProdutoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNConfirmar_CadastroProdutoFuncActionPerformed
        //diz se o cadastro pode ser realizado
        boolean cadastro = true;
        //verifica se todos os campos obrigatórios foram preenchidos, se não, o cadastro não pode ser feito
        if (nome_CadastroProdutoFunc.getText().equals("") || nome_CadastroProdutoFunc.getText().equals("Campo obrigatório")) {
            nome_CadastroProdutoFunc.setText("Campo obrigatório");
            cadastro = false;
        }
        if (preco_CadastroProdutoFunc.getText().equals("") || preco_CadastroProdutoFunc.getText().equals("Campo obrigatório")) {
            preco_CadastroProdutoFunc.setText("Campo obrigatório");
            cadastro = false;
        }
        if (quantidade_CadastroProdutoFunc.getText().equals("") || quantidade_CadastroProdutoFunc.getText().equals("Campo obrigatório")) {
            quantidade_CadastroProdutoFunc.setText("Campo obrigatório");
            cadastro = false;
        }
        if (cadastro) {
            //verifica se o campo de validade foi preenchido
            if (validade_CadastroProdutoFunc.getText().equals("")) {
                //se não estiver preenchido o produto é cadastrado sem a validade
                new Produto(nome_CadastroProdutoFunc.getText(), Double.parseDouble(preco_CadastroProdutoFunc.getText()), Double.parseDouble(quantidade_CadastroProdutoFunc.getText()));
            } else {
                //define um formato para a data da validade
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date validade = null;
                try {
                    validade = formato.parse(validade_CadastroProdutoFunc.getText());
                    //verifica se a data é válida
                    if (verificaDataValida(validade)) {
                        //adiciona um produto com a validade
                        new Produto(nome_CadastroProdutoFunc.getText(), Double.parseDouble(preco_CadastroProdutoFunc.getText()), validade, Double.parseDouble(quantidade_CadastroProdutoFunc.getText()));
                    } else {
                        //se a data for inválida o cadastro não pode ser feito
                        validade_CadastroProdutoFunc.setText("Data inválida");
                        cadastro = false;
                    }
                } catch (ParseException ex) {
                }
            }
            //se o cadastro foi realizado retorna para o crud de produtos
            if (cadastro) {
                this.setVisible(false);
                new CrudProdutos().setVisible(true);
            }
        }
    }//GEN-LAST:event_BTNConfirmar_CadastroProdutoFuncActionPerformed

    public static boolean verificaDataValida(Date data) {
        //Mon Oct 12 00:00:00 BRT 2020
        //verifica se a data é anterior à atual
        if (data.before(Date.from(Instant.now()))) {
            return false;
        }
        //transforma a data em uma string
        String aux = data + "";
        //separa o dia, o mês e o ano da data
        int dia = Integer.parseInt(aux.charAt(8) + "") * 10 + Integer.parseInt(aux.charAt(9) + "");
        int ano = Integer.parseInt(aux.charAt(24) + "") * 1000 + Integer.parseInt(aux.charAt(25) + "") * 100 + Integer.parseInt(aux.charAt(26) + "") * 10 + Integer.parseInt(aux.charAt(27) + "");
        String mes = aux.substring(4, 7);
        int maxDias = 0;
        //verifica qual o máximo de dias que pode ter de acordo com o mês e o ano da validade
        if (mes.equals("JAN") || mes.equals("MAR") || mes.equals("MAY") || mes.equals("JUL") || mes.equals("AUG") || mes.equals("OCT") || mes.equals("DEC")) {
            maxDias = 31;
        } else {
            if (mes.equals("APR") || mes.equals("JUN") || mes.equals("SEP") || mes.equals("NOV")) {
                maxDias = 30;
            } else {
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
        }
        //verifica se o dia inserido é válido
        if (dia > maxDias || maxDias == 0 || dia < 1) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNConfirmar_CadastroProdutoFunc;
    private javax.swing.JButton btn_sairCadastroCliente;
    private javax.swing.JButton btn_sairCadastroProdutoFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_CadastroProdutoFunc;
    private javax.swing.JTextField preco_CadastroProdutoFunc;
    private javax.swing.JTextField quantidade_CadastroProdutoFunc;
    private javax.swing.JTextField validade_CadastroProdutoFunc;
    // End of variables declaration//GEN-END:variables
}
