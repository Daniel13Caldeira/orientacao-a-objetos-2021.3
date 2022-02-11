package com.made_lavant.view;

import com.made_lavant.base.Funcionario;
import com.made_lavant.dados.FuncionarioDados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudFuncionarios extends javax.swing.JFrame {

    protected static String codigo;

    protected static String getCodigo() {
        //Retorna o codigo do Funcionário
        return CrudFuncionarios.codigo;
    }

    public CrudFuncionarios() {
        initComponents();
        //Colocando o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Chama o método que preenche a tabela
        preencherTabela();
    }

    private void preencherTabela() {
        //Lista que armazena os funcionários
        ArrayList<Funcionario> funcionarios = FuncionarioDados.getFuncionarios();
        DefaultTableModel model = (DefaultTableModel) jTFuncionario.getModel();
        //Preenche a tabela com os funcionários
        for (int i = 0; i < funcionarios.size(); i++) {
            Object[] linha = {funcionarios.get(i).getNome(), funcionarios.get(i).getCodigo()};
            model.addRow(linha);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        madeLB_CRF = new javax.swing.JLabel();
        addFuncBTN_CRF = new javax.swing.JButton();
        lavantLB_CRF = new javax.swing.JLabel();
        removerBTN_CRF = new javax.swing.JButton();
        sairBTN_CRF = new javax.swing.JButton();
        descricaoBTN_CRF = new javax.swing.JButton();
        voltarBTN_CRF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Funcionários");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        madeLB_CRF.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_CRF.setFont(madeLB_CRF.getFont().deriveFont(madeLB_CRF.getFont().getStyle() | java.awt.Font.BOLD, madeLB_CRF.getFont().getSize()+13));
        madeLB_CRF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_CRF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_CRF.setText("MADE");
        madeLB_CRF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        addFuncBTN_CRF.setBackground(new java.awt.Color(255, 253, 130));
        addFuncBTN_CRF.setFont(addFuncBTN_CRF.getFont().deriveFont(addFuncBTN_CRF.getFont().getStyle() & ~java.awt.Font.BOLD, addFuncBTN_CRF.getFont().getSize()+7));
        addFuncBTN_CRF.setForeground(new java.awt.Color(232, 72, 85));
        addFuncBTN_CRF.setText("Adicionar Funcionário");
        addFuncBTN_CRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuncBTN_CRFActionPerformed(evt);
            }
        });

        lavantLB_CRF.setFont(lavantLB_CRF.getFont().deriveFont(lavantLB_CRF.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_CRF.getFont().getSize()+13));
        lavantLB_CRF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_CRF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_CRF.setText("Lavant");

        removerBTN_CRF.setBackground(new java.awt.Color(255, 253, 130));
        removerBTN_CRF.setFont(removerBTN_CRF.getFont().deriveFont(removerBTN_CRF.getFont().getStyle() & ~java.awt.Font.BOLD, removerBTN_CRF.getFont().getSize()+7));
        removerBTN_CRF.setForeground(new java.awt.Color(232, 72, 85));
        removerBTN_CRF.setText("Remover");
        removerBTN_CRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBTN_CRFActionPerformed(evt);
            }
        });

        sairBTN_CRF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_CRF.setFont(sairBTN_CRF.getFont().deriveFont(sairBTN_CRF.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_CRF.getFont().getSize()+7));
        sairBTN_CRF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_CRF.setText("Sair");
        sairBTN_CRF.setToolTipText("");
        sairBTN_CRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_CRFActionPerformed(evt);
            }
        });

        descricaoBTN_CRF.setBackground(new java.awt.Color(255, 253, 130));
        descricaoBTN_CRF.setFont(descricaoBTN_CRF.getFont().deriveFont(descricaoBTN_CRF.getFont().getStyle() & ~java.awt.Font.BOLD, descricaoBTN_CRF.getFont().getSize()+7));
        descricaoBTN_CRF.setForeground(new java.awt.Color(232, 72, 85));
        descricaoBTN_CRF.setText("Descrição");
        descricaoBTN_CRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoBTN_CRFActionPerformed(evt);
            }
        });

        voltarBTN_CRF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_CRF.setFont(voltarBTN_CRF.getFont().deriveFont(voltarBTN_CRF.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_CRF.getFont().getSize()+7));
        voltarBTN_CRF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_CRF.setText("Voltar");
        voltarBTN_CRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_CRFActionPerformed(evt);
            }
        });

        jTFuncionario.setBackground(new java.awt.Color(45, 48, 71));
        jTFuncionario.setFont(jTFuncionario.getFont().deriveFont(jTFuncionario.getFont().getStyle() & ~java.awt.Font.BOLD, jTFuncionario.getFont().getSize()+4));
        jTFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jTFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "IDENTIFICAÇÃO"
            }
        ));
        jTFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTFuncionario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_CRF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(addFuncBTN_CRF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(voltarBTN_CRF)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(removerBTN_CRF)
                        .addGap(26, 26, 26)
                        .addComponent(descricaoBTN_CRF)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(madeLB_CRF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lavantLB_CRF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_CRF)
                    .addComponent(voltarBTN_CRF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addFuncBTN_CRF))
                .addGap(18, 18, 18)
                .addComponent(madeLB_CRF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_CRF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoBTN_CRF)
                    .addComponent(removerBTN_CRF))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFuncBTN_CRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuncBTN_CRFActionPerformed
        //Encaminha para a tela de cadastro de funcionário
        this.setVisible(false);
        new CadastroFuncionario().setVisible(true);
    }//GEN-LAST:event_addFuncBTN_CRFActionPerformed

    private void sairBTN_CRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_CRFActionPerformed
        //Retorna para tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_CRFActionPerformed

    private void descricaoBTN_CRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoBTN_CRFActionPerformed
        //Encaminha para a tela de perfil do funcionário e guarda o codigo do funcionário
        if (jTFuncionario.getSelectedRow() != -1) {
            codigo = jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(), 1).toString();
            this.setVisible(false);
            new PerfilFuncionario_Crud().setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado!");
        }

    }//GEN-LAST:event_descricaoBTN_CRFActionPerformed

    private void voltarBTN_CRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_CRFActionPerformed
        //Volta para a tela de Inicio
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_CRFActionPerformed

    private void removerBTN_CRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBTN_CRFActionPerformed
        //Remove o funcionário selecionado da tabela e do arquivo de funcionários 
        if (jTFuncionario.getSelectedRow() != -1) {
            DefaultTableModel dtmFuncionarios = (DefaultTableModel) jTFuncionario.getModel();
            String cod = jTFuncionario.getValueAt(jTFuncionario.getSelectedRow(), 1).toString();
            dtmFuncionarios.removeRow(jTFuncionario.getSelectedRow());
            FuncionarioDados.remover(cod);
        } else {

            JOptionPane.showMessageDialog(null, "Nenhum funcionário selecionado!");
        }
    }//GEN-LAST:event_removerBTN_CRFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFuncBTN_CRF;
    private javax.swing.JButton descricaoBTN_CRF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTFuncionario;
    private javax.swing.JLabel lavantLB_CRF;
    private javax.swing.JLabel madeLB_CRF;
    private javax.swing.JButton removerBTN_CRF;
    private javax.swing.JButton sairBTN_CRF;
    private javax.swing.JButton voltarBTN_CRF;
    // End of variables declaration//GEN-END:variables
}
