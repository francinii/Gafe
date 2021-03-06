/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafe.vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class formularioProveedores extends javax.swing.JPanel {
    
DefaultTableModel modelo;
   
    public formularioProveedores(ControlFormularioPrincipal controlFormularioPrincipal) {
        initComponents();
        this.controlVentanas = controlFormularioPrincipal;
        //Crear los filtros en los header de las tablas.
        modelo = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(modelo);
        jTable1.setRowSorter(elQueOrdena);
        
        //Dar formato a la tabla 
        jTable1.setDefaultRenderer(Object.class, new formatoTabla(2));
        FramePrincipal = controlFormularioPrincipal.getControl().getPanelPrincipal();
    }

        
    public void llenarDatosProyecto(String nombre, String cedula) {
        lblEmpresa.setText(cedula);
        lblCedulaJuridica.setText(nombre);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblCedulaJuridica = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 238, 212));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(247, 238, 212));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Cédula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel13, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel12, gridBagConstraints);

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmpresa.setText("Cedula Juridica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(lblEmpresa, gridBagConstraints);

        lblCedulaJuridica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCedulaJuridica.setText("Empresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        jPanel3.add(lblCedulaJuridica, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
        jLabel1.setText("Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel3.add(jLabel1, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.4;
        jPanel3.add(jScrollPane1, gridBagConstraints);

        add(jPanel3);

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
        controlVentanas.exportarReporte(jTable1,FramePrincipal);
    }//GEN-LAST:event_jButton2ActionPerformed

    public JTable tablaProveedores(){
        return jTable1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblEmpresa;
    // End of variables declaration//GEN-END:variables

    ControlFormularioPrincipal controlVentanas;
    private JPanel FramePrincipal;
}
