package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.base.VendaDelivery;
import com.made_lavant.base.VendaProntaEntrega;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.ArrayList;

public class Confirmacao extends javax.swing.JFrame {

    private ArrayList<Produto> listaDeProdutos = new ArrayList();

    public Confirmacao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CON = new javax.swing.JLabel();
        lavantLB_CON = new javax.swing.JLabel();
        sairBTN_CON = new javax.swing.JButton();
        topicoTotalLB_CON = new javax.swing.JLabel();
        totalLB_CON = new javax.swing.JLabel();
        topicoNomeClienteLB_CON = new javax.swing.JLabel();
        nomeClienteLB_CON = new javax.swing.JLabel();
        confirmarBTN_CON = new javax.swing.JButton();
        alterarCarrinhoBTN_CON = new javax.swing.JButton();
        cancelarBTN_CON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmacao de Venda");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CON.setText("MADE");
        madeLB_CON.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CON.setText("Lavant");

        sairBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CON.setText("Sair");
        sairBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CONActionPerformed(evt);
            }
        });

        topicoTotalLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        topicoTotalLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CON.setText("Total");

        totalLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        totalLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CON.setText("0000,00");

        topicoNomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        topicoNomeClienteLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CON.setText("Nome Do Cliente");

        nomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setFont(new java.awt.Font("Colonna MT", 1, 11)); // NOI18N
        nomeClienteLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setText("Nome");

        confirmarBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        confirmarBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CON.setText("Confirmar Venda");
        confirmarBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CONActionPerformed(evt);
            }
        });

        alterarCarrinhoBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        alterarCarrinhoBTN_CON.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        alterarCarrinhoBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        alterarCarrinhoBTN_CON.setText("Alterar Carrinho");
        alterarCarrinhoBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCarrinhoBTN_CONActionPerformed(evt);
            }
        });

        cancelarBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        cancelarBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        cancelarBTN_CON.setText("Cancelar Venda");
        cancelarBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTN_CONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sairBTN_CON)
                        .addGap(323, 323, 323)
                        .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_CON)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alterarCarrinhoBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cancelarBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmarBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairBTN_CON, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(madeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alterarCarrinhoBTN_CON)
                .addGap(18, 18, 18)
                .addComponent(cancelarBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmarBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );

        CarrinhoDados carrinho = new CarrinhoDados();
        double soma =0;
        this.listaDeProdutos = carrinho.getProdutos(CrudCarrinho.getCodigo());
        for(int i=0;i<this.listaDeProdutos.size();i++){
            soma+=this.listaDeProdutos.get(i).getPreco();
        }
        totalLB_CON.setText(soma+"");
        ClienteDados cliente = new ClienteDados();
        nomeClienteLB_CON.setText(cliente.buscarNome(CrudCarrinho.getCodigo()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CONActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CONActionPerformed

    private void confirmarBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CONActionPerformed
        boolean flag = false;
        if (CrudCarrinho.getCodigo().equals("entrega")) {
            VendaDelivery confirma = new VendaDelivery(CrudCarrinho.getCodigo());
            confirma.efetuaVenda();
            flag = true;

        } else {
            if (CrudCarrinho.getCodigo().equals("busca")) {
                VendaProntaEntrega confirma = new VendaProntaEntrega(CrudCarrinho.getCodigo());
                confirma.efetuaVenda();
                flag = true;
            }
        }
        if (flag) {
            this.setVisible(false);
            new CrudCarrinho().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CONActionPerformed

    private void alterarCarrinhoBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCarrinhoBTN_CONActionPerformed
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_alterarCarrinhoBTN_CONActionPerformed

    private void cancelarBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTN_CONActionPerformed
        boolean flag = false;
        if (CrudCarrinho.getCodigo().equals("entrega")) {
            VendaDelivery cancela = new VendaDelivery(CrudCarrinho.getCodigo());
            cancela.cancelaVenda();
            flag = true;

        } else {
            if (CrudCarrinho.getCodigo().equals("busca")) {
                VendaProntaEntrega cancela = new VendaProntaEntrega(CrudCarrinho.getCodigo());
                cancela.cancelaVenda();
                flag = true;

            }
        }
        if (flag) {
            this.setVisible(false);
            new CrudCarrinho().setVisible(true);
        }
    }//GEN-LAST:event_cancelarBTN_CONActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCarrinhoBTN_CON;
    private javax.swing.JButton cancelarBTN_CON;
    private javax.swing.JButton confirmarBTN_CON;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CON;
    private javax.swing.JLabel madeLB_CON;
    private javax.swing.JLabel nomeClienteLB_CON;
    private javax.swing.JButton sairBTN_CON;
    private javax.swing.JLabel topicoNomeClienteLB_CON;
    private javax.swing.JLabel topicoTotalLB_CON;
    private javax.swing.JLabel totalLB_CON;
    // End of variables declaration//GEN-END:variables
}
