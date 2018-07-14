/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafe.vista;
//Fafiiiiiiiiiiiiiiiiiiiiiiiiiiiii

import gafe.control.Control;
import gafe.modelo.RecursosCompartidos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP_810G2
 */
public class filtroReporte extends javax.swing.JFrame {

    public filtroReporte(Control control) {
        this.control = control;         
        initComponents();        
      
      
        // JScrollPane scrollPane = new JScrollPane(jPanel1);
        // add(scrollPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jCheckBox19 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel4.setBackground(new java.awt.Color(52, 21, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtro de reporte de facturas");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(jLabel2);

        getContentPane().add(jPanel4);

        jTabbedPane1.setBackground(new java.awt.Color(1, 50, 83));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Clave");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Consecutivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox2, gridBagConstraints);

        jCheckBox29.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox29.setText("Unidad de Medida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox29, gridBagConstraints);

        jCheckBox28.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox28.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox28, gridBagConstraints);

        jCheckBox30.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox30.setText("Unidad de Medida Comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox30, gridBagConstraints);

        jCheckBox31.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox31.setText("Detalle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox31, gridBagConstraints);

        jCheckBox26.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox26.setText("Numero Linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox26, gridBagConstraints);

        jCheckBox36.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox36.setText("Codigo Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox36, gridBagConstraints);

        jCheckBox32.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox32.setText("Monto Descuento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox32, gridBagConstraints);

        jCheckBox33.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox33.setText("Naturaleza Descuento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox33, gridBagConstraints);

        jCheckBox34.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox34.setText("SubTotal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox34, gridBagConstraints);

        jCheckBox38.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox38.setText("Monto Impuesto");
        jCheckBox38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox38ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox38, gridBagConstraints);

        jCheckBox40.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox40.setText("Tipo Documento Exoneracion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox40, gridBagConstraints);

        jCheckBox41.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox41.setText("Numero Documento Exoneracion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox41, gridBagConstraints);

        jCheckBox42.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox42.setText("Nombre Institucion Exoneración");
        jCheckBox42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox42ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox42, gridBagConstraints);

        jCheckBox37.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox37.setText("Tarifa Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox37, gridBagConstraints);

        jCheckBox43.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox43.setText("Fecha Emisón Exoneración");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox43, gridBagConstraints);

        jCheckBox39.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox39.setText("Monto Impuesto Exo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox39, gridBagConstraints);

        jCheckBox44.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox44.setText("Porcentaje Compra Exoneración");
        jCheckBox44.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox44, gridBagConstraints);

        jCheckBox35.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox35.setText("Monto Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox35, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 25, 0, 6);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Datos generales");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Detalle de factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 25, 0, 6);
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(jSeparator5, gridBagConstraints);

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Fecha Emision");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel1.add(jCheckBox3, gridBagConstraints);

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Condicion Venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel1.add(jCheckBox4, gridBagConstraints);

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Plazo Credito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox5, gridBagConstraints);

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Medio Pago");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox6, gridBagConstraints);

        jCheckBox27.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox27.setText("Codigo del Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox27, gridBagConstraints);

        jTabbedPane1.addTab("Facturas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Emisor de la factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        jPanel2.add(jSeparator1, gridBagConstraints);

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox7.setText("Cédula emisor");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox7, gridBagConstraints);

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox8.setText("Nombre emisor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox8, gridBagConstraints);

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox9.setText("Nombre Comercial ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox9, gridBagConstraints);

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox10, gridBagConstraints);

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setText("Fax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox11, gridBagConstraints);

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Correo Electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox12, gridBagConstraints);

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox13.setText("Provincia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox13, gridBagConstraints);

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox14.setText("Cantón");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox14, gridBagConstraints);

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox15.setText("Distrito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox15, gridBagConstraints);

        jTabbedPane1.addTab("Datos del Emisor", jPanel2);

        jPanel3.setBackground(new java.awt.Color(247, 238, 212));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jCheckBox16.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox16.setText("Cédula receptor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox16, gridBagConstraints);

        jCheckBox17.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox17.setText("Nombre receptor");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox17, gridBagConstraints);

        jCheckBox18.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox18.setText("Nombre Comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox18, gridBagConstraints);

        jCheckBox23.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox23.setText("Provincia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox23, gridBagConstraints);

        jCheckBox24.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox24.setText("Canton");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox24, gridBagConstraints);

        jCheckBox25.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox25.setText("Distrito");
        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox25, gridBagConstraints);

        jCheckBox20.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox20.setText("Telefono");
        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox20, gridBagConstraints);

        jCheckBox21.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox21.setText("Fax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox21, gridBagConstraints);

        jCheckBox22.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox22.setText("Correo Electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox22, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Receptor de la factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 6);
        jPanel3.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 1);
        jPanel3.add(jSeparator9, gridBagConstraints);

        jCheckBox19.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox19.setText("Identificacion Extranjero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel3.add(jCheckBox19, gridBagConstraints);

        jTabbedPane1.addTab("Datos del receptor", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBackground(new java.awt.Color(52, 21, 0));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        jButton2.setText("Cancelar");
        jPanel5.add(jButton2);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
//        int i = 0;
//        int status;
//        if (ChkClave.isSelected()) {
//            status = 1;
 //           controlVentanas.ocultarMostrarColumnas(TablaReportes, 0, status);
//        } else {
//            status = 0;
//            controlVentanas.ocultarMostrarColumnas(TablaReportes, 0, status);
//        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox42ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox38ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirArchivoConfiguracion();
        cambiarEstadoColumnasReporte();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    public void escribirArchivoConfiguracion() {
        List<String> listaEstados = new ArrayList<>();
        listaEstados.add(jCheckBox1.isSelected() + "");
        listaEstados.add(jCheckBox2.isSelected() + "");
        listaEstados.add(jCheckBox3.isSelected() + "");
        listaEstados.add(jCheckBox4.isSelected() + "");
        listaEstados.add(jCheckBox5.isSelected() + "");
        listaEstados.add(jCheckBox6.isSelected() + "");
        listaEstados.add(jCheckBox7.isSelected() + "");
        listaEstados.add(jCheckBox8.isSelected() + "");
        listaEstados.add(jCheckBox9.isSelected() + "");
        listaEstados.add(jCheckBox10.isSelected() + "");
        listaEstados.add(jCheckBox11.isSelected() + "");
        listaEstados.add(jCheckBox12.isSelected() + "");
        listaEstados.add(jCheckBox13.isSelected() + "");
        listaEstados.add(jCheckBox14.isSelected() + "");
        listaEstados.add(jCheckBox15.isSelected() + "");
        listaEstados.add(jCheckBox16.isSelected() + "");
        listaEstados.add(jCheckBox17.isSelected() + "");
        listaEstados.add(jCheckBox18.isSelected() + "");
        listaEstados.add(jCheckBox19.isSelected() + "");
        listaEstados.add(jCheckBox20.isSelected() + "");
        listaEstados.add(jCheckBox21.isSelected() + "");
        listaEstados.add(jCheckBox22.isSelected() + "");
        listaEstados.add(jCheckBox23.isSelected() + "");
        listaEstados.add(jCheckBox24.isSelected() + "");
        listaEstados.add(jCheckBox25.isSelected() + "");
        listaEstados.add(jCheckBox26.isSelected() + "");
        listaEstados.add(jCheckBox27.isSelected() + "");
        listaEstados.add(jCheckBox28.isSelected() + "");
        listaEstados.add(jCheckBox29.isSelected() + "");
        listaEstados.add(jCheckBox30.isSelected() + "");
        listaEstados.add(jCheckBox31.isSelected() + "");
        listaEstados.add(jCheckBox32.isSelected() + "");
        listaEstados.add(jCheckBox33.isSelected() + "");
        listaEstados.add(jCheckBox34.isSelected() + "");
        listaEstados.add(jCheckBox35.isSelected() + "");
        listaEstados.add(jCheckBox36.isSelected() + "");
        listaEstados.add(jCheckBox37.isSelected() + "");
        listaEstados.add(jCheckBox38.isSelected() + "");
        listaEstados.add(jCheckBox39.isSelected() + "");
        listaEstados.add(jCheckBox40.isSelected() + "");
        listaEstados.add(jCheckBox41.isSelected() + "");
        listaEstados.add(jCheckBox42.isSelected() + "");
        listaEstados.add(jCheckBox43.isSelected() + "");
        listaEstados.add(jCheckBox44.isSelected() + "");
        control.escribirArchivoConfiguracion(RecursosCompartidos.getDiretorioArchivoConfiguracion(), listaEstados, false);
    }

    public void leerArchivoConfiguracion() {
        List<String> listaEstados = control.leerArchivoConfiguracion(RecursosCompartidos.getDiretorioArchivoConfiguracion());        
        boolean estado;
        for (int i = 0; i < listaEstados.size(); i++) {
            estado = false;
            if (listaEstados.get(i).equals("true")) {            
                estado = true;
            }
            checkSeleccionado(i, estado);
        }
          setVisible(true);
    }

    public void cambiarEstadoColumnasReporte(){
        control.cambiarEstadoColumnasReporte(RecursosCompartidos.getDiretorioArchivoConfiguracion());
//         List<String> listaEstados = control.leerArchivoConfiguracion();
//          boolean estado;
//         for (int i = 0; i < listaEstados.size(); i++) {
//            estado = false;
//            if (listaEstados.get(i).equals("true")) {            
//                estado = true;
//            }
//            control.ocultarMostrarColumnas( i, estado);
//        }
     
    }
    
    private void checkSeleccionado(int i, boolean estado) {
        i = i+1;
        switch (i) {
            case 1:
                jCheckBox1.setSelected(estado);
                break;
            case 2:
                jCheckBox2.setSelected(estado);
                break;
            case 3:
                jCheckBox3.setSelected(estado);
                break;
            case 4:
                jCheckBox4.setSelected(estado);
                break;
            case 5:
                jCheckBox5.setSelected(estado);
                break;
            case 6:
                jCheckBox6.setSelected(estado);
                break;
            case 7:
                jCheckBox7.setSelected(estado);
                break;
            case 8:
                jCheckBox8.setSelected(estado);
                break;
            case 9:
                jCheckBox9.setSelected(estado);
                break;
            case 10:
                jCheckBox10.setSelected(estado);
                break;
            case 11:
                jCheckBox11.setSelected(estado);
                break;
            case 12:
                jCheckBox12.setSelected(estado);
                break;
            case 13:
                jCheckBox13.setSelected(estado);
                break;
            case 14:
                jCheckBox14.setSelected(estado);
                break;
            case 15:
                jCheckBox15.setSelected(estado);
                break;
            case 16:
                jCheckBox16.setSelected(estado);
                break;
            case 17:
                jCheckBox17.setSelected(estado);
                break;
            case 18:
                jCheckBox18.setSelected(estado);
                break;
            case 19:
                jCheckBox19.setSelected(estado);
                break;
            case 20:
                jCheckBox20.setSelected(estado);
                break;
            case 21:
                jCheckBox21.setSelected(estado);
                break;
            case 22:
                jCheckBox22.setSelected(estado);
                break;
            case 23:
                jCheckBox23.setSelected(estado);
                break;
            case 24:
                jCheckBox24.setSelected(estado);
                break;
            case 25:
                jCheckBox25.setSelected(estado);
                break;
            case 26:
                jCheckBox26.setSelected(estado);
                break;
            case 27:
                jCheckBox27.setSelected(estado);
                break;
            case 28:
                jCheckBox28.setSelected(estado);
                break;
            case 29:
                jCheckBox29.setSelected(estado);
                break;
            case 30:
                jCheckBox30.setSelected(estado);
                break;
            case 31:
                jCheckBox31.setSelected(estado);
                break;
            case 32:
                jCheckBox32.setSelected(estado);
                break;
            case 33:
                jCheckBox33.setSelected(estado);
                break;
            case 34:
                jCheckBox34.setSelected(estado);
                break;
            case 35:
                jCheckBox35.setSelected(estado);
                break;
            case 36:
                jCheckBox36.setSelected(estado);
                break;
            case 37:
                jCheckBox37.setSelected(estado);
                break;
            case 38:
                jCheckBox38.setSelected(estado);
                break;
            case 39:
                jCheckBox39.setSelected(estado);
                break;
            case 40:
                jCheckBox40.setSelected(estado);
                break;
            case 41:
                jCheckBox41.setSelected(estado);
                break;
            case 42:
                jCheckBox42.setSelected(estado);
                break;
            case 43:
                jCheckBox43.setSelected(estado);
                break;
            case 44:
                jCheckBox44.setSelected(estado);
                break;
            default:
                break;

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private Control control;
}
