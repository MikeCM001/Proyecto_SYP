package com.mycompany.conexionc;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class LobbyClientes extends javax.swing.JFrame {

   
    public LobbyClientes() {
        initComponents();
        
        verClientes xd = new verClientes();
        xd.setSize(820, 610);
        xd.setLocation(0,0);
        
        content.removeAll();
        content.add(xd, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barside = new javax.swing.JPanel();
        BtnCliente = new javax.swing.JPanel();
        TxtInventario = new javax.swing.JLabel();
        logoReturn1 = new javax.swing.JLabel();
        BtnFuncionX = new javax.swing.JPanel();
        TxtModificarProducto = new javax.swing.JLabel();
        logoReturn = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barside.setBackground(new java.awt.Color(0, 153, 153));
        barside.setPreferredSize(new java.awt.Dimension(220, 400));
        barside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCliente.setBackground(new java.awt.Color(0, 102, 102));
        BtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnClienteMousePressed(evt);
            }
        });
        BtnCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtInventario.setForeground(new java.awt.Color(255, 255, 255));
        TxtInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtInventario.setText("VER CLIENTE");
        BtnCliente.add(TxtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 38));

        logoReturn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\proveedor.png")); // NOI18N
        logoReturn1.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnCliente.add(logoReturn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 60));

        BtnFuncionX.setBackground(new java.awt.Color(0, 124, 130));
        BtnFuncionX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFuncionX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFuncionXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFuncionXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFuncionXMousePressed(evt);
            }
        });

        TxtModificarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto.setText("REGRESAR");

        logoReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\return.png")); // NOI18N
        logoReturn.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnFuncionXLayout = new javax.swing.GroupLayout(BtnFuncionX);
        BtnFuncionX.setLayout(BtnFuncionXLayout);
        BtnFuncionXLayout.setHorizontalGroup(
            BtnFuncionXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFuncionXLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtModificarProducto)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        BtnFuncionXLayout.setVerticalGroup(
            BtnFuncionXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnFuncionXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnFuncionXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnFuncionX, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 60));

        background.add(barside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 610));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setAlignmentX(0.0F);
        content.setAlignmentY(0.0F);
        content.setAutoscrolls(true);
        content.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        content.setMaximumSize(new java.awt.Dimension(820, 610));
        content.setMinimumSize(new java.awt.Dimension(820, 610));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 820, 610));

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

    private void BtnClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMousePressed
        setColor(BtnCliente);
        resetColor(BtnFuncionX);
        
        verClientes xd = new verClientes();
        xd.setSize(820, 610);
        xd.setLocation(0,0);
        
        content.removeAll();
        content.add(xd, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BtnClienteMousePressed

    private void BtnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseExited
        if(BtnCliente.getBackground().getRGB() != -16745342 || BtnFuncionX.getBackground().getRGB() != -16745342)
            resetColor(BtnCliente);
    }//GEN-LAST:event_BtnClienteMouseExited

    private void BtnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseEntered
        if(BtnCliente.getBackground().getRGB() == -16745342)
        setColor(BtnCliente);
    }//GEN-LAST:event_BtnClienteMouseEntered

    private void BtnFuncionXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFuncionXMousePressed
        setColor(BtnFuncionX);
        resetColor(BtnFuncionX);
        
        Lobby lob = new Lobby();
        lob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnFuncionXMousePressed

    private void BtnFuncionXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFuncionXMouseEntered
        if(BtnFuncionX.getBackground().getRGB() == -16745342)
        setColor(BtnFuncionX);
    }//GEN-LAST:event_BtnFuncionXMouseEntered

    private void BtnFuncionXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFuncionXMouseExited
        if( BtnCliente.getBackground().getRGB() != -16745342
            || BtnFuncionX.getBackground().getRGB() != -16745342)
            resetColor(BtnFuncionX);
    }//GEN-LAST:event_BtnFuncionXMouseExited

    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,102,102));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,124,130));
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LobbyClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCliente;
    private javax.swing.JPanel BtnFuncionX;
    private javax.swing.JLabel TxtInventario;
    private javax.swing.JLabel TxtModificarProducto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barside;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel logoReturn;
    private javax.swing.JLabel logoReturn1;
    // End of variables declaration//GEN-END:variables
}
