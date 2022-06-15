package com.mycompany.conexionc;


import java.awt.Color;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    int xMouse, yMouse;
    public InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titleIniciarSesion = new javax.swing.JLabel();
        titlePass = new javax.swing.JLabel();
        UserVar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        PassVar = new javax.swing.JPasswordField();
        titleUser1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bar = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        exittext = new javax.swing.JLabel();
        logoPass = new javax.swing.JLabel();
        logoUser1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(48, 102, 173));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\logo.png")); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(420, 469));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 420, 500));

        titleIniciarSesion.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        titleIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        titleIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleIniciarSesion.setText("INICIO DE SESION");
        background.add(titleIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 280, 60));

        titlePass.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titlePass.setForeground(new java.awt.Color(255, 255, 255));
        titlePass.setText("CONTRASEÑA:");
        background.add(titlePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        UserVar.setBackground(new java.awt.Color(48, 102, 173));
        UserVar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        UserVar.setForeground(new java.awt.Color(255, 255, 255));
        UserVar.setBorder(null);
        background.add(UserVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 240, 40));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 340, 10));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 340, 10));

        PassVar.setBackground(new java.awt.Color(48, 102, 173));
        PassVar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        PassVar.setForeground(new java.awt.Color(255, 255, 255));
        PassVar.setBorder(null);
        PassVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassVarActionPerformed(evt);
            }
        });
        background.add(PassVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 260, 40));

        titleUser1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        titleUser1.setForeground(new java.awt.Color(255, 255, 255));
        titleUser1.setText("USUARIO:");
        background.add(titleUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("INICIAR SESION");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 150, 40));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        exittext.setBackground(new java.awt.Color(255, 255, 255));
        exittext.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exittext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittext.setText("X");
        exittext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exittextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exittextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exittextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittext, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exittext, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 842, Short.MAX_VALUE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 30));

        logoPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\padlock2.png")); // NOI18N
        logoPass.setPreferredSize(new java.awt.Dimension(40, 40));
        background.add(logoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 30, 40));

        logoUser1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\user.png")); // NOI18N
        logoUser1.setPreferredSize(new java.awt.Dimension(40, 40));
        background.add(logoUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barMouseDragged

    private void exittextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittextMouseExited
        exitbtn.setBackground(Color.white);
        exittext.setForeground(Color.black);
    }//GEN-LAST:event_exittextMouseExited

    private void exittextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittextMouseEntered
        exitbtn.setBackground(Color.red);
        exittext.setForeground(Color.white);
    }//GEN-LAST:event_exittextMouseEntered

    private void exittextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exittextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exittextMouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String pass = "01PasswordPrueba", user = "Admin-01";
        String usertxt = UserVar.getText();
        String passtxt = String.valueOf(PassVar.getPassword());
        if(pass.equals(passtxt) && user.equals(usertxt)){
            JOptionPane.showMessageDialog(rootPane, "Los Datos Son Correctos");
            Lobby lob = new Lobby();
            lob.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Los Datos Son Incorrectos");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void PassVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassVarActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassVar;
    private javax.swing.JTextField UserVar;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel exittext;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoPass;
    private javax.swing.JLabel logoUser1;
    private javax.swing.JLabel titleIniciarSesion;
    private javax.swing.JLabel titlePass;
    private javax.swing.JLabel titleUser1;
    // End of variables declaration//GEN-END:variables
}
