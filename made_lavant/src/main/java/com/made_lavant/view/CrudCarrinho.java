package com.made_lavant.view;

import com.made_lavant.base.Carrinho;
import com.made_lavant.dados.CarrinhoDados;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class CrudCarrinho extends javax.swing.JFrame {

    protected static String codigo;

    public static String getCodigo() {
        //Retorna o codigo do carrinho
        return codigo;
    }

    public CrudCarrinho() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os carrinhos
        ArrayList<Carrinho> carrinhos = CarrinhoDados.getCarrinhos();
        DefaultTableModel model = (DefaultTableModel) jTCrudCarrinho.getModel();
        //Preenche a tabela com os carrinhos que estão prontos pra finalizar a venda
        for (int i = 0; i < carrinhos.size(); i++) {
            Object[] linha = {carrinhos.get(i).getCliente().getNome(), carrinhos.get(i).getCliente().getCpf()};
            if (CarrinhoDados.getPronto(carrinhos.get(i).getCliente().getCpf())) {
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
        jTCrudCarrinho = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Carrinhos");

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setFont(madeLB_CRC.getFont().deriveFont(madeLB_CRC.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRC.getFont().getSize()+25));
        madeLB_CRC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRC.setText("MADE");
        madeLB_CRC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        confirmarBTN_CRC.setFont(confirmarBTN_CRC.getFont().deriveFont(confirmarBTN_CRC.getFont().getStyle() & ~java.awt.Font.BOLD, confirmarBTN_CRC.getFont().getSize()+7));
        confirmarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        confirmarBTN_CRC.setText("Confirmar venda");
        confirmarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBTN_CRCActionPerformed(evt);
            }
        });

        lavantLB_CRC.setFont(lavantLB_CRC.getFont().deriveFont(lavantLB_CRC.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRC.getFont().getSize()+25));
        lavantLB_CRC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRC.setText("Lavant");

        descricaoBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRC.setFont(descricaoBTN_CRC.getFont().deriveFont(descricaoBTN_CRC.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRC.getFont().getSize()+7));
        descricaoBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRC.setText("Descrição");
        descricaoBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRCActionPerformed(evt);
            }
        });

        sairBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRC.setFont(sairBTN_CRC.getFont().deriveFont(sairBTN_CRC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRC.getFont().getSize()+7));
        sairBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRC.setText("Sair");
        sairBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRCActionPerformed(evt);
            }
        });

        voltarBTN_CRC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRC.setFont(voltarBTN_CRC.getFont().deriveFont(voltarBTN_CRC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRC.getFont().getSize()+7));
        voltarBTN_CRC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRC.setText("Voltar");
        voltarBTN_CRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRCActionPerformed(evt);
            }
        });

        jTCrudCarrinho.setFont(jTCrudCarrinho.getFont().deriveFont(jTCrudCarrinho.getFont().getStyle() & ~java.awt.Font.BOLD, jTCrudCarrinho.getFont().getSize()+4));
        jTCrudCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME DO CLIENTE", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTCrudCarrinho);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 481, Short.MAX_VALUE)
                        .addComponent(confirmarBTN_CRC)
                        .addGap(18, 18, 18)
                        .addComponent(descricaoBTN_CRC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lavantLB_CRC, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(madeLB_CRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRC)
                    .addComponent(voltarBTN_CRC))
                .addGap(18, 18, 18)
                .addComponent(madeLB_CRC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRC)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarBTN_CRC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        //Encaminha para a tela detalhe carrinho e guarda o codigo do carrinho
        if (jTCrudCarrinho.getSelectedRow() != -1) {
            codigo = jTCrudCarrinho.getValueAt(jTCrudCarrinho.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new DetalheCarrinho().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum carrinho selecionado!");
        }
    }//GEN-LAST:event_descricaoBTN_CRCActionPerformed

    private void sairBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRCActionPerformed
        //Retorna para tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRCActionPerformed

    private void confirmarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBTN_CRCActionPerformed
        //Encaminha para a tela de confirmação de venda e guarda o codigo do carrinho
        if (jTCrudCarrinho.getSelectedRow() != -1) {
            codigo = jTCrudCarrinho.getValueAt(jTCrudCarrinho.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new Confirmacao().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum carrinho selecionado!");
        }
    }//GEN-LAST:event_confirmarBTN_CRCActionPerformed

    private void voltarBTN_CRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRCActionPerformed
        //Volta para a tela de Inicio
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBTN_CRC;
    private javax.swing.JButton descricaoBTN_CRC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCrudCarrinho;
    private javax.swing.JLabel lavantLB_CRC;
    private javax.swing.JLabel madeLB_CRC;
    private javax.swing.JButton sairBTN_CRC;
    private javax.swing.JButton voltarBTN_CRC;
    // End of variables declaration//GEN-END:variables
}
