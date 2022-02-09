package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudCarrinhoGerente extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        return codigo;
    }

    public CrudCarrinhoGerente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela();
    }
    
    private void preencherTabela() {
        ArrayList<Carrinho> carrinhos = CarrinhoDados.getCarrinhos();
        //ArrayList<Funcionario> codigos = FuncionarioDados.buscarCodigo(funcionario);
        DefaultTableModel model = (DefaultTableModel) jTCrudCarrrinhoG.getModel();
        //Object[] linha;  //alguma linha
        for (int i = 0; i < carrinhos.size(); i++) {
            Object[] linha = {carrinhos.get(i).getCliente().getNome(), carrinhos.get(i).getCliente().getCpf()};
            if (CarrinhoDados.getPronto(codigo)) {
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
        jTCrudCarrrinhoG = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        descricaoBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRCG.setText("Descrição");
        descricaoBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCGActionPerformed(evt);
            }
        });

        sairBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRCG.setText("Sair");
        sairBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCGActionPerformed(evt);
            }
        });

        voltarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRCG.setText("Voltar");
        voltarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCGActionPerformed(evt);
            }
        });

        madeLB_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setFont(new java.awt.Font("Colonna MT", 0, 36)); // NOI18N
        madeLB_CRCG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRCG.setText("MADE");
        madeLB_CRCG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRCG.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        confirmarBTN_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRCG.setText("Confirmar venda");
        confirmarBTN_CRCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCGActionPerformed(evt);
            }
        });

        lavantLB_CRCG.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        lavantLB_CRCG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRCG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRCG.setText("Lavant");

        jTCrudCarrrinhoG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME DO CLIENTE", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTCrudCarrrinhoG);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 512, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRCG)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(madeLB_CRCG)
                                .addGap(18, 18, 18)
                                .addComponent(lavantLB_CRCG)
                                .addGap(286, 286, 286))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmarBTN_CRCG)
                                .addGap(18, 18, 18)
                                .addComponent(descricaoBTN_CRCG)
                                .addContainerGap())))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRCG)
                    .addComponent(voltarBTN_CRCG))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lavantLB_CRCG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(madeLB_CRCG)))
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
        this.setVisible(false);
        new DetalheCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_descricaoBTN_CRCGActionPerformed

    private void sairBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCGActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCGActionPerformed

    private void voltarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCGActionPerformed
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCGActionPerformed

    private void confirmarBTN_CRCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCGActionPerformed
        if (jTCrudCarrrinhoG.getSelectedRow() != -1) {
            codigo = jTCrudCarrrinhoG.getValueAt(jTCrudCarrrinhoG.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new Confirmacao().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "NENHUM CLIENTE SELECIONADO!");
        }
    }//GEN-LAST:event_confirmarBTN_CRCGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CRCG;
    private javax.swing.JButton descricaoBTN_CRCG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCrudCarrrinhoG;
    private javax.swing.JLabel lavantLB_CRCG;
    private javax.swing.JLabel madeLB_CRCG;
    private javax.swing.JButton sairBTN_CRCG;
    private javax.swing.JButton voltarBTN_CRCG;
    // End of variables declaration//GEN-END:variables
}
