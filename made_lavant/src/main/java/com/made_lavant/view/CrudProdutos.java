package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.ProdutoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudProdutos extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        //Retorna o codigo do produto
        return CrudProdutos.codigo;
    }

    public CrudProdutos() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = ProdutoDados.getProdutos();
        DefaultTableModel model = (DefaultTableModel) jTProdutos.getModel();
        //Preenche a tabela com os produtos
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
        setTitle("Lista de Produtos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRP.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRP.setFont(madeLB_CRP.getFont().deriveFont(madeLB_CRP.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRP.getFont().getSize()+13));
        madeLB_CRP.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRP.setText("MADE");
        madeLB_CRP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CRP.setFont(lavantLB_CRP.getFont().deriveFont(lavantLB_CRP.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRP.getFont().getSize()+13));
        lavantLB_CRP.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRP.setText("Lavant");

        sairBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRP.setFont(sairBTN_CRP.getFont().deriveFont(sairBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRP.getFont().getSize()+7));
        sairBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRP.setText("Sair");
        sairBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRPActionPerformed(evt);
            }
        });

        voltarBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRP.setFont(voltarBTN_CRP.getFont().deriveFont(voltarBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRP.getFont().getSize()+7));
        voltarBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRP.setText("Voltar");
        voltarBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRPActionPerformed(evt);
            }
        });

        addProdBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        addProdBTN_CRP.setFont(addProdBTN_CRP.getFont().deriveFont(addProdBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, addProdBTN_CRP.getFont().getSize()+7));
        addProdBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        addProdBTN_CRP.setText("Adicionar Produto");
        addProdBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTN_CRPActionPerformed(evt);
            }
        });

        removerBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_CRP.setFont(removerBTN_CRP.getFont().deriveFont(removerBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, removerBTN_CRP.getFont().getSize()+7));
        removerBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_CRP.setText("Remover");
        removerBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_CRPActionPerformed(evt);
            }
        });

        editarBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_CRP.setFont(editarBTN_CRP.getFont().deriveFont(editarBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, editarBTN_CRP.getFont().getSize()+7));
        editarBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_CRP.setText("Editar");
        editarBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_CRPActionPerformed(evt);
            }
        });

        descricaoBTN_CRP.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRP.setFont(descricaoBTN_CRP.getFont().deriveFont(descricaoBTN_CRP.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRP.getFont().getSize()+7));
        descricaoBTN_CRP.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRP.setText("Descrição");
        descricaoBTN_CRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRPActionPerformed(evt);
            }
        });

        jTProdutos.setBackground(new java.awt.Color(45, 48, 71));
        jTProdutos.setFont(jTProdutos.getFont().deriveFont(jTProdutos.getFont().getSize()+4f));
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(addProdBTN_CRP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRP))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removerBTN_CRP)
                        .addGap(18, 18, 18)
                        .addComponent(editarBTN_CRP)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoBTN_CRP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(madeLB_CRP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lavantLB_CRP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRP)
                    .addComponent(voltarBTN_CRP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProdBTN_CRP))
                .addGap(27, 27, 27)
                .addComponent(madeLB_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
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
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRPActionPerformed

    private void voltarBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRPActionPerformed
        //Volta para a tela de Inicio
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRPActionPerformed

    private void addProdBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTN_CRPActionPerformed
        //Encaminha para a tela de cadastro de produtos
        this.setVisible(false);
        new CadastroProduto().setVisible(true);
    }//GEN-LAST:event_addProdBTN_CRPActionPerformed

    private void descricaoBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRPActionPerformed
        //Encaminha para a tela de perfil do produto e guarda o codigo do produto
        if (jTProdutos.getSelectedRow() != -1) {
            codigo = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheProduto_Func().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_descricaoBTN_CRPActionPerformed

    private void editarBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_CRPActionPerformed
        //Encaminha para a tela de editar produto e guarda o codigo do produto
        if (jTProdutos.getSelectedRow() != -1) {
            codigo = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new EditarProduto().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_editarBTN_CRPActionPerformed

    private void removerBTN_CRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_CRPActionPerformed
        //Remove o produto selecionado da tabela e do arquivo de produtos 
        if (jTProdutos.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
            String cod = jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString();
            dtmProdutos.removeRow(jTProdutos.getSelectedRow());
            ProdutoDados.remover(Integer.parseInt(cod));
        } else {

            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
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
