package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ProdutoDados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudProdutos_Cliente extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        //Retorna o codigo do produto
        return CrudProdutos_Cliente.codigo;
    }

    public CrudProdutos_Cliente() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = ProdutoDados.getProdutos();
        DefaultTableModel model = (DefaultTableModel) jTProdCliente.getModel();
        //Preenche a tabela com os produtos
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
        quantidadeTF_CRPC = new javax.swing.JTextField();
        topicoQuantidadeLB_CRPC = new javax.swing.JLabel();
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
        madeLB_CRPC.setFont(madeLB_CRPC.getFont().deriveFont(madeLB_CRPC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRPC.getFont().getSize()+13));
        madeLB_CRPC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRPC.setText("MADE");
        madeLB_CRPC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CRPC.setFont(lavantLB_CRPC.getFont().deriveFont(lavantLB_CRPC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRPC.getFont().getSize()+13));
        lavantLB_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRPC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRPC.setText("Lavant");

        sairBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRPC.setFont(sairBTN_CRPC.getFont().deriveFont(sairBTN_CRPC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRPC.getFont().getSize()+7));
        sairBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRPC.setText("Sair");
        sairBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRPCActionPerformed(evt);
            }
        });

        voltarBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRPC.setFont(voltarBTN_CRPC.getFont().deriveFont(voltarBTN_CRPC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRPC.getFont().getSize()+7));
        voltarBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRPC.setText("Voltar");
        voltarBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRPCActionPerformed(evt);
            }
        });

        descricaoBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRPC.setFont(descricaoBTN_CRPC.getFont().deriveFont(descricaoBTN_CRPC.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRPC.getFont().getSize()+7));
        descricaoBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRPC.setText("Descrição");
        descricaoBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRPCActionPerformed(evt);
            }
        });

        jTProdCliente.setBackground(new java.awt.Color(45, 48, 71));
        jTProdCliente.setFont(jTProdCliente.getFont().deriveFont(jTProdCliente.getFont().getStyle() & ~java.awt.Font.BOLD, jTProdCliente.getFont().getSize()+4));
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

        quantidadeTF_CRPC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantidadeTF_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTF_CRPCActionPerformed(evt);
            }
        });

        topicoQuantidadeLB_CRPC.setFont(topicoQuantidadeLB_CRPC.getFont().deriveFont(topicoQuantidadeLB_CRPC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoQuantidadeLB_CRPC.getFont().getSize()+7));
        topicoQuantidadeLB_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        topicoQuantidadeLB_CRPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoQuantidadeLB_CRPC.setText("Quantidade");
        topicoQuantidadeLB_CRPC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        adicionarBTN_CDC.setBackground(new java.awt.Color(255, 253, 130));
        adicionarBTN_CDC.setFont(adicionarBTN_CDC.getFont().deriveFont(adicionarBTN_CDC.getFont().getStyle() & ~java.awt.Font.BOLD, adicionarBTN_CDC.getFont().getSize()+7));
        adicionarBTN_CDC.setForeground(new java.awt.Color(232, 72, 85));
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavantLB_CRPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(madeLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRPC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(topicoQuantidadeLB_CRPC)
                        .addGap(18, 18, 18)
                        .addComponent(quantidadeTF_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sairBTN_CRPC)
                            .addComponent(voltarBTN_CRPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(73, 73, 73))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(madeLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adicionarBTN_CDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(topicoQuantidadeLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantidadeTF_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descricaoBTN_CRPC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRPCActionPerformed

    private void voltarBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRPCActionPerformed
        //Volta para a tela do carrinho
       this.setVisible(false);
        new TelaCarrinho().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRPCActionPerformed

    private void descricaoBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRPCActionPerformed
        //Encaminha para a tela de perfil do produto e guarda o codigo do produto
        if (jTProdCliente.getSelectedRow() != -1) {
            codigo = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheProduto().setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_descricaoBTN_CRPCActionPerformed

    private void adicionarBTN_CDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBTN_CDCActionPerformed
        //Adiciona o produto ao carrinho 
        if (jTProdCliente.getSelectedRow() != -1) {
            codigo = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
            if (Double.parseDouble(quantidadeTF_CRPC.getText()) == 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma quantidade selecionada!");
            } else {
                CarrinhoDados.adicionarProduto(Login.getCodigo(), Integer.parseInt(codigo), Double.parseDouble(quantidadeTF_CRPC.getText()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }
    }//GEN-LAST:event_adicionarBTN_CDCActionPerformed

    private void quantidadeTF_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTF_CRPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeTF_CRPCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarrinhoBTN_CRPC;
    private javax.swing.JButton addCarrinhoBTN_CRPC1;
    private javax.swing.JButton adicionarBTN_CDC;
    private javax.swing.JButton descricaoBTN_CRPC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdCliente;
    private javax.swing.JLabel lavantLB_CRPC;
    private javax.swing.JLabel madeLB_CRPC;
    private javax.swing.JTextField quantidadeTF_CRPC;
    private javax.swing.JButton sairBTN_CRPC;
    private javax.swing.JLabel topicoQuantidadeLB_CRPC;
    private javax.swing.JButton voltarBTN_CRPC;
    // End of variables declaration//GEN-END:variables
}
