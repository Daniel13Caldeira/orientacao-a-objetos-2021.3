
package com.made_lavant.view;

import com.made_lavant.base.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        lerArquivo();
        
    }
    
    public void lerArquivo(){
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\produto.txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//produto.txt");
        }
        try {
            FileReader fr = new FileReader(arquivo); //define o escritor
            BufferedReader br = new BufferedReader(fr);//buffer de escrita
            //insere o produto e adiciona uma nova linha
            
            String aux;
            String dados[];
            DefaultTableModel model = (DefaultTableModel) jTProdCliente.getModel();
            //Object[] linha;  //alguma linha
                    
            while (br.ready()) {
                aux = br.readLine();
                dados = aux.split(";");
                Object[] linha = {dados[1],dados[0],dados[2]};
                model.addRow(linha);
                ht.put(dados[0], aux);
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);

        }
    }
    
    public void adicionar(String info, String cod) {
        //cria uma String com os dados do produto no formato padrão que está sendo utilizado
        //String info = String.valueOf(produto.getCodigo()) + ';' + produto.getNome() + ';' + produto.getPreco() + ';' + String.valueOf(produto.getValidade()) + ';' + produto.getQuantidade() + ';';
        //define o arquivo de salvamento
        File arquivo;
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            //File arquivo = new File("caminho win");
            arquivo = new File("dados\\carrinhos\\"+ cod + ".txt");
        }else{
            //File arquivo = new File("caminho linux");
            arquivo = new File("dados//carrinhos//"+ cod + ".txt");
        }
        try {
            FileWriter escrita = new FileWriter(arquivo, true); //define o escritor
            BufferedWriter escritor = new BufferedWriter(escrita);//buffer de escrita
            //insere o produto e adiciona uma nova linha
            escritor.write(info);
            escritor.newLine();
            escritor.flush();
            escritor.close();
            escrita.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não é possível ler o arquivo no momento", "Erro", 0);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        madeLB_CRPC = new javax.swing.JLabel();
        lavantLB_CRPC = new javax.swing.JLabel();
        sairBTN_CRPC = new javax.swing.JButton();
        voltarBTN_CRPC = new javax.swing.JButton();
        addCarrinhoBTN_CRPC = new javax.swing.JButton();
        descricaoBTN_CRPC = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdCliente = new javax.swing.JTable();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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

        addCarrinhoBTN_CRPC.setBackground(new java.awt.Color(255, 253, 130));
        addCarrinhoBTN_CRPC.setFont(new java.awt.Font("Colonna MT", 1, 13)); // NOI18N
        addCarrinhoBTN_CRPC.setForeground(new java.awt.Color(232, 72, 85));
        addCarrinhoBTN_CRPC.setText("Adicionar ao Carrinho");
        addCarrinhoBTN_CRPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarrinhoBTN_CRPCActionPerformed(evt);
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
        jTProdCliente.setForeground(new java.awt.Color(255, 255, 255));
        jTProdCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "CÓDIGO", "PREÇO"
            }
        ));
        jTProdCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTProdClienteComponentShown(evt);
            }
        });
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
                        .addGap(18, 18, 18)
                        .addComponent(addCarrinhoBTN_CRPC)
                        .addGap(18, 18, 18)
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
                    .addComponent(jTextFieldQuantidade)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lavantLB_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descricaoBTN_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addCarrinhoBTN_CRPC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        
        if(jTProdCliente.getSelectedRow()!= -1){
            DefaultTableModel dtmProdutos = (DefaultTableModel)jTProdCliente.getModel();
            codigo = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
            
            this.setVisible(false);
            new DetalheProduto().setVisible(true);
        }else{
            
            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }
        
    }//GEN-LAST:event_descricaoBTN_CRPCActionPerformed

    private void addCarrinhoBTN_CRPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarrinhoBTN_CRPCActionPerformed
        
        if(jTProdCliente.getSelectedRow()!= -1){
            String quantidade = jTextFieldQuantidade.getText();
            DefaultTableModel dtmProdutos = (DefaultTableModel)jTProdCliente.getModel();
            if(quantidade.length()== 0){
                JOptionPane.showMessageDialog(null, "QUANTIDADE VAZIA!");
            }else{
                String aux;
                String cod = jTProdCliente.getValueAt(jTProdCliente.getSelectedRow(), 1).toString();
                aux = ht.get(cod);
                String dados[] = aux.split(";");
                String info = dados[0] + ";" + dados[1] + ";" + dados[2] + ";" + dados[3] + ";" + dados[4]; 
                adicionar(info,"a"); //trocar pela variavel
                
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "NENHUM PRODUTO SELECIONADO!");
        }
    }//GEN-LAST:event_addCarrinhoBTN_CRPCActionPerformed

    private void jTProdClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTProdClienteComponentShown
        System.out.println("ola");
    }//GEN-LAST:event_jTProdClienteComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarrinhoBTN_CRPC;
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
