package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.ProdutoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudProdutos extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        return CrudProdutos.codigo;
    }

    public CrudProdutos() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        preencherTabela();
    }

    private void preencherTabela() {
        ArrayList<Produto> produtos = ProdutoDados.getProdutos();
        DefaultTableModel model = (DefaultTableModel) jTProdutos.getModel();
        //Object[] linha;  //alguma linha
        for (int i = 0; i < produtos.size(); i++) {
            Object[] linha = {produtos.get(i).getNome(), produtos.get(i).getCodigo(), produtos.get(i).getPreco()};
            model.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CRP = new javax.swing.JLabel();
        lavantLB_CRP = new javax.swing.JLabel();
        sairBTN_CRP = new javax.swing.JButton();
        voltarBTN_CRP = new javax.swing.JButton();
        addProdBTN_CRP = new javax.swing.JButton();
        removerBTN_CRP = new javax.swing.JButton();
        editarBTN_CRP = new javax.swing.JButton();
        descricaoBTN_CRP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TeladeProdutosFuncionario");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRP.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRP.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        madeLB_CRP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRP.setText("MADE");
        madeLB_CRP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CRP.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        lavantLB_CRP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRP.setText("Lavant");

        sairBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        sairBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRP.setText("Sair");
        sairBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRPActionPerformed(evt);
            }
        });

        voltarBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        voltarBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRP.setText("Voltar");
        voltarBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRPActionPerformed(evt);
            }
        });

        addProdBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        addProdBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 14)); // NOI18N
        addProdBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        addProdBTN_CRP.setText("Adicionar Produto");
        addProdBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTN_CRPActionPerformed(evt);
            }
        });

        removerBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        removerBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_CRP.setText("Remover");
        removerBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_CRPActionPerformed(evt);
            }
        });

        editarBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        editarBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_CRP.setText("Editar");
        editarBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_CRPActionPerformed(evt);
            }
        });

        descricaoBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRP.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        descricaoBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRP.setText("Descrição");
        descricaoBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRPActionPerformed(evt);
            }
        });

        jTProdutos.setBackground(new java.awt.Color(45, 48, 71));
        jTProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(addProdBTN_CRP)
                        .addGap(198, 198, 198)
                        .addComponent(voltarBTN_CRP)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lavantLB_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(madeLB_CRP))
                                .addGap(330, 330, 330))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(removerBTN_CRP)
                                .addGap(18, 18, 18)
                                .addComponent(editarBTN_CRP)
                                .addGap(18, 18, 18)
                                .addComponent(descricaoBTN_CRP)
                                .addContainerGap())))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRP)
                    .addComponent(voltarBTN_CRP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProdBTN_CRP))
                .addGap(29, 29, 29)
                .addComponent(madeLB_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerBTN_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBTN_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoBTN_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void sairBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRPActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRPActionPerformed

    private void voltarBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRPActionPerformed
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRPActionPerformed

    private void addProdBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTN_CRPActionPerformed
        this.setVisible(false);
        new CadastroProduto().setVisible(true);
    }//GEN-LAST:event_addProdBTN_CRPActionPerformed

    private void descricaoBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRPActionPerformed

        if (jTProdutos.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
            codigo = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheProduto_Func().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }

    }//GEN-LAST:event_descricaoBTN_CRPActionPerformed

    private void editarBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_CRPActionPerformed

        if (jTProdutos.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
            codigo = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();

            this.setVisible(false);
            new EditarProduto().setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }

    }//GEN-LAST:event_editarBTN_CRPActionPerformed

    private void removerBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_CRPActionPerformed
        if (jTProdutos.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
            String cod = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();
            dtmProdutos.removeRow(jTProdutos.getSelectedRow());
            ProdutoDados.remover(Integer.parseInt(cod));
        } else {

            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }

    }//GEN-LAST:event_removerBTN_CRPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProdBTN_CRP;
    private javax.swing.JButton descricaoBTN_CRP;
    private javax.swing.JButton editarBTN_CRP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JLabel lavantLB_CRP;
    private javax.swing.JLabel madeLB_CRP;
    private javax.swing.JButton removerBTN_CRP;
    private javax.swing.JButton sairBTN_CRP;
    private javax.swing.JButton voltarBTN_CRP;
    // End of variables declaration//GEN-END:variables
}
