package gafe.vista;

import gafe.modelo.FormatoFecha;
import gafe.modelo.TipoFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class formularioReporte extends javax.swing.JPanel {

    ControlFormularioPrincipal controlVentanas;
    DefaultTableModel modelo;
    TableRowSorter trs;
    
    boolean statusBtnFiltrar = false;

    public formularioReporte(ControlFormularioPrincipal control) {
        this.controlVentanas = control;
        initComponents();
        init();
       
    }

    public void init() {
        llenarComboFacturas();
        llenarComboEmitidosRecibidos();
         
        //Crear los filtros en los header de las tablas.
        modelo = (DefaultTableModel) TablaReportes.getModel();
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
        TablaReportes.setRowSorter(elQueOrdena);

    }

    public JTable ObtenerTablaReportes() {
        return TablaReportes;
    }

        
    public void llenarDatosProyecto(String nombre, String cedula) {
        lblEmpresa.setText(cedula);
        lblCedulaJuridica.setText(nombre);
    }

    private void llenarComboFacturas() {
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{todo,
            facturaElectronica,
            notaCredito, notaDebito,
            tiqueteElectronico}));
    }

    private void llenarComboEmitidosRecibidos() {
        JComboEmitidasRecibidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            todo,noAplica, emitidas, recibidas
        }));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFiltro = new javax.swing.JButton();
        txtFiltroNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFiltroEmisor = new javax.swing.JTextField();
        txtNombreComercial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreComercialRecep = new javax.swing.JTextField();
        txtFiltroCedEmisor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFiltroCedReceptor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFiltroFactura = new javax.swing.JTextField();
        FechaAntes = new org.jdesktop.swingx.JXDatePicker();
        FechaDespues = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblCedulaJuridica = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JComboEmitidasRecibidas = new javax.swing.JComboBox<>();
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

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
        jLabel1.setText("Categoría");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(52, 21, 0));
        jLabel2.setText("Desde");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(52, 21, 0));
        jLabel3.setText("Hasta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 21, 0));
        jLabel4.setText("Reporte");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jLabel4, gridBagConstraints);

        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png"))); // NOI18N
        btnFiltro.setToolTipText("");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(3, 2, 3, 0);
        jPanel1.add(btnFiltro, gridBagConstraints);

        txtFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroNombreActionPerformed(evt);
            }
        });
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtFiltroNombre, gridBagConstraints);

        jLabel5.setText("Nombre Receptor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Nombre Emisor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel6, gridBagConstraints);

        txtFiltroEmisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroEmisorKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtFiltroEmisor, gridBagConstraints);

        txtNombreComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComercialKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtNombreComercial, gridBagConstraints);

        jLabel7.setText("Nom Comercial Emisor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Nom Comecial Receptor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel8, gridBagConstraints);

        txtNombreComercialRecep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreComercialRecepKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtNombreComercialRecep, gridBagConstraints);

        txtFiltroCedEmisor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroCedEmisorKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtFiltroCedEmisor, gridBagConstraints);

        jLabel9.setText("Ced. Emisor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Ced. Receptor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel10, gridBagConstraints);

        txtFiltroCedReceptor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroCedReceptorKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtFiltroCedReceptor, gridBagConstraints);

        jLabel11.setText("Numero de Factura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel11, gridBagConstraints);

        txtFiltroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroFacturaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel1.add(txtFiltroFactura, gridBagConstraints);

        FechaAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaAntesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(FechaAntes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(FechaDespues, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cédula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jLabel13, gridBagConstraints);

        lblEmpresa.setText("jLabel14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(lblEmpresa, gridBagConstraints);

        lblCedulaJuridica.setText("jLabel15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(lblCedulaJuridica, gridBagConstraints);

        jLabel14.setText("Emitidas/Recibidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel1.add(jLabel14, gridBagConstraints);

        JComboEmitidasRecibidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JComboEmitidasRecibidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboEmitidasRecibidasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        jPanel1.add(JComboEmitidasRecibidas, gridBagConstraints);

        add(jPanel1);

        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Clave", "Consecutivo", "Fecha Emision", "Condicion Venta", "Plaza Credito", "Medio Pago", "Cédula Emisor", "Nombre Emisor", "Nombre Comercial Emisor", "Telefono Emisor", "Fax Emisor", "Correo Electrónico Emisor", "Provincia Emisor", "Cantón Emisor", "Distrito Emisor", "Cédula Receptor", "Nombre Receptor", "Nombre Comercial Receptor", "Identificacion Extranjero", "Telefono Receptor", "Fax Receptor", "Correo Electrónico Receptor", "Provincia Receptor", "Cantón Receptor", "Distrito Receptor", "Numero de Linea", "Codigo del Producto", "Cantidad", "Unidad de Medida", "Unidad de Medida Comercial", "Detalle", "Monto Descuento", "Naturaleza Descuento", "SubTotal", "Monto Total", "Codigo Impuesto", "Tarifa Impuesto", "Monto Impuesto", "Monto Impuesto Exoneración", "Tipo documento Exoneracion", "Numero Documento Exoneracion", "Nombre Institución Exoneración", "Fecha Emisión Exoneración", "Porcentaje Compra Exoneración", "Codigo Moneda", "Tipo Cambio", "Total Serv Gravados", "Total Serv Excentos", "Total Mercancias Gravadas", "Total Mercancias Excentas", "Tota Gravado", "Total Excento", "Total Venta", "Total Descuentos", "Total Venta Neta", "Total Impuestos", "Total Comprobante", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true
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


    
    
    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed

        if ((FechaAntes.getDate() != null)) { // Validacion campos en Blanco 
            try {
                Calendar ini = Calendar.getInstance();
                SimpleDateFormat formaterIni = new SimpleDateFormat("dd/MM/yyyy");
                formaterIni.format(FechaAntes.getDate());

                Calendar fin = Calendar.getInstance();
                SimpleDateFormat formaterFin = new SimpleDateFormat("dd/MM/yyyy");
                formaterFin.format(FechaDespues.getDate());

                String fIncio = formaterIni.format(FechaAntes.getDate());
                String fFinal = formaterFin.format(FechaDespues.getDate());

                /* Validacio para evitar traslape de fechas
                    Convertir dechas a Date.
                
                el compare to devuelve 
                1 - bien
                -1 si esta mal
                
                 */
                Date fecha1 = formaterIni.parse(fIncio);
                Date fecha2 = formaterIni.parse(fFinal);

                int fechasComparadas = fecha2.compareTo(fecha1);

                if (fechasComparadas > 0) {
                    if (statusBtnFiltrar == false) {
                        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/quitar.png")));
                        FechaAntes.setEditable(false);
                        FechaDespues.setEditable(false);   
                        controlVentanas.abrirFormularioReportes(TablaReportes, fIncio, fFinal);                       
                        statusBtnFiltrar = true;
                    } else {
                        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png")));
                        statusBtnFiltrar = false;
                        FechaAntes.setEditable(true);
                        FechaDespues.setEditable(true);                       
                        FechaAntes.setDate(null);
                        FechaDespues.setDate(null);
                        controlVentanas.limpiarTablaGenerico(TablaReportes);
                        controlVentanas.abrirFormularioReportes(controlVentanas.getControl().getPanelPrincipal());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La fecha inicial no puede ser mayor que la fecha final", "Alerta", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (ParseException ex) {
                Logger.getLogger(formularioReporte.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes ingresar las fechas en el filtro", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnFiltroActionPerformed

    public String formatoFecha(String fecha) {
        if (!fecha.equals("")) {
            fecha = fecha.substring(0, 10);
            // 2018-02-14T10:51:04.707
            String[] fechaFinal = fecha.split("-");
            String anio = fechaFinal[0];
            String mes = fechaFinal[1];
            String dia = fechaFinal[2];
            return dia + "/" + mes + "/" + anio;
        }
        return "";
    }

    public boolean compararFecha(String fechaI, String fechaF, String fechaComparar) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = formato.parse(fechaI);
            Date fecha2 = formato.parse(fechaF);
            Date fechaComp = formato.parse(fechaComparar);
            if ((fechaComp.compareTo(fecha1) == 0 || fechaComp.compareTo(fecha1) > 0) && (fechaComp.compareTo(fecha2) == 0 || fechaComp.compareTo(fecha2) < 0)) {
                return true;
            }
//            if (!fechaComp.after(fecha1) && !fechaComp.before(fecha2)) {
//                return true;
//                /* historyDate <= todayDate <= futureDate */
//            }
        } catch (ParseException ex) {
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }  
    
    
    
    
    private void txtFiltroNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyTyped

        txtFiltroNombre.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltroNombre.getText(), 17));
            }

        });

        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);

    }//GEN-LAST:event_txtFiltroNombreKeyTyped

    private void txtFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroNombreActionPerformed

    private void txtFiltroEmisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroEmisorKeyTyped
        txtFiltroEmisor.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltroEmisor.getText(), 8));
            }

        });

        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
        
    }//GEN-LAST:event_txtFiltroEmisorKeyTyped

    private void txtNombreComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComercialKeyTyped
        txtNombreComercial.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtNombreComercial.getText(), 9));
            }

        });

        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreComercialKeyTyped

    private void txtNombreComercialRecepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreComercialRecepKeyTyped
        txtNombreComercialRecep.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtNombreComercialRecep.getText(), 18));
            }
        });

        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtNombreComercialRecepKeyTyped

    private void txtFiltroCedEmisorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroCedEmisorKeyTyped
        txtFiltroCedEmisor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltroCedEmisor.getText(), 7));
            }
        });
        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroCedEmisorKeyTyped

    private void txtFiltroCedReceptorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroCedReceptorKeyTyped
        txtFiltroCedReceptor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltroCedReceptor.getText(), 16));
            }
        });
        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroCedReceptorKeyTyped

    private void txtFiltroFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroFacturaKeyTyped
        txtFiltroFactura.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltroFactura.getText(), 2));
            }
        });
        trs = new TableRowSorter(modelo);
        TablaReportes.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroFacturaKeyTyped

    private void FechaAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaAntesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaAntesActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        trs = new TableRowSorter(modelo);
        String dato = (jComboBox1.getSelectedItem().toString()).replace(" ", "");
        
        System.out.println("dat  "+dato);
        if (dato.equals("Todos")) {
            trs.setRowFilter(RowFilter.regexFilter(""));
        } else {
            trs.setRowFilter(RowFilter.regexFilter(dato,0));
        }
        
        TablaReportes.setRowSorter(trs);


    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void JComboEmitidasRecibidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboEmitidasRecibidasItemStateChanged
        
        trs = new TableRowSorter(modelo);
        String dato = (JComboEmitidasRecibidas.getSelectedItem().toString());
        
        System.out.println("dat  "+dato);
        if (dato.equals("Todos")) {
            trs.setRowFilter(RowFilter.regexFilter(""));
        } else {
            trs.setRowFilter(RowFilter.regexFilter(dato,58));
        }
        
        TablaReportes.setRowSorter(trs);
        
        
        
        
        
        
    }//GEN-LAST:event_JComboEmitidasRecibidasItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker FechaAntes;
    private org.jdesktop.swingx.JXDatePicker FechaDespues;
    private javax.swing.JComboBox<String> JComboEmitidasRecibidas;
    private javax.swing.JTable TablaReportes;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JTextField txtFiltroCedEmisor;
    private javax.swing.JTextField txtFiltroCedReceptor;
    private javax.swing.JTextField txtFiltroEmisor;
    private javax.swing.JTextField txtFiltroFactura;
    private javax.swing.JTextField txtFiltroNombre;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtNombreComercialRecep;
    // End of variables declaration//GEN-END:variables
    private String todo = "Todos";
    private String facturaElectronica = "Factura Electronica";
    private String notaCredito = "Nota Credito Electronica";
    private String notaDebito = "Nota Debito Electronica";
    private String tiqueteElectronico = "Tiquete electronico";
    
    //Datos del combo emitidasRecibidas;
    private String noAplica = "N/A";
    private String emitidas = "Emitida";
    private String recibidas = "Recibida";
    

}
