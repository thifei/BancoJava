package mainnn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewJFrame extends javax.swing.JFrame {
    BDBanco banco = new BDBanco();
    Conta p;
    JLabel background = new JLabel(new ImageIcon(getClass().getResource("background.jpg")));
    JLabel logo = new JLabel(new ImageIcon(getClass().getResource("logoBANK.png")));
    boolean menu= false;
    boolean saque= false;
    int coluna = 0, car = 0; //car representa o número de caracteres da senha
    char[][] a = new char[1][4]; //váriaveis do campo de texto da agência
    char[][] n = new char[1][5]; //váriaveis do campo de texto do número
    char[][] s = new char[1][6]; //váriaveis do campo de texto da senha
    int Na; //váriaveis do campo de texto da agência
    int Nn; //váriaveis do campo de texto do número
    int Ns;//váriaveis do campo de texto da senha
    //começar chamando setVetores e setFund
    
    
    
    
    public NewJFrame() {
        initComponents();
        setVetores();
        setFundo();
        showTexto();
        setPanels(1);
        setLocationRelativeTo(null);
        banco.carregarBD();
        banco.verContas();
        //jPanelMenu.setVisible(false);
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
        jPanelMenu = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonSaldo = new javax.swing.JButton();
        jButtonExtrato = new javax.swing.JButton();
        jButtonTransf = new javax.swing.JButton();
        jButtonSaque = new javax.swing.JButton();
        jButtonDep = new javax.swing.JButton();
        jPanelSaqueDep = new javax.swing.JPanel();
        jPanelDep = new java.awt.Panel();
        jLabel14 = new javax.swing.JLabel();
        jLabelGetExtrato2 = new javax.swing.JLabel();
        jPanelSaque1 = new java.awt.Panel();
        jLabel15 = new javax.swing.JLabel();
        jLabelGetExtrato3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        JButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextFieldSD = new javax.swing.JTextField();
        confirma1 = new javax.swing.JButton();
        limpa1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanelSaldo = new javax.swing.JPanel();
        jLabelGetSaldo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelExtrato = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaGetExtrato = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(4000, 511));

        jPanel1.setPreferredSize(new java.awt.Dimension(460, 500));
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
        jPanel1.add(JButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 55, 54));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 55, 54));

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
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 55, 54));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 55, 54));

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
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 55, 54));

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
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 55, 54));

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
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 55, 54));

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
        jPanel1.add(confirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 110, 54));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 55, 54));

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
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 55, 54));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 55, 54));

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
        jPanel1.add(limpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, 54));

        cancela.setBackground(new java.awt.Color(183, 183, 183));
        cancela.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        cancela.setText("Cancela");
        cancela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancela.setBorderPainted(false);
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });
        jPanel1.add(cancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 110, 54));

        jLabel1.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel1.setText("Nº Conta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 20));

        jLabel2.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel2.setText("AG");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 20, 20));

        jLabel3.setFont(new java.awt.Font("DialogInput", 2, 16)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 50, 20));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CODE BANK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 70));

        jLabel6.setBackground(new java.awt.Color(255, 175, 45));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/logoBANK.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setMaximumSize(new java.awt.Dimension(15, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(15, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(15, 15));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 90, 80));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPasswordField1.setName(""); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 175, -1));

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
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));
        jTextField2.getAccessibleContext().setAccessibleName("");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("DialogInput", 2, 11)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 65, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/background.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 500));

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("UHUUUUUUUUUUUUU");
        jPanelMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 9, 290, 40));

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jButtonSaldo.setText("Saldo");
        jButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaldoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jButtonExtrato.setText("Extrato");
        jButtonExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtratoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jButtonTransf.setText("Transferência");
        jPanelMenu.add(jButtonTransf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        jButtonSaque.setText("Saque");
        jButtonSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaqueActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        jButtonDep.setText("Depósito");
        jButtonDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, -1));

        jPanelSaqueDep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel14.setText("Depósito");
        jPanelDep.add(jLabel14);

        jLabelGetExtrato2.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jLabelGetExtrato2.setText("Insira o valor do depósito:");
        jPanelDep.add(jLabelGetExtrato2);

        jPanelSaqueDep.add(jPanelDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel15.setText("Saque");
        jPanelSaque1.add(jLabel15);

        jLabelGetExtrato3.setFont(new java.awt.Font("DialogInput", 1, 17)); // NOI18N
        jLabelGetExtrato3.setText("Insira o valor do saque:");
        jPanelSaque1.add(jLabelGetExtrato3);

        jPanelSaqueDep.add(jPanelSaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 130));

        jButton11.setBackground(new java.awt.Color(183, 183, 183));
        jButton11.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton11.setText("1");
        jButton11.setToolTipText("");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 40, 40));

        jButton12.setBackground(new java.awt.Color(183, 183, 183));
        jButton12.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton12.setText("2");
        jButton12.setToolTipText("");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 40, 40));

        jButton13.setBackground(new java.awt.Color(183, 183, 183));
        jButton13.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton13.setText("3");
        jButton13.setToolTipText("");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 40, 40));

        jButton14.setBackground(new java.awt.Color(183, 183, 183));
        jButton14.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton14.setText("4");
        jButton14.setToolTipText("");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.setBorderPainted(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 40, 40));

        jButton15.setBackground(new java.awt.Color(183, 183, 183));
        jButton15.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton15.setText("5");
        jButton15.setToolTipText("");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton15.setBorderPainted(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 40, 40));

        jButton16.setBackground(new java.awt.Color(183, 183, 183));
        jButton16.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton16.setText("6");
        jButton16.setToolTipText("");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton16.setBorderPainted(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 40, 40));

        JButton17.setBackground(new java.awt.Color(183, 183, 183));
        JButton17.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        JButton17.setText("7");
        JButton17.setToolTipText("");
        JButton17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButton17.setBorderPainted(false);
        JButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton17ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(JButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 40, 40));

        jButton18.setBackground(new java.awt.Color(183, 183, 183));
        jButton18.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton18.setText("8");
        jButton18.setToolTipText("");
        jButton18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton18.setBorderPainted(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 40, 40));

        jButton19.setBackground(new java.awt.Color(183, 183, 183));
        jButton19.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton19.setText("9");
        jButton19.setToolTipText("");
        jButton19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton19.setBorderPainted(false);
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 40, 40));

        jButton20.setBackground(new java.awt.Color(183, 183, 183));
        jButton20.setFont(new java.awt.Font("DialogInput", 1, 21)); // NOI18N
        jButton20.setText("0");
        jButton20.setToolTipText("");
        jButton20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton20.setBorderPainted(false);
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 40, 40));

        jTextFieldSD.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSD.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSaqueDep.add(jTextFieldSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, 60));

        confirma1.setBackground(new java.awt.Color(183, 183, 183));
        confirma1.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        confirma1.setText("Confirma");
        confirma1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirma1.setBorderPainted(false);
        confirma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirma1ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(confirma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, 54));

        limpa1.setBackground(new java.awt.Color(183, 183, 183));
        limpa1.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        limpa1.setText("Limpa");
        limpa1.setToolTipText("");
        limpa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpa1.setBorderPainted(false);
        limpa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpa1ActionPerformed(evt);
            }
        });
        jPanelSaqueDep.add(limpa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 100, 54));

        jLabel10.setBackground(new java.awt.Color(255, 153, 51));
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/background.jpg"))); // NOI18N
        jPanelSaqueDep.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 390));

        jPanelMenu.add(jPanelSaqueDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 340, 420));

        jPanelSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGetSaldo.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabelGetSaldo.setText("R$ ");
        jPanelSaldo.add(jLabelGetSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, -1));

        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel11.setText("Saldo");
        jPanelSaldo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 153, 51));
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/background.jpg"))); // NOI18N
        jPanelSaldo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 390));

        jPanelExtrato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel12.setText("Extrato");
        jPanelExtrato.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jTextAreaGetExtrato.setBackground(new java.awt.Color(255, 153, 0));
        jTextAreaGetExtrato.setColumns(20);
        jTextAreaGetExtrato.setRows(5);
        jScrollPane1.setViewportView(jTextAreaGetExtrato);

        jPanelExtrato.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 310));

        jLabel9.setBackground(new java.awt.Color(255, 153, 51));
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainnn/background.jpg"))); // NOI18N
        jPanelExtrato.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(493, 493, 493)
                .addComponent(jPanelExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
        setFundo();
        if(coluna==3)
            logar();
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

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        coluna= 0;
        menu= false;
        car= 0;
        setVetores();
        showTexto();
        setFundo();
        setPanels(1);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepActionPerformed
        saque= false;
        jTextFieldSD.setText("");
        setPanels(5);
    }//GEN-LAST:event_jButtonDepActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        escreveSD(1);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        escreveSD(2);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        escreveSD(3);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        escreveSD(4);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        escreveSD(5);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        escreveSD(6);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void JButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton17ActionPerformed
        escreveSD(7);
    }//GEN-LAST:event_JButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        escreveSD(8);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        escreveSD(9);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        escreveSD(0);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void confirma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirma1ActionPerformed
        if(saque==true)
            p.saca(Integer.parseInt(jTextFieldSD.getText())); //chama o método sacar
        else{
            p.deposita(Integer.parseInt(jTextFieldSD.getText())); //chama o método depositar
        }
        jTextFieldSD.setText("");
    }//GEN-LAST:event_confirma1ActionPerformed

    private void limpa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpa1ActionPerformed
        apagaSD();
    }//GEN-LAST:event_limpa1ActionPerformed

    private void jButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaldoActionPerformed
        setPanels(3);
        jLabelGetSaldo.setText("R$" + p.getSaldo());
    }//GEN-LAST:event_jButtonSaldoActionPerformed

    private void jButtonExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtratoActionPerformed
        setPanels(4);
        jTextAreaGetExtrato.setText("" + p.getExtrato());
    }//GEN-LAST:event_jButtonExtratoActionPerformed

    private void jButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaqueActionPerformed
        saque= true;
        jTextFieldSD.setText("");
        setPanels(6);
    }//GEN-LAST:event_jButtonSaqueActionPerformed


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
    
    void logar(){
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
            System.out.println(Ns);

            if (banco.logar(Na, Nn, Ssenha)){
                System.out.println("Conta Acessada");
                p= Conta.pegarInstancia(Na, Nn);
                menu= true;
                setPanels(2);
            }
            else
                System.out.println("Acesso Negado");
    }
    
    public void setPanels(int op){
        jPanel1.setVisible(false); // op=1
        if(menu==false){
            jPanelMenu.setVisible(false); // op=2
        }
        jPanelSaldo.setVisible(false); // op=3 
        jPanelExtrato.setVisible(false); // op=4
        jPanelSaqueDep.setVisible(false); // op=5
        jPanelDep.setVisible(false); // op=6
        jPanelSaque1.setVisible(false); // op=7
        
        switch(op){
            case 1:
                jPanel1.setVisible(true); // op=1
                break;
            case 2:
                jPanelMenu.setVisible(true); // op=2
                break;
            case 3:
                jPanelSaldo.setVisible(true); // op=3
                break;
            case 4:
                jPanelExtrato.setVisible(true); // op=4
                break;
            case 5:
                jPanelSaqueDep.setVisible(true); // op=5
                jPanelDep.setVisible(true); // op=6
                break;
            case 6:
                jPanelSaqueDep.setVisible(true); // op=5
                jPanelSaque1.setVisible(true); // op=7
                break;    
            default:
                
        }
    }
    
    public void escreveSD(int m){
        jTextFieldSD.setText(jTextFieldSD.getText() + m + "");
    }
    
    public void apagaSD(){
        String borracha= jTextFieldSD.getText();
        borracha= borracha.substring(0, borracha.length() - 1);
        jTextFieldSD.setText(borracha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton17;
    private javax.swing.JButton JButton7;
    private javax.swing.JButton cancela;
    private javax.swing.JButton confirma;
    private javax.swing.JButton confirma1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDep;
    private javax.swing.JButton jButtonExtrato;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSaldo;
    private javax.swing.JButton jButtonSaque;
    private javax.swing.JButton jButtonTransf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelGetExtrato2;
    private javax.swing.JLabel jLabelGetExtrato3;
    private javax.swing.JLabel jLabelGetSaldo;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel jPanelDep;
    private javax.swing.JPanel jPanelExtrato;
    private java.awt.Panel jPanelMenu;
    private javax.swing.JPanel jPanelSaldo;
    private java.awt.Panel jPanelSaque1;
    private javax.swing.JPanel jPanelSaqueDep;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaGetExtrato;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldSD;
    private javax.swing.JButton limpa;
    private javax.swing.JButton limpa1;
    // End of variables declaration//GEN-END:variables
}
