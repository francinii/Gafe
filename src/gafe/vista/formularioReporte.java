package gafe.vista;

import gafe.modelo.FormatoFecha;
import gafe.modelo.TipoFactura;
import java.text.ParseException;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class formularioReporte extends javax.swing.JPanel {

    ControlFormularioPrincipal controlVentanas;

    public formularioReporte(ControlFormularioPrincipal control) {
        this.controlVentanas = control;
        initComponents();
        init();
    }

    public void init() {
        llenarComboFacturas();
        inicializarFechas();
    }

    public JTable tablaReportes() {
        return TablaReportes;
    }

    public void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) TablaReportes.getModel();
        int filas = TablaReportes.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
            System.out.println("Limpiar");
        }
    }

    private void llenarComboFacturas() {
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{todo,
            facturaElectronica,
            notaCredito, notaDebito,
            tiqueteElectronico}));
    }

    public void inicializarFechas() {
        fechaInicio.setValue(new Date());
        fechaFinal.setValue(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        try{
            fechaInicio = new JFormattedTextField(new FormatoFecha());
            jLabel3 = new javax.swing.JLabel();
            try{
                fechaFinal = new JFormattedTextField(new FormatoFecha());
                jLabel4 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane(TablaReportes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                TablaReportes = new javax.swing.JTable();
                jPanel2 = new javax.swing.JPanel();
                jButton2 = new javax.swing.JButton();

                setBackground(new java.awt.Color(247, 238, 212));
                setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
                setMinimumSize(new java.awt.Dimension(500, 204));
                setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

                jPanel1.setBackground(new java.awt.Color(247, 238, 212));
                jPanel1.setLayout(new java.awt.GridBagLayout());

                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox1ActionPerformed(evt);
                    }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 4;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.ipadx = 262;
                gridBagConstraints.ipady = 4;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.weightx = 0.2;
                gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
                jPanel1.add(jComboBox1, gridBagConstraints);

                jLabel1.setForeground(new java.awt.Color(52, 21, 0));
                jLabel1.setText("Categoría");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.ipadx = 8;
                gridBagConstraints.ipady = 8;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(3, 1, 1, 0);
                jPanel1.add(jLabel1, gridBagConstraints);

                jLabel2.setForeground(new java.awt.Color(52, 21, 0));
                jLabel2.setText("Desde");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.ipadx = 8;
                gridBagConstraints.ipady = 8;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
                gridBagConstraints.insets = new java.awt.Insets(3, 6, 1, 0);
                jPanel1.add(jLabel2, gridBagConstraints);

            }catch (ParseException ex) {
                Logger.getLogger(formularioReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            fechaInicio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fechaInicioActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.weightx = 0.1;
            jPanel1.add(fechaInicio, gridBagConstraints);

            jLabel3.setForeground(new java.awt.Color(52, 21, 0));
            jLabel3.setText("Hasta");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            gridBagConstraints.ipadx = 8;
            gridBagConstraints.ipady = 8;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new java.awt.Insets(5, 2, 1, 0);
            jPanel1.add(jLabel3, gridBagConstraints);

        }catch (ParseException ex) {
            Logger.getLogger(formularioReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        fechaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFinalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(fechaFinal, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 21, 0));
        jLabel4.setText("Reporte");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jLabel4, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png"))); // NOI18N
        jButton1.setText("Filtrar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 2, 3, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jTextField1.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jTextField1, gridBagConstraints);

        add(jPanel1);

        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Clave", "Consecutivo", "Fecha Emision", "Condicion Venta", "Plaza Credito", "Medio Pago", "Cédula Emisor", "Nombre Emisor", "Nombre Comercial Emisor", "Telefono Emisor", "Fax Emisor", "Correo Electrónico Emisor", "Provincia Emisor", "Cantón Emisor", "Distrito Emisor", "Cédula Receptor", "Nombre Receptor", "Nombre Comercial Receptor", "Identificacion Extranjero", "Telefono Receptor", "Fax Receptor", "Correo Electrónico Receptor", "Provincia Receptor", "Cantón Receptor", "Distrito Receptor", "Numero de Linea", "Codigo del Producto", "Cantidad", "Unidad de Medida", "Unidad de Medida Comercial", "Detalle", "Monto Descuento", "Naturaleza Descuento", "SubTotal", "Monto Total", "Codigo Impuesto", "Tarifa Impuesto", "Monto Impuesto", "Monto Impuesto Exoneración", "Tipo documento Exoneracion", "Numero Documento Exoneracion", "Nombre Institución Exoneración", "Fecha Emisión Exoneración", "Porcentaje Compra Exoneración", "Codigo Moneda", "Tipo Cambio", "Total Serv Gravados", "Total Serv Excentos", "Total Mercancias Gravadas", "Total Mercancias Excentas", "Tota Gravado", "Total Excento", "Total Venta", "Total Descuentos", "Total Venta Neta", "Total Impuestos", "Total Comprobante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaReportes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TablaReportes.setMinimumSize(new java.awt.Dimension(500, 600));
        jScrollPane1.setViewportView(TablaReportes);

        add(jScrollPane1);

        jPanel2.setBackground(new java.awt.Color(247, 238, 212));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/export.png"))); // NOI18N
        jButton2.setText("Generar reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controlVentanas.exportarReporte(TablaReportes);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String categoria = jComboBox1.getSelectedItem().toString();
        if (categoria.equals(todo)) {
            categoria = TipoFactura.TODASFACTURAS.getNombre();
        } else if (categoria.equals(facturaElectronica)) {
            categoria = TipoFactura.FACTURAELECTRONICA.getNombre();
        } else if (categoria.equals(notaCredito)) {
            categoria = TipoFactura.NOTACREDITO.getNombre();
        } else if (categoria.equals(notaDebito)) {
            categoria = TipoFactura.NOTADEBITO.getNombre();
        } else if (categoria.equals(tiqueteElectronico)) {
            categoria = TipoFactura.TIQUETEELECTRONICO.getNombre();
        }
        String fIncio = fechaInicio.getText();
        String fFinal = fechaFinal.getText();
        controlVentanas.abrirFormularioReportes(categoria, fIncio, fFinal);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaInicioActionPerformed

    private void fechaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFinalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaReportes;
    private javax.swing.JFormattedTextField fechaFinal;
    private javax.swing.JFormattedTextField fechaInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private String todo = "Todo";
    private String facturaElectronica = "Factura electronica";
    private String notaCredito = "Nota de credito";
    private String notaDebito = "Noa de debito";
    private String tiqueteElectronico = "Tiquete electronico";

}
