
package com.mycompany.conexionc;

import static com.mycompany.conexionc.LobbyInventario.content;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Proveedores extends javax.swing.JPanel {
    
    int cantidad = 0;
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;    
    
    public Proveedores() {
        initComponents();
        cargarProveedores();
    }

    public void cargarProveedores() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.proveedores");
       

        model = (DefaultTableModel) jTable1.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("id"), r.getString("nombre"), r.getString("direccion"),
                    r.getString("correo"),r.getString("tipo"),r.getString("telefono"),r.getString("observacion")});
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void añadirProveedor(){
        Coneccion c = new Coneccion();
        String consulta = "INSERT INTO proveedores(\n"
        + "id, nombre, direccion, correo, tipo, telefono, observacion)\n"
        + "VALUES('" + TxtID.getText() + "','" + TxtNameProveedor.getText() + "','" + TxtDireccion.getText() + "','" + TxtCorreo.getText()
        + "','" + BoxTipo.getSelectedItem().toString() + "','" + TxtTelefono.getText() + "','" + TxtObservacion.getText() + "');";
        int respuesta = c.accionesEdit(consulta);
        System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null,"INSERTADO CORRECTAMENTE!","MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            cargarProveedores();
        } else {
            JOptionPane.showMessageDialog(null,"ERROR AL INSERTAR!","MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void buscar(String str){
        model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        TxtNameProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        TxtObservacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAggProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminarProduc = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        BoxTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setMaximumSize(new java.awt.Dimension(820, 610));
        body.setMinimumSize(new java.awt.Dimension(820, 610));
        body.setName(""); // NOI18N
        body.setPreferredSize(new java.awt.Dimension(820, 610));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setMinimumSize(new java.awt.Dimension(710, 610));
        Background.setPreferredSize(new java.awt.Dimension(710, 610));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 40));

        TxtID.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TxtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 40));

        labelBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        labelBuscar.setText("BUSCAR PROVEEDOR:");
        Background.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        TxtNameProveedor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtNameProveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtNameProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 280, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("TIPO:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("OBSERVACIONES:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        TxtTelefono.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        Background.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 40));

        TxtObservacion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtObservacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 660, 40));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE DEL PROVEEDOR", "DIRECCION", "CORREO ELECTRONICO", "ENTIDAD", "TELEFONO", "OBSERVACIONES"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(80);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 820, 220));

        btnAggProducto.setBackground(new java.awt.Color(204, 255, 255));
        btnAggProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\agregar-usuario.png")); // NOI18N
        btnAggProducto.setText("AGREGAR PROVEEDOR");
        btnAggProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAggProductoMousePressed(evt);
            }
        });
        Background.add(btnAggProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 210, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("NOMBRE DEL PROVEEDOR:");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        btnEliminarProduc.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminarProduc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProduc.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\eliminar.png")); // NOI18N
        btnEliminarProduc.setText("ELIMINAR PROVEEDOR");
        btnEliminarProduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarProducMousePressed(evt);
            }
        });
        btnEliminarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProducActionPerformed(evt);
            }
        });
        Background.add(btnEliminarProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 210, 40));

        btnModificar.setBackground(new java.awt.Color(204, 255, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\editar2.png")); // NOI18N
        btnModificar.setText("MODIFICAR PROVEEDOR");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        Background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 40));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        Background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 300, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("DIRECCION:");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        TxtDireccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 280, 40));

        BoxTipo.setEditable(true);
        BoxTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERSONA", "EMPRESA" }));
        BoxTipo.setAutoscrolls(true);
        Background.add(BoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("TELEFONO:");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setText("CORREO ELECTRONICO:");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        TxtCorreo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 280, 40));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 790, 10));

        body.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String dataBuscar = txtBuscar.getText();
        buscar(dataBuscar);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAggProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggProductoMousePressed
        añadirProveedor();
    }//GEN-LAST:event_btnAggProductoMousePressed

    private void btnEliminarProducMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProducMousePressed
        Coneccion c = new Coneccion();
        String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR ");
        String consulta = "DELETE from proveedores WHERE nombre='"+nombre+"'";
        int respuesta = c.accionesEdit(consulta);
        //System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null,"PRODUCTO ELIMINADO CORRECTAMENTE!","MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            cargarProveedores();
        } else {
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR EL PRODUCTO!","MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnEliminarProducMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        int Myindex = jTable1.getSelectedRow();
        
        String textoID = model.getValueAt(Myindex, 0).toString();
        String textoNamePro = model.getValueAt(Myindex, 1).toString();
        String textoDir = model.getValueAt(Myindex, 2).toString();
        String textoCorreo = model.getValueAt(Myindex, 3).toString();
        String textoTipo = model.getValueAt(Myindex, 4).toString();
        String textoTelefono = model.getValueAt(Myindex, 5).toString();
        String textoObservacion = model.getValueAt(Myindex, 6).toString();
        
        TxtID.setText(textoID.trim());
        TxtNameProveedor.setText(textoNamePro.trim());
        TxtCorreo.setText(textoCorreo.trim());
        TxtDireccion.setText(textoDir.trim());
        TxtObservacion.setText(textoObservacion.trim());
        TxtTelefono.setText(textoTelefono.trim());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        if(TxtID.getText().isEmpty() || TxtNameProveedor.getText().isEmpty() || TxtObservacion.getText().isEmpty() || TxtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR","MENSAJE", JOptionPane.ERROR_MESSAGE);
        }else{
            Coneccion c = new Coneccion();
            String consulta = "UPDATE proveedores SET ID='"+TxtID.getText()+"'"+",NOMBRE='"+TxtNameProveedor.getText()+"'"+
                    ",DIRECCION='"+TxtDireccion.getText()+"'"+",CORREO='"+TxtCorreo.getText()+"'"+",TIPO='"+BoxTipo.getSelectedItem().toString()+"'"
                    +",TELEFONO='"+TxtTelefono.getText()+"'"+",OBSERVACION='"+TxtObservacion.getText()+"'"+"WHERE ID ='"+TxtID.getText()+"'";
            int respuesta = c.accionesEdit(consulta);
            System.out.println(respuesta);
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null,"MODIFICADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                cargarProveedores();
            } else {
                JOptionPane.showMessageDialog(null,"ERROR AL MODIFCAR!","MENSAJE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarMousePressed

    private void btnEliminarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProducActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JComboBox<String> BoxTipo;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNameProveedor;
    private javax.swing.JTextField TxtObservacion;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAggProducto;
    private javax.swing.JButton btnEliminarProduc;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
