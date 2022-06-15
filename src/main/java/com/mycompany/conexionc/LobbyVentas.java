package com.mycompany.conexionc;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class LobbyVentas extends javax.swing.JFrame {
    

   
    public LobbyVentas() {
        initComponents();
        
        verVentas rt = new verVentas();
        rt.setSize(820, 610);
        rt.setLocation(0,0);
        
        content.removeAll();
        content.add(rt, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barside = new javax.swing.JPanel();
        BtnVerVentas = new javax.swing.JPanel();
        TxtInventario = new javax.swing.JLabel();
        logoVerVentas = new javax.swing.JLabel();
        BtnLimpiarTabla = new javax.swing.JPanel();
        TxtAggProducto1 = new javax.swing.JLabel();
        logoTabla = new javax.swing.JLabel();
        BtnArticulosVendidos = new javax.swing.JPanel();
        TxtEliminarProducto1 = new javax.swing.JLabel();
        logoVendido = new javax.swing.JLabel();
        BtnModificarProducto = new javax.swing.JPanel();
        TxtModificarProducto = new javax.swing.JLabel();
        logoReturn = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barside.setBackground(new java.awt.Color(0, 153, 153));
        barside.setPreferredSize(new java.awt.Dimension(220, 400));
        barside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVerVentas.setBackground(new java.awt.Color(0, 102, 102));
        BtnVerVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVerVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVerVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVerVentasMousePressed(evt);
            }
        });
        BtnVerVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtInventario.setForeground(new java.awt.Color(255, 255, 255));
        TxtInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtInventario.setText("VER VENTAS");
        BtnVerVentas.add(TxtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 38));

        logoVerVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\ver.png")); // NOI18N
        logoVerVentas.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnVerVentas.add(logoVerVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnVerVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 60));

        BtnLimpiarTabla.setBackground(new java.awt.Color(0, 124, 130));
        BtnLimpiarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpiarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLimpiarTablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLimpiarTablaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnLimpiarTablaMousePressed(evt);
            }
        });
        BtnLimpiarTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtAggProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtAggProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtAggProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtAggProducto1.setText("LIMPIAR TABLA");
        BtnLimpiarTabla.add(TxtAggProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 38));

        logoTabla.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\eliminarTabla.png")); // NOI18N
        logoTabla.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnLimpiarTabla.add(logoTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnLimpiarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, 60));

        BtnArticulosVendidos.setBackground(new java.awt.Color(0, 124, 130));
        BtnArticulosVendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnArticulosVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnArticulosVendidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnArticulosVendidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnArticulosVendidosMousePressed(evt);
            }
        });
        BtnArticulosVendidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtEliminarProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtEliminarProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtEliminarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtEliminarProducto1.setText("ARTICULOS VENDIDOS");
        BtnArticulosVendidos.add(TxtEliminarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 38));

        logoVendido.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\bolsacompra.png")); // NOI18N
        logoVendido.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnArticulosVendidos.add(logoVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnArticulosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 220, 60));

        BtnModificarProducto.setBackground(new java.awt.Color(0, 124, 130));
        BtnModificarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModificarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnModificarProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnModificarProductoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnModificarProductoMousePressed(evt);
            }
        });

        TxtModificarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto.setText("REGRESAR");

        logoReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\return.png")); // NOI18N
        logoReturn.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnModificarProductoLayout = new javax.swing.GroupLayout(BtnModificarProducto);
        BtnModificarProducto.setLayout(BtnModificarProductoLayout);
        BtnModificarProductoLayout.setHorizontalGroup(
            BtnModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnModificarProductoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtModificarProducto)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        BtnModificarProductoLayout.setVerticalGroup(
            BtnModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnModificarProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 60));

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

    private void BtnVerVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVerVentasMousePressed
        
        setColor(BtnVerVentas);
        resetColor(BtnLimpiarTabla);
        resetColor(BtnArticulosVendidos);
        resetColor(BtnModificarProducto);
        
        verVentas rt = new verVentas();
        rt.setSize(820, 610);
        rt.setLocation(0,0);
        
        content.removeAll();
        content.add(rt, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BtnVerVentasMousePressed

    private void BtnVerVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVerVentasMouseExited
        if(BtnLimpiarTabla.getBackground().getRGB() != -16745342 || BtnVerVentas.getBackground().getRGB() != -16745342
            || BtnModificarProducto.getBackground().getRGB() != -16745342 || BtnArticulosVendidos.getBackground().getRGB() != -16745342)
            resetColor(BtnVerVentas);
    }//GEN-LAST:event_BtnVerVentasMouseExited

    private void BtnVerVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVerVentasMouseEntered
        if(BtnVerVentas.getBackground().getRGB() == -16745342)
        setColor(BtnVerVentas);
    }//GEN-LAST:event_BtnVerVentasMouseEntered

    private void BtnLimpiarTablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarTablaMousePressed
        //en esta seccion volvemos a cargar la pagina papra que qeude limpia 
        setColor(BtnVerVentas);
        resetColor(BtnLimpiarTabla);
        resetColor(BtnArticulosVendidos);
        resetColor(BtnModificarProducto);
        
        verVentas rt = new verVentas();
        rt.setSize(820, 610);
        rt.setLocation(0,0);
        
        content.removeAll();
        content.add(rt, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BtnLimpiarTablaMousePressed

    private void BtnLimpiarTablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarTablaMouseEntered
        if(BtnLimpiarTabla.getBackground().getRGB() == -16745342)
        setColor(BtnLimpiarTabla);
    }//GEN-LAST:event_BtnLimpiarTablaMouseEntered

    private void BtnLimpiarTablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarTablaMouseExited
        if(BtnLimpiarTabla.getBackground().getRGB() != -16745342 || BtnVerVentas.getBackground().getRGB() != -16745342
            || BtnModificarProducto.getBackground().getRGB() != -16745342 || BtnArticulosVendidos.getBackground().getRGB() != -16745342)
            resetColor(BtnLimpiarTabla);
    }//GEN-LAST:event_BtnLimpiarTablaMouseExited

    private void BtnModificarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarProductoMousePressed
        setColor(BtnModificarProducto);
        resetColor(BtnLimpiarTabla);
        resetColor(BtnArticulosVendidos);
        resetColor(BtnModificarProducto);
        
        Lobby lob = new Lobby();
        lob.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BtnModificarProductoMousePressed

    private void BtnModificarProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarProductoMouseExited
        if(BtnLimpiarTabla.getBackground().getRGB() != -16745342 || BtnVerVentas.getBackground().getRGB() != -16745342
            || BtnModificarProducto.getBackground().getRGB() != -16745342 || BtnArticulosVendidos.getBackground().getRGB() != -16745342)
        resetColor(BtnModificarProducto);
    }//GEN-LAST:event_BtnModificarProductoMouseExited

    private void BtnModificarProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnModificarProductoMouseEntered
        if(BtnModificarProducto.getBackground().getRGB() == -16745342)
        setColor(BtnModificarProducto);
    }//GEN-LAST:event_BtnModificarProductoMouseEntered

    private void BtnArticulosVendidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArticulosVendidosMousePressed
        ArticulosVendidos po = new ArticulosVendidos();
        po.setSize(820, 610);
        po.setLocation(0,0);
        
        content.removeAll();
        content.add(po, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BtnArticulosVendidosMousePressed

    private void BtnArticulosVendidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArticulosVendidosMouseExited
        if(BtnLimpiarTabla.getBackground().getRGB() != -16745342 || BtnVerVentas.getBackground().getRGB() != -16745342
            || BtnModificarProducto.getBackground().getRGB() != -16745342 || BtnArticulosVendidos.getBackground().getRGB() != -16745342)
        resetColor(BtnArticulosVendidos);
    }//GEN-LAST:event_BtnArticulosVendidosMouseExited

    private void BtnArticulosVendidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnArticulosVendidosMouseEntered
        if(BtnArticulosVendidos.getBackground().getRGB() == -16745342)
        setColor(BtnArticulosVendidos);
    }//GEN-LAST:event_BtnArticulosVendidosMouseEntered

    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0,102,102));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0,124,130));
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LobbyVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnArticulosVendidos;
    private javax.swing.JPanel BtnLimpiarTabla;
    private javax.swing.JPanel BtnModificarProducto;
    private javax.swing.JPanel BtnVerVentas;
    private javax.swing.JLabel TxtAggProducto1;
    private javax.swing.JLabel TxtEliminarProducto1;
    private javax.swing.JLabel TxtInventario;
    private javax.swing.JLabel TxtModificarProducto;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barside;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel logoReturn;
    private javax.swing.JLabel logoTabla;
    private javax.swing.JLabel logoVendido;
    private javax.swing.JLabel logoVerVentas;
    // End of variables declaration//GEN-END:variables
}
