
package com.mycompany.conexionc;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
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

public class SolicitudProveedor extends javax.swing.JPanel {
    
    int cantidad = 0;
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;    
    
    public SolicitudProveedor() {
        initComponents();
        CargarSelectProveedor();
        CargarSelectProducto();
        cargarProveedores();
        AutoCompleteDecorator.decorate(BoxProducto);
        AutoCompleteDecorator.decorate(BoxProveedor);
    }

    public void cargarProveedores() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.solicitud");
       

        model = (DefaultTableModel) jTable1.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("id"), r.getString("nombre"), r.getString("cantidad"),
                    r.getString("proveedor")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void CargarSelectProveedor(){
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.proveedores");
        try {
            while(r.next()){
               BoxProveedor.addItem(r.getString("nombre").trim());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CargarSelectProducto(){
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.productos");
        try {
            while(r.next()){
               BoxProducto.addItem(r.getString("nombre").trim());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void añadirProveedor(){
        Coneccion c = new Coneccion();
        String consulta = "INSERT INTO solicitud(\n"
        + "id, nombre, cantidad, proveedor)\n"
        + "VALUES('" + TxtID.getText() + "','" + BoxProducto.getSelectedItem().toString() + "','" + TxtCantidad.getText() + "','" +
                BoxProveedor.getSelectedItem().toString()+"');";
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAggPedido = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        BoxProveedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BoxProducto = new javax.swing.JComboBox<>();
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
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, 40));

        TxtID.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TxtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 40));

        labelBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        labelBuscar.setText("BUSCAR PROVEEDOR:");
        Background.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("PRODUCTO:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE DEL PRODUCTO", "CANTIDAD", "PROVEEDOR"
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
            jTable1.getColumnModel().getColumn(2).setMinWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 660, 240));

        btnAggPedido.setBackground(new java.awt.Color(204, 255, 255));
        btnAggPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggPedido.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\agregar.png")); // NOI18N
        btnAggPedido.setText("AGREGAR SOLICITUD");
        btnAggPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAggPedidoMousePressed(evt);
            }
        });
        Background.add(btnAggPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 210, 40));

        btnEliminarPedido.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarPedido.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\eliminar.png")); // NOI18N
        btnEliminarPedido.setText("ELIMINAR SOLICITUD");
        btnEliminarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarPedidoMousePressed(evt);
            }
        });
        Background.add(btnEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 40));

        btnModificar.setBackground(new java.awt.Color(204, 255, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\editar2.png")); // NOI18N
        btnModificar.setText("MODIFICAR SOLICITUD");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        Background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 210, 40));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        Background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 300, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("CANTIDAD:");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TxtCantidad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 60, 40));

        BoxProveedor.setEditable(true);
        BoxProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoxProveedor.setAutoscrolls(true);
        Background.add(BoxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("PROVEEDOR:");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        BoxProducto.setEditable(true);
        BoxProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoxProducto.setAutoscrolls(true);
        Background.add(BoxProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 330, 40));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 730, 20));

        body.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String dataBuscar = txtBuscar.getText();
        buscar(dataBuscar);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAggPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggPedidoMousePressed
        añadirProveedor();
    }//GEN-LAST:event_btnAggPedidoMousePressed

    private void btnEliminarPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPedidoMousePressed
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
    
    }//GEN-LAST:event_btnEliminarPedidoMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    /*    model = (DefaultTableModel) jTable1.getModel();
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
        TxtCantidad.setText(textoDir.trim());
        TxtObservacion.setText(textoObservacion.trim());
        TxtTelefono.setText(textoTelefono.trim());
    */
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        if(TxtID.getText().isEmpty() || BoxProveedor.getSelectedItem().toString().isEmpty() || BoxProducto.getSelectedItem().toString().isEmpty() 
                || TxtCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR AL MODIFICAR","MENSAJE", JOptionPane.ERROR_MESSAGE);
        }else{
            Coneccion c = new Coneccion();
            String consulta = "UPDATE solicitud SET ID='"+TxtID.getText()+"'"+",NOMBRE='"+BoxProducto.getSelectedItem().toString()+"'"+
                    ",CANTIDAD='"+TxtCantidad.getText()+"'"+",PROVEEDOR='"+BoxProveedor.getSelectedItem().toString()+"'"
                    +"WHERE ID ='"+TxtID.getText()+"'";
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JComboBox<String> BoxProducto;
    private javax.swing.JComboBox<String> BoxProveedor;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtID;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAggPedido;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
