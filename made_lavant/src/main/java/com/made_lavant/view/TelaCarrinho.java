package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.CarrinhoDados;
import com.made_lavant.dados.ClienteDados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCarrinho extends javax.swing.JFrame {

    public TelaCarrinho() {
        initComponents();
        //Coloca o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = CarrinhoDados.getProdutos(Login.getCodigo());
        DefaultTableModel model = (DefaultTableModel) jTCarrinho.getModel();
        //Preenche a tabela com os produtos
        for (int i = 0; i < produtos.size(); i++) {
            String validade = produtos.get(i).getValidade();
            if (validade.equals("null")) {
                validade = "Inderteminado";
            }
            Object[] linha = {produtos.get(i).getNome(), produtos.get(i).getCodigo(), produtos.get(i).getQuantidade(), validade, produtos.get(i).getPreco()};
            model.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selecaoBG_TC = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_TC = new javax.swing.JLabel();
        totalLB_TC = new javax.swing.JLabel();
        madeLB_TC = new javax.swing.JLabel();
        lavantLB_TC = new javax.swing.JLabel();
        sairBTN_TC = new javax.swing.JButton();
        addProdBTN_TC = new javax.swing.JButton();
        removerBTN_TC = new javax.swing.JButton();
        voltarBTN_TC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();
        entregaRBTN_TC = new javax.swing.JRadioButton();
        buscaRBTN_TC = new javax.swing.JRadioButton();
        finalizarBTN_TC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrinho");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_TC.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_TC.setFont(topicoTotalLB_TC.getFont().deriveFont(topicoTotalLB_TC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoTotalLB_TC.getFont().getSize()+7));
        topicoTotalLB_TC.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_TC.setText("Total");

        totalLB_TC.setFont(totalLB_TC.getFont().deriveFont(totalLB_TC.getFont().getStyle() & ~java.awt.Font.BOLD));
        totalLB_TC.setForeground(new java.awt.Color(255, 253, 130));

        madeLB_TC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_TC.setFont(madeLB_TC.getFont().deriveFont(madeLB_TC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_TC.getFont().getSize()+9));
        madeLB_TC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_TC.setText("MADE");
        madeLB_TC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_TC.setFont(lavantLB_TC.getFont().deriveFont(lavantLB_TC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_TC.getFont().getSize()+9));
        lavantLB_TC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_TC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_TC.setText("Lavant");

        sairBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_TC.setFont(sairBTN_TC.getFont().deriveFont(sairBTN_TC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_TC.getFont().getSize()+7));
        sairBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_TC.setText("Sair");
        sairBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_TCActionPerformed(evt);
            }
        });

        addProdBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        addProdBTN_TC.setFont(addProdBTN_TC.getFont().deriveFont(addProdBTN_TC.getFont().getStyle() & ~java.awt.Font.BOLD, addProdBTN_TC.getFont().getSize()+7));
        addProdBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        addProdBTN_TC.setText("Adicionar Produto");
        addProdBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProdBTN_TCActionPerformed(evt);
            }
        });

        removerBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_TC.setFont(removerBTN_TC.getFont().deriveFont(removerBTN_TC.getFont().getSize()+7f));
        removerBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_TC.setText("Remover");
        removerBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_TCActionPerformed(evt);
            }
        });

        voltarBTN_TC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_TC.setFont(voltarBTN_TC.getFont().deriveFont(voltarBTN_TC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_TC.getFont().getSize()+7));
        voltarBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_TC.setText("Voltar");
        voltarBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_TCActionPerformed(evt);
            }
        });

        jTCarrinho.setBackground(new java.awt.Color(45, 48, 71));
        jTCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTCarrinho);

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

        entregaRBTN_TC.setBackground(new java.awt.Color(45, 48, 71));
        selecaoBG_TC.add(entregaRBTN_TC);
        entregaRBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        entregaRBTN_TC.setText("Delivery");
        entregaRBTN_TC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buscaRBTN_TC.setBackground(new java.awt.Color(45, 48, 71));
        selecaoBG_TC.add(buscaRBTN_TC);
        buscaRBTN_TC.setForeground(new java.awt.Color(232, 72, 85));
        buscaRBTN_TC.setText("Buscar no local");
        buscaRBTN_TC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        finalizarBTN_TC.setText("Finalizar compra");
        finalizarBTN_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarBTN_TCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removerBTN_TC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entregaRBTN_TC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscaRBTN_TC)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(finalizarBTN_TC)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_TC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(voltarBTN_TC)
                        .addGap(112, 112, 112)
                        .addComponent(addProdBTN_TC)
                        .addGap(42, 42, 42)
                        .addComponent(topicoTotalLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lavantLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(madeLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBTN_TC)
                    .addComponent(totalLB_TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_TC)
                    .addComponent(addProdBTN_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(madeLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerBTN_TC)
                    .addComponent(entregaRBTN_TC)
                    .addComponent(buscaRBTN_TC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizarBTN_TC)
                .addGap(8, 8, 8))
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

    private void sairBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_TCActionPerformed
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_TCActionPerformed

    private void addProdBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProdBTN_TCActionPerformed
        //Redireciona pra tela do CRUD de produtos
        this.setVisible(false);
        new CrudProdutos_Cliente().setVisible(true);
    }//GEN-LAST:event_addProdBTN_TCActionPerformed

    private void voltarBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_TCActionPerformed
        //Retorna para tela de inicio
        this.setVisible(false);
        new InicioCliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_TCActionPerformed

    private void removerBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_TCActionPerformed
        //Remove da tabela e do arquivo do carrinho 
        if (jTCarrinho.getSelectedRow() != -1) {
            DefaultTableModel dtmProdutos = (DefaultTableModel) jTCarrinho.getModel();
            String codigo = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 1).toString();
            dtmProdutos.removeRow(jTCarrinho.getSelectedRow());
            CarrinhoDados.removerProduto(Login.getCodigo(), Integer.parseInt(codigo));
        } else {

            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
        }
    }//GEN-LAST:event_removerBTN_TCActionPerformed

    private void finalizarBTN_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarBTN_TCActionPerformed
        //Finaliza o carrinho e envia para o CRUD de carrinho
        boolean flag = true;
        if (entregaRBTN_TC.isSelected()) {
            CarrinhoDados.setTipoVenda(Login.getCodigo(), "entrega");
            if (ClienteDados.buscarBairro(Login.getCodigo()).equals("null")) {
                JOptionPane.showMessageDialog(null, "Cadastre um endereço ou selecione a opção para busca o seu pedido", "Endereço não cadastrado", 0);
                flag = false;
            }
        } else {
            if (buscaRBTN_TC.isSelected()) {
                CarrinhoDados.setTipoVenda(Login.getCodigo(), "busca");
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma opção de venda", "Erro", 0);
                flag = false;
            }
        }
        if (flag) {
            CarrinhoDados.setPronto(Login.getCodigo(), true);
        }
    }//GEN-LAST:event_finalizarBTN_TCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProdBTN_TC;
    private javax.swing.JRadioButton buscaRBTN_TC;
    private javax.swing.JRadioButton entregaRBTN_TC;
    private javax.swing.JButton finalizarBTN_TC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JLabel lavantLB_TC;
    private javax.swing.JLabel madeLB_TC;
    private javax.swing.JButton removerBTN_TC;
    private javax.swing.JButton sairBTN_TC;
    private javax.swing.ButtonGroup selecaoBG_TC;
    private javax.swing.JLabel topicoTotalLB_TC;
    private javax.swing.JLabel totalLB_TC;
    private javax.swing.JButton voltarBTN_TC;
    // End of variables declaration//GEN-END:variables
}
