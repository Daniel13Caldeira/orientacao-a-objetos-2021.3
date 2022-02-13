package com.made_lavant.view;

import com.made_lavant.dados.FuncionarioDados;

/* Integrantes: 
        Daniel Jorge Reis Caldeira - 202065555C
         Ewerson dos Santos Rodrigues -201965029AB
         Marcio Felipe Daniel Gonçalves - 202065519B
         Matheus Reis Ribeiro - 201965090AB 
 */
public class PerfilFuncionario extends javax.swing.JFrame {

    public PerfilFuncionario() {
        initComponents();
        //Coloca o jframe em tela cheia
        setExtendedState(MAXIMIZED_BOTH);
        //Esconde os tópicos do endereço caso não tenha endereço cadastrado
        SemEndereco();
    }

    public void SemEndereco() {
        String cidade = FuncionarioDados.buscarCidade(Login.getCodigo());
        if (cidade.equals("null")) {
            titleLB_PF.setVisible(false);
            topicoBairroLB_PF.setVisible(false);
            topicoCepLB_PF.setVisible(false);
            topicoNumeroLB_PF.setVisible(false);
            topicoRuaLB_PF.setVisible(false);
            topicoUfLB_PF.setVisible(false);
            topicoCidadeLB_PF.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topicoRuaLB_PF = new javax.swing.JLabel();
        topicoIdLB_PF = new javax.swing.JLabel();
        numeroLB_PF = new javax.swing.JLabel();
        cidadeLB_PF = new javax.swing.JLabel();
        topicoNumeroLB_PF = new javax.swing.JLabel();
        topicoCidadeLB_PF = new javax.swing.JLabel();
        titleLB_PF = new javax.swing.JLabel();
        ufLB_PF = new javax.swing.JLabel();
        sairBTN_PF = new javax.swing.JButton();
        topicoUfLB_PF = new javax.swing.JLabel();
        nomeLB_PF = new javax.swing.JLabel();
        cepLB_PF = new javax.swing.JLabel();
        lavantLB_PF = new javax.swing.JLabel();
        topicoCepLB_PF = new javax.swing.JLabel();
        bairroLB_PF = new javax.swing.JLabel();
        topicoNomeLB_PF = new javax.swing.JLabel();
        topicoBairroLB_PF = new javax.swing.JLabel();
        madeLB_PF = new javax.swing.JLabel();
        ruaLB_PF = new javax.swing.JLabel();
        idLB_PF = new javax.swing.JLabel();
        voltarBTN_PF = new javax.swing.JButton();
        editarBTN_PF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Funcionário");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 48, 71));
        jPanel1.setToolTipText("");

        topicoRuaLB_PF.setFont(topicoRuaLB_PF.getFont().deriveFont(topicoRuaLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoRuaLB_PF.getFont().getSize()+9));
        topicoRuaLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoRuaLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoRuaLB_PF.setText("Rua:");
        topicoRuaLB_PF.setMaximumSize(new java.awt.Dimension(73, 22));
        topicoRuaLB_PF.setMinimumSize(new java.awt.Dimension(73, 22));

        topicoIdLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoIdLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoIdLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topicoIdLB_PF.setText("ID:");
        topicoIdLB_PF.setPreferredSize(new java.awt.Dimension(73, 22));

        numeroLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        numeroLB_PF.setFont(numeroLB_PF.getFont().deriveFont(numeroLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, numeroLB_PF.getFont().getSize()+9));
        numeroLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        numeroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        numeroLB_PF.setText("Numero");
        numeroLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cidadeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        cidadeLB_PF.setFont(cidadeLB_PF.getFont().deriveFont(cidadeLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, cidadeLB_PF.getFont().getSize()+9));
        cidadeLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        cidadeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cidadeLB_PF.setText("Nome Cidade");
        cidadeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNumeroLB_PF.setFont(topicoNumeroLB_PF.getFont().deriveFont(topicoNumeroLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoNumeroLB_PF.getFont().getSize()+9));
        topicoNumeroLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoNumeroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNumeroLB_PF.setText("Número:");

        topicoCidadeLB_PF.setFont(topicoCidadeLB_PF.getFont().deriveFont(topicoCidadeLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCidadeLB_PF.getFont().getSize()+9));
        topicoCidadeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoCidadeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCidadeLB_PF.setText("Cidade:");

        titleLB_PF.setFont(titleLB_PF.getFont().deriveFont(titleLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, titleLB_PF.getFont().getSize()+9));
        titleLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        titleLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLB_PF.setText("Endereço");

        ufLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        ufLB_PF.setFont(ufLB_PF.getFont().deriveFont(ufLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, ufLB_PF.getFont().getSize()+9));
        ufLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        ufLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ufLB_PF.setText("UF");
        ufLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        sairBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        sairBTN_PF.setFont(sairBTN_PF.getFont().deriveFont(sairBTN_PF.getFont().getStyle() & ~java.awt.Font.BOLD, sairBTN_PF.getFont().getSize()+7));
        sairBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        sairBTN_PF.setText("Sair");
        sairBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBTN_PFActionPerformed(evt);
            }
        });

        topicoUfLB_PF.setFont(topicoUfLB_PF.getFont().deriveFont(topicoUfLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoUfLB_PF.getFont().getSize()+9));
        topicoUfLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoUfLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoUfLB_PF.setText("UF:");

        nomeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        nomeLB_PF.setFont(nomeLB_PF.getFont().deriveFont(nomeLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, nomeLB_PF.getFont().getSize()+9));
        nomeLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        nomeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nomeLB_PF.setText("Nome Funcionário");
        nomeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cepLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        cepLB_PF.setFont(cepLB_PF.getFont().deriveFont(cepLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, cepLB_PF.getFont().getSize()+9));
        cepLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        cepLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cepLB_PF.setText("00000-000");
        cepLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lavantLB_PF.setFont(lavantLB_PF.getFont().deriveFont(lavantLB_PF.getFont().getStyle() | java.awt.Font.BOLD, lavantLB_PF.getFont().getSize()+9));
        lavantLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        lavantLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lavantLB_PF.setText("Lavant");

        topicoCepLB_PF.setFont(topicoCepLB_PF.getFont().deriveFont(topicoCepLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoCepLB_PF.getFont().getSize()+9));
        topicoCepLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoCepLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoCepLB_PF.setText("CEP:");

        bairroLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        bairroLB_PF.setFont(bairroLB_PF.getFont().deriveFont(bairroLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, bairroLB_PF.getFont().getSize()+9));
        bairroLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        bairroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bairroLB_PF.setText("Nome Bairoo");
        bairroLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        topicoNomeLB_PF.setFont(new java.awt.Font("Colonna MT", 0, 20)); // NOI18N
        topicoNomeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoNomeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoNomeLB_PF.setText("Nome:");

        topicoBairroLB_PF.setFont(topicoBairroLB_PF.getFont().deriveFont(topicoBairroLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, topicoBairroLB_PF.getFont().getSize()+9));
        topicoBairroLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        topicoBairroLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicoBairroLB_PF.setText("Bairro:");

        madeLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        madeLB_PF.setFont(madeLB_PF.getFont().deriveFont(madeLB_PF.getFont().getStyle() | java.awt.Font.BOLD, madeLB_PF.getFont().getSize()+9));
        madeLB_PF.setForeground(new java.awt.Color(255, 253, 130));
        madeLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        madeLB_PF.setText("MADE");
        madeLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        ruaLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        ruaLB_PF.setFont(ruaLB_PF.getFont().deriveFont(ruaLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, ruaLB_PF.getFont().getSize()+9));
        ruaLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        ruaLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ruaLB_PF.setText("Nome Rua");
        ruaLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        idLB_PF.setBackground(new java.awt.Color(255, 253, 130));
        idLB_PF.setFont(idLB_PF.getFont().deriveFont(idLB_PF.getFont().getStyle() & ~java.awt.Font.BOLD, idLB_PF.getFont().getSize()+9));
        idLB_PF.setForeground(new java.awt.Color(232, 72, 85));
        idLB_PF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLB_PF.setText("123456789-10");
        idLB_PF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        voltarBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        voltarBTN_PF.setFont(voltarBTN_PF.getFont().deriveFont(voltarBTN_PF.getFont().getStyle() & ~java.awt.Font.BOLD, voltarBTN_PF.getFont().getSize()+7));
        voltarBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        voltarBTN_PF.setText("Voltar");
        voltarBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTN_PFActionPerformed(evt);
            }
        });

        editarBTN_PF.setBackground(new java.awt.Color(255, 253, 130));
        editarBTN_PF.setFont(editarBTN_PF.getFont().deriveFont(editarBTN_PF.getFont().getStyle() & ~java.awt.Font.BOLD, editarBTN_PF.getFont().getSize()+7));
        editarBTN_PF.setForeground(new java.awt.Color(232, 72, 85));
        editarBTN_PF.setText("Editar");
        editarBTN_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTN_PFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sairBTN_PF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarBTN_PF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarBTN_PF)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(topicoIdLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(idLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(topicoNomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nomeLB_PF)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(topicoUfLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(topicoCidadeLB_PF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoBairroLB_PF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoCepLB_PF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(topicoRuaLB_PF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(topicoNumeroLB_PF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cidadeLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ufLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bairroLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cepLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ruaLB_PF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(titleLB_PF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lavantLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(madeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarBTN_PF)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sairBTN_PF)
                        .addComponent(editarBTN_PF)))
                .addGap(45, 45, 45)
                .addComponent(madeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lavantLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoIdLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoUfLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCidadeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoBairroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoCepLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoRuaLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicoNumeroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLB_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        //Adiciona o número do funcionário no label, apenas se tiver endereço cadastrado
        String num = FuncionarioDados.buscarNumero(Login.getCodigo());
        if (!num.equals("null")){
            numeroLB_PF.setText(num);
        }else numeroLB_PF.setText(" ");
        //Adiciona o cidade do funcionário no label, apenas se tiver endereço cadastrado
        String cidade = FuncionarioDados.buscarCidade(Login.getCodigo());
        if (!cidade.equals("null")){
            cidadeLB_PF.setText(cidade);
        }else cidadeLB_PF.setText(" ");
        //Adiciona o uf do funcionário no label, apenas se tiver endereço cadastrado
        String uf = FuncionarioDados.buscarUF(Login.getCodigo());
        if (!uf.equals("null")){
            ufLB_PF.setText(uf);
        }else ufLB_PF.setText(" ");
        //Adiciona o nome do funcionário no label
        nomeLB_PF.setText(FuncionarioDados.buscarNome(Login.getCodigo()));
        //Adiciona o cep do funcionário no label, apenas se tiver endereço cadastrado
        String cep = FuncionarioDados.buscarCEP(Login.getCodigo());
        if (!cep.equals("null")){
            cepLB_PF.setText(cep);
        }else cepLB_PF.setText(" ");
        //Adiciona o bairro do funcionário no label, apenas se tiver endereço cadastrado
        String bairro = FuncionarioDados.buscarBairro(Login.getCodigo());
        if (!bairro.equals("null")){
            bairroLB_PF.setText(bairro);
        }else bairroLB_PF.setText(" ");
        //Adiciona o rua do funcionário no label, apenas se tiver endereço cadastrado
        String rua = FuncionarioDados.buscarRua(Login.getCodigo());
        if (!rua.equals("null")){
            ruaLB_PF.setText(rua);
        }else ruaLB_PF.setText(" ");
        //Adiciona o id do funcionário no label
        idLB_PF.setText(Login.getCodigo());

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

    private void sairBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBTN_PFActionPerformed
        //Redireciona para a tela de Login
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairBTN_PFActionPerformed

    private void voltarBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTN_PFActionPerformed
        //Volta para a tela de inicio
        this.setVisible(false);
        new InicioFuncionario().setVisible(true);
    }//GEN-LAST:event_voltarBTN_PFActionPerformed

    private void editarBTN_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTN_PFActionPerformed
        //Redireciona para a tela de editar os dados
        this.setVisible(false);
        new EditarDadosFuncionario().setVisible(true);
    }//GEN-LAST:event_editarBTN_PFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLB_PF;
    private javax.swing.JLabel cepLB_PF;
    private javax.swing.JLabel cidadeLB_PF;
    private javax.swing.JButton editarBTN_PF;
    private javax.swing.JLabel idLB_PF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lavantLB_PF;
    private javax.swing.JLabel madeLB_PF;
    private javax.swing.JLabel nomeLB_PF;
    private javax.swing.JLabel numeroLB_PF;
    private javax.swing.JLabel ruaLB_PF;
    private javax.swing.JButton sairBTN_PF;
    private javax.swing.JLabel titleLB_PF;
    private javax.swing.JLabel topicoBairroLB_PF;
    private javax.swing.JLabel topicoCepLB_PF;
    private javax.swing.JLabel topicoCidadeLB_PF;
    private javax.swing.JLabel topicoIdLB_PF;
    private javax.swing.JLabel topicoNomeLB_PF;
    private javax.swing.JLabel topicoNumeroLB_PF;
    private javax.swing.JLabel topicoRuaLB_PF;
    private javax.swing.JLabel topicoUfLB_PF;
    private javax.swing.JLabel ufLB_PF;
    private javax.swing.JButton voltarBTN_PF;
    // End of variables declaration//GEN-END:variables
}
