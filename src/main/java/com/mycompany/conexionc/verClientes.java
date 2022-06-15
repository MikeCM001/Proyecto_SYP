package com.mycompany.conexionc;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import static com.mycompany.conexionc.LobbyClientes.content;
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

/**
 *
 * @author David Del Cid
 */
public class verClientes extends javax.swing.JPanel {

    TableRowSorter<DefaultTableModel> sorter;
    DefaultTableModel model;
    Coneccion conn;
    Connection reg;

    /**
     * Creates new form verClientes
     */
    public verClientes() {
        initComponents();
        cargarClientes();
    }

    //Para cargar los clientes de la base de datos a la tabla
    ///////////////////////////////////////////////////////////////////////
    public void cargarClientes() {
        Coneccion c = new Coneccion();
        ResultSet r = c.consultar("SELECT * FROM public.cliente");

        model = (DefaultTableModel) tablaClientes.getModel();
        try {
            while (r.next()) {
                model.addRow(new Object[]{r.getString("nombre"), r.getString("telefono"), r.getString("dui")});

            }
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        float threeColumnWidth[] = {threecol, threecol, threecol};
        float FullWidth[] = {threecol * 3};

        Table table = new Table(twocolumnWidth);
        table.addCell(new Cell().add("SERPROCOMP").setFontSize(21f).setBorder(Border.NO_BORDER).setBold());
        Table nestedtable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedtable.addCell(new Cell().add("REPORTE: ").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("INFORME DE CLIENTES").setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add("FECHA: ").setBold().setBold().setBorder(Border.NO_BORDER));
        nestedtable.addCell(new Cell().add(datee).setBold().setBorder(Border.NO_BORDER));

        table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER));
        document.add(table);
        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(com.itextpdf.kernel.color.Color.BLACK, 2.8f);

        threeColTable1.addCell(new Cell().add("NOMBRE DEL CLIENTE").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("TELEFONO").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        threeColTable1.addCell(new Cell().add("DUI").setBold().setFontColor(com.itextpdf.kernel.color.Color.WHITE).setTextAlignment(TextAlignment.CENTER));
        document.add(threeColTable1);

        Table tablaDatos = new Table(threeColumnWidth).setBackgroundColor(com.itextpdf.kernel.color.Color.LIGHT_GRAY, 0.8f).setTextAlignment(TextAlignment.CENTER);
        try {
            Coneccion c = new Coneccion();
            ResultSet r = c.consultar("SELECT * FROM public.cliente");

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
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnImprimirTablaClientes = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(820, 610));
        setPreferredSize(new java.awt.Dimension(820, 610));

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        tablaClientes.setBorder(new javax.swing.border.MatteBorder(null));
        tablaClientes.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE DEL CLIENTE", "TELEFONO", "DUI"
            }
        ));
        tablaClientes.setColumnSelectionAllowed(true);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);
        tablaClientes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CLIENTES REGISTRADOS ");

        btnImprimirTablaClientes.setBackground(new java.awt.Color(204, 255, 255));
        btnImprimirTablaClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirTablaClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\ander\\Documents\\imagees\\imprimir.png")); // NOI18N
        btnImprimirTablaClientes.setText("Imprimir");
        btnImprimirTablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnImprimirTablaClientesMousePressed(evt);
            }
        });
        btnImprimirTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirTablaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(btnImprimirTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnImprimirTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnImprimirTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirTablaClientesActionPerformed
        ////// SECCION DONDE SE IMPRIME LA TABLA DE CLIENTES ///////////////////////////////////////////////7
        try {
            generarPDF();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirTablaClientesActionPerformed

    private void btnImprimirTablaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirTablaClientesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirTablaClientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirTablaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
