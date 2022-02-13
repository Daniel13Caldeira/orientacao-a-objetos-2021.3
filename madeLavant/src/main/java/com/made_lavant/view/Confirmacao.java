package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.base.VendaDelivery;
import com.made_lavant.base.VendaProntaEntrega;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.ArrayList;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class Confirmacao extends javax.swing.JFrame {

    private ArrayList<Produto> listaDeProdutos;

    public Confirmacao() {
        initComponents();
        //Colocando o jframe em tela cheia
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
        setTitle("Confirmação de Venda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setFont(madeLB_CON.getFont().deriveFont(madeLB_CON.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CON.getFont().getSize()+13));
        madeLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CON.setText("MADE");
        madeLB_CON.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CON.setFont(lavantLB_CON.getFont().deriveFont(lavantLB_CON.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CON.getFont().getSize()+13));
        lavantLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CON.setText("Lavant");

        sairBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CON.setFont(sairBTN_CON.getFont().deriveFont(sairBTN_CON.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CON.getFont().getSize()+7));
        sairBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CON.setText("Sair");
        sairBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CONActionPerformed(evt);
            }
        });

        topicoTotalLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_CON.setFont(topicoTotalLB_CON.getFont().deriveFont(topicoTotalLB_CON.getFont().getStyle() & ~java.awt.Font.BOLD, topicoTotalLB_CON.getFont().getSize()+7));
        topicoTotalLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CON.setText("Total");

        totalLB_CON.setFont(totalLB_CON.getFont().deriveFont(totalLB_CON.getFont().getStyle() & ~java.awt.Font.BOLD, totalLB_CON.getFont().getSize()+7));
        totalLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CON.setText("0000,00");

        topicoNomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CON.setFont(topicoNomeClienteLB_CON.getFont().deriveFont(topicoNomeClienteLB_CON.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeClienteLB_CON.getFont().getSize()+3));
        topicoNomeClienteLB_CON.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CON.setText("Nome Do Cliente");

        nomeClienteLB_CON.setBackground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setFont(nomeClienteLB_CON.getFont().deriveFont(nomeClienteLB_CON.getFont().getStyle() & ~java.awt.Font.BOLD, nomeClienteLB_CON.getFont().getSize()+3));
        nomeClienteLB_CON.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CON.setText("Nome");

        confirmarBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CON.setFont(confirmarBTN_CON.getFont().deriveFont(confirmarBTN_CON.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CON.getFont().getSize()+7));
        confirmarBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CON.setText("Confirmar Carrinho");
        confirmarBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CONActionPerformed(evt);
            }
        });

        alterarCarrinhoBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        alterarCarrinhoBTN_CON.setFont(alterarCarrinhoBTN_CON.getFont().deriveFont(alterarCarrinhoBTN_CON.getFont().getStyle() & ~java.awt.Font.BOLD, alterarCarrinhoBTN_CON.getFont().getSize()+7));
        alterarCarrinhoBTN_CON.setForeground(new java.awt.Color(232, 72, 85));
        alterarCarrinhoBTN_CON.setText("Alterar Carrinho");
        alterarCarrinhoBTN_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCarrinhoBTN_CONActionPerformed(evt);
            }
        });

        cancelarBTN_CON.setBackground(new java.awt.Color(255, 253, 130));
        cancelarBTN_CON.setFont(cancelarBTN_CON.getFont().deriveFont(cancelarBTN_CON.getFont().getStyle() & ~java.awt.Font.BOLD, cancelarBTN_CON.getFont().getSize()+7));
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
                .addContainerGap()
                .addComponent(sairBTN_CON)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(confirmarBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelarBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alterarCarrinhoBTN_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lavantLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(madeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_CON)
                    .addComponent(totalLB_CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addComponent(madeLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteLB_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(alterarCarrinhoBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarBTN_CON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        //Calcula o preço total do carrinho e adiciona o valor no label
        double soma =0;
        this.listaDeProdutos = CarrinhoDados.getProdutos(CrudCarrinho.getCodigo());
        for(int i=0;i<this.listaDeProdutos.size();i++){
            soma+=this.listaDeProdutos.get(i).getPreco()*this.listaDeProdutos.get(i).getQuantidade();
        }
        totalLB_CON.setText(Math.round(soma*1000.0)/1000.0 + "");
        //Adiciona o nome do cliente a qual o carrinho pertence
        nomeClienteLB_CON.setText(ClienteDados.buscarNome(CrudCarrinho.getCodigo()));

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

    private void sairBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CONActionPerformed
        //Retorna para a Tela do Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CONActionPerformed

    private void confirmarBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CONActionPerformed
        //Verifica o Tipo da Venda e confirma de acordo com o tipo
        if (CarrinhoDados.getTipoVenda(CrudCarrinho.getCodigo()).equals("entrega")) {
            VendaDelivery confirma = new VendaDelivery(CrudCarrinho.getCodigo());
            confirma.efetuaVenda();
            this.setVisible(false);
            new CrudCarrinho().setVisible(true);
        } else {
            VendaProntaEntrega confirma = new VendaProntaEntrega(CrudCarrinho.getCodigo());
            confirma.efetuaVenda();
            this.setVisible(false);
            new CrudCarrinho().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CONActionPerformed

    private void alterarCarrinhoBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCarrinhoBTN_CONActionPerformed
        //Retorna para o Crud de Carrinho
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_alterarCarrinhoBTN_CONActionPerformed

    private void cancelarBTN_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTN_CONActionPerformed
        //Verifica o tipo da venda e cancela de acordo
        if (CarrinhoDados.getTipoVenda(CrudCarrinho.getCodigo()).equals("entrega")) {
            VendaDelivery cancela = new VendaDelivery(CrudCarrinho.getCodigo());
            cancela.cancelaVenda();
            this.setVisible(false);
            new CrudCarrinho().setVisible(true);
        } else {
            VendaProntaEntrega cancela = new VendaProntaEntrega(CrudCarrinho.getCodigo());
            cancela.cancelaVenda();
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
