package com.mycompany.conexionc;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LobbyProveedores extends javax.swing.JFrame {

    public LobbyProveedores() {
        initComponents();
        
        Proveedores p1 = new Proveedores();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barside = new javax.swing.JPanel();
        BtnProveedores = new javax.swing.JPanel();
        TxtInventario = new javax.swing.JLabel();
        logoProveedor = new javax.swing.JLabel();
        BtnPedido = new javax.swing.JPanel();
        TxtAggProducto1 = new javax.swing.JLabel();
        logoSolicitud1 = new javax.swing.JLabel();
        BtnEliminarProducto = new javax.swing.JPanel();
        TxtEliminarProducto1 = new javax.swing.JLabel();
        BtnReturn = new javax.swing.JPanel();
        TxtModificarProducto = new javax.swing.JLabel();
        logoReturn1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROVEEDORES");

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barside.setBackground(new java.awt.Color(0, 153, 153));
        barside.setPreferredSize(new java.awt.Dimension(220, 400));
        barside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnProveedores.setBackground(new java.awt.Color(0, 102, 102));
        BtnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnProveedoresMousePressed(evt);
            }
        });
        BtnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtInventario.setForeground(new java.awt.Color(255, 255, 255));
        TxtInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtInventario.setText("PROVEEDORES");
        BtnProveedores.add(TxtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 38));

        logoProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\proveedor.png")); // NOI18N
        logoProveedor.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnProveedores.add(logoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        barside.add(BtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 60));

        BtnPedido.setBackground(new java.awt.Color(0, 124, 130));
        BtnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPedidoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPedidoMousePressed(evt);
            }
        });
        BtnPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtAggProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtAggProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtAggProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtAggProducto1.setText("SOLICITUDES");
        BtnPedido.add(TxtAggProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 38));

        logoSolicitud1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\solicitud.png")); // NOI18N
        logoSolicitud1.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnPedido.add(logoSolicitud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        barside.add(BtnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 60));

        BtnEliminarProducto.setBackground(new java.awt.Color(0, 124, 130));
        BtnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEliminarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarProductoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnEliminarProductoMousePressed(evt);
            }
        });
        BtnEliminarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtEliminarProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtEliminarProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtEliminarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtEliminarProducto1.setText("FUNCION3");
        BtnEliminarProducto.add(TxtEliminarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 38));

        barside.add(BtnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 60));

        BtnReturn.setBackground(new java.awt.Color(0, 124, 130));
        BtnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnReturnMousePressed(evt);
            }
        });

        TxtModificarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto.setText("REGRESAR");

        logoReturn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\return.png")); // NOI18N
        logoReturn1.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnReturnLayout = new javax.swing.GroupLayout(BtnReturn);
        BtnReturn.setLayout(BtnReturnLayout);
        BtnReturnLayout.setHorizontalGroup(
            BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnReturnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        BtnReturnLayout.setVerticalGroup(
            BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 60));

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

    private void BtnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMousePressed
        
        setColor(BtnProveedores);
        resetColor(BtnPedido);
        resetColor(BtnEliminarProducto);
        resetColor(BtnReturn);
        
        Proveedores p1 = new Proveedores();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BtnProveedoresMousePressed

    private void BtnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseExited
        if(BtnPedido.getBackground().getRGB() != -16745342 || BtnProveedores.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnProveedores);
    }//GEN-LAST:event_BtnProveedoresMouseExited

    private void BtnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseEntered
        if(BtnProveedores.getBackground().getRGB() == -16745342)
        setColor(BtnProveedores);
    }//GEN-LAST:event_BtnProveedoresMouseEntered

    private void BtnPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPedidoMousePressed
        setColor(BtnPedido);
        resetColor(BtnPedido);
        resetColor(BtnEliminarProducto);
        resetColor(BtnReturn);
       
        SolicitudProveedor p1 = new SolicitudProveedor();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BtnPedidoMousePressed

    private void BtnPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPedidoMouseEntered
        if(BtnPedido.getBackground().getRGB() == -16745342)
        setColor(BtnPedido);
    }//GEN-LAST:event_BtnPedidoMouseEntered

    private void BtnPedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPedidoMouseExited
        if(BtnPedido.getBackground().getRGB() != -16745342 || BtnProveedores.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnPedido);
    }//GEN-LAST:event_BtnPedidoMouseExited

    private void BtnEliminarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarProductoMousePressed
        ProductNoExist p1 = new ProductNoExist();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();      
    }//GEN-LAST:event_BtnEliminarProductoMousePressed

    private void BtnEliminarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarProductoMouseEntered
        if(BtnEliminarProducto.getBackground().getRGB() == -16745342)
        setColor(BtnEliminarProducto);
    }//GEN-LAST:event_BtnEliminarProductoMouseEntered

    private void BtnEliminarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarProductoMouseExited
        if(BtnPedido.getBackground().getRGB() != -16745342 || BtnProveedores.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnEliminarProducto);
    }//GEN-LAST:event_BtnEliminarProductoMouseExited

    private void BtnReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReturnMousePressed
        setColor(BtnReturn);
        resetColor(BtnPedido);
        resetColor(BtnEliminarProducto);
        resetColor(BtnReturn);
        
        Lobby lob = new Lobby();
        lob.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_BtnReturnMousePressed

    private void BtnReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReturnMouseEntered
        if(BtnReturn.getBackground().getRGB() == -16745342)
        setColor(BtnReturn);
    }//GEN-LAST:event_BtnReturnMouseEntered

    private void BtnReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReturnMouseExited
        if(BtnPedido.getBackground().getRGB() != -16745342 || BtnProveedores.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnReturn);
    }//GEN-LAST:event_BtnReturnMouseExited

    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,102,102));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,124,130));
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LobbyProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnEliminarProducto;
    private javax.swing.JPanel BtnPedido;
    private javax.swing.JPanel BtnProveedores;
    private javax.swing.JPanel BtnReturn;
    private javax.swing.JLabel TxtAggProducto1;
    private javax.swing.JLabel TxtEliminarProducto1;
    private javax.swing.JLabel TxtInventario;
    private javax.swing.JLabel TxtModificarProducto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barside;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel logoProveedor;
    private javax.swing.JLabel logoReturn1;
    private javax.swing.JLabel logoSolicitud1;
    // End of variables declaration//GEN-END:variables
}
