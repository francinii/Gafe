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
        arrastrarSoltar(); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaXml = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNombre = new javax.swing.JLabel();
        txtCedulaJ = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        tablaXml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Factura", "Emisor", "Receptor", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaXml);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 530;
        gridBagConstraints.ipady = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 27, 5, 32);
        add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jButton1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cédula jurídica:");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(jLabel3, gridBagConstraints);

        jButton2.setText("Cargar facturas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 4, 30);
        add(jButton2, gridBagConstraints);

        txtNombre.setText("Empresa");
        add(txtNombre, new java.awt.GridBagConstraints());

        txtCedulaJ.setText("Cedula Juridica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(txtCedulaJ, gridBagConstraints);

        jButton3.setText("-");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        add(jButton3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarTabla() {
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
            controlVentanas.agregarFacturaProyecto( guardarEn,"Archivos XML", "xml",true,tablaXml);
        } catch (JAXBException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controlVentanas.eliminarFacturas(tablaXml);
    }//GEN-LAST:event_jButton3ActionPerformed
      
    public void arrastrarSoltar() {

        DropTarget target = new DropTarget(tablaXml, new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent e) {

                try {
                    File[] files = null;
                    // Aceptar el Drop
                    e.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);

                    // Get the files that are dropped as java.util.List
                    //java.util.List list=(java.util.List) e.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    List<File> listaArchivosArrastrados = (List<File>) e.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);

                    files = new File[listaArchivosArrastrados.size()];
                    files = listaArchivosArrastrados.toArray(files);

                    //Cargar Tabla
//                    for (int i = 0; i < files.length; i++) {
//                        String nombre = files[i].getName();
//                        String ruta = files[i].getAbsolutePath();
//                        long tamano = files[i].length();
//                        AgregarDatosTabla(nombre, ruta, tamano);
//                    }
                    //controlVentanas.controlLectorFacturas(files);
                    
                    String guardarEn = RecursosCompartidos.getRuta(); 
                    
                    
                    controlVentanas.agregarFacturaProyecto(files,guardarEn,tablaXml);
                    
                    

                } catch (Exception ex) {
                    System.out.println("Error" + ex);

                }

            }
        });

    }
    
    //retornar la tabla para poder cargarla a la hora de abrir el archivo .GAFE
    public JTable obtenerTabla(){
        return tablaXml;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaXml;
    private javax.swing.JLabel txtCedulaJ;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
