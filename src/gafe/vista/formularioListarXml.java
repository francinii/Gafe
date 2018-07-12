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
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(35, 114, 75));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(35, 114, 75));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtCedulaJ.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaJ.setText("Cedula Juridica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtCedulaJ, gridBagConstraints);

        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Empresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(txtNombre, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel2.setBackground(new java.awt.Color(35, 114, 75));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setText("Cargar facturas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("-");
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
        ));
        jScrollPane1.setViewportView(tablaXml);

        add(jScrollPane1);

        jPanel3.setBackground(new java.awt.Color(35, 114, 75));

        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        add(jPanel3);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaXml;
    private javax.swing.JLabel txtCedulaJ;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
