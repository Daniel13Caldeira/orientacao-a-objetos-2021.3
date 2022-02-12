package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.base.VendaDelivery;
import com.made_lavant.base.VendaProntaEntrega;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.ArrayList;

public class ConfirmacaoGerente extends javax.swing.JFrame {

    private ArrayList<Produto> listaDeProdutos = new ArrayList();

    public ConfirmacaoGerente() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CONG = new javax.swing.JLabel();
        lavantLB_CONG = new javax.swing.JLabel();
        sairBTN_CONG = new javax.swing.JButton();
        topicoTotalLB_CONG = new javax.swing.JLabel();
        totalLB_CONG = new javax.swing.JLabel();
        topicoNomeClienteLB_CONG = new javax.swing.JLabel();
        nomeClienteLB_CONG = new javax.swing.JLabel();
        confirmarBTN_CONG = new javax.swing.JButton();
        alterarCarrinhoBTN_CONG = new javax.swing.JButton();
        cancelarBTN_CONG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmação de Venda");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CONG.setFont(madeLB_CONG.getFont().deriveFont(madeLB_CONG.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CONG.getFont().getSize()+13));
        madeLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CONG.setText("MADE");
        madeLB_CONG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CONG.setFont(lavantLB_CONG.getFont().deriveFont(lavantLB_CONG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CONG.getFont().getSize()+13));
        lavantLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CONG.setText("Lavant");

        sairBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CONG.setFont(sairBTN_CONG.getFont().deriveFont(sairBTN_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CONG.getFont().getSize()+7));
        sairBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CONG.setText("Sair");
        sairBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CONGActionPerformed(evt);
            }
        });

        topicoTotalLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_CONG.setFont(topicoTotalLB_CONG.getFont().deriveFont(topicoTotalLB_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoTotalLB_CONG.getFont().getSize()+7));
        topicoTotalLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_CONG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_CONG.setText("Total");

        totalLB_CONG.setFont(totalLB_CONG.getFont().deriveFont(totalLB_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, totalLB_CONG.getFont().getSize()+7));
        totalLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_CONG.setText("0000,00");

        topicoNomeClienteLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        topicoNomeClienteLB_CONG.setFont(topicoNomeClienteLB_CONG.getFont().deriveFont(topicoNomeClienteLB_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeClienteLB_CONG.getFont().getSize()+3));
        topicoNomeClienteLB_CONG.setForeground(new java.awt.Color(232, 72, 85));
        topicoNomeClienteLB_CONG.setText("Nome Do Cliente");

        nomeClienteLB_CONG.setBackground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CONG.setFont(nomeClienteLB_CONG.getFont().deriveFont(nomeClienteLB_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, nomeClienteLB_CONG.getFont().getSize()+3));
        nomeClienteLB_CONG.setForeground(new java.awt.Color(255, 253, 130));
        nomeClienteLB_CONG.setText("Nome");

        confirmarBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CONG.setFont(confirmarBTN_CONG.getFont().deriveFont(confirmarBTN_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CONG.getFont().getSize()+7));
        confirmarBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CONG.setText("Confirmar Carrinho");
        confirmarBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CONGActionPerformed(evt);
            }
        });

        alterarCarrinhoBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        alterarCarrinhoBTN_CONG.setFont(alterarCarrinhoBTN_CONG.getFont().deriveFont(alterarCarrinhoBTN_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, alterarCarrinhoBTN_CONG.getFont().getSize()+7));
        alterarCarrinhoBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        alterarCarrinhoBTN_CONG.setText("Alterar Carrinho");
        alterarCarrinhoBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCarrinhoBTN_CONGActionPerformed(evt);
            }
        });

        cancelarBTN_CONG.setBackground(new java.awt.Color(255, 253, 130));
        cancelarBTN_CONG.setFont(cancelarBTN_CONG.getFont().deriveFont(cancelarBTN_CONG.getFont().getStyle() & ~java.awt.Font.BOLD, cancelarBTN_CONG.getFont().getSize()+7));
        cancelarBTN_CONG.setForeground(new java.awt.Color(232, 72, 85));
        cancelarBTN_CONG.setText("Cancelar Venda");
        cancelarBTN_CONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBTN_CONGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_CONG)
                .addGap(289, 289, 289)
                .addComponent(topicoTotalLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(madeLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alterarCarrinhoBTN_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmarBTN_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelarBTN_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topicoNomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(nomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_CONG)
                    .addComponent(totalLB_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(madeLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeClienteLB_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(alterarCarrinhoBTN_CONG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarBTN_CONG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarBTN_CONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );

        //Calcula o total do preço dos produtos no carrinho e adiciona esse valor ao label
        double soma =0;
        this.listaDeProdutos = CarrinhoDados.getProdutos(CrudCarrinhoGerente.getCodigo());
        for(int i=0;i<this.listaDeProdutos.size();i++){
            soma+=this.listaDeProdutos.get(i).getPreco()*this.listaDeProdutos.get(i).getQuantidade();
        }
        totalLB_CONG.setText(soma+"");
        //Adiciona o nome do cliente a qual o carrinho pertence
        nomeClienteLB_CONG.setText(ClienteDados.buscarNome(CrudCarrinhoGerente.getCodigo()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CONGActionPerformed
        //Retorna para tela do Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CONGActionPerformed

    private void confirmarBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CONGActionPerformed
        //Verifica o tipo de venda e confirma de acordo com a venda
        if (CarrinhoDados.getTipoVenda(CrudCarrinhoGerente.getCodigo()).equals("entrega")) {
            VendaDelivery confirma = new VendaDelivery(CrudCarrinhoGerente.getCodigo());
            confirma.efetuaVenda();
            this.setVisible(false);
            new CrudCarrinhoGerente().setVisible(true);
        } else {
            VendaProntaEntrega confirma = new VendaProntaEntrega(CrudCarrinhoGerente.getCodigo());
            confirma.efetuaVenda();
            this.setVisible(false);
            new CrudCarrinhoGerente().setVisible(true);
        }
    }//GEN-LAST:event_confirmarBTN_CONGActionPerformed

    private void alterarCarrinhoBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCarrinhoBTN_CONGActionPerformed
        //Volta para o CRUD de carrinhos
        this.setVisible(false);
        new CrudCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_alterarCarrinhoBTN_CONGActionPerformed

    private void cancelarBTN_CONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBTN_CONGActionPerformed
        //Verifica o tipo da venda e cancela de acordo
        if (CarrinhoDados.getTipoVenda(CrudCarrinhoGerente.getCodigo()).equals("entrega")) {
            VendaDelivery cancela = new VendaDelivery(CrudCarrinhoGerente.getCodigo());
            cancela.cancelaVenda();
            this.setVisible(false);
            new CrudCarrinhoGerente().setVisible(true);
        } else {
            VendaProntaEntrega cancela = new VendaProntaEntrega(CrudCarrinhoGerente.getCodigo());
            cancela.cancelaVenda();
            this.setVisible(false);
            new CrudCarrinhoGerente().setVisible(true);
        }
    }//GEN-LAST:event_cancelarBTN_CONGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCarrinhoBTN_CONG;
    private javax.swing.JButton cancelarBTN_CONG;
    private javax.swing.JButton confirmarBTN_CONG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_CONG;
    private javax.swing.JLabel madeLB_CONG;
    private javax.swing.JLabel nomeClienteLB_CONG;
    private javax.swing.JButton sairBTN_CONG;
    private javax.swing.JLabel topicoNomeClienteLB_CONG;
    private javax.swing.JLabel topicoTotalLB_CONG;
    private javax.swing.JLabel totalLB_CONG;
    // End of variables declaration//GEN-END:variables
}
