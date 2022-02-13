
package com.made_lavant.view;

import com.made_lavant.dados.FuncionarioDados;


public class PerfilGerente extends javax.swing.JFrame {


    public PerfilGerente() {
        initComponents();
        //Coloca o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Esconde os tópicos do endereço caso não tenha endereço cadastrado
        SemEndereco();
    }
    
    public void SemEndereco(){
        String cidade = FuncionarioDados.buscarCidade(Login.getCodigo());
        if (cidade.equals("null")){
            titleLB_PG.setVisible(false);
            topicoBairroLB_PG.setVisible(false);
            topicoCepLB_PG.setVisible(false);
            topicoNumeroLB_PG.setVisible(false);
            topicoRuaLB_PG.setVisible(false);
            topicoUfLB_PG.setVisible(false);
            topicoCidadeLB_PG.setVisible(false);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bairroLB_PG = new javax.swing.JLabel();
        topicoNumeroLB_PG = new javax.swing.JLabel();
        topicoNomeLB_PG = new javax.swing.JLabel();
        topicoCidadeLB_PG = new javax.swing.JLabel();
        topicoBairroLB_PG = new javax.swing.JLabel();
        titleLB_PG = new javax.swing.JLabel();
        madeLB_PG = new javax.swing.JLabel();
        ufLB_PG = new javax.swing.JLabel();
        ruaLB_PG = new javax.swing.JLabel();
        sairBTN_PG = new javax.swing.JButton();
        idLB_PG = new javax.swing.JLabel();
        topicoUfLB_PG = new javax.swing.JLabel();
        voltarBTN_PG = new javax.swing.JButton();
        nomeLB_PG = new javax.swing.JLabel();
        topicoRuaLB_PG = new javax.swing.JLabel();
        cepLB_PG = new javax.swing.JLabel();
        topicoIdLB_PG = new javax.swing.JLabel();
        lavantLB_PG = new javax.swing.JLabel();
        numeroLB_PG = new javax.swing.JLabel();
        topicoCepLB_PG = new javax.swing.JLabel();
        cidadeLB_PG = new javax.swing.JLabel();
        editarBTN_PG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        bairroLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PG.setFont(bairroLB_PG.getFont().deriveFont(bairroLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, bairroLB_PG.getFont().getSize()+9));
        bairroLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLB_PG.setText("Nome Bairoo");
        bairroLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PG.setFont(topicoNumeroLB_PG.getFont().deriveFont(topicoNumeroLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_PG.getFont().getSize()+9));
        topicoNumeroLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PG.setText("Número:");

        topicoNomeLB_PG.setFont(topicoNomeLB_PG.getFont().deriveFont(topicoNomeLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_PG.getFont().getSize()+9));
        topicoNomeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PG.setText("Nome:");

        topicoCidadeLB_PG.setFont(topicoCidadeLB_PG.getFont().deriveFont(topicoCidadeLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_PG.getFont().getSize()+9));
        topicoCidadeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PG.setText("Cidade:");

        topicoBairroLB_PG.setFont(topicoBairroLB_PG.getFont().deriveFont(topicoBairroLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_PG.getFont().getSize()+9));
        topicoBairroLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PG.setText("Bairro:");

        titleLB_PG.setFont(titleLB_PG.getFont().deriveFont(titleLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_PG.getFont().getSize()+9));
        titleLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB_PG.setText("Endereço");

        madeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PG.setFont(madeLB_PG.getFont().deriveFont(madeLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, madeLB_PG.getFont().getSize()+9));
        madeLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PG.setText("MADE");
        madeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ufLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PG.setFont(ufLB_PG.getFont().deriveFont(ufLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, ufLB_PG.getFont().getSize()+9));
        ufLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PG.setText("UF");
        ufLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ruaLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PG.setFont(ruaLB_PG.getFont().deriveFont(ruaLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, ruaLB_PG.getFont().getSize()+9));
        ruaLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PG.setText("Nome Rua");
        ruaLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sairBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PG.setFont(sairBTN_PG.getFont().deriveFont(sairBTN_PG.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_PG.getFont().getSize()+7));
        sairBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PG.setText("Sair");
        sairBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PGActionPerformed(evt);
            }
        });

        idLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        idLB_PG.setFont(idLB_PG.getFont().deriveFont(idLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, idLB_PG.getFont().getSize()+9));
        idLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        idLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLB_PG.setText("123456789-10");
        idLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoUfLB_PG.setFont(topicoUfLB_PG.getFont().deriveFont(topicoUfLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_PG.getFont().getSize()+9));
        topicoUfLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PG.setText("UF:");

        voltarBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PG.setFont(voltarBTN_PG.getFont().deriveFont(voltarBTN_PG.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_PG.getFont().getSize()+7));
        voltarBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PG.setText("Voltar");
        voltarBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PGActionPerformed(evt);
            }
        });

        nomeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PG.setFont(nomeLB_PG.getFont().deriveFont(nomeLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_PG.getFont().getSize()+9));
        nomeLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PG.setText("Nome Funcionário");
        nomeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoRuaLB_PG.setFont(topicoRuaLB_PG.getFont().deriveFont(topicoRuaLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_PG.getFont().getSize()+9));
        topicoRuaLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PG.setText("Rua:");
        topicoRuaLB_PG.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PG.setMinimumSize(new java.awt.Dimension(73, 22));

        cepLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PG.setFont(cepLB_PG.getFont().deriveFont(cepLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, cepLB_PG.getFont().getSize()+9));
        cepLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PG.setText("00000-000");
        cepLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoIdLB_PG.setFont(topicoIdLB_PG.getFont().deriveFont(topicoIdLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoIdLB_PG.getFont().getSize()+9));
        topicoIdLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoIdLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoIdLB_PG.setText("ID:");
        topicoIdLB_PG.setPreferredSize(new java.awt.Dimension(73, 22));

        lavantLB_PG.setFont(lavantLB_PG.getFont().deriveFont(lavantLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, lavantLB_PG.getFont().getSize()+9));
        lavantLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PG.setText("Lavant");

        numeroLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PG.setFont(numeroLB_PG.getFont().deriveFont(numeroLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, numeroLB_PG.getFont().getSize()+9));
        numeroLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PG.setText("Numero");
        numeroLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoCepLB_PG.setFont(topicoCepLB_PG.getFont().deriveFont(topicoCepLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_PG.getFont().getSize()+9));
        topicoCepLB_PG.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PG.setText("CEP:");

        cidadeLB_PG.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PG.setFont(cidadeLB_PG.getFont().deriveFont(cidadeLB_PG.getFont().getStyle() & ~java.awt.Font.BOLD, cidadeLB_PG.getFont().getSize()+9));
        cidadeLB_PG.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PG.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cidadeLB_PG.setText("Nome Cidade");
        cidadeLB_PG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        editarBTN_PG.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_PG.setFont(editarBTN_PG.getFont().deriveFont(editarBTN_PG.getFont().getStyle() & ~java.awt.Font.BOLD, editarBTN_PG.getFont().getSize()+7));
        editarBTN_PG.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_PG.setText("Editar");
        editarBTN_PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_PGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sairBTN_PG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarBTN_PG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBTN_PG)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 199, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoNumeroLB_PG)
                                    .addComponent(topicoRuaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoCepLB_PG)
                                    .addComponent(topicoUfLB_PG)
                                    .addComponent(topicoCidadeLB_PG)
                                    .addComponent(topicoBairroLB_PG))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cidadeLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ufLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ruaLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cepLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(titleLB_PG))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(topicoIdLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoNomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(177, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lavantLB_PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(madeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_PG)
                        .addComponent(editarBTN_PG))
                    .addComponent(voltarBTN_PG))
                .addGap(40, 40, 40)
                .addComponent(madeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoIdLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(titleLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoUfLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topicoBairroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCepLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNumeroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLB_PG, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        //Adiciona o bairro do funcionário no label, apenas se tiver endereço cadastrado
        String bairro = FuncionarioDados.buscarBairro(Login.getCodigo());
        if (!bairro.equals("null")){
            bairroLB_PG.setText(bairro);
        }else bairroLB_PG.setText(" ");
        //Adiciona o uf do funcionário no label, apenas se tiver endereço cadastrado
        String uf = FuncionarioDados.buscarUF(Login.getCodigo());
        if (!uf.equals("null")){
            ufLB_PG.setText(uf);
        }else ufLB_PG.setText(" ");
        //Adiciona a rua do funcionário no label, apenas se tiver endereço cadastrado
        String rua = FuncionarioDados.buscarRua(Login.getCodigo());
        if (!rua.equals("null")){
            ruaLB_PG.setText(rua);
        }else ruaLB_PG.setText(" ");
        //Adiciona o id do funcionário no label
        idLB_PG.setText(Login.getCodigo());
        //Adiciona o nome do funcionário no label
        nomeLB_PG.setText(FuncionarioDados.buscarNome(Login.getCodigo()));
        //Adiciona o cep do funcionário no label, apenas se tiver endereço cadastrado
        String cep = FuncionarioDados.buscarCEP(Login.getCodigo());
        if (!cep.equals("null")){
            cepLB_PG.setText(cep);
        }else cepLB_PG.setText(" ");
        //Adiciona o número do funcionário no label, apenas se tiver endereço cadastrado
        String num = FuncionarioDados.buscarNumero(Login.getCodigo());
        if (!num.equals("null")){
            numeroLB_PG.setText(num);
        }else numeroLB_PG.setText(" ");
        //Adiciona a cidade do funcionário no label, apenas se tiver endereço cadastrado
        String cidade = FuncionarioDados.buscarCidade(Login.getCodigo());
        if (!cidade.equals("null")){
            cidadeLB_PG.setText(cidade);
        }else cidadeLB_PG.setText(" ");

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

    private void sairBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PGActionPerformed
        //Redireciona para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PGActionPerformed

    private void voltarBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PGActionPerformed
        //Volta para a tela de inicio
        this.setVisible(false);
        new InicioGerente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PGActionPerformed

    private void editarBTN_PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_PGActionPerformed
        //Redireciona para a tela editarDados
        this.setVisible(false);
        new EditarDadosGerente().setVisible(true);
    }//GEN-LAST:event_editarBTN_PGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PG;
    private javax.swing.JLabel cepLB_PG;
    private javax.swing.JLabel cidadeLB_PG;
    private javax.swing.JButton editarBTN_PG;
    private javax.swing.JLabel idLB_PG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_PG;
    private javax.swing.JLabel madeLB_PG;
    private javax.swing.JLabel nomeLB_PG;
    private javax.swing.JLabel numeroLB_PG;
    private javax.swing.JLabel ruaLB_PG;
    private javax.swing.JButton sairBTN_PG;
    private javax.swing.JLabel titleLB_PG;
    private javax.swing.JLabel topicoBairroLB_PG;
    private javax.swing.JLabel topicoCepLB_PG;
    private javax.swing.JLabel topicoCidadeLB_PG;
    private javax.swing.JLabel topicoIdLB_PG;
    private javax.swing.JLabel topicoNomeLB_PG;
    private javax.swing.JLabel topicoNumeroLB_PG;
    private javax.swing.JLabel topicoRuaLB_PG;
    private javax.swing.JLabel topicoUfLB_PG;
    private javax.swing.JLabel ufLB_PG;
    private javax.swing.JButton voltarBTN_PG;
    // End of variables declaration//GEN-END:variables
}
