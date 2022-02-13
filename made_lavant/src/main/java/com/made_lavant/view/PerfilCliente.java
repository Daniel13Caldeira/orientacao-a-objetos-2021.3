
package com.made_lavant.view;

import com.made_lavant.dados.ClienteDados;


public class PerfilCliente extends javax.swing.JFrame {


    public PerfilCliente() {
        initComponents();
        //Coloca o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Esconde os tópicos do endereço caso não tenha endereço cadastrado
        SemEndereco();
    }
    
    public void SemEndereco(){
        String cidade = ClienteDados.buscarCidade(Login.getCodigo());
        if (cidade.equals("null")){
            title2LB_PC.setVisible(false);
            topicoBairroLB_PC.setVisible(false);
            topicoCepLB_PC.setVisible(false);
            topicoNumeroLB_PC.setVisible(false);
            topicoRuaLB_PC.setVisible(false);
            topicoUfLB_PC.setVisible(false);
            topicoCidadeLB_PC.setVisible(false);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        editarBTN_PC = new javax.swing.JButton();
        nomeLB_PC = new javax.swing.JLabel();
        lavantLB_PC = new javax.swing.JLabel();
        titleLB_PC = new javax.swing.JLabel();
        topicoNomeLB_PC = new javax.swing.JLabel();
        madeLB_PC = new javax.swing.JLabel();
        cpfLB_PC = new javax.swing.JLabel();
        topicoCpfLB_PC = new javax.swing.JLabel();
        cidadeLB_PC = new javax.swing.JLabel();
        topicoCidadeLB_PC = new javax.swing.JLabel();
        ufLB_PC = new javax.swing.JLabel();
        topicoUfLB_PC = new javax.swing.JLabel();
        cepLB_PC = new javax.swing.JLabel();
        topicoCepLB_PC = new javax.swing.JLabel();
        bairroLB_PC = new javax.swing.JLabel();
        topicoBairroLB_PC = new javax.swing.JLabel();
        ruaLB_PC = new javax.swing.JLabel();
        topicoRuaLB_PC = new javax.swing.JLabel();
        numeroLB_PC = new javax.swing.JLabel();
        topicoNumeroLB_PC = new javax.swing.JLabel();
        title2LB_PC = new javax.swing.JLabel();
        sairBTN_PC = new javax.swing.JButton();
        voltarBTN_PC = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Cliente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));

