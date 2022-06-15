package com.mycompany.conexionc;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LobbyInventario extends javax.swing.JFrame {

   
    public LobbyInventario() {
        initComponents();
        
        Productos p1 = new Productos();
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
        BtnInventario = new javax.swing.JPanel();
        TxtInventario = new javax.swing.JLabel();
        logoProducto = new javax.swing.JLabel();
        BtnCarrito = new javax.swing.JPanel();
        TxtAggProducto1 = new javax.swing.JLabel();
        logoCarrito = new javax.swing.JLabel();
        BtnEliminarProducto = new javax.swing.JPanel();
        TxtEliminarProducto1 = new javax.swing.JLabel();
        logoNoExiste1 = new javax.swing.JLabel();
        BtnReturn = new javax.swing.JPanel();
        TxtModificarProducto = new javax.swing.JLabel();
        logoReturn = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barside.setBackground(new java.awt.Color(0, 153, 153));
        barside.setPreferredSize(new java.awt.Dimension(220, 400));
        barside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnInventario.setBackground(new java.awt.Color(0, 102, 102));
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnInventarioMousePressed(evt);
            }
        });
        BtnInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtInventario.setForeground(new java.awt.Color(255, 255, 255));
        TxtInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtInventario.setText("GESTION PRODUCTO");
        BtnInventario.add(TxtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 38));

        logoProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\inventory.png")); // NOI18N
        logoProducto.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnInventario.add(logoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 60));

        BtnCarrito.setBackground(new java.awt.Color(0, 124, 130));
        BtnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCarritoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnCarritoMousePressed(evt);
            }
        });
        BtnCarrito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtAggProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtAggProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtAggProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtAggProducto1.setText("CARRITO");
        BtnCarrito.add(TxtAggProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, 38));

        logoCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\shopping-cart.png")); // NOI18N
        logoCarrito.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnCarrito.add(logoCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 60));

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
        TxtEliminarProducto1.setText("SIN EXISTENCIA");
        BtnEliminarProducto.add(TxtEliminarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 38));

        logoNoExiste1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\noexistencias.png")); // NOI18N
        logoNoExiste1.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnEliminarProducto.add(logoNoExiste1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

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
        TxtModificarProducto.setText("REGRESAR ");

        logoReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\return.png")); // NOI18N
        logoReturn.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnReturnLayout = new javax.swing.GroupLayout(BtnReturn);
        BtnReturn.setLayout(BtnReturnLayout);
        BtnReturnLayout.setHorizontalGroup(
            BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnReturnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtModificarProducto)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        BtnReturnLayout.setVerticalGroup(
            BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnReturnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BtnInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMousePressed
        setColor(BtnInventario);
        resetColor(BtnCarrito);
        resetColor(BtnEliminarProducto);
        resetColor(BtnReturn);
        
        Productos p1 = new Productos();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BtnInventarioMousePressed

    private void BtnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseExited
        if(BtnCarrito.getBackground().getRGB() != -16745342 || BtnInventario.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnInventario);
    }//GEN-LAST:event_BtnInventarioMouseExited

    private void BtnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseEntered
        if(BtnInventario.getBackground().getRGB() == -16745342)
        setColor(BtnInventario);
    }//GEN-LAST:event_BtnInventarioMouseEntered

    private void BtnCarritoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCarritoMousePressed
        setColor(BtnCarrito);
        resetColor(BtnCarrito);
        resetColor(BtnEliminarProducto);
        resetColor(BtnReturn);
       
        Carrito p1 = new Carrito();
        p1.setSize(820, 610);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BtnCarritoMousePressed

    private void BtnCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCarritoMouseEntered
        if(BtnCarrito.getBackground().getRGB() == -16745342)
        setColor(BtnCarrito);
    }//GEN-LAST:event_BtnCarritoMouseEntered

    private void BtnCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCarritoMouseExited
        if(BtnCarrito.getBackground().getRGB() != -16745342 || BtnInventario.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnCarrito);
    }//GEN-LAST:event_BtnCarritoMouseExited

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
        if(BtnCarrito.getBackground().getRGB() != -16745342 || BtnInventario.getBackground().getRGB() != -16745342
            || BtnReturn.getBackground().getRGB() != -16745342 || BtnEliminarProducto.getBackground().getRGB() != -16745342)
            resetColor(BtnEliminarProducto);
    }//GEN-LAST:event_BtnEliminarProductoMouseExited

    private void BtnReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnReturnMousePressed
        setColor(BtnReturn);
        resetColor(BtnCarrito);
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
        if(BtnCarrito.getBackground().getRGB() != -16745342 || BtnInventario.getBackground().getRGB() != -16745342
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
                new LobbyInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnCarrito;
    private javax.swing.JPanel BtnEliminarProducto;
    private javax.swing.JPanel BtnInventario;
    private javax.swing.JPanel BtnReturn;
    private javax.swing.JLabel TxtAggProducto1;
    private javax.swing.JLabel TxtEliminarProducto1;
    private javax.swing.JLabel TxtInventario;
    private javax.swing.JLabel TxtModificarProducto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barside;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel logoCarrito;
    private javax.swing.JLabel logoNoExiste1;
    private javax.swing.JLabel logoProducto;
    private javax.swing.JLabel logoReturn;
    // End of variables declaration//GEN-END:variables
}
