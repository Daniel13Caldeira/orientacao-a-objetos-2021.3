package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.ProdutoDados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudProdutosGerente extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        //Retorna o codigo do produto
        return CrudProdutosGerente.codigo;
    }

    public CrudProdutosGerente() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = ProdutoDados.getProdutos();
        DefaultTableModel model = (DefaultTableModel) jTProdutosGerente.getModel();
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
        madeLB_CRPG = new javax.swing.JLabel();
        lavantLB_CRPG = new javax.swing.JLabel();
        sairBTN_CRPG = new javax.swing.JButton();
        voltarBTN_CRPG = new javax.swing.JButton();
        addProdBTN_CRPG = new javax.swing.JButton();
        removerBTN_CRPG = new javax.swing.JButton();
        editarBTN_CRPG = new javax.swing.JButton();
        descricaoBTN_CRPG = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutosGerente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Produtos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRPG.setFont(madeLB_CRPG.getFont().deriveFont(madeLB_CRPG.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRPG.getFont().getSize()+13));
        madeLB_CRPG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRPG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRPG.setText("MADE");
        madeLB_CRPG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_CRPG.setFont(lavantLB_CRPG.getFont().deriveFont(lavantLB_CRPG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRPG.getFont().getSize()+13));
        lavantLB_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRPG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRPG.setText("Lavant");

        sairBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRPG.setFont(sairBTN_CRPG.getFont().deriveFont(sairBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRPG.getFont().getSize()+7));
        sairBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRPG.setText("Sair");
        sairBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRPGActionPerformed(evt);
            }
        });

        voltarBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRPG.setFont(voltarBTN_CRPG.getFont().deriveFont(voltarBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRPG.getFont().getSize()+7));
        voltarBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRPG.setText("Voltar");
        voltarBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRPGActionPerformed(evt);
            }
        });

        addProdBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        addProdBTN_CRPG.setFont(addProdBTN_CRPG.getFont().deriveFont(addProdBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, addProdBTN_CRPG.getFont().getSize()+7));
        addProdBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        addProdBTN_CRPG.setText("Adicionar Produto");
        addProdBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTN_CRPGActionPerformed(evt);
            }
        });

        removerBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_CRPG.setFont(removerBTN_CRPG.getFont().deriveFont(removerBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, removerBTN_CRPG.getFont().getSize()+7));
        removerBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_CRPG.setText("Remover");
        removerBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_CRPGActionPerformed(evt);
            }
        });

        editarBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_CRPG.setFont(editarBTN_CRPG.getFont().deriveFont(editarBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, editarBTN_CRPG.getFont().getSize()+7));
        editarBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_CRPG.setText("Editar");
        editarBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_CRPGActionPerformed(evt);
            }
        });

        descricaoBTN_CRPG.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRPG.setFont(descricaoBTN_CRPG.getFont().deriveFont(descricaoBTN_CRPG.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRPG.getFont().getSize()+7));
        descricaoBTN_CRPG.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRPG.setText("Descrição");
        descricaoBTN_CRPG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRPGActionPerformed(evt);
            }
        });

        jTProdutosGerente.setBackground(new java.awt.Color(45, 48, 71));
        jTProdutosGerente.setFont(jTProdutosGerente.getFont().deriveFont(jTProdutosGerente.getFont().getSize()+4f));
        jTProdutosGerente.setForeground(new java.awt.Color(255, 255, 255));
        jTProdutosGerente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTProdutosGerente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
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
                        .addComponent(sairBTN_CRPG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProdBTN_CRPG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRPG))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removerBTN_CRPG)
                        .addGap(18, 18, 18)
                        .addComponent(editarBTN_CRPG)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoBTN_CRPG))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lavantLB_CRPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(madeLB_CRPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sairBTN_CRPG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(voltarBTN_CRPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProdBTN_CRPG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(madeLB_CRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarBTN_CRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerBTN_CRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoBTN_CRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void sairBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRPGActionPerformed
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRPGActionPerformed

    private void voltarBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRPGActionPerformed
        //Volta para a tela de Inicio
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRPGActionPerformed

    private void addProdBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTN_CRPGActionPerformed
        //Encaminha para a tela de cadastro de produtos
        this.setVisible(false);
        new CadastroProdutoGerente().setVisible(true);
    }//GEN-LAST:event_addProdBTN_CRPGActionPerformed

    private void removerBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_CRPGActionPerformed
        //Remove o produto selecionado da tabela e do arquivo de produtos 
        if (jTProdutosGerente.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutosGerente.getModel();
            String cod = jTProdutosGerente.getValueAt(jTProdutosGerente.getSelectedRow(), 1).toString();
            dtmProdutos.removeRow(jTProdutosGerente.getSelectedRow());
            ProdutoDados.remover(Integer.parseInt(cod));
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_removerBTN_CRPGActionPerformed

    private void editarBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_CRPGActionPerformed
        //Encaminha para a tela de editar produto e guarda o codigo do produto
        if (jTProdutosGerente.getSelectedRow() != -1) {
            codigo = jTProdutosGerente.getValueAt(jTProdutosGerente.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new EditarProdutoGerente().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_editarBTN_CRPGActionPerformed

    private void descricaoBTN_CRPGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRPGActionPerformed
        //Encaminha para a tela de perfil do produto e guarda o codigo do produto
        if (jTProdutosGerente.getSelectedRow() != -1) {
            codigo = jTProdutosGerente.getValueAt(jTProdutosGerente.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheProduto_Gerente().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }

    }//GEN-LAST:event_descricaoBTN_CRPGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProdBTN_CRPG;
    private javax.swing.JButton descricaoBTN_CRPG;
    private javax.swing.JButton editarBTN_CRPG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutosGerente;
    private javax.swing.JLabel lavantLB_CRPG;
    private javax.swing.JLabel madeLB_CRPG;
    private javax.swing.JButton removerBTN_CRPG;
    private javax.swing.JButton sairBTN_CRPG;
    private javax.swing.JButton voltarBTN_CRPG;
    // End of variables declaration//GEN-END:variables
}
