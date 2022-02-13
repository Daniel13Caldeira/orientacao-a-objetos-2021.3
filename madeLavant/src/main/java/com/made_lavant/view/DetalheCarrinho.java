package com.made_lavant.view;

import com.made_lavant.base.Produto;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class DetalheCarrinho extends javax.swing.JFrame {

    private ArrayList<Produto> listaDeProdutos;

    public DetalheCarrinho() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os produtos
        ArrayList<Produto> produtos = CarrinhoDados.getProdutos(CrudCarrinho.getCodigo());
        DefaultTableModel model = (DefaultTableModel) jTDetalhe.getModel();
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

        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        topicoTotalLB_DC = new javax.swing.JLabel();
        madeLB_DC = new javax.swing.JLabel();
        lavantLB_DC = new javax.swing.JLabel();
        voltarBTN_DC = new javax.swing.JButton();
        totalLB_DC = new javax.swing.JLabel();
        sairBTN_DC = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDetalhe = new javax.swing.JTable();

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 253, 130));
        jLabel18.setText("000");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 253, 130));
        jLabel20.setText("dd/mm/aaaa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrinho");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoTotalLB_DC.setBackground(new java.awt.Color(255, 253, 130));
        topicoTotalLB_DC.setFont(topicoTotalLB_DC.getFont().deriveFont(topicoTotalLB_DC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoTotalLB_DC.getFont().getSize()+7));
        topicoTotalLB_DC.setForeground(new java.awt.Color(232, 72, 85));
        topicoTotalLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoTotalLB_DC.setText("Total");

        madeLB_DC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_DC.setFont(madeLB_DC.getFont().deriveFont(madeLB_DC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_DC.getFont().getSize()+13));
        madeLB_DC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_DC.setText("MADE");
        madeLB_DC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_DC.setFont(lavantLB_DC.getFont().deriveFont(lavantLB_DC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_DC.getFont().getSize()+13));
        lavantLB_DC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_DC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_DC.setText("Lavant");

        voltarBTN_DC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_DC.setFont(voltarBTN_DC.getFont().deriveFont(voltarBTN_DC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_DC.getFont().getSize()+7));
        voltarBTN_DC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_DC.setText("Voltar");
        voltarBTN_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_DCActionPerformed(evt);
            }
        });

        totalLB_DC.setBackground(new java.awt.Color(255, 255, 255));
        totalLB_DC.setFont(totalLB_DC.getFont().deriveFont(totalLB_DC.getFont().getStyle() & ~java.awt.Font.BOLD, totalLB_DC.getFont().getSize()+7));
        totalLB_DC.setForeground(new java.awt.Color(255, 253, 130));
        totalLB_DC.setText("000");

        sairBTN_DC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_DC.setFont(sairBTN_DC.getFont().deriveFont(sairBTN_DC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_DC.getFont().getSize()+7));
        sairBTN_DC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_DC.setText("Sair");
        sairBTN_DC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_DCActionPerformed(evt);
            }
        });

        jTDetalhe.setBackground(new java.awt.Color(45, 48, 71));
        jTDetalhe.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTDetalhe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "QUANTIDADE", "VALIDADE", "PREÇO"
            }
        ));
        jScrollPane1.setViewportView(jTDetalhe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
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
                        .addComponent(sairBTN_DC)
                        .addGap(18, 18, 18)
                        .addComponent(voltarBTN_DC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topicoTotalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(madeLB_DC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lavantLB_DC, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoTotalLB_DC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(voltarBTN_DC)
                    .addComponent(totalLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairBTN_DC))
                .addGap(31, 31, 31)
                .addComponent(madeLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_DC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        //Calcula o valor total do carrinho e atribui esse valor ao label
        double soma =0;
        this.listaDeProdutos = CarrinhoDados.getProdutos(CrudCarrinho.getCodigo());
        for(int i=0;i<this.listaDeProdutos.size();i++){
            soma+=this.listaDeProdutos.get(i).getPreco()*this.listaDeProdutos.get(i).getQuantidade();
        }
        totalLB_DC.setText(Math.round(soma*1000.0)/1000.0 + "");

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

    private void voltarBTN_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_DCActionPerformed
        //Retorna para o CRUD de carrinho
        this.setVisible(false);
        new CrudCarrinho().setVisible(true);
    }//GEN-LAST:event_voltarBTN_DCActionPerformed

    private void sairBTN_DCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_DCActionPerformed
        //Retorna para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_DCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDetalhe;
    private javax.swing.JLabel lavantLB_DC;
    private javax.swing.JLabel madeLB_DC;
    private javax.swing.JButton sairBTN_DC;
    private javax.swing.JLabel topicoTotalLB_DC;
    private javax.swing.JLabel totalLB_DC;
    private javax.swing.JButton voltarBTN_DC;
    // End of variables declaration//GEN-END:variables
}
