package gafe.vista;

import gafe.control.Control;
import gafe.modelo.VariablesGlobales;
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
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;

public class formularioListarXml extends javax.swing.JPanel {

    ControlFormularioPrincipal controlVentanas;

    //   JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    public formularioListarXml(ControlFormularioPrincipal control) {

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
        nombreEmpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cedulaJuridica = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        tablaXml.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre", "Ruta", "Tamaño"
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

        nombreEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(nombreEmpresa, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Empresa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(jLabel3, gridBagConstraints);

        cedulaJuridica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 6, 32);
        add(cedulaJuridica, gridBagConstraints);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // File[] files = controlVentanas.abrirFileChooser("Archivos XML", "xml",true);
            VariablesGlobales vg = VariablesGlobales.getInstance();
            String guardarEn = "C:" + '\\' + "Users" + '\\' + "HP_810G2" + '\\' + "Desktop" + '\\' + vg.getNombreProyectoActual() + ".gafe";
            controlVentanas.agregarFacturaProyecto(guardarEn, "Archivos XML", "xml", true);
//        FileFilter xmlFilter = new FileNameExtensionFilter("Archivos XML", "xml");
//       jfc.setDialogTitle("Seleccione los archivos");
//        jfc.setMultiSelectionEnabled(true);
//        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        jfc.setFileFilter(xmlFilter);
//        File[] files = null;
//
//        int returnValue = jfc.showOpenDialog(null);
//        if (returnValue == JFileChooser.APPROVE_OPTION) {
//            files = jfc.getSelectedFiles();
//        }
//
//        //Cargar Tabla
//if(files != null){
//    for (int i = 0; i < files.length; i++) {
//        String nombre = files[i].getName();
//        String ruta = files[i].getAbsolutePath();
//        long tamano = files[i].length();
//        AgregarDatosTabla(nombre, ruta, tamano);
//    }
////        control.controlLectorFacturas(files);
//}
        } catch (JAXBException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(formularioListarXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AgregarDatosTabla(String nombre, String ruta, long tamano) {
        DefaultTableModel modelo = (DefaultTableModel) tablaXml.getModel(); //Obtengo el modelo existente por defecto     
        Object[] fila = new Object[3];
        fila[0] = nombre;
        fila[1] = ruta;
        fila[2] = tamano + " Mb";
        modelo.addRow(fila);

        tablaXml.setModel(modelo);
    }

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
                    for (int i = 0; i < files.length; i++) {
                        String nombre = files[i].getName();
                        String ruta = files[i].getAbsolutePath();
                        long tamano = files[i].length();
                        AgregarDatosTabla(nombre, ruta, tamano);
                    }
                    controlVentanas.controlLectorFacturas(files);
                    System.out.println("Hagase Grande" + listaArchivosArrastrados.size());

                } catch (Exception ex) {
                    System.out.println("Error" + ex);

                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedulaJuridica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JTable tablaXml;
    // End of variables declaration//GEN-END:variables
}
