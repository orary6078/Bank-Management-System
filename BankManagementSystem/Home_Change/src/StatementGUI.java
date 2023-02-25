/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Color;
import javax.swing.JPanel;

public class StatementGUI extends javax.swing.JFrame {

    public StatementGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_panel = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        nd_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        nd_2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        nd_3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        nd_6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        nd_7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_5 = new javax.swing.JPanel();
        nd_5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        nd_4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logoutbtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XZNOM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_panel.setBackground(new java.awt.Color(21, 35, 51));
        side_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(41, 57, 80));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        nd_1.setOpaque(false);
        nd_1.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_1Layout = new javax.swing.GroupLayout(nd_1);
        nd_1.setLayout(nd_1Layout);
        nd_1Layout.setHorizontalGroup(
            nd_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_1Layout.setVerticalGroup(
            nd_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(nd_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_panel.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 40));

        btn_2.setBackground(new java.awt.Color(41, 57, 80));
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });

        nd_2.setOpaque(false);
        nd_2.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_2Layout = new javax.swing.GroupLayout(nd_2);
        nd_2.setLayout(nd_2Layout);
        nd_2Layout.setHorizontalGroup(
            nd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_2Layout.setVerticalGroup(
            nd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Statement");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(nd_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_panel.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, -1));

        btn_3.setBackground(new java.awt.Color(41, 57, 80));
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        nd_3.setOpaque(false);
        nd_3.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_3Layout = new javax.swing.GroupLayout(nd_3);
        nd_3.setLayout(nd_3Layout);
        nd_3Layout.setHorizontalGroup(
            nd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_3Layout.setVerticalGroup(
            nd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Load Money");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(nd_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_panel.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 40));

        btn_6.setBackground(new java.awt.Color(41, 57, 80));
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
        });

        nd_6.setOpaque(false);
        nd_6.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_6Layout = new javax.swing.GroupLayout(nd_6);
        nd_6.setLayout(nd_6Layout);
        nd_6Layout.setHorizontalGroup(
            nd_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_6Layout.setVerticalGroup(
            nd_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Share Details");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addComponent(nd_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_panel.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, 40));

        btn_7.setBackground(new java.awt.Color(41, 57, 80));
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
        });

        nd_7.setOpaque(false);
        nd_7.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_7Layout = new javax.swing.GroupLayout(nd_7);
        nd_7.setLayout(nd_7Layout);
        nd_7Layout.setHorizontalGroup(
            nd_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_7Layout.setVerticalGroup(
            nd_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Status");

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addComponent(nd_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_panel.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, -1, 40));

        btn_5.setBackground(new java.awt.Color(41, 57, 80));
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
        });

        nd_5.setOpaque(false);
        nd_5.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_5Layout = new javax.swing.GroupLayout(nd_5);
        nd_5.setLayout(nd_5Layout);
        nd_5Layout.setHorizontalGroup(
            nd_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_5Layout.setVerticalGroup(
            nd_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Transfer Money");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addComponent(nd_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_panel.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 40));

        btn_4.setBackground(new java.awt.Color(41, 57, 80));
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        nd_4.setOpaque(false);
        nd_4.setPreferredSize(new java.awt.Dimension(3, 40));

        javax.swing.GroupLayout nd_4Layout = new javax.swing.GroupLayout(nd_4);
        nd_4.setLayout(nd_4Layout);
        nd_4Layout.setHorizontalGroup(
            nd_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        nd_4Layout.setVerticalGroup(
            nd_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Withdraw Money");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(nd_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nd_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        side_panel.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 40));

        getContentPane().add(side_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 530));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Xznom req. images/banklogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("P052", 1, 36)); // NOI18N
        jLabel2.setText("XZNOM BANK");

        Logoutbtn.setBackground(new java.awt.Color(255, 0, 51));
        Logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutbtnMousePressed(evt);
            }
        });

        jLabel6.setText("Log Out");

        javax.swing.GroupLayout LogoutbtnLayout = new javax.swing.GroupLayout(Logoutbtn);
        Logoutbtn.setLayout(LogoutbtnLayout);
        LogoutbtnLayout.setHorizontalGroup(
            LogoutbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutbtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(17, 17, 17))
        );
        LogoutbtnLayout.setVerticalGroup(
            LogoutbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutbtnLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jLabel3.setText("only for testing :statement");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addGap(0, 493, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(368, 368, 368))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2))
                            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)))
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 810, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed

        setColor(btn_2); 
        nd_2.setOpaque(true);
        resetColor(new JPanel[]{btn_3,btn_4,btn_5,btn_6,btn_7,btn_1}, new JPanel[]{nd_3,nd_4, nd_5, nd_6, nd_7, nd_1});
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

        setColor(btn_1); 
        nd_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4,btn_5,btn_6,btn_7}, new JPanel[]{nd_2,nd_3, nd_4, nd_5, nd_6, nd_7});
        
        DashboardGUI db=new DashboardGUI();
        setVisible(false);
        
        db.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed

        setColor(btn_3); 
        nd_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4,btn_5,btn_6,btn_7}, new JPanel[]{nd_2,nd_1, nd_4, nd_5, nd_6, nd_7});
        
        LoadMoneyGUI lm=new LoadMoneyGUI();
        setVisible(false);
        
        lm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed

        setColor(btn_4); 
        nd_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_1,btn_5,btn_6,btn_7}, new JPanel[]{nd_2,nd_3, nd_1, nd_5, nd_6, nd_7});
        
        WithdrawMoneyGUI wd=new WithdrawMoneyGUI();
        setVisible(false);
        
        wd.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_4MousePressed

    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed

        setColor(btn_5); 
        nd_5.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4,btn_1,btn_6,btn_7}, new JPanel[]{nd_2,nd_3, nd_4, nd_1, nd_6, nd_7});
        
        TransferMoneyGUI tf=new TransferMoneyGUI();
        setVisible(false);
        
        tf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_5MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed

        setColor(btn_6); 
        nd_6.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4,btn_5,btn_1,btn_7}, new JPanel[]{nd_2,nd_3, nd_4, nd_5, nd_1, nd_7});
        
        ShareDetailsGUI sd=new ShareDetailsGUI();
        setVisible(false);
        
        sd.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_6MousePressed

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed

        setColor(btn_7); 
        nd_7.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4,btn_5,btn_6,btn_1}, new JPanel[]{nd_2,nd_3, nd_4, nd_5, nd_6, nd_1});
        
        AccountStatusGUI as=new AccountStatusGUI();
        setVisible(false);
        
        as.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_7MousePressed

    private void LogoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutbtnMousePressed
        // TODO add your handling code here:
        LoginGUI Lg=new LoginGUI();
        setVisible(false);
        
        Lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutbtnMousePressed

    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for (JPanel pane1 : pane) {
            pane1.setBackground(new Color(21,35,51));
        }
        for (JPanel indicator : indicators) {
            indicator.setOpaque(false);           
        }
        
    }
    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new DashboardGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Logoutbtn;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JPanel btn_5;
    private javax.swing.JPanel btn_6;
    private javax.swing.JPanel btn_7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel nd_1;
    private javax.swing.JPanel nd_2;
    private javax.swing.JPanel nd_3;
    private javax.swing.JPanel nd_4;
    private javax.swing.JPanel nd_5;
    private javax.swing.JPanel nd_6;
    private javax.swing.JPanel nd_7;
    private javax.swing.JPanel side_panel;
    // End of variables declaration//GEN-END:variables
}
