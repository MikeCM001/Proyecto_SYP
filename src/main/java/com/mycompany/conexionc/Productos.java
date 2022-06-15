package com.mycompany.conexionc;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import static com.mycompany.conexionc.LobbyInventario.content;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.FileNotFoundException;
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

public class Productos extends javax.swing.JPanel {

    int cantidad = 0;
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    public Productos() {
        initComponents();
        cargarProductos();
    }

    public void cargarProductos() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.productos");

        model = (DefaultTableModel) jTable1.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("id"), r.getString("nombre"), r.getString("precio"),
                    r.getString("cantidad")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void añadirProducto() {
        Coneccion c = new Coneccion();
        String consulta = "INSERT INTO productos(\n"
                + "id, nombre, precio, cantidad)\n"
                + "VALUES('" + TxtID.getText() + "','" + TxtNameProduct.getText() + "','" + TxtPrice.getText() + "','" + TxtCantidad.getText()
                + "');";
        int respuesta = c.accionesEdit(consulta);
        System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null, "INSERTADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            cargarProductos();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscar(String str) {
        model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    String path, datee;
    public void generarPDF() throws FileNotFoundException {
        datee = String.valueOf(java.time.LocalDate.now());
        path = "Inventario.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        float threecol = 190f; //COLUMNAS DE LA TABLA
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};
        float threeColumnWidth[] = {threecol, threecol, threecol, threecol};
        float FullWidth[] = {threecol * 4};

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell().add("SERPROCOMP").setFontSize(21f).setBorder(Border.NO_BORDER).setBold());
        Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedtable.addCell(new Cell().add("PRODUCTOS: ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("EN INVENTARIO.").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(com.itextpdf.kernel.color.Color.BLACK, 2.6f);

        threeColTable1.addCell(new Cell().add("ID").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("NOMBRE DEL PRODUCTO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("PRECIO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("CANTIDAD").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        document.add(threeColTable1);

        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(com.itextpdf.kernel.color.Color.LIGHT_GRAY, 0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
            Coneccion c = new Coneccion();
            ResultSet r = c.consultar("SELECT * FROM public.productos");

            while (r.next()) {
                tablaDatos.addCell(r.getString(1));
                tablaDatos.addCell(r.getString(2));
                tablaDatos.addCell(r.getString(3));
                tablaDatos.addCell(r.getString(4));
            }
            document.add(tablaDatos);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        document.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        labelBuscar = new javax.swing.JLabel();
        TxtNameProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtPrice = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAggProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnEliminarProduc = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        BtnPrint = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setMaximumSize(new java.awt.Dimension(820, 610));
        body.setMinimumSize(new java.awt.Dimension(820, 610));
        body.setName(""); // NOI18N
        body.setPreferredSize(new java.awt.Dimension(820, 610));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        body.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 300, 40));

        Background.setMinimumSize(new java.awt.Dimension(710, 610));
        Background.setPreferredSize(new java.awt.Dimension(710, 610));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        TxtID.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        TxtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 50));

        labelBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        labelBuscar.setText("BUSCAR PRODUCTO:");
        Background.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        TxtNameProduct.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtNameProduct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 360, 50));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("PRECIO:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("CANTIDAD:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        TxtPrice.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 80, 50));

        TxtCantidad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Background.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 90, 50));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE DEL PRODUCTO", "PRECIO", "CANTIDAD"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(70);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 630, 250));

        btnAggProducto.setBackground(new java.awt.Color(204, 255, 255));
        btnAggProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAggProducto.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\agregar.png")); // NOI18N
        btnAggProducto.setText("AGREGAR PRODUCTO");
        btnAggProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAggProductoMousePressed(evt);
            }
        });
        Background.add(btnAggProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("NOMBRE DEL PRODUCTO:");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        btnEliminarProduc.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminarProduc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProduc.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\eliminar.png")); // NOI18N
        btnEliminarProduc.setText("ELIMINAR PRODUCTO");
        btnEliminarProduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEliminarProducMousePressed(evt);
            }
        });
        Background.add(btnEliminarProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, 40));

        btnModificar.setBackground(new java.awt.Color(204, 255, 255));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\editar2.png")); // NOI18N
        btnModificar.setText("MODIFICAR PRODUCTO");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnModificarMousePressed(evt);
            }
        });
        Background.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 220, 40));

        BtnPrint.setBackground(new java.awt.Color(204, 255, 255));
        BtnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        BtnPrint.setText("IMPRIMIR INVENTARIO");
        BtnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPrintMousePressed(evt);
            }
        });
        BtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrintActionPerformed(evt);
            }
        });
        Background.add(BtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 210, 30));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 800, 20));

        body.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String dataBuscar = txtBuscar.getText();
        buscar(dataBuscar);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAggProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggProductoMousePressed
        añadirProducto();
    }//GEN-LAST:event_btnAggProductoMousePressed

    private void btnEliminarProducMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProducMousePressed
        Coneccion c = new Coneccion();
        String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR ");
        String consulta = "DELETE from productos WHERE nombre='" + nombre + "'";
        int respuesta = c.accionesEdit(consulta);
        //System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            cargarProductos();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EL PRODUCTO!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarProducMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        int Myindex = jTable1.getSelectedRow();

        String textoID = model.getValueAt(Myindex, 0).toString();
        String textoNameProduc = model.getValueAt(Myindex, 1).toString();
        String textoPrice = model.getValueAt(Myindex, 2).toString();
        String textoCantidad = model.getValueAt(Myindex, 3).toString();

        TxtID.setText(textoID.trim());
        TxtNameProduct.setText(textoNameProduc.trim());
        TxtCantidad.setText(textoCantidad.trim());
        TxtPrice.setText(textoPrice.trim());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMousePressed
        if (TxtID.getText().isEmpty() || TxtNameProduct.getText().isEmpty() || TxtCantidad.getText().isEmpty() || TxtPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        } else {
            Coneccion c = new Coneccion();
            String consulta = "UPDATE productos SET ID='" + TxtID.getText() + "'" + ",NOMBRE='" + TxtNameProduct.getText() + "'"
                    + ",PRECIO='" + TxtPrice.getText() + "'" + ",CANTIDAD='" + TxtCantidad.getText() + "'" + "WHERE ID ='" + TxtID.getText() + "'";
            int respuesta = c.accionesEdit(consulta);
            System.out.println(respuesta);
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                cargarProductos();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL MODIFCAR!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarMousePressed

    private void BtnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintMousePressed
        /*    MessageFormat cabecera = new MessageFormat("INVENTARIO DE PRODUCTOS");
        MessageFormat pie = new MessageFormat("PAGINA");
        try{
            jTable1.print(JTable.PrintMode.NORMAL,cabecera,pie);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         */
    }//GEN-LAST:event_BtnPrintMousePressed

    private void BtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrintActionPerformed
        try {
            generarPDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnPrint;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNameProduct;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAggProducto;
    private javax.swing.JButton btnEliminarProduc;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
