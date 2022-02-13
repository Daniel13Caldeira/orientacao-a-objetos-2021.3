package com.made_lavant.view;

import com.made_lavant.dados.FuncionarioDados;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class PerfilFuncionario_Crud extends javax.swing.JFrame {

    public PerfilFuncionario_Crud() {
        initComponents();
        //Coloca o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Esconde os tópicos do endereço caso não tenha endereço cadastrado
        SemEndereco();
    }

    public void SemEndereco() {
        String cidade = FuncionarioDados.buscarCidade(CrudFuncionarios.getCodigo());
        if (cidade.equals("null")) {
            titleLB_PFC.setVisible(false);
            topicoBairroLB_PFC.setVisible(false);
            topicoCepLB_PFC.setVisible(false);
            topicoNumeroLB_PFC.setVisible(false);
            topicoRuaLB_PFC.setVisible(false);
            topicoUfLB_PFC.setVisible(false);
            topicoCidadeLB_PFC.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoCepLB_PFC = new javax.swing.JLabel();
        cidadeLB_PFC = new javax.swing.JLabel();
        bairroLB_PFC = new javax.swing.JLabel();
        topicoNumeroLB_PFC = new javax.swing.JLabel();
        topicoNomeLB_PFC = new javax.swing.JLabel();
        topicoCidadeLB_PFC = new javax.swing.JLabel();
        topicoBairroLB_PFC = new javax.swing.JLabel();
        titleLB_PFC = new javax.swing.JLabel();
        madeLB_PFC = new javax.swing.JLabel();
        ufLB_PFC = new javax.swing.JLabel();
        ruaLB_PFC = new javax.swing.JLabel();
        sairBTN_PFC = new javax.swing.JButton();
        idLB_PFC = new javax.swing.JLabel();
        topicoUfLB_PFC = new javax.swing.JLabel();
        voltarBTN_PFC = new javax.swing.JButton();
        nomeLB_PFC = new javax.swing.JLabel();
        topicoRuaLB_PFC = new javax.swing.JLabel();
        cepLB_PFC = new javax.swing.JLabel();
        topicoIdLB_PFC = new javax.swing.JLabel();
        lavantLB_PFC = new javax.swing.JLabel();
        numeroLB_PFC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        topicoCepLB_PFC.setFont(topicoCepLB_PFC.getFont().deriveFont(topicoCepLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_PFC.getFont().getSize()+9));
        topicoCepLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PFC.setText("CEP:");

        cidadeLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cidadeLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cidadeLB_PFC.setText("Nome Cidade");
        cidadeLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        bairroLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        bairroLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLB_PFC.setText("Nome Bairoo");
        bairroLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PFC.setFont(topicoNumeroLB_PFC.getFont().deriveFont(topicoNumeroLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_PFC.getFont().getSize()+9));
        topicoNumeroLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PFC.setText("Número:");

        topicoNomeLB_PFC.setFont(topicoNomeLB_PFC.getFont().deriveFont(topicoNomeLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_PFC.getFont().getSize()+9));
        topicoNomeLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PFC.setText("Nome:");

        topicoCidadeLB_PFC.setFont(topicoCidadeLB_PFC.getFont().deriveFont(topicoCidadeLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_PFC.getFont().getSize()+9));
        topicoCidadeLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PFC.setText("Cidade:");

        topicoBairroLB_PFC.setFont(topicoBairroLB_PFC.getFont().deriveFont(topicoBairroLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_PFC.getFont().getSize()+9));
        topicoBairroLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PFC.setText("Bairro:");

        titleLB_PFC.setFont(titleLB_PFC.getFont().deriveFont(titleLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_PFC.getFont().getSize()+9));
        titleLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB_PFC.setText("Endereço");

        madeLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PFC.setFont(madeLB_PFC.getFont().deriveFont(madeLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, madeLB_PFC.getFont().getSize()+9));
        madeLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PFC.setText("MADE");
        madeLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ufLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ufLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PFC.setText("UF");
        ufLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ruaLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        ruaLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PFC.setText("Nome Rua");
        ruaLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sairBTN_PFC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PFC.setFont(sairBTN_PFC.getFont().deriveFont(sairBTN_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_PFC.getFont().getSize()+7));
        sairBTN_PFC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PFC.setText("Sair");
        sairBTN_PFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PFCActionPerformed(evt);
            }
        });

        idLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        idLB_PFC.setFont(idLB_PFC.getFont().deriveFont(idLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, idLB_PFC.getFont().getSize()+9));
        idLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        idLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLB_PFC.setText("123456789-10");
        idLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoUfLB_PFC.setFont(topicoUfLB_PFC.getFont().deriveFont(topicoUfLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_PFC.getFont().getSize()+9));
        topicoUfLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PFC.setText("UF:");

        voltarBTN_PFC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PFC.setFont(voltarBTN_PFC.getFont().deriveFont(voltarBTN_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_PFC.getFont().getSize()+7));
        voltarBTN_PFC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PFC.setText("Voltar");
        voltarBTN_PFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PFCActionPerformed(evt);
            }
        });

        nomeLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PFC.setFont(nomeLB_PFC.getFont().deriveFont(nomeLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_PFC.getFont().getSize()+9));
        nomeLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PFC.setText("Nome Funcionário");
        nomeLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoRuaLB_PFC.setFont(topicoRuaLB_PFC.getFont().deriveFont(topicoRuaLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_PFC.getFont().getSize()+9));
        topicoRuaLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PFC.setText("Rua:");
        topicoRuaLB_PFC.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PFC.setMinimumSize(new java.awt.Dimension(73, 22));

        cepLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        cepLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PFC.setText("00000-000");
        cepLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoIdLB_PFC.setFont(topicoIdLB_PFC.getFont().deriveFont(topicoIdLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoIdLB_PFC.getFont().getSize()+9));
        topicoIdLB_PFC.setForeground(new java.awt.Color(255, 253, 130));
        topicoIdLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoIdLB_PFC.setText("ID:");
        topicoIdLB_PFC.setPreferredSize(new java.awt.Dimension(73, 22));

        lavantLB_PFC.setFont(lavantLB_PFC.getFont().deriveFont(lavantLB_PFC.getFont().getStyle() & ~java.awt.Font.BOLD, lavantLB_PFC.getFont().getSize()+9));
        lavantLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PFC.setText("Lavant");

        numeroLB_PFC.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PFC.setFont(new java.awt.Font("Colonna MT", 1, 20)); // NOI18N
        numeroLB_PFC.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PFC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PFC.setText("Numero");
        numeroLB_PFC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sairBTN_PFC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBTN_PFC))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLB_PFC)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(topicoNumeroLB_PFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoCidadeLB_PFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoUfLB_PFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoBairroLB_PFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoCepLB_PFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topicoRuaLB_PFC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cidadeLB_PFC)
                            .addComponent(ufLB_PFC)
                            .addComponent(bairroLB_PFC)
                            .addComponent(cepLB_PFC)
                            .addComponent(ruaLB_PFC)
                            .addComponent(numeroLB_PFC)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(topicoIdLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoNomeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idLB_PFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeLB_PFC)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lavantLB_PFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(madeLB_PFC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sairBTN_PFC)
                            .addComponent(voltarBTN_PFC)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(madeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNomeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoIdLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(titleLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoUfLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoCidadeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoBairroLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoCepLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cepLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoRuaLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruaLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNumeroLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLB_PFC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        //Adiciona a cidade do funcionário no label, apenas se tiver endereço cadastrado
        String cidade = FuncionarioDados.buscarCidade(CrudFuncionarios.getCodigo());
        if (!cidade.equals("null")){
            cidadeLB_PFC.setText(cidade);
        }else cidadeLB_PFC.setText(" ");
        //Adiciona o bairro do funcionário no label, apenas se tiver endereço cadastrado
        String bairro = FuncionarioDados.buscarBairro(CrudFuncionarios.getCodigo());
        if (!bairro.equals("null")){
            bairroLB_PFC.setText(bairro);
        }else bairroLB_PFC.setText(" ");
        //Adiciona o uf do funcionário no label, apenas se tiver endereço cadastrado
        String uf = FuncionarioDados.buscarUF(CrudFuncionarios.getCodigo());
        if (!uf.equals("null")){
            ufLB_PFC.setText(uf);
        }else ufLB_PFC.setText(" ");
        //Adiciona a rua do funcionário no label, apenas se tiver endereço cadastrado
        String rua = FuncionarioDados.buscarRua(CrudFuncionarios.getCodigo());
        if (!rua.equals("null")){
            ruaLB_PFC.setText(rua);
        }else ruaLB_PFC.setText(" ");
        //Adiciona o id do funcionário no label
        idLB_PFC.setText(CrudFuncionarios.getCodigo());
        //Adiciona o nome do funcionário no label
        nomeLB_PFC.setText(FuncionarioDados.buscarNome(CrudFuncionarios.getCodigo()));
        //Adiciona o cep do funcionário no label, apenas se tiver endereço cadastrado
        String cep = FuncionarioDados.buscarCEP(CrudFuncionarios.getCodigo());
        if (!cep.equals("null")){
            cepLB_PFC.setText(cep);
        }else cepLB_PFC.setText(" ");
        //Adiciona o número do funcionário no label, apenas se tiver endereço cadastrado
        String num = FuncionarioDados.buscarNumero(CrudFuncionarios.getCodigo());
        if (!num.equals("null")){
            numeroLB_PFC.setText(num);
        }else numeroLB_PFC.setText(" ");

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

    private void sairBTN_PFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PFCActionPerformed
        //Redireciona para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PFCActionPerformed

    private void voltarBTN_PFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PFCActionPerformed
        //Volta para a tela de inicio
        this.setVisible(false);
        new CrudFuncionarios().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PFCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PFC;
    private javax.swing.JLabel cepLB_PFC;
    private javax.swing.JLabel cidadeLB_PFC;
    private javax.swing.JLabel idLB_PFC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_PFC;
    private javax.swing.JLabel madeLB_PFC;
    private javax.swing.JLabel nomeLB_PFC;
    private javax.swing.JLabel numeroLB_PFC;
    private javax.swing.JLabel ruaLB_PFC;
    private javax.swing.JButton sairBTN_PFC;
    private javax.swing.JLabel titleLB_PFC;
    private javax.swing.JLabel topicoBairroLB_PFC;
    private javax.swing.JLabel topicoCepLB_PFC;
    private javax.swing.JLabel topicoCidadeLB_PFC;
    private javax.swing.JLabel topicoIdLB_PFC;
    private javax.swing.JLabel topicoNomeLB_PFC;
    private javax.swing.JLabel topicoNumeroLB_PFC;
    private javax.swing.JLabel topicoRuaLB_PFC;
    private javax.swing.JLabel topicoUfLB_PFC;
    private javax.swing.JLabel ufLB_PFC;
    private javax.swing.JButton voltarBTN_PFC;
    // End of variables declaration//GEN-END:variables
}
