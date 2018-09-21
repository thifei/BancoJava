package mainnn;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class NewJFrame extends javax.swing.JFrame {

    JLabel background = new JLabel(new ImageIcon(getClass().getResource("background.jpg")));
    JLabel logo = new JLabel(new ImageIcon(getClass().getResource("logoBANK.png")));
    BDBanco contas = new BDBanco();

    public NewJFrame() {
        initComponents();
        setVetores();
        setFundo();
        showTexto();
        setLocationRelativeTo(null);
        contas.carregarBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        confirma = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton7.setBackground(new java.awt.Color(183, 183, 183));
        JButton7.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        JButton7.setText("7");
        JButton7.setToolTipText("");
        JButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButton7.setBorderPainted(false);
        JButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(JButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 55, 54));

        jButton1.setBackground(new java.awt.Color(183, 183, 183));
        jButton1.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton1.setText("1");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 55, 54));

        jButton6.setBackground(new java.awt.Color(183, 183, 183));
        jButton6.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton6.setText("6");
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 55, 54));

        jButton2.setBackground(new java.awt.Color(183, 183, 183));
        jButton2.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton2.setText("2");
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 55, 54));

        jButton5.setBackground(new java.awt.Color(183, 183, 183));
        jButton5.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton5.setText("5");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 55, 54));

        jButton10.setBackground(new java.awt.Color(183, 183, 183));
        jButton10.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton10.setText("0");
        jButton10.setToolTipText("");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 55, 54));

        jButton9.setBackground(new java.awt.Color(183, 183, 183));
        jButton9.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton9.setText("9");
        jButton9.setToolTipText("");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 55, 54));

        confirma.setBackground(new java.awt.Color(183, 183, 183));
        confirma.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        confirma.setText("Confirma");
        confirma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirma.setBorderPainted(false);
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });
        jPanel1.add(confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 110, 54));

        jButton3.setBackground(new java.awt.Color(183, 183, 183));
        jButton3.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton3.setText("3");
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 55, 54));

        jButton8.setBackground(new java.awt.Color(183, 183, 183));
        jButton8.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton8.setText("8");
        jButton8.setToolTipText("");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 55, 54));

        jButton4.setBackground(new java.awt.Color(183, 183, 183));
        jButton4.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton4.setText("4");
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 55, 54));

        limpa.setBackground(new java.awt.Color(183, 183, 183));
        limpa.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        limpa.setText("Limpa");
        limpa.setToolTipText("");
        limpa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpa.setBorderPainted(false);
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });
        jPanel1.add(limpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 110, 54));

        cancela.setBackground(new java.awt.Color(183, 183, 183));
        cancela.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        cancela.setText("cancela");
        cancela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancela.setBorderPainted(false);
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });
        jPanel1.add(cancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 110, 54));

        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel1.setText("Nº Conta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 20));

        jLabel2.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel2.setText("AG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 20, 20));

        jLabel3.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 20));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CODE BANK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 210, 70));

        jLabel6.setBackground(new java.awt.Color(255, 175, 45));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/logoBANK.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setMaximumSize(new java.awt.Dimension(15, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(15, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 80));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.setName(""); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 175, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setColumns(15);
        jTextField2.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setName(""); // NOI18N
        jTextField2.setSelectedTextColor(null);
        jTextField2.setSelectionColor(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 100, -1));
        jTextField2.getAccessibleContext().setAccessibleName("");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 65, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/background.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escreve('1');
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        escreve('6');
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escreve('2');
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        escreve('5');
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        escreve('0');
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        escreve('9');
    }//GEN-LAST:event_jButton9ActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed

        if (coluna < 3) {
            coluna += 1;
        }
        if (coluna == 3) {

            String[][] ag = new String[1][4];
            String[][] num = new String[1][5];
            String[][] senha = new String[1][6];
            String Snum = null;
            String Sag = null;
            String Ssenha = null;

            for (int i = 0; i < 4; i++) {
                if (a[0][i] == ' ') {
                    break;
                }
                ag[0][i] = Character.toString(a[0][i]);
                if (i == 0) {
                    Sag = ag[0][i];
                } else {
                    Sag += ag[0][i];
                }
            }
            if (Sag == null) {
                throw new RuntimeException("erro agencia");
            }
            Na = Integer.parseInt(Sag);
            System.out.println(Na);
            for (int i = 0; i < 5; i++) {
                if (n[0][i] == ' ') {
                    break;
                }
                num[0][i] = Character.toString(n[0][i]);
                if (i == 0) {
                    Snum = num[0][i];
                } else {
                    Snum += num[0][i];
                }
            }
            if (Snum == null) {
                throw new RuntimeException("erro numero");
            }
            Nn = Integer.parseInt(Snum);
            System.out.println(Nn);

            for (int i = 0; i < 6; i++) {
                if (s[0][i] == ' ') {
                    break;
                }
                senha[0][i] = Character.toString(s[0][i]);
                if (i == 0) {
                    Ssenha = senha[0][i];
                } else {
                    Ssenha += senha[0][i];
                }
            }
            if (Ssenha == null) {
                throw new RuntimeException("erro senha");
            }
            Ns = Integer.parseInt(Ssenha);
            System.out.println(Ns);

            if (contas.logar(Na, Nn, "333333")) {
                System.out.println("Conta Acessada");
            }
            else
                System.out.println("Acesso Negado");
        }
        setFundo();
    }//GEN-LAST:event_confirmaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escreve('3');
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        escreve('8');
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escreve('4');
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        apaga();
    }//GEN-LAST:event_limpaActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        if (coluna > 0) {
            coluna -= 1;
        }
        setFundo();
    }//GEN-LAST:event_cancelaActionPerformed

    private void JButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton7ActionPerformed
        escreve('7');
    }//GEN-LAST:event_JButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    int coluna = 0, car = 0; //car representa o número de caracteres da senha
    char[][] a = new char[1][4]; //váriaveis do campo de texto da agência
    char[][] n = new char[1][5]; //váriaveis do campo de texto do número
    char[][] s = new char[1][6]; //váriaveis do campo de texto da senha
    int Na; //váriaveis do campo de texto da agência
    int Nn; //váriaveis do campo de texto do número
    int Ns;//váriaveis do campo de texto da senha
    //começar chamando setVetores e setFund

    public void setFundo() { //ajusta a cor do campo selecionado
        switch (coluna) {
            case 0:
                jTextField1.setBackground(Color.gray);
                jTextField2.setBackground(Color.LIGHT_GRAY);
                jPasswordField1.setBackground(Color.gray);
                jLabel1.setVisible(false);
                if (a[0][0] != ' ') {
                    jLabel2.setVisible(false);
                } else {
                    jLabel2.setVisible(true);
                }
                if (s[0][0] != ' ') {
                    jLabel3.setVisible(false);
                } else {

                    jLabel3.setVisible(true);
                }

                break;

            case 1:
                jTextField1.setBackground(Color.LIGHT_GRAY);
                jTextField2.setBackground(Color.gray);
                jPasswordField1.setBackground(Color.gray);
                jLabel2.setVisible(false);
                if (n[0][0] != ' ') {
                    jLabel1.setVisible(false);
                } else {
                    jLabel1.setVisible(true);
                }
                if (s[0][0] != ' ') {
                    jLabel3.setVisible(false);
                } else {
                    jLabel3.setVisible(true);
                }

                break;

            default:
                jTextField1.setBackground(Color.gray);
                jTextField2.setBackground(Color.gray);
                jPasswordField1.setBackground(Color.LIGHT_GRAY);
                jLabel3.setVisible(false);
                if (n[0][0] != ' ') {
                    jLabel1.setVisible(false);
                } else {
                    jLabel1.setVisible(true);
                }
                if (a[0][0] != ' ') {
                    jLabel2.setVisible(false);
                } else {
                    jLabel2.setVisible(true);
                }
        }
    }

    public void setVetores() { //método para inicializar os vetores
        int i;
        for (i = 0; i < 6; i++) {
            if (i < 4) {
                a[0][i] = ' ';
                n[0][i] = ' ';
                s[0][i] = ' ';
            } else if (i == 4) {
                n[0][i] = ' ';
                s[0][i] = ' ';
            } else {
                s[0][i] = ' ';
            }
        }
    }

    public void escreve(char num) { //método para escrever nos 3 campos de texto
        int i;
        switch (coluna) {
            case 0:
                for (i = 0; i < 5; i++) {
                    if (n[0][i] == ' ') {
                        if (i == 0 && num == '0') {
                            return;
                        }
                        n[0][i] = num;
                        showTexto();
                        return;
                    }
                }
                break;
            case 1:
                for (i = 0; i < 4; i++) {
                    if (a[0][i] == ' ') {
                        if (i == 0 && num == '0') {
                            return;
                        }
                        a[0][i] = num;
                        showTexto();
                        return;
                    }
                }
                break;
            default:
                for (i = 0; i < 6; i++) {
                    if (s[0][i] == ' ') {
                        if (i == 0 && num == '0') {
                            return;
                        }
                        s[0][i] = num;
                        if (car < 6) {
                            car += 1;
                        }
                        showTexto();
                        return;
                    }
                }
        }
    }

    public void showTexto() { //método para exibir o texto
        jTextField1.setText(a[0][0] + "" + a[0][1] + "" + a[0][2] + "" + a[0][3] + "");
        jTextField2.setText(n[0][0] + "" + n[0][1] + "" + n[0][2] + "" + n[0][3] + "" + n[0][4] + "");
        switch (car) {
            case 0:
                jPasswordField1.setText("");
                break;
            case 1:
                jPasswordField1.setText("a");
                break;
            case 2:
                jPasswordField1.setText("aa");
                break;
            case 3:
                jPasswordField1.setText("aaa");
                break;
            case 4:
                jPasswordField1.setText("aaaa");
                break;
            case 5:
                jPasswordField1.setText("aaaaa");
                break;
            default:
                jPasswordField1.setText("aaaaaa");
        }
    }

    public void apaga() { //método que apaga o numero digitado
        int i;
        switch (coluna) {
            case 0:
                for (i = 4; i >= 0; i--) {
                    if (n[0][i] != ' ') {
                        n[0][i] = ' ';
                        showTexto();
                        return;
                    }
                }
                break;
            case 1:
                for (i = 3; i >= 0; i--) {
                    if (a[0][i] != ' ') {
                        a[0][i] = ' ';
                        showTexto();
                        return;
                    }
                }

                break;
            default:
                for (i = 5; i >= 0; i--) {
                    if (s[0][i] != ' ') {
                        s[0][i] = ' ';
                        if (car > 0) {
                            car -= 1;
                        }
                        showTexto();
                        return;
                    }
                }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton7;
    private javax.swing.JButton cancela;
    private javax.swing.JButton confirma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton limpa;
    // End of variables declaration//GEN-END:variables
}
