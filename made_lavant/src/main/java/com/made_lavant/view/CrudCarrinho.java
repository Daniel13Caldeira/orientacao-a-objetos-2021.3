package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudCarrinho extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        return codigo;
    }

    public CrudCarrinho() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela();
    }
    
    private void preencherTabela() {
        ArrayList<Carrinho> carrinhos = CarrinhoDados.getCarrinhos();
        //ArrayList<Funcionario> codigos = FuncionarioDados.buscarCodigo(funcionario);
        DefaultTableModel model = (DefaultTableModel) jTCarrinhos.getModel();
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
        madeLB_CRC = new javax.swing.JLabel();
        confirmarBTN_CRC = new javax.swing.JButton();
        lavantLB_CRC = new javax.swing.JLabel();
        descricaoBTN_CRC = new javax.swing.JButton();
        sairBTN_CRC = new javax.swing.JButton();
        voltarBTN_CRC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrinhos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Carrinhos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setFont(new java.awt.Font("Colonna MT", 0, 36)); // NOI18N
        madeLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRC.setText("MADE");
        madeLB_CRC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        confirmarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRC.setText("Confirmar venda");
        confirmarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCActionPerformed(evt);
            }
        });

        lavantLB_CRC.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        lavantLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRC.setText("Lavant");

        descricaoBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRC.setText("Descrição");
        descricaoBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCActionPerformed(evt);
            }
        });

        sairBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRC.setText("Sair");
        sairBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCActionPerformed(evt);
            }
        });

        voltarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRC.setText("Voltar");
        voltarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCActionPerformed(evt);
            }
        });

        jTCarrinhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLIENTE", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTCarrinhos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(sairBTN_CRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(voltarBTN_CRC))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 272, Short.MAX_VALUE)
                                .addComponent(madeLB_CRC)
                                .addGap(18, 18, 18)
                                .addComponent(lavantLB_CRC)
                                .addGap(276, 276, 276)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirmarBTN_CRC)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoBTN_CRC)
                        .addGap(2, 2, 2))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRC)
                    .addComponent(voltarBTN_CRC))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lavantLB_CRC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(madeLB_CRC)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRCActionPerformed
        this.setVisible(false);
        new DetalheCarrinho().setVisible(true);
    }//GEN-LAST:event_descricaoBTN_CRCActionPerformed

    private void sairBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCActionPerformed

    private void confirmarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCActionPerformed
        if (jTCarrinhos.getSelectedRow() != -1) {
            codigo = jTCarrinhos.getValueAt(jTCarrinhos.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new Confirmacao().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "NENHUM CLIENTE SELECIONADO!");
        }
    }//GEN-LAST:event_confirmarBTN_CRCActionPerformed

    private void voltarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCActionPerformed
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CRC;
    private javax.swing.JButton descricaoBTN_CRC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCarrinhos;
    private javax.swing.JLabel lavantLB_CRC;
    private javax.swing.JLabel madeLB_CRC;
    private javax.swing.JButton sairBTN_CRC;
    private javax.swing.JButton voltarBTN_CRC;
    // End of variables declaration//GEN-END:variables
}
