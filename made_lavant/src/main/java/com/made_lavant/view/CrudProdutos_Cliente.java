package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ProdutoDados;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudProdutos_Cliente extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        return CrudProdutos_Cliente.codigo;
    }

    Hashtable<String, String> ht;

    public CrudProdutos_Cliente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        ht = new Hashtable<>();
        preencherTabela();
    }

    private void preencherTabela() {
        ArrayList<Produto> produtos = ProdutoDados.getProdutos();
        DefaultTableModel model = (DefaultTableModel) jTProdCliente.getModel();
        //Object[] linha;  //alguma linha
        for (int i = 0; i < produtos.size(); i++) {
            Object[] linha = {produtos.get(i).getNome(), produtos.get(i).getCodigo(), produtos.get(i).getPreco()};
            model.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCarrinhoBTN_CRPC = new javax.swing.JButton();
        addCarrinhoBTN_CRPC1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        madeLB_CRPC = new javax.swing.JLabel();
        lavantLB_CRPC = new javax.swing.JLabel();
        sairBTN_CRPC = new javax.swing.JButton();
        voltarBTN_CRPC = new javax.swing.JButton();
        descricaoBTN_CRPC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdCliente = new javax.swing.JTable();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        adicionarBTN_CDC = new javax.swing.JButton();

        addCarrinhoBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        addCarrinhoBTN_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        addCarrinhoBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        addCarrinhoBTN_CRPC.setText("Adicionar ao Carrinho");

        addCarrinhoBTN_CRPC1.setBackground(new java.awt.Color(255, 253, 130));
        addCarrinhoBTN_CRPC1.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        addCarrinhoBTN_CRPC1.setForeground(new java.awt.Color(232, 72, 85));
        addCarrinhoBTN_CRPC1.setText("Adicionar ao Carrinho");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaDeProdutosCliente");

        jPanel2.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRPC.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_CRPC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRPC.setText("MADE");
        madeLB_CRPC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRPC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRPC.setText("Lavant");

        sairBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRPC.setText("Sair");
        sairBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRPCActionPerformed(evt);
            }
        });

        voltarBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRPC.setText("Voltar");
        voltarBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRPCActionPerformed(evt);
            }
        });

        descricaoBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRPC.setText("Descrição");
        descricaoBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRPCActionPerformed(evt);
            }
        });

        jTProdCliente.setBackground(new java.awt.Color(45, 48, 71));
        jTProdCliente.setFont(new java.awt.Font("Colonna MT", 0, 14)); // NOI18N
        jTProdCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTProdCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jTextFieldQuantidade.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 72, 85));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantidade");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        adicionarBTN_CDC.setText("Adicionar ao Carrinho");
        adicionarBTN_CDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBTN_CDCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRPC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRPC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_CRPC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldQuantidade)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addComponent(adicionarBTN_CDC)
                        .addGap(56, 56, 56)
                        .addComponent(descricaoBTN_CRPC)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRPC)
                    .addComponent(voltarBTN_CRPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(madeLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adicionarBTN_CDC))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lavantLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descricaoBTN_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void sairBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRPCActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRPCActionPerformed

    private void voltarBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRPCActionPerformed
        this.setVisible(false);
        new TelaCarrinho().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRPCActionPerformed

    private void descricaoBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRPCActionPerformed

        if (jTProdCliente.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdCliente.getModel();
            codigo = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheProduto().setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }

    }//GEN-LAST:event_descricaoBTN_CRPCActionPerformed

    private void adicionarBTN_CDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBTN_CDCActionPerformed
        if (jTProdCliente.getSelectedRow() != -1) {
            codigo = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
            CarrinhoDados.adicionarProduto(Login.getCodigo(), Integer.parseInt(codigo), Double.parseDouble(jTextFieldQuantidade.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }
    }//GEN-LAST:event_adicionarBTN_CDCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarrinhoBTN_CRPC;
    private javax.swing.JButton addCarrinhoBTN_CRPC1;
    private javax.swing.JButton adicionarBTN_CDC;
    private javax.swing.JButton descricaoBTN_CRPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdCliente;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JLabel lavantLB_CRPC;
    private javax.swing.JLabel madeLB_CRPC;
    private javax.swing.JButton sairBTN_CRPC;
    private javax.swing.JButton voltarBTN_CRPC;
    // End of variables declaration//GEN-END:variables
}
