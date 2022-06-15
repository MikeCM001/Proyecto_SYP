package com.mycompany.conexionc;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author David Del Cid
 */
public class ArticulosVendidos extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    public ArticulosVendidos() {
        initComponents();
        cargarArticulosVendidos();
    }

    public void cargarArticulosVendidos() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.articulosvendidos");

        model = (DefaultTableModel) TablaArtVendidos.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("indice"), r.getString("producto"), r.getString("precio"),
                    r.getString("cantidad"), r.getString("total"), r.getString("fecha")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    String path, datee;

    public void generarPDF() throws FileNotFoundException {
        datee = String.valueOf(java.time.LocalDate.now());
        path = "Articulos_Vendidos.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);

        float threecol = 190f; //COLUMNAS DE LA TABLA
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};
        float threeColumnWidth[] = {threecol, threecol, threecol, threecol, threecol, threecol};
        float FullWidth[] = {threecol * 6};

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell().add("SERPROCOMP").setFontSize(21f).setBorder(Border.NO_BORDER).setBold());
        Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedtable.addCell(new Cell().add("INFORME DE: ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("ARTICULOS VENDIDOS").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(com.itextpdf.kernel.color.Color.BLACK, 2.8f);

        threeColTable1.addCell(new Cell().add("INDICE").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("NOMBRE DEL PRODUCTO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("PRECIO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("CANTIDAD").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("TOTAL").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("FECHA").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));

        document.add(threeColTable1);

        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(com.itextpdf.kernel.color.Color.LIGHT_GRAY, 0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
            Coneccion c = new Coneccion();
            ResultSet r = c.consultar("SELECT * FROM public.articulosvendidos");

            while (r.next()) {
                tablaDatos.addCell(r.getString(1));
                tablaDatos.addCell(r.getString(2));
                tablaDatos.addCell(r.getString(3));
                tablaDatos.addCell(r.getString(4));
                tablaDatos.addCell(r.getString(5));
                tablaDatos.addCell(r.getString(6));
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

        jScrollPane3 = new javax.swing.JScrollPane();
        TablaArtVendidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        TablaArtVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INDICE", "NOMBRE DEL PRODUCTO", "PRECIO", "CANTIDAD", "TOTAL", "FECHA"
            }
        ));
        jScrollPane3.setViewportView(TablaArtVendidos);
        if (TablaArtVendidos.getColumnModel().getColumnCount() > 0) {
            TablaArtVendidos.getColumnModel().getColumn(0).setMinWidth(55);
            TablaArtVendidos.getColumnModel().getColumn(0).setPreferredWidth(55);
            TablaArtVendidos.getColumnModel().getColumn(0).setMaxWidth(55);
            TablaArtVendidos.getColumnModel().getColumn(2).setMinWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(2).setPreferredWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(2).setMaxWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(3).setMinWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(3).setPreferredWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(3).setMaxWidth(75);
            TablaArtVendidos.getColumnModel().getColumn(4).setMinWidth(65);
            TablaArtVendidos.getColumnModel().getColumn(4).setPreferredWidth(65);
            TablaArtVendidos.getColumnModel().getColumn(4).setMaxWidth(65);
            TablaArtVendidos.getColumnModel().getColumn(5).setMinWidth(95);
            TablaArtVendidos.getColumnModel().getColumn(5).setPreferredWidth(95);
            TablaArtVendidos.getColumnModel().getColumn(5).setMaxWidth(95);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ARTICULOS VENDIDOS");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        jButton1.setText("IMPRIMIR TABLA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        try {
            generarPDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaArtVendidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
