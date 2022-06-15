package com.mycompany.conexionc;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
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

public class verVentas extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    public verVentas() {
        initComponents();

    }

    String path, datee;

    public void generarPDF() throws FileNotFoundException {
        datee = String.valueOf(java.time.LocalDate.now());
        path = "Clientes_Registrados.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        float threecol = 190f; //COLUMNAS DE LA TABLA
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};
        float threeColumnWidth[] = {threecol, threecol, threecol,threecol, threecol, threecol};
        float FullWidth[] = {threecol * 6};

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell().add("SERPROCOMP").setFontSize(21f).setBorder(Border.NO_BORDER).setBold());
        Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedtable.addCell(new Cell().add("INFORME DE: ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("VENTAS").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(com.itextpdf.kernel.color.Color.BLACK, 2.8f);

        threeColTable1.addCell(new Cell().add("NOMBRE").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("TELEFONO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("DUI").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("NUMERO DE PRODUCTOS").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("CANTIDAD GASTADA").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("FECHA").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));

        document.add(threeColTable1);

        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(com.itextpdf.kernel.color.Color.LIGHT_GRAY, 0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
            Coneccion c = new Coneccion();
            ResultSet r = c.consultar("SELECT * FROM public.registroventas");

            while (r.next()) {
                tablaDatos.addCell(r.getString(1));
                tablaDatos.addCell(r.getString(2));
                tablaDatos.addCell(r.getString(3));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        txtFecha1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha2 = new javax.swing.JTextField();
        btnFiltrarVentas = new javax.swing.JButton();
        btnMostrarRegistroCompleto = new javax.swing.JButton();
        btnImprimirTablaVentas = new javax.swing.JButton();

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        tablaVentas.setBorder(new javax.swing.border.MatteBorder(null));
        tablaVentas.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Telefon", "Dui", "Numero de Productos", "Cantidad Gastada $", "Fecha"
            }
        ));
        tablaVentas.setColumnSelectionAllowed(true);
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);
        tablaVentas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFecha1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO DE VENTAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese la fecha 2 con el Formato Año, mes, dia.  EJ: 2022-06-10");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese la fecha 1 con el Formato Año, mes, dia. EJ: 2022-05-10");

        btnFiltrarVentas.setBackground(new java.awt.Color(204, 255, 255));
        btnFiltrarVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFiltrarVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\filtrar.png")); // NOI18N
        btnFiltrarVentas.setText("Filtrar");
        btnFiltrarVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFiltrarVentasMousePressed(evt);
            }
        });
        btnFiltrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarVentasActionPerformed(evt);
            }
        });

        btnMostrarRegistroCompleto.setBackground(new java.awt.Color(204, 255, 255));
        btnMostrarRegistroCompleto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostrarRegistroCompleto.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\ver.png")); // NOI18N
        btnMostrarRegistroCompleto.setText("Mostrar Registro Completo ");
        btnMostrarRegistroCompleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMostrarRegistroCompletoMousePressed(evt);
            }
        });
        btnMostrarRegistroCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistroCompletoActionPerformed(evt);
            }
        });

        btnImprimirTablaVentas.setBackground(new java.awt.Color(204, 255, 255));
        btnImprimirTablaVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirTablaVentas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        btnImprimirTablaVentas.setText("Imprimir ");
        btnImprimirTablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImprimirTablaVentasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFiltrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMostrarRegistroCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnImprimirTablaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(326, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(243, 243, 243)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarRegistroCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFiltrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnImprimirTablaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(506, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked

    }//GEN-LAST:event_tablaVentasMouseClicked

    private void txtFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFecha1ActionPerformed

    private void btnFiltrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarVentasActionPerformed

    private void btnFiltrarVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltrarVentasMousePressed

        //////////////////// PARTE PARA PODER FILTRAR LAS VENTAS SEGUN RANGO DE FECHAS
        //-----------------------------------------------------------------------------------------//
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM registroventas where fecha between '" + txtFecha1.getText() + "' and '" + txtFecha2.getText() + "'");

        model = (DefaultTableModel) tablaVentas.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("nombre"), r.getString("telefono"), r.getString("dui"), r.getString("articulos"), r.getString("cantidad"), r.getString("fecha")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFiltrarVentasMousePressed

    private void btnMostrarRegistroCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistroCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarRegistroCompletoActionPerformed

    private void btnMostrarRegistroCompletoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarRegistroCompletoMousePressed
        // TODO add your handling code here:

        // SECCION PARA VER TODO EL REGISTRO DE VENTAS 
        //---------------------------------------------------------------------------------------//
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM registroventas");
        model = (DefaultTableModel) tablaVentas.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("nombre"), r.getString("telefono"), r.getString("dui"), r.getString("articulos"), r.getString("cantidad"), r.getString("fecha")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnMostrarRegistroCompletoMousePressed

    private void btnImprimirTablaVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirTablaVentasMousePressed
        ////// SECCION DONDE SE IMPRIME LA TABLA DE CLIENTES ///////////////////////////////////////////////7
        try {
            generarPDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnImprimirTablaVentasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrarVentas;
    private javax.swing.JButton btnImprimirTablaVentas;
    private javax.swing.JButton btnMostrarRegistroCompleto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtFecha2;
    // End of variables declaration//GEN-END:variables

}
