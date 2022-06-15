package com.mycompany.conexionc;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.layout.property.TextAlignment;


public class Carrito extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    public Carrito() {
        initComponents();
        cargar();
    }

        ////////////////////////////////////// Variables globales ///////////////////////////////
    int i = 0;
    Double PrecioxUnidad=0.0,PrecioTotal=0.0,MontoTotal=0.0;
    int disponible = 0;
    int cantidadComprada = 0;
    String path, datee;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TxtBuscar = new javax.swing.JTextField();
        btnEliminarProduc = new javax.swing.JButton();
        btnAggCarrito = new javax.swing.JButton();
        TxtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDui = new javax.swing.JTextField();
        Dui = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        Mtotal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCarrito = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TxtNameProduct = new javax.swing.JTextField();
        TxtNameClient = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtTelefono1 = new javax.swing.JTextField();
        Dui1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(710, 610));

        Background.setMinimumSize(new java.awt.Dimension(820, 610));
        Background.setPreferredSize(new java.awt.Dimension(820, 610));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE DEL PRODUCTO", "PRECIO", "CANTIDAD"
            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(2).setMinWidth(75);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(75);
        }

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 640, 140));

        TxtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscarKeyReleased(evt);
            }
        });
        body.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 370, 30));

        btnEliminarProduc.setBackground(new java.awt.Color(204, 255, 255));
        btnEliminarProduc.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\quitcart.png")); // NOI18N
        btnEliminarProduc.setText("QUITAR CARRITO");
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
        body.add(btnEliminarProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, 40));

        btnAggCarrito.setBackground(new java.awt.Color(204, 255, 255));
        btnAggCarrito.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\addcart.png")); // NOI18N
        btnAggCarrito.setText("AGREGAR CARRITO");
        btnAggCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAggCarritoMousePressed(evt);
            }
        });
        btnAggCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAggCarritoActionPerformed(evt);
            }
        });
        body.add(btnAggCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, 40));

        TxtPrice.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("PRECIO:");
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        TxtCantidad.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("CANTIDAD:");
        body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        TxtDui.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtDui.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtDui, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, 40));

        Dui.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Dui.setText("BUSCAR:");
        body.add(Dui, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 70, -1));

        btnPrint.setBackground(new java.awt.Color(204, 255, 255));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        btnPrint.setText("IMPRIMIR Y FINALIZAR COMPRA");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        body.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 290, 40));

        Mtotal.setText("TOTAL : $");
        body.add(Mtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, -1, -1));

        TablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INDICE", "NOMBRE DEL PRODUCTO", "PRECIO", "CANTIDAD", "TOTAL"
            }
        ));
        jScrollPane3.setViewportView(TablaCarrito);
        if (TablaCarrito.getColumnModel().getColumnCount() > 0) {
            TablaCarrito.getColumnModel().getColumn(0).setMinWidth(50);
            TablaCarrito.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaCarrito.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaCarrito.getColumnModel().getColumn(2).setMinWidth(50);
            TablaCarrito.getColumnModel().getColumn(2).setPreferredWidth(50);
            TablaCarrito.getColumnModel().getColumn(2).setMaxWidth(50);
            TablaCarrito.getColumnModel().getColumn(3).setMinWidth(75);
            TablaCarrito.getColumnModel().getColumn(3).setPreferredWidth(75);
            TablaCarrito.getColumnModel().getColumn(3).setMaxWidth(75);
            TablaCarrito.getColumnModel().getColumn(4).setMinWidth(50);
            TablaCarrito.getColumnModel().getColumn(4).setPreferredWidth(50);
            TablaCarrito.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        body.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 760, 130));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("NOMBRE DEL PRODUCTO:");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        TxtNameProduct.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtNameProduct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtNameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 360, 40));

        TxtNameClient.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtNameClient.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtNameClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 320, 40));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("NOMBRE DEL CLIENTE:");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setText("TELEFONO:");
        body.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        TxtTelefono1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TxtTelefono1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(TxtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 140, 40));

        Dui1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Dui1.setText("DUI:");
        body.add(Dui1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        Background.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void cargar() {
        DefaultTableModel model;
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.productos");

        model = (DefaultTableModel) jTable1.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("nombre"), r.getString("precio"),
                    r.getString("cantidad")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarCarrito() {
        DefaultTableModel model;
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.carrito");

        model = (DefaultTableModel) TablaCarrito.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("indice"), r.getString("producto"), r.getString("precio"),
                    r.getString("cantidad"), r.getString("total")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void añadirCarrito() {
        i++;
        Coneccion c = new Coneccion();
        String consulta = "INSERT INTO carrito(\n"
                + "indice, producto, precio, cantidad, total)\n"
                + "VALUES('" + i + "','" + TxtNameProduct.getText() + "','" + TxtPrice.getText() + "','" + TxtCantidad.getText()
                + "','" + PrecioTotal + "');";
        int respuesta = c.accionesEdit(consulta);
        System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null, "AÑADIDO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL AÑADIR!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscar(String str) {
        model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    int nuevaCantidad;int itFact=0;

    public void Update() {
        try {
            Coneccion c = new Coneccion();
            String consulta = "UPDATE productos SET CANTIDAD='" + nuevaCantidad + "'" + "WHERE NOMBRE='" + TxtNameProduct.getText() + "'";
            int respuesta = c.accionesEdit(consulta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void generarPDF() throws FileNotFoundException {
        itFact++;
        datee= String.valueOf(java.time.LocalDate.now());   
        
        path = "Factura"+String.valueOf(itFact)+".pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        float threecol = 190f; //COLUMNAS DE LA TABLA
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};
        float threeColumnWidth[] = {threecol, threecol, threecol};
        float FullWidth[] = {threecol * 3};

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell().add("SERPROCOMP").setFontSize(21f).setBorder(Border.NO_BORDER).setBold());
        Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedtable.addCell(new Cell().add("FACTURA No. ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("SRCMP-"+String.valueOf(itFact)).setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("CLIENTE: ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(TxtNameClient.getText()).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(Color.BLACK, 2.8f);
        
        threeColTable1.addCell(new Cell().add("DESCRIPCION").setBold().setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("CANTIDAD").setBold().setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("PRECIO").setBold().setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        document.add(threeColTable1);
        
        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(Color.GRAY,0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
                Coneccion c = new Coneccion();
                ResultSet r = c.consultar("SELECT * FROM public.carrito");

                while (r.next()) {
                    tablaDatos.addCell(r.getString(2));
                    tablaDatos.addCell(r.getString(4));
                    tablaDatos.addCell(r.getString(3));
                }
             document.add(tablaDatos);
            }catch (Exception e) {
                System.out.println("Error " + e);
            }
        
        document.close();
        guardarPDF();
 }
   
    public void guardarPDF(){
        Coneccion c = new Coneccion();
        String consulta = "INSERT INTO facturas(\n"
                + "correlativo, nombre, fecha, total)\n"
                + "VALUES('" + itFact + "','" + path + "','" + datee + "','" + MontoTotal + "');";
        int respuesta = c.accionesEdit(consulta);
        System.out.println(respuesta);
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null, "AÑADIDO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL AÑADIR!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void TxtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarKeyReleased
        String dataBuscar = TxtBuscar.getText();
        buscar(dataBuscar);
    }//GEN-LAST:event_TxtBuscarKeyReleased

    private void btnEliminarProducMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProducMousePressed
        Coneccion c = new Coneccion();
        String nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL PRODUCTO A ELIMINAR ");
        String consulta = "DELETE from carrito WHERE producto='" + nombre + "'";
        int respuesta = c.accionesEdit(consulta);
        
        if (respuesta > 0) {
            JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel model = (DefaultTableModel) TablaCarrito.getModel();
            model.setRowCount(0);
            cargarCarrito();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR EL PRODUCTO!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarProducMousePressed

    private void btnAggCarritoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAggCarritoMousePressed

        if (TxtNameProduct.getText().isEmpty() || TxtCantidad.getText().isEmpty() || TxtPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR AL AÑADIR", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (disponible < Integer.valueOf(TxtCantidad.getText())) {
            JOptionPane.showMessageDialog(null, "NO EXISTE DICHA CANTIDAD EN STOCK", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            cantidadComprada = ( Integer.parseInt(TxtCantidad.getText()) + (cantidadComprada));
            PrecioTotal = (PrecioxUnidad * Integer.valueOf(TxtCantidad.getText()));
            nuevaCantidad = disponible - Integer.valueOf(TxtCantidad.getText());
            MontoTotal += PrecioTotal;
            añadirCarrito();

            Mtotal.setText("TOTAL: $" + MontoTotal);
            Update();

            DefaultTableModel model = (DefaultTableModel) TablaCarrito.getModel();
            model.setRowCount(0);
            cargarCarrito();

            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
            model1.setRowCount(0);
            cargar();

        }
    }//GEN-LAST:event_btnAggCarritoMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        int Myindex = jTable1.getSelectedRow();

        String textoNameProduc = model.getValueAt(Myindex, 0).toString();
        String textoPrice = model.getValueAt(Myindex, 1).toString();
        String textoCantidad = model.getValueAt(Myindex, 2).toString();

        TxtNameProduct.setText(textoNameProduc.trim());
        TxtCantidad.setText(textoCantidad.trim());
        TxtPrice.setText(textoPrice.trim());

        PrecioxUnidad = Double.valueOf(textoPrice);

        disponible = Integer.valueOf(textoCantidad);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAggCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAggCarritoActionPerformed

    }//GEN-LAST:event_btnAggCarritoActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
         // Seccion para ingresar el nombre y el teléfono a la tabla clientes
        ///////////////////////////////////////////////////////////////////////////////////////////
 
        Coneccion X = new Coneccion();
        String consultaX = "INSERT INTO cliente(\n"
        + "nombre,telefono,dui)\n"
        + "VALUES('" + TxtNameClient.getText() + "','" + TxtTelefono1.getText()+ "','" + TxtDui.getText()
        + "');";
        int resultado = X.accionesEdit(consultaX);
        System.out.println(resultado);
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "CLIENTE INSERTADO CORRECTAMENTE!", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
        
        ///En esta parte se ingresa el rgistro de las ventas a la tabla registroVentas en la base de datos///////////
        //--------------------------------------------------------------------------------------------------//  
        Coneccion Y = new Coneccion();
        String consultaY = "INSERT INTO registroventas(\n"
        + "nombre,telefono,dui,articulos,cantidad,fecha)\n"
        + "VALUES('" + TxtNameClient.getText() + "','" + TxtDui.getText()+ "','" + TxtDui.getText() + "','" + cantidadComprada+"','" + MontoTotal+"',current_date);";
        int resultadoY = Y.accionesEdit(consultaY);
        //System.out.println(resultadoY);
        JOptionPane.showMessageDialog(null, "Los articulos son: "+cantidadComprada+" La cantidad a pagar es: "+MontoTotal, "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        if (resultadoY > 0) {
            JOptionPane.showMessageDialog(null, "VENTA REGISTRADA CON EXITO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR VENTA NO REGISTRADA", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }      
        try {
            generarPDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // En esta seccion se va eliminar lo que haya en la tabla temporal de agrgar al carrito
        /////////////////////////////////////////////////////////////////////////////////////////
        
        Coneccion c = new Coneccion();
        String consulta = "DELETE from carrito";
        int respuesta = c.accionesEdit(consulta);
        System.out.println(respuesta);
        if (respuesta > 0){
            JOptionPane.showMessageDialog(null, "SE HA ELIMINADO LA TABLA CORRECTAMENTE!", "MENSAJE" ,JOptionPane.INFORMATION_MESSAGE);
            
            DefaultTableModel model = (DefaultTableModel)TablaCarrito.getModel();
            model.setRowCount(0);
            cargarCarrito();
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR LA TABLA!", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnEliminarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProducActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Dui;
    private javax.swing.JLabel Dui1;
    private javax.swing.JLabel Mtotal;
    private javax.swing.JTable TablaCarrito;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtDui;
    private javax.swing.JTextField TxtNameClient;
    private javax.swing.JTextField TxtNameProduct;
    private javax.swing.JTextField TxtPrice;
    private javax.swing.JTextField TxtTelefono1;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnAggCarrito;
    private javax.swing.JButton btnEliminarProduc;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
