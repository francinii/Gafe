package gafe.vista;

import gafe.control.Control;
import gafe.modelo.Proyecto;
import gafe.modelo.RecursosCompartidos;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.xml.bind.JAXBException;

public class formularioListarXml extends javax.swing.JPanel {

    ControlFormularioPrincipal controlVentanas;

    public formularioListarXml(ControlFormularioPrincipal control) {
        System.out.println("Entre constructor");
        initComponents();
        this.controlVentanas = control;
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txtCedulaJ = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaXml = new javax.swing.JTable();

        setBackground(new java.awt.Color(247, 238, 212));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(247, 238, 212));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtCedulaJ.setForeground(new java.awt.Color(52, 21, 0));
        txtCedulaJ.setText("Cedula Juridica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtCedulaJ, gridBagConstraints);

        txtNombre.setBackground(new java.awt.Color(247, 238, 212));
        txtNombre.setForeground(new java.awt.Color(52, 21, 0));
        txtNombre.setText("Empresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtNombre, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 21, 0));
        jLabel3.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
        jLabel1.setText("Cédula jurídica:");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jLabel1, gridBagConstraints);

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(247, 238, 212));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/plus.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/minus.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        add(jPanel2);

        tablaXml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Factura", "Emisor", "Receptor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaXml);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarTabla() {
        System.out.println("Limpiar tabla listar");
        DefaultTableModel modelo = (DefaultTableModel) tablaXml.getModel();
        int filas = tablaXml.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
            System.out.println("Limpiar");
        }
        txtCedulaJ.setText("");
        txtNombre.setText("");
    }

    public void llenarDatosProyecto(String nombre, String cedula) {
        txtCedulaJ.setText(cedula);
        txtNombre.setText(nombre);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String guardarEn = RecursosCompartidos.getRuta();
            controlVentanas.agregarFacturaProyecto(guardarEn, "Archivos XML", "xml", true, tablaXml);
        } catch (JAXBException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar las facturas seleccionadas?", "", JOptionPane.YES_NO_OPTION);
        if (respuesta == 0) {
            controlVentanas.eliminarFacturas(tablaXml);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //retornar la tabla para poder cargarla a la hora de abrir el archivo .GAFE
    public JTable obtenerTabla() {
        return tablaXml;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaXml;
    private javax.swing.JLabel txtCedulaJ;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