        editarBTN_PC.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_PC.setFont(editarBTN_PC.getFont().deriveFont(editarBTN_PC.getFont().getStyle() & ~java.awt.Font.BOLD, editarBTN_PC.getFont().getSize()+7));
        editarBTN_PC.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_PC.setText("Editar");
        editarBTN_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_PCActionPerformed(evt);
            }
        });

        nomeLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PC.setFont(nomeLB_PC.getFont().deriveFont(nomeLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_PC.getFont().getSize()+9));
        nomeLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PC.setText("Nome Cliente");
        nomeLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_PC.setFont(lavantLB_PC.getFont().deriveFont(lavantLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, lavantLB_PC.getFont().getSize()+9));
        lavantLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PC.setText("Lavant");

        titleLB_PC.setFont(titleLB_PC.getFont().deriveFont(titleLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_PC.getFont().getSize()+9));
        titleLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleLB_PC.setText("Seu perfil");

        topicoNomeLB_PC.setFont(topicoNomeLB_PC.getFont().deriveFont(topicoNomeLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNomeLB_PC.getFont().getSize()+9));
        topicoNomeLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PC.setText("Nome:");

        madeLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PC.setFont(madeLB_PC.getFont().deriveFont(madeLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, madeLB_PC.getFont().getSize()+9));
        madeLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PC.setText("MADE");
        madeLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cpfLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        cpfLB_PC.setFont(cpfLB_PC.getFont().deriveFont(cpfLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, cpfLB_PC.getFont().getSize()+9));
        cpfLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        cpfLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cpfLB_PC.setText("123456789-10");
        cpfLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoCpfLB_PC.setFont(topicoCpfLB_PC.getFont().deriveFont(topicoCpfLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCpfLB_PC.getFont().getSize()+9));
        topicoCpfLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoCpfLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCpfLB_PC.setText("CPF:");
        topicoCpfLB_PC.setPreferredSize(new java.awt.Dimension(73, 22));

        cidadeLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PC.setFont(cidadeLB_PC.getFont().deriveFont(cidadeLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, cidadeLB_PC.getFont().getSize()+9));
        cidadeLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cidadeLB_PC.setText("Nome Cidade");
        cidadeLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoCidadeLB_PC.setFont(topicoCidadeLB_PC.getFont().deriveFont(topicoCidadeLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_PC.getFont().getSize()+9));
        topicoCidadeLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PC.setText("Cidade:");

        ufLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PC.setFont(ufLB_PC.getFont().deriveFont(ufLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, ufLB_PC.getFont().getSize()+9));
        ufLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PC.setText("UF");
        ufLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoUfLB_PC.setFont(topicoUfLB_PC.getFont().deriveFont(topicoUfLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_PC.getFont().getSize()+9));
        topicoUfLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PC.setText("UF:");

        cepLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PC.setFont(cepLB_PC.getFont().deriveFont(cepLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, cepLB_PC.getFont().getSize()+9));
        cepLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PC.setText("00000-000");
        cepLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoCepLB_PC.setFont(topicoCepLB_PC.getFont().deriveFont(topicoCepLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_PC.getFont().getSize()+9));
        topicoCepLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PC.setText("CEP:");

        bairroLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PC.setFont(bairroLB_PC.getFont().deriveFont(bairroLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, bairroLB_PC.getFont().getSize()+9));
        bairroLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bairroLB_PC.setText("Nome Bairoo");
        bairroLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoBairroLB_PC.setFont(topicoBairroLB_PC.getFont().deriveFont(topicoBairroLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_PC.getFont().getSize()+9));
        topicoBairroLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PC.setText("Bairro:");

        ruaLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PC.setFont(ruaLB_PC.getFont().deriveFont(ruaLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, ruaLB_PC.getFont().getSize()+9));
        ruaLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PC.setText("Nome Rua");
        ruaLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoRuaLB_PC.setFont(topicoRuaLB_PC.getFont().deriveFont(topicoRuaLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_PC.getFont().getSize()+9));
        topicoRuaLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PC.setText("Rua:");
        topicoRuaLB_PC.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PC.setMinimumSize(new java.awt.Dimension(73, 22));

        numeroLB_PC.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PC.setFont(numeroLB_PC.getFont().deriveFont(numeroLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, numeroLB_PC.getFont().getSize()+9));
        numeroLB_PC.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PC.setText("Numero");
        numeroLB_PC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PC.setFont(topicoNumeroLB_PC.getFont().deriveFont(topicoNumeroLB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_PC.getFont().getSize()+9));
        topicoNumeroLB_PC.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PC.setText("Número:");

        title2LB_PC.setFont(title2LB_PC.getFont().deriveFont(title2LB_PC.getFont().getStyle() & ~java.awt.Font.BOLD, title2LB_PC.getFont().getSize()+9));
        title2LB_PC.setForeground(new java.awt.Color(255, 253, 130));
        title2LB_PC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2LB_PC.setText("Endereço");

        sairBTN_PC.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PC.setFont(sairBTN_PC.getFont().deriveFont(sairBTN_PC.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_PC.getFont().getSize()+7));
        sairBTN_PC.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PC.setText("Sair");
        sairBTN_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PCActionPerformed(evt);
            }
        });

        voltarBTN_PC.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PC.setFont(voltarBTN_PC.getFont().deriveFont(voltarBTN_PC.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_PC.getFont().getSize()+7));
        voltarBTN_PC.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PC.setText("Voltar");
        voltarBTN_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PCActionPerformed(evt);
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
                        .addComponent(sairBTN_PC)
                        .addGap(18, 18, 18)
                        .addComponent(editarBTN_PC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addComponent(voltarBTN_PC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(topicoNomeLB_PC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(topicoCpfLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfLB_PC)
                                    .addComponent(nomeLB_PC)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(topicoCidadeLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(topicoNumeroLB_PC)
                                            .addGap(11, 11, 11))
                                        .addComponent(topicoBairroLB_PC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(topicoUfLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoCepLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoRuaLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(numeroLB_PC)
                                                .addComponent(ruaLB_PC, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(cepLB_PC, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(bairroLB_PC, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(cidadeLB_PC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ufLB_PC)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleLB_PC)
                                    .addComponent(title2LB_PC)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(madeLB_PC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lavantLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairBTN_PC)
                    .addComponent(editarBTN_PC))
                .addGap(435, 435, 435))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(madeLB_PC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lavantLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(titleLB_PC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNomeLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoCpfLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(title2LB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoUfLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoCidadeLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bairroLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicoBairroLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topicoCepLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cepLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoRuaLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ruaLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(topicoNumeroLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroLB_PC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarBTN_PC)
                        .addGap(499, 499, 499))))
        );

        //Adiciona o nome do cliente no label
        nomeLB_PC.setText(ClienteDados.buscarNome(Login.getCodigo()));
        //Adiciona o cpf do cliente no label
        cpfLB_PC.setText(Login.getCodigo());
        //Adiciona a cidade do cliente no label, apenas se tiver endereço cadastrado
        String cidade = ClienteDados.buscarCidade(Login.getCodigo());
        if (!cidade.equals("null")){
            cidadeLB_PC.setText(cidade);
        }else cidadeLB_PC.setText(" ");
        //Adiciona o uf do cliente no label, apenas se tiver endereço cadastrado
        String uf = ClienteDados.buscarUF(Login.getCodigo());
        if (!uf.equals("null")){
            ufLB_PC.setText(uf);
        }else ufLB_PC.setText(" ");
        //Adiciona o cep do cliente no label, apenas se tiver endereço cadastrado
        String cep = ClienteDados.buscarCEP(Login.getCodigo());
        if (!cep.equals("null")){
            cepLB_PC.setText(cep);
        }else cepLB_PC.setText(" ");
        //Adiciona o bairro do cliente no label, apenas se tiver endereço cadastrado
        String bairro = ClienteDados.buscarBairro(Login.getCodigo());
        if (!bairro.equals("null")){
            bairroLB_PC.setText(bairro);
        }else bairroLB_PC.setText(" ");

        //Adiciona o rua do cliente no label, apenas se tiver endereço cadastrado
        String rua = ClienteDados.buscarRua(Login.getCodigo());
        if (!rua.equals("null")){
            ruaLB_PC.setText(rua);
        }else ruaLB_PC.setText(" ");
        //Adiciona o número do cliente no label, apenas se tiver endereço cadastrado
        String num = ClienteDados.buscarNumero(Login.getCodigo());
        if (!num.equals("null")){
            numeroLB_PC.setText(num);
        }else numeroLB_PC.setText(" ");

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

    private void editarBTN_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_PCActionPerformed
        //Redireciona para a tela de editar os dados
        this.setVisible(false);
        new EditarDadosCliente().setVisible(true);
    }//GEN-LAST:event_editarBTN_PCActionPerformed

    private void sairBTN_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PCActionPerformed
        //Redireciona para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PCActionPerformed

    private void voltarBTN_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PCActionPerformed
        //Volta para a tela de inicio
        this.setVisible(false);
        new InicioCliente().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PC;
    private javax.swing.JLabel cepLB_PC;
    private javax.swing.JLabel cidadeLB_PC;
    private javax.swing.JLabel cpfLB_PC;
    private javax.swing.JButton editarBTN_PC;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lavantLB_PC;
    private javax.swing.JLabel madeLB_PC;
    private javax.swing.JLabel nomeLB_PC;
    private javax.swing.JLabel numeroLB_PC;
    private javax.swing.JLabel ruaLB_PC;
    private javax.swing.JButton sairBTN_PC;
    private javax.swing.JLabel title2LB_PC;
    private javax.swing.JLabel titleLB_PC;
    private javax.swing.JLabel topicoBairroLB_PC;
    private javax.swing.JLabel topicoCepLB_PC;
    private javax.swing.JLabel topicoCidadeLB_PC;
    private javax.swing.JLabel topicoCpfLB_PC;
    private javax.swing.JLabel topicoNomeLB_PC;
    private javax.swing.JLabel topicoNumeroLB_PC;
    private javax.swing.JLabel topicoRuaLB_PC;
    private javax.swing.JLabel topicoUfLB_PC;
    private javax.swing.JLabel ufLB_PC;
    private javax.swing.JButton voltarBTN_PC;
    // End of variables declaration//GEN-END:variables
}
