package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudCarrinhoGerente extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        //Retorna o codigo do carrinho
        return codigo;
    }

    public CrudCarrinhoGerente() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os carrinhos
        ArrayList<Carrinho> carrinhos = CarrinhoDados.getCarrinhos();
        DefaultTableModel model = (DefaultTableModel) jTCrudCarrinhoG.getModel();
        //Preenche a tabela com os carrinhos que estão prontos pra finalizar a venda
        for (int i = 0; i < carrinhos.size(); i++) {
            Object[] linha = {carrinhos.get(i).getCliente().getNome(), carrinhos.get(i).getCliente().getCpf()};
            if (CarrinhoDados.getPronto(carrinhos.get(i).getCliente().getCpf())) {
                model.addRow(linha);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        descricaoBTN_CRCG = new javax.swing.JButton();
        sairBTN_CRCG = new javax.swing.JButton();
        voltarBTN_CRCG = new javax.swing.JButton();
        madeLB_CRCG = new javax.swing.JLabel();
        confirmarBTN_CRCG = new javax.swing.JButton();
        lavantLB_CRCG = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCrudCarrinhoG = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Carrinhos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        descricaoBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRCG.setFont(descricaoBTN_CRCG.getFont().deriveFont(descricaoBTN_CRCG.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRCG.getFont().getSize()+7));
        descricaoBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRCG.setText("Descrição");
        descricaoBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCGActionPerformed(evt);
            }
        });

        sairBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRCG.setFont(sairBTN_CRCG.getFont().deriveFont(sairBTN_CRCG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRCG.getFont().getSize()+7));
        sairBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRCG.setText("Sair");
        sairBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCGActionPerformed(evt);
            }
        });

        voltarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRCG.setFont(voltarBTN_CRCG.getFont().deriveFont(voltarBTN_CRCG.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRCG.getFont().getSize()+7));
        voltarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRCG.setText("Voltar");
        voltarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCGActionPerformed(evt);
            }
        });

        madeLB_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setFont(madeLB_CRCG.getFont().deriveFont(madeLB_CRCG.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRCG.getFont().getSize()+25));
        madeLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRCG.setText("MADE");
        madeLB_CRCG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRCG.setFont(confirmarBTN_CRCG.getFont().deriveFont(confirmarBTN_CRCG.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CRCG.getFont().getSize()+7));
        confirmarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRCG.setText("Confirmar venda");
        confirmarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCGActionPerformed(evt);
            }
        });

        lavantLB_CRCG.setFont(lavantLB_CRCG.getFont().deriveFont(lavantLB_CRCG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRCG.getFont().getSize()+25));
        lavantLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRCG.setText("Lavant");

        jTCrudCarrinhoG.setFont(jTCrudCarrinhoG.getFont().deriveFont(jTCrudCarrinhoG.getFont().getStyle() & ~java.awt.Font.BOLD, jTCrudCarrinhoG.getFont().getSize()+4));
        jTCrudCarrinhoG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME DO CLIENTE", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTCrudCarrinhoG);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRCG)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarBTN_CRCG)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoBTN_CRCG)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lavantLB_CRCG, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(madeLB_CRCG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(286, 286, 286))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRCG)
                    .addComponent(voltarBTN_CRCG))
                .addGap(18, 18, 18)
                .addComponent(madeLB_CRCG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRCG)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoBTN_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarBTN_CRCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void descricaoBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRCGActionPerformed

        //Encaminha para a tela detalhe carrinho e guarda o codigo do carrinho
        if (jTCrudCarrinhoG.getSelectedRow() != -1) {
            codigo = jTCrudCarrinhoG.getValueAt(jTCrudCarrinhoG.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheCarrinhoGerente().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum carrinho selecionado!");
        }
    }//GEN-LAST:event_descricaoBTN_CRCGActionPerformed

    private void sairBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCGActionPerformed
        //Retorna para tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCGActionPerformed

    private void voltarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCGActionPerformed
        //Volta para a tela de Inicio
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCGActionPerformed

    private void confirmarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCGActionPerformed
        //Encaminha para a tela de confirmação de venda e guarda o codigo do carrinho
        if (jTCrudCarrinhoG.getSelectedRow() != -1) {
            codigo = jTCrudCarrinhoG.getValueAt(jTCrudCarrinhoG.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new ConfirmacaoGerente().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NENHUM CLIENTE SELECIONADO!");
        }
    }//GEN-LAST:event_confirmarBTN_CRCGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CRCG;
    private javax.swing.JButton descricaoBTN_CRCG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCrudCarrinhoG;
    private javax.swing.JLabel lavantLB_CRCG;
    private javax.swing.JLabel madeLB_CRCG;
    private javax.swing.JButton sairBTN_CRCG;
    private javax.swing.JButton voltarBTN_CRCG;
    // End of variables declaration//GEN-END:variables
}
