package com.mycompany.conexionc;


import static com.mycompany.conexionc.LobbyInventario.content;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Lobby extends javax.swing.JFrame {

   
    public Lobby() {
        initComponents();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        barside = new javax.swing.JPanel();
        BtnInventario = new javax.swing.JPanel();
        TxtInventario = new javax.swing.JLabel();
        logoInventario = new javax.swing.JLabel();
        BtnProveedores = new javax.swing.JPanel();
        TxtAggProducto1 = new javax.swing.JLabel();
        logoProveedor = new javax.swing.JLabel();
        BtnGesClientes = new javax.swing.JPanel();
        TxtEliminarProducto = new javax.swing.JLabel();
        logoClient = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JPanel();
        TxtModificarProducto = new javax.swing.JLabel();
        logoExit = new javax.swing.JLabel();
        BtnFactura = new javax.swing.JPanel();
        TxtModificarProducto1 = new javax.swing.JLabel();
        logoExit1 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        TxtModificarProducto2 = new javax.swing.JLabel();
        logoExit2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        logoPrincipal = new javax.swing.JLabel();
        logoPrincipal1 = new javax.swing.JLabel();
        logoPrincipal2 = new javax.swing.JLabel();
        logoPrincipal3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SERPROCOMP");
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barside.setBackground(new java.awt.Color(13, 71, 161));
        barside.setPreferredSize(new java.awt.Dimension(220, 610));
        barside.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnInventario.setBackground(new java.awt.Color(21, 101, 192));
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
        TxtInventario.setText("GESTION INVENTARIO");
        BtnInventario.add(TxtInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 38));

        logoInventario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\inventory.png")); // NOI18N
        logoInventario.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnInventario.add(logoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 60));

        BtnProveedores.setBackground(new java.awt.Color(18, 90, 173));
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

        TxtAggProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtAggProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtAggProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtAggProducto1.setText("GESTION PROVEEDOR");
        BtnProveedores.add(TxtAggProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 38));

        logoProveedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\proveedor.png")); // NOI18N
        logoProveedor.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnProveedores.add(logoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 60));

        BtnGesClientes.setBackground(new java.awt.Color(18, 90, 173));
        BtnGesClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGesClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGesClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGesClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnGesClientesMousePressed(evt);
            }
        });
        BtnGesClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtEliminarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtEliminarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtEliminarProducto.setText("GESTION CLIENTE");
        BtnGesClientes.add(TxtEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 38));

        logoClient.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\client.png")); // NOI18N
        logoClient.setPreferredSize(new java.awt.Dimension(34, 14));
        BtnGesClientes.add(logoClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        barside.add(BtnGesClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 60));

        BtnSalir.setBackground(new java.awt.Color(18, 90, 173));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSalirMousePressed(evt);
            }
        });

        TxtModificarProducto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto.setText("SALIR");

        logoExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\exit.png")); // NOI18N
        logoExit.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSalirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtModificarProducto)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BtnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 220, 60));

        BtnFactura.setBackground(new java.awt.Color(18, 90, 173));
        BtnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFacturaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFacturaMousePressed(evt);
            }
        });

        TxtModificarProducto1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto1.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto1.setText("FACTURAS");

        logoExit1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\solicitud.png")); // NOI18N
        logoExit1.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnFacturaLayout = new javax.swing.GroupLayout(BtnFactura);
        BtnFactura.setLayout(BtnFacturaLayout);
        BtnFacturaLayout.setHorizontalGroup(
            BtnFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnFacturaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoExit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtModificarProducto1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        BtnFacturaLayout.setVerticalGroup(
            BtnFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 60));

        BtnVentas.setBackground(new java.awt.Color(18, 90, 173));
        BtnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVentasMousePressed(evt);
            }
        });

        TxtModificarProducto2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        TxtModificarProducto2.setForeground(new java.awt.Color(255, 255, 255));
        TxtModificarProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtModificarProducto2.setText("VENTAS");

        logoExit2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\bolsa-de-dinero.png")); // NOI18N
        logoExit2.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout BtnVentasLayout = new javax.swing.GroupLayout(BtnVentas);
        BtnVentas.setLayout(BtnVentasLayout);
        BtnVentasLayout.setHorizontalGroup(
            BtnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnVentasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoExit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtModificarProducto2)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        BtnVentasLayout.setVerticalGroup(
            BtnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtModificarProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barside.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 220, 60));

        background.add(barside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 610));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPrincipal.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        logoPrincipal.setForeground(new java.awt.Color(0, 51, 204));
        logoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal.setText("EN COMPUTACION");
        content.add(logoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 350, 120));
        logoPrincipal.getAccessibleContext().setAccessibleName("SERVICIOS PROFESIONALES\n EN COMPUTACION");

        logoPrincipal1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\logo.png")); // NOI18N
        content.add(logoPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 200));

        logoPrincipal2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        logoPrincipal2.setForeground(new java.awt.Color(0, 51, 204));
        logoPrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal2.setText("SERVICIOS");
        content.add(logoPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 250, 120));

        logoPrincipal3.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        logoPrincipal3.setForeground(new java.awt.Color(0, 51, 204));
        logoPrincipal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrincipal3.setText("PROFESIONALES");
        content.add(logoPrincipal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 350, 120));

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

    private void BtnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMousePressed
        setColor(BtnSalir);
        resetColor(BtnProveedores);
        resetColor(BtnGesClientes);
        resetColor(BtnSalir);
        
        System.exit(0);

    }//GEN-LAST:event_BtnSalirMousePressed

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        if(BtnProveedores.getBackground().getRGB() != -15574355 || BtnInventario.getBackground().getRGB() != -15574355
            || BtnSalir.getBackground().getRGB() != -15574355 || BtnGesClientes.getBackground().getRGB() != -15574355)
        resetColor(BtnSalir);
    }//GEN-LAST:event_BtnSalirMouseExited

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        if(BtnSalir.getBackground().getRGB() == -15574355)
        setColor(BtnSalir);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnGesClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGesClientesMousePressed
        setColor(BtnInventario);
        resetColor(BtnProveedores);
        resetColor(BtnGesClientes);
        resetColor(BtnSalir);

        LobbyClientes lob = new LobbyClientes();
        lob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnGesClientesMousePressed

    private void BtnGesClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGesClientesMouseExited
        if(BtnProveedores.getBackground().getRGB() != -15574355 || BtnInventario.getBackground().getRGB() != -15574355
            || BtnSalir.getBackground().getRGB() != -15574355 || BtnGesClientes.getBackground().getRGB() != -15574355)
        resetColor(BtnGesClientes);
    }//GEN-LAST:event_BtnGesClientesMouseExited

    private void BtnGesClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGesClientesMouseEntered
        if(BtnGesClientes.getBackground().getRGB() == -15574355)
        setColor(BtnGesClientes);
    }//GEN-LAST:event_BtnGesClientesMouseEntered

    private void BtnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMousePressed
        setColor(BtnProveedores);
        resetColor(BtnProveedores);
        resetColor(BtnGesClientes);
        resetColor(BtnSalir);

        LobbyProveedores lob = new LobbyProveedores();
        lob.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BtnProveedoresMousePressed

    private void BtnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseExited
        if(BtnProveedores.getBackground().getRGB() != -15574355 || BtnInventario.getBackground().getRGB() != -15574355
            || BtnSalir.getBackground().getRGB() != -15574355 || BtnGesClientes.getBackground().getRGB() != -15574355)
        resetColor(BtnProveedores);
    }//GEN-LAST:event_BtnProveedoresMouseExited

    private void BtnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedoresMouseEntered
        if(BtnProveedores.getBackground().getRGB() == -15574355)
        setColor(BtnProveedores);
    }//GEN-LAST:event_BtnProveedoresMouseEntered

    private void BtnInventarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMousePressed
        setColor(BtnInventario);
        resetColor(BtnProveedores);
        resetColor(BtnGesClientes);
        resetColor(BtnSalir);

        LobbyInventario lob = new LobbyInventario();
        lob.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BtnInventarioMousePressed

    private void BtnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseExited
        if(BtnProveedores.getBackground().getRGB() != -15574355 || BtnInventario.getBackground().getRGB() != -15574355
            || BtnSalir.getBackground().getRGB() != -15574355 || BtnGesClientes.getBackground().getRGB() != -15574355)
        resetColor(BtnInventario);
    }//GEN-LAST:event_BtnInventarioMouseExited

    private void BtnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseEntered
        if(BtnInventario.getBackground().getRGB() == -15574355)
        setColor(BtnInventario);
    }//GEN-LAST:event_BtnInventarioMouseEntered

    private void BtnFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFacturaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFacturaMouseEntered

    private void BtnFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFacturaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFacturaMouseExited

    private void BtnFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFacturaMousePressed
     
        LobbyFactura lob = new LobbyFactura();
        lob.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BtnFacturaMousePressed

    private void BtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVentasMouseEntered

    private void BtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVentasMouseExited

    private void BtnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMousePressed
        LobbyVentas lob = new LobbyVentas();
        lob.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_BtnVentasMousePressed

    
    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnFactura;
    private javax.swing.JPanel BtnGesClientes;
    private javax.swing.JPanel BtnInventario;
    private javax.swing.JPanel BtnProveedores;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JLabel TxtAggProducto1;
    private javax.swing.JLabel TxtEliminarProducto;
    private javax.swing.JLabel TxtInventario;
    private javax.swing.JLabel TxtModificarProducto;
    private javax.swing.JLabel TxtModificarProducto1;
    private javax.swing.JLabel TxtModificarProducto2;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barside;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel logoClient;
    private javax.swing.JLabel logoExit;
    private javax.swing.JLabel logoExit1;
    private javax.swing.JLabel logoExit2;
    private javax.swing.JLabel logoInventario;
    private javax.swing.JLabel logoPrincipal;
    private javax.swing.JLabel logoPrincipal1;
    private javax.swing.JLabel logoPrincipal2;
    private javax.swing.JLabel logoPrincipal3;
    private javax.swing.JLabel logoProveedor;
    // End of variables declaration//GEN-END:variables
}
