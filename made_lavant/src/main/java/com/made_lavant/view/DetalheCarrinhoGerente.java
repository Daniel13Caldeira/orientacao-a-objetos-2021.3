package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DetalheCarrinhoGerente extends javax.swing.JFrame {

private ArrayList<Produto> listaDeProdutos;


    public DetalheCarrinhoGerente() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = CarrinhoDados.getProdutos(CrudCarrinho.getCodigo());
        DefaultTableModel model = (DefaultTableModel) jTDetalheGerente.getModel();
        //Preenche a tabela com os produtos
        for (int i = 0; i < produtos.size(); i++) {
            String validade=produtos.get(i).getValidade();
            if(validade.equals("null")){
                validade = "Inderteminado";
            }
            Object[] linha = {produtos.get(i).getNome(), produtos.get(i).getCodigo(), produtos.get(i).getQuantidade(), validade, produtos.get(i).getPreco()};
            model.addRow(linha);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_DCG = new javax.swing.JLabel();
        madeLB_DCG = new javax.swing.JLabel();
        lavantLB_DCG = new javax.swing.JLabel();
        voltarBTN_DCG = new javax.swing.JButton();
        totalLB_DCG = new javax.swing.JLabel();
        sairBTN_DCG = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalheGerente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_DCG.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_DCG.setFont(topicoTotalLB_DCG.getFont().deriveFont(topicoTotalLB_DCG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoTotalLB_DCG.getFont().getSize()+7));
        topicoTotalLB_DCG.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_DCG.setText("Total");

        madeLB_DCG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DCG.setFont(madeLB_DCG.getFont().deriveFont(madeLB_DCG.getFont().getStyle() | java.awt.Font.BOLD, madeLB_DCG.getFont().getSize()+13));
        madeLB_DCG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DCG.setText("MADE");
        madeLB_DCG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DCG.setFont(lavantLB_DCG.getFont().deriveFont(lavantLB_DCG.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_DCG.getFont().getSize()+13));
        lavantLB_DCG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DCG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DCG.setText("Lavant");

        voltarBTN_DCG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DCG.setFont(voltarBTN_DCG.getFont().deriveFont(voltarBTN_DCG.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_DCG.getFont().getSize()+7));
        voltarBTN_DCG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DCG.setText("Voltar");
        voltarBTN_DCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DCGActionPerformed(evt);
            }
        });

        totalLB_DCG.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_DCG.setFont(totalLB_DCG.getFont().deriveFont(totalLB_DCG.getFont().getStyle() & ~java.awt.Font.BOLD, totalLB_DCG.getFont().getSize()+7));
        totalLB_DCG.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_DCG.setText("000");

        sairBTN_DCG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DCG.setFont(sairBTN_DCG.getFont().deriveFont(sairBTN_DCG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_DCG.getFont().getSize()+7));
        sairBTN_DCG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DCG.setText("Sair");
        sairBTN_DCG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DCGActionPerformed(evt);
            }
        });

        jTDetalheGerente.setBackground(new java.awt.Color(45, 48, 71));
        jTDetalheGerente.setFont(jTDetalheGerente.getFont().deriveFont(jTDetalheGerente.getFont().getSize()+4f));
        jTDetalheGerente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTDetalheGerente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_DCG)
                        .addGap(18, 18, 18)
                        .addComponent(voltarBTN_DCG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicoTotalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(madeLB_DCG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lavantLB_DCG, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_DCG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_DCG)
                    .addComponent(totalLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBTN_DCG))
                .addGap(43, 43, 43)
                .addComponent(madeLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DCG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        //Calcula o preço total dos produtos do carrinho
        double soma =0;
        this.listaDeProdutos = CarrinhoDados.getProdutos(CrudCarrinhoGerente.getCodigo());
        for(int i=0;i<this.listaDeProdutos.size();i++){
            soma+=this.listaDeProdutos.get(i).getPreco()*this.listaDeProdutos.get(i).getQuantidade();
        }
        totalLB_DCG.setText(soma+"");

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

    private void voltarBTN_DCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DCGActionPerformed
        //Retorna para o CRUD de carrinho
        this.setVisible(false);
        new CrudCarrinhoGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DCGActionPerformed

    private void sairBTN_DCGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DCGActionPerformed
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DCGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDetalheGerente;
    private javax.swing.JLabel lavantLB_DCG;
    private javax.swing.JLabel madeLB_DCG;
    private javax.swing.JButton sairBTN_DCG;
    private javax.swing.JLabel topicoTotalLB_DCG;
    private javax.swing.JLabel totalLB_DCG;
    private javax.swing.JButton voltarBTN_DCG;
    // End of variables declaration//GEN-END:variables
}
