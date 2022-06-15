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

public class ProductNoExist extends javax.swing.JPanel {

    int cantidad = 0;
    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    public ProductNoExist() {
        initComponents();
        cargarProductos();
    }

    public void cargarProductos() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.productos WHERE CANTIDAD = '0'");

        model = (DefaultTableModel) jTable1.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("id"), r.getString("nombre"), r.getString("precio"),
                    r.getString("cantidad")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductNoExist.class.getName()).log(Level.SEVERE, null, ex);
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
        path = "SinExistencias.pdf";
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
        nestedtable.addCell(new Cell().add("SIN EXISTENCIAS").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(com.itextpdf.kernel.color.Color.BLACK, 2.8f);

        threeColTable1.addCell(new Cell().add("ID").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("NOMBRE DEL PRODUCTO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("PRECIO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("CANTIDAD").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        document.add(threeColTable1);

        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(com.itextpdf.kernel.color.Color.LIGHT_GRAY, 0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
            Coneccion c = new Coneccion();
            ResultSet r = c.consultar("SELECT * FROM public.productos WHERE CANTIDAD = '0'");

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
        Background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        BtnPrint = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setMaximumSize(new java.awt.Dimension(820, 610));
        body.setMinimumSize(new java.awt.Dimension(820, 610));
        body.setName(""); // NOI18N
        body.setPreferredSize(new java.awt.Dimension(820, 610));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setMinimumSize(new java.awt.Dimension(710, 610));
        Background.setPreferredSize(new java.awt.Dimension(710, 610));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("BUSCAR PRODUCTO:");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

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

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 730, 320));

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        Background.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 510, 40));

        BtnPrint.setBackground(new java.awt.Color(204, 255, 255));
        BtnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnPrint.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        BtnPrint.setText("IMPRIMIR");
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
        Background.add(BtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 230, 40));

        body.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String dataBuscar = txtBuscar.getText();
        buscar(dataBuscar);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintMousePressed
        /*    MessageFormat cabecera = new MessageFormat("INVENTARIO DE PRODUCTOS SIN EXISTENCIA");
        MessageFormat pie = new MessageFormat("PAGINA");
        try{
            jTable1.print(JTable.PrintMode.NORMAL,cabecera,pie);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         */
    }//GEN-LAST:event_BtnPrintMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

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
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
