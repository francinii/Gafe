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
import java.util.ArrayList;
import java.util.Calendar;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
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
        llenarComboTipoFiltro();
         
        //Crear los filtros en los header de las tablas.
        modelo = (DefaultTableModel) TablaReportes.getModel();
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
        TablaReportes.setRowSorter(elQueOrdena);

        // quitar que se muevan las columnas
        TablaReportes.getTableHeader().setReorderingAllowed(false); 
        
        //formato a la tabla para dar colores a las celdas
        TablaReportes.setDefaultRenderer(Object.class, new formatoTabla(0));
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
    
    private void llenarComboTipoFiltro() {
        ComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            todo,emisor, comercialEmisor, cedEmisor,receptor,comercialReceptor,cedReceptor,numFactura
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
        jLabel6 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        FechaAntes = new org.jdesktop.swingx.JXDatePicker();
        FechaDespues = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblCedulaJuridica = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JComboEmitidasRecibidas = new javax.swing.JComboBox<>();
        ComboFiltro = new javax.swing.JComboBox<>();
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
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 1, 1);
        jPanel1.add(jComboBox1, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
        jLabel1.setText("Categoría");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setForeground(new java.awt.Color(52, 21, 0));
        jLabel2.setText("Desde");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setForeground(new java.awt.Color(52, 21, 0));
        jLabel3.setText("Hasta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 9, 4, 4);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 21, 0));
        jLabel4.setText("Reporte");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
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
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(4, 3, 4, 1);
        jPanel1.add(btnFiltro, gridBagConstraints);

        jLabel6.setText("Filtro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel6, gridBagConstraints);

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 9, 4, 4);
        jPanel1.add(txtFiltro, gridBagConstraints);

        FechaAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaAntesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 1, 1);
        jPanel1.add(FechaAntes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(FechaDespues, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cédula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel13, gridBagConstraints);

        lblEmpresa.setText("jLabel14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(lblEmpresa, gridBagConstraints);

        lblCedulaJuridica.setText("jLabel15");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(lblCedulaJuridica, gridBagConstraints);

        jLabel14.setText("Emitidas/Recibidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        jPanel1.add(jLabel14, gridBagConstraints);

        JComboEmitidasRecibidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JComboEmitidasRecibidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboEmitidasRecibidasItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 1, 1);
        jPanel1.add(JComboEmitidasRecibidas, gridBagConstraints);

        ComboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 1, 1);
        jPanel1.add(ComboFiltro, gridBagConstraints);

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

    private void JComboEmitidasRecibidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboEmitidasRecibidasItemStateChanged
        FiltroTabla();
        
        //Lo que viene aqui es para cuando esta seleccionada la fecha, y se cambian los parametros, lo que hace 
        // reiniciar los parametros de fecha.
        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png")));
        statusBtnFiltrar = false;
        FechaAntes.setEditable(true);
        FechaDespues.setEditable(true);  
        FechaAntes.setDate(null);
        FechaDespues.setDate(null);
        
    }//GEN-LAST:event_JComboEmitidasRecibidasItemStateChanged

    private void FechaAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaAntesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaAntesActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        FiltroTabla(); 
        
        //Lo que viene aqui es para cuando esta seleccionada la fecha, y se cambian los parametros, lo que hace 
        // reiniciar los parametros de fecha.       
        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png")));
        statusBtnFiltrar = false;
        FechaAntes.setEditable(true);
        FechaDespues.setEditable(true);  
        FechaAntes.setDate(null);
        FechaDespues.setDate(null);
        
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed

        if ((FechaAntes.getDate() != null)) { // Validacion campos en Blanco
            //try {
                Calendar ini = Calendar.getInstance();
                
                Date desde = FechaAntes.getDate();
                Date hasta = FechaDespues.getDate();
                
                int fechasComparadas = hasta.compareTo(desde);
                  
                if (fechasComparadas > 0) {
                    if (statusBtnFiltrar == false) {
                        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/quitar.png")));
                        FechaAntes.setEditable(false);
                        FechaDespues.setEditable(false);
                        statusBtnFiltrar = true;
                        FiltroTabla(desde,hasta);
                         
                    } else {
                        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png")));
                        statusBtnFiltrar = false;
                        FechaAntes.setEditable(true);
                        FechaDespues.setEditable(true);                 
                        FiltroTabla(null,null);
                        
                        // al quitar el filtro de fecha quitar todos los demas filtros
                        jComboBox1.setSelectedIndex(0);
                        JComboEmitidasRecibidas.setSelectedIndex(0);
                        ComboFiltro.setSelectedIndex(0);
                        txtFiltro.setText("");
                        FechaAntes.setDate(null);
                        FechaDespues.setDate(null);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La fecha inicial no puede ser mayor que la fecha final", "Alerta", JOptionPane.INFORMATION_MESSAGE);

                }

           
        } else {
            JOptionPane.showMessageDialog(null, "Debes ingresar las fechas en el filtro", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }
                        
        
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        FiltroTabla();
        
        //Lo que viene aqui es para cuando esta seleccionada la fecha, y se cambian los parametros, lo que hace 
        // reiniciar los parametros de fecha.
        btnFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png")));
        statusBtnFiltrar = false;
        FechaAntes.setEditable(true);
        FechaDespues.setEditable(true);  
        FechaAntes.setDate(null);
        FechaDespues.setDate(null);
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    
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
        } catch (ParseException ex) {
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }  
    
        
    public void FiltroTabla(){
    
        trs = new TableRowSorter(modelo);
        List<RowFilter<Object, Object>> rfs = new ArrayList<RowFilter<Object, Object>>(3);
        
        String tipoFiltro = (ComboFiltro.getSelectedItem().toString()); // obtiende categoria del combo de filtros general
        String emitidasRecibidas = (JComboEmitidasRecibidas.getSelectedItem().toString());
        String tipoComprobante = (jComboBox1.getSelectedItem().toString()).replace(" ", "");
            
        String obtenerTxtFiltro = "";
        
        if (tipoFiltro.equals("Todos")) {
            obtenerTxtFiltro = "";
        }        
        if (emitidasRecibidas.equals("Todos")) {
            emitidasRecibidas = "";
        }

        if (tipoComprobante.equals("Todos")) {
            tipoComprobante = "";
        }
                
        rfs.add(RowFilter.regexFilter(emitidasRecibidas, 58));
        rfs.add(RowFilter.regexFilter(tipoComprobante, 0));       
        
        /*  Validacion del filtro para el combo box     */ 
        if (tipoFiltro.equals("Nombre Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            System.out.println("engtreee "+txtFiltro.getText());
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 8));  // Case sensitive
        } else if (tipoFiltro.equals("Nombre Comercial Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 9));
        } else if (tipoFiltro.equals("Cédula Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 7));
        } else if (tipoFiltro.equals("Nombre Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 17));
        } else if (tipoFiltro.equals("Nombre Comercial Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 18));
        } else if (tipoFiltro.equals("Cédula Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 16));
        } else if (tipoFiltro.equals("Numero de Factura")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 2));
        }     
        
        System.out.println("EmitidasRecibidas  "+obtenerTxtFiltro);
        System.out.println("tipoComprobante  "+tipoComprobante);
        System.out.println("Filtro del txt "+obtenerTxtFiltro);
       
          
        
        System.out.println("Tamano "+rfs.size());
        
        
        RowFilter<Object, Object> af = RowFilter.andFilter(rfs);       
        TablaReportes.setRowSorter(trs);
        trs.setRowFilter(af);          
    }
    
    
    public void FiltroTabla(Date desde , Date hasta){
    
        /* 
            Este filtro solo aplica para cuando queremos fechas.
        */
        
        trs = new TableRowSorter(modelo);
        List<RowFilter<Object, Object>> rfs = new ArrayList<RowFilter<Object, Object>>(5);
        
        String tipoFiltro = (ComboFiltro.getSelectedItem().toString()); // obtiende categoria del combo de filtros general
        String emitidasRecibidas = (JComboEmitidasRecibidas.getSelectedItem().toString());
        String tipoComprobante = (jComboBox1.getSelectedItem().toString()).replace(" ", "");
            
        String obtenerTxtFiltro = "";
        
        if (tipoFiltro.equals("Todos")) {
            obtenerTxtFiltro = "";
        }        
        if (emitidasRecibidas.equals("Todos")) {
            emitidasRecibidas = "";
        }

        if (tipoComprobante.equals("Todos")) {
            tipoComprobante = "";
        }
           
                
        rfs.add(RowFilter.regexFilter(emitidasRecibidas, 58));
        rfs.add(RowFilter.regexFilter(tipoComprobante, 0));       
        
        /*  Validacion del filtro para el combo box     */ 
        if (tipoFiltro.equals("Nombre Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            System.out.println("engtreee "+txtFiltro.getText());
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 8));  // Case sensitive
        } else if (tipoFiltro.equals("Nombre Comercial Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 9));
        } else if (tipoFiltro.equals("Cédula Emisor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 7));
        } else if (tipoFiltro.equals("Nombre Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 17));
        } else if (tipoFiltro.equals("Nombre Comercial Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 18));
        } else if (tipoFiltro.equals("Cédula Receptor")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2,RowFilter.regexFilter("(?i)" +obtenerTxtFiltro, 16));
        } else if (tipoFiltro.equals("Numero de Factura")) {
            obtenerTxtFiltro = txtFiltro.getText();
            rfs.add(2, RowFilter.regexFilter("(?i)" + obtenerTxtFiltro, 2));
        }

        System.out.println("EmitidasRecibidas  " + obtenerTxtFiltro);
        System.out.println("tipoComprobante  " + tipoComprobante);
        System.out.println("Filtro del txt " + obtenerTxtFiltro);

        
        if ((desde != null) || (hasta != null)) {
            rfs.add(RowFilter.dateFilter(ComparisonType.AFTER, desde, 3));
            rfs.add(RowFilter.dateFilter(ComparisonType.BEFORE, hasta, 3));

        }else { //esto es para cuando quiero quitar el filtro de las fechas.
            rfs.add(RowFilter.regexFilter(""));
            rfs.add(RowFilter.regexFilter(""));
        }
        
        RowFilter<Object, Object> af = RowFilter.andFilter(rfs);       
        TablaReportes.setRowSorter(trs);
        trs.setRowFilter(af);          
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFiltro;
    private org.jdesktop.swingx.JXDatePicker FechaAntes;
    private org.jdesktop.swingx.JXDatePicker FechaDespues;
    private javax.swing.JComboBox<String> JComboEmitidasRecibidas;
    private javax.swing.JTable TablaReportes;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JTextField txtFiltro;
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
    
    //Datos del combo filtro.
    
    private String emisor = "Nombre Emisor";
    private String comercialEmisor = "Nombre Comercial Emisor";
    private String cedEmisor = "Cédula Emisor";
    private String receptor = "Nombre Receptor";
    private String comercialReceptor = "Nombre Comercial Receptor";
    private String cedReceptor = "Cédula Receptor";
    private String numFactura = "Numero de Factura";
    
    
}
