package gafe.vista;

import gafe.control.Control;
import gafe.modelo.RecursosCompartidos;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class filtroReporte extends javax.swing.JFrame {

    public filtroReporte(Control control) {
        this.control = control;
        initComponents();
        this.setTitle("Filtros");
        Image icon = new ImageIcon(getClass().getResource("/recursos/Filter List.png")).getImage();
        setIconImage(icon);
        this.setLocationRelativeTo(null); // centrar la pantalla.
        
        jCheckBox5.setVisible(false); // este es para que la fecha con la que se realizan los reportes no aparezca.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jCheckBox21 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jCheckBox64 = new javax.swing.JCheckBox();
        jCheckBox65 = new javax.swing.JCheckBox();
        jCheckBox66 = new javax.swing.JCheckBox();
        jCheckBox67 = new javax.swing.JCheckBox();
        jCheckBox70 = new javax.swing.JCheckBox();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox63 = new javax.swing.JCheckBox();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox71 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox79 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox82 = new javax.swing.JCheckBox();
        jCheckBox83 = new javax.swing.JCheckBox();
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

        jTabbedPane1.setBackground(new java.awt.Color(247, 238, 212));

        jPanel2.setBackground(new java.awt.Color(247, 238, 212));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
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

        jCheckBox9.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox9.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox9.setText("Cédula emisor");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox9, gridBagConstraints);

        jCheckBox10.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox10.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox10.setText("Nombre emisor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox10, gridBagConstraints);

        jCheckBox11.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox11.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox11.setText("Nombre Comercial ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 0);
        jPanel2.add(jCheckBox11, gridBagConstraints);

        jCheckBox12.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox12.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox12.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox12, gridBagConstraints);

        jCheckBox13.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox13.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox13.setText("Fax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox13, gridBagConstraints);

        jCheckBox14.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox14.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox14.setText("Correo Electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox14, gridBagConstraints);

        jCheckBox15.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox15.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox15.setText("Provincia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox15, gridBagConstraints);

        jCheckBox16.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox16.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox16.setText("Cantón");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox16, gridBagConstraints);

        jCheckBox17.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox17.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox17.setText("Distrito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel2.add(jCheckBox17, gridBagConstraints);

        jTabbedPane1.addTab("Datos del Emisor", jPanel2);

        jPanel3.setBackground(new java.awt.Color(247, 238, 212));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jCheckBox18.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox18.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox18.setText("Cédula receptor");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox18, gridBagConstraints);

        jCheckBox19.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox19.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox19.setText("Nombre receptor");
        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox19, gridBagConstraints);

        jCheckBox20.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox20.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox20.setText("Nombre Comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel3.add(jCheckBox20, gridBagConstraints);

        jCheckBox25.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox25.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox25.setText("Provincia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox25, gridBagConstraints);

        jCheckBox26.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox26.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox26.setText("Canton");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox26, gridBagConstraints);

        jCheckBox27.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox27.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox27.setText("Distrito");
        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 1);
        jPanel3.add(jCheckBox27, gridBagConstraints);

        jCheckBox22.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox22.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox22.setText("Telefono");
        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox22, gridBagConstraints);

        jCheckBox23.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox23.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox23.setText("Fax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox23, gridBagConstraints);

        jCheckBox24.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox24.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox24.setText("Correo Electrónico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel3.add(jCheckBox24, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(52, 21, 0));
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

        jCheckBox21.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox21.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox21.setText("Identificacion Extranjero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel3.add(jCheckBox21, gridBagConstraints);

        jTabbedPane1.addTab("Datos del receptor", jPanel3);

        jPanel6.setBackground(new java.awt.Color(247, 238, 212));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jCheckBox53.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox53.setText("Codigo Moneda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox53, gridBagConstraints);

        jCheckBox54.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox54.setText("Tipo Cambio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox54, gridBagConstraints);

        jCheckBox55.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox55.setText("Total ServGravados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox55, gridBagConstraints);

        jCheckBox56.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox56.setText("Total ServExcentos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox56, gridBagConstraints);

        jCheckBox58.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox58.setText("Total Mercancias Gravadas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox58, gridBagConstraints);

        jCheckBox59.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox59.setText("Total Mercancias Excentas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox59, gridBagConstraints);

        jCheckBox61.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox61.setText("Total Gravado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox61, gridBagConstraints);

        jCheckBox62.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox62.setText("Total Excento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox62, gridBagConstraints);

        jCheckBox64.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox64.setText("Total Venta");
        jCheckBox64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox64ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox64, gridBagConstraints);

        jCheckBox65.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox65.setText("Total Descuentos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox65, gridBagConstraints);

        jCheckBox66.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox66.setText("Total Venta Neta");
        jCheckBox66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox66ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox66, gridBagConstraints);

        jCheckBox67.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox67.setText("Total Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox67, gridBagConstraints);

        jCheckBox70.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox70.setText("Total Comprobante");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox70, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jSeparator4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jSeparator8, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Información Referencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        jPanel6.add(jLabel6, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Resumen de la Factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel6.add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jSeparator6, gridBagConstraints);

        jCheckBox73.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox73.setText("Tipo Documento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox73, gridBagConstraints);

        jCheckBox74.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox74.setText("Num Documento ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox74, gridBagConstraints);

        jCheckBox75.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox75.setText("Fecha Emisión");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox75, gridBagConstraints);

        jCheckBox76.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox76.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox76, gridBagConstraints);

        jCheckBox77.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox77.setText("Razón");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel6.add(jCheckBox77, gridBagConstraints);

        jCheckBox57.setText("Total ServExonerados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel6.add(jCheckBox57, gridBagConstraints);

        jCheckBox60.setText("Total Mercancias Exoneradas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel6.add(jCheckBox60, gridBagConstraints);

        jCheckBox63.setText("Total Exonerado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jCheckBox63, gridBagConstraints);

        jCheckBox68.setText("TotalIVA Devuelto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel6.add(jCheckBox68, gridBagConstraints);

        jCheckBox69.setText("Total Otros Cargos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        jPanel6.add(jCheckBox69, gridBagConstraints);

        jTabbedPane1.addTab("Resumen Factura", jPanel6);

        jPanel1.setBackground(new java.awt.Color(247, 238, 212));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jCheckBox2.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox2.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox2.setText("Clave");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox2, gridBagConstraints);

        jCheckBox4.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox4.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox4.setText("Consecutivo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox4, gridBagConstraints);

        jCheckBox32.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox32.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox32.setText("Unidad de Medida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox32, gridBagConstraints);

        jCheckBox31.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox31.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox31.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox31, gridBagConstraints);

        jCheckBox33.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox33.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox33.setText("Unidad de Medida Comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox33, gridBagConstraints);

        jCheckBox34.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox34.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox34.setText("Detalle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox34, gridBagConstraints);

        jCheckBox28.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox28.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox28.setText("Numero Linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox28, gridBagConstraints);

        jCheckBox42.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox42.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox42.setText("Codigo Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox42, gridBagConstraints);

        jCheckBox37.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox37.setText("Monto Descuento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox37, gridBagConstraints);

        jCheckBox38.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox38.setText("Naturaleza Descuento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox38, gridBagConstraints);

        jCheckBox39.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox39.setText("SubTotal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox39, gridBagConstraints);

        jCheckBox46.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox46.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox46.setText("Monto Impuesto");
        jCheckBox46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox46ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox46, gridBagConstraints);

        jCheckBox47.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox47.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox47.setText("Tipo Documento Exoneracion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox47, gridBagConstraints);

        jCheckBox48.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox48.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox48.setText("Numero Documento Exoneracion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox48, gridBagConstraints);

        jCheckBox49.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox49.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox49.setText("Nombre Institucion Exoneración");
        jCheckBox49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox49ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox49, gridBagConstraints);

        jCheckBox44.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox44.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox44.setText("Tarifa Impuesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox44, gridBagConstraints);

        jCheckBox50.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox50.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox50.setText("Fecha Emisón Exoneración");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox50, gridBagConstraints);

        jCheckBox52.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox52.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox52.setText("Monto Impuesto Exoneracion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox52, gridBagConstraints);

        jCheckBox51.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox51.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox51.setText("Porcentaje Compra Exoneración");
        jCheckBox51.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox51, gridBagConstraints);

        jCheckBox41.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox41.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox41.setText("Monto Total Linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox41, gridBagConstraints);
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
        jLabel3.setForeground(new java.awt.Color(52, 21, 0));
        jLabel3.setText("Otros Cargos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 25, 0, 6);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 21, 0));
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
        jLabel5.setForeground(new java.awt.Color(52, 21, 0));
        jLabel5.setText("Detalle de factura por linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 25, 0, 6);
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(jSeparator5, gridBagConstraints);

        jCheckBox5.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox5.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox5.setText("Fecha Emision");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel1.add(jCheckBox5, gridBagConstraints);

        jCheckBox6.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox6.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox6.setText("Condicion Venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        jPanel1.add(jCheckBox6, gridBagConstraints);

        jCheckBox7.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox7.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox7.setText("Plazo Credito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox7, gridBagConstraints);

        jCheckBox8.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox8.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox8.setText("Medio Pago");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox8, gridBagConstraints);

        jCheckBox29.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox29.setForeground(new java.awt.Color(52, 21, 0));
        jCheckBox29.setText("Codigo del Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox29, gridBagConstraints);

        jCheckBox1.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox1.setText("Categoria");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox1, gridBagConstraints);

        jCheckBox71.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox71.setText("Emitidas/Recibidas");
        jCheckBox71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox71ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox71, gridBagConstraints);

        jCheckBox72.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox72.setText("Fecha Factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox72, gridBagConstraints);

        jCheckBox35.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox35.setText("Precio Unitario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 6);
        jPanel1.add(jCheckBox35, gridBagConstraints);

        jCheckBox36.setBackground(new java.awt.Color(247, 238, 212));
        jCheckBox36.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        jPanel1.add(jCheckBox36, gridBagConstraints);

        jCheckBox3.setText("Codigo Actividad");
        jCheckBox3.setToolTipText("");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jCheckBox3, gridBagConstraints);

        jCheckBox30.setText("Codigo Comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanel1.add(jCheckBox30, gridBagConstraints);

        jCheckBox40.setText("Base Imponible");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        jPanel1.add(jCheckBox40, gridBagConstraints);

        jCheckBox43.setText("Código Tarifa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        jPanel1.add(jCheckBox43, gridBagConstraints);

        jCheckBox45.setText("FactorIVA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        jPanel1.add(jCheckBox45, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(52, 21, 0));
        jLabel9.setText("Impuesto por linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 25, 0, 6);
        jPanel1.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        jPanel1.add(jSeparator7, gridBagConstraints);

        jCheckBox78.setText("Tipo Documento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        jPanel1.add(jCheckBox78, gridBagConstraints);

        jCheckBox79.setText("IdentidadTercero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        jPanel1.add(jCheckBox79, gridBagConstraints);

        jCheckBox80.setText("Nombre Tercero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        jPanel1.add(jCheckBox80, gridBagConstraints);

        jCheckBox81.setText("Detalle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        jPanel1.add(jCheckBox81, gridBagConstraints);

        jCheckBox82.setText("Porcentaje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 25;
        jPanel1.add(jCheckBox82, gridBagConstraints);

        jCheckBox83.setText("Monto Cargo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 26;
        jPanel1.add(jCheckBox83, gridBagConstraints);

        jTabbedPane1.addTab("Facturas", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jPanel5.setBackground(new java.awt.Color(52, 21, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardarcomo.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox49ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox46ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirArchivoConfiguracion();
        cambiarEstadoColumnasReporte();
        JOptionPane.showMessageDialog(null, "La configuración ha sido guardada con éxito.", "Filtro de reportes", HEIGHT);
        //cerrarVentana();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrarVentana();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox64ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox71ActionPerformed

    private void jCheckBox66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox66ActionPerformed
    public void cerrarVentana() {
        super.setVisible(false);
        super.dispose();
    }

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
        listaEstados.add(jCheckBox45.isSelected() + "");
        listaEstados.add(jCheckBox46.isSelected() + "");
        listaEstados.add(jCheckBox47.isSelected() + "");
        listaEstados.add(jCheckBox48.isSelected() + "");
        listaEstados.add(jCheckBox49.isSelected() + "");
        listaEstados.add(jCheckBox50.isSelected() + "");
        listaEstados.add(jCheckBox51.isSelected() + "");
        
        listaEstados.add(jCheckBox52.isSelected() + "");
        listaEstados.add(jCheckBox53.isSelected() + "");
        listaEstados.add(jCheckBox54.isSelected() + "");
        listaEstados.add(jCheckBox55.isSelected() + "");
        listaEstados.add(jCheckBox56.isSelected() + "");
        listaEstados.add(jCheckBox57.isSelected() + "");
        listaEstados.add(jCheckBox58.isSelected() + "");
        listaEstados.add(jCheckBox59.isSelected() + "");
        listaEstados.add(jCheckBox60.isSelected() + "");
        
        listaEstados.add(jCheckBox61.isSelected() + "");
        listaEstados.add(jCheckBox62.isSelected() + "");
        listaEstados.add(jCheckBox63.isSelected() + "");
        
        listaEstados.add(jCheckBox64.isSelected() + "");
        listaEstados.add(jCheckBox65.isSelected() + "");
        listaEstados.add(jCheckBox66.isSelected() + "");
        listaEstados.add(jCheckBox67.isSelected() + "");
        listaEstados.add(jCheckBox68.isSelected() + "");
        listaEstados.add(jCheckBox69.isSelected() + "");
        
        
        
        listaEstados.add(jCheckBox70.isSelected() + "");
        listaEstados.add(jCheckBox71.isSelected() + "");
        listaEstados.add(jCheckBox72.isSelected() + "");
        listaEstados.add(jCheckBox73.isSelected() + "");
        listaEstados.add(jCheckBox74.isSelected() + "");
        listaEstados.add(jCheckBox75.isSelected() + "");
        listaEstados.add(jCheckBox76.isSelected() + "");
        listaEstados.add(jCheckBox77.isSelected() + "");
        listaEstados.add(jCheckBox78.isSelected() + "");
        listaEstados.add(jCheckBox79.isSelected() + "");
        listaEstados.add(jCheckBox80.isSelected() + "");
        listaEstados.add(jCheckBox81.isSelected() + "");
        listaEstados.add(jCheckBox82.isSelected() + "");
        listaEstados.add(jCheckBox83.isSelected() + "");
             
        
               
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

    public void cambiarEstadoColumnasReporte() {
        control.cambiarEstadoColumnasReporte(RecursosCompartidos.getDiretorioArchivoConfiguracion());
    }

    private void checkSeleccionado(int i, boolean estado) {
        i = i + 1;
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
                jCheckBox5.setSelected(estado);
                break;
            case 5:
                jCheckBox6.setSelected(estado);
                break;
            case 6:
                jCheckBox7.setSelected(estado);
                break;
            case 7:
                jCheckBox8.setSelected(estado);
                break;
            case 8:
                jCheckBox9.setSelected(estado);
                break;
            case 9:
                jCheckBox10.setSelected(estado);
                break;
            case 10:
                jCheckBox11.setSelected(estado);
                break;
            case 11:
                jCheckBox12.setSelected(estado);
                break;
            case 12:
                jCheckBox13.setSelected(estado);
                break;
            case 13:
                jCheckBox14.setSelected(estado);
                break;
            case 14:
                jCheckBox15.setSelected(estado);
                break;
            case 15:
                jCheckBox16.setSelected(estado);
                break;
            case 16:
                jCheckBox17.setSelected(estado);
                break;
            case 17:
                jCheckBox18.setSelected(estado);
                break;
            case 18:
                jCheckBox19.setSelected(estado);
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
            case 45:
                jCheckBox45.setSelected(estado);
                break;
            case 46:
                jCheckBox46.setSelected(estado);
                break;
            case 47:
                jCheckBox47.setSelected(estado);
                break;
            case 48:
                jCheckBox48.setSelected(estado);
                break;
            case 49:
                jCheckBox49.setSelected(estado);
                break;
            case 50:
                jCheckBox50.setSelected(estado);
                break;
            case 51:
                jCheckBox51.setSelected(estado);
                break;
            case 52:
                jCheckBox52.setSelected(estado);
                break;
            case 53:
                jCheckBox53.setSelected(estado);
                break;
            case 54:
                jCheckBox54.setSelected(estado);
                break;
            case 55:
                jCheckBox55.setSelected(estado);
                break;
            case 56:
                jCheckBox56.setSelected(estado);
                break;
            case 57:
                jCheckBox57.setSelected(estado);
                break;
            case 58:
                jCheckBox58.setSelected(estado);
                break;
            case 59:
                jCheckBox59.setSelected(estado);
                break;
            case 60:
                jCheckBox60.setSelected(estado);
                break;
            case 61:
                jCheckBox61.setSelected(estado);
                break;
            case 62:
                jCheckBox62.setSelected(estado);
                break;
            case 63:
                jCheckBox63.setSelected(estado);
                break;
            case 64:
                jCheckBox64.setSelected(estado);
                break;
            case 65:
                jCheckBox65.setSelected(estado);
                break;
            case 66:
                jCheckBox66.setSelected(estado);
                break;
            case 67:
                jCheckBox67.setSelected(estado); 
                break;
            case 68:
                jCheckBox68.setSelected(estado);   
                break;
            case 69:
                jCheckBox69.setSelected(estado);   
                break;
            case 70:
                jCheckBox70.setSelected(estado);   
                break;
            case 71:
                jCheckBox71.setSelected(estado);  
                break;
            case 72:
                jCheckBox72.setSelected(estado);
                break;
            case 73:
                jCheckBox73.setSelected(estado);   
                break;
            case 74:
                jCheckBox74.setSelected(estado);  
                break;
            case 75:
                jCheckBox75.setSelected(estado); 
                break;
           case 76:
                jCheckBox76.setSelected(estado);
                break;
            case 77:
                jCheckBox77.setSelected(estado);    
                break;
            case 78:
                jCheckBox78.setSelected(estado);    
                break;
            case 79:
                jCheckBox79.setSelected(estado);   
                break;
            case 80:
                jCheckBox80.setSelected(estado);
                break;
            case 81:
                jCheckBox81.setSelected(estado); 
                break;
            case 82:
                jCheckBox82.setSelected(estado);  
                break;
            case 83:
                jCheckBox83.setSelected(estado);    
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
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private Control control;
}
