
package gafe.vista;
import gafe.control.Control;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

public class formularioListarXml extends javax.swing.JPanel {

   Control control;
   
   JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());   
   
    public formularioListarXml(Control control) {
        
        initComponents();
        this.control = control;
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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 530;
        gridBagConstraints.ipady = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 23, 0, 23);
        add(jScrollPane1, gridBagConstraints);

        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        add(jButton1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public void AgregarDatosTabla(String nombre, String ruta, long tamano){
        
        DefaultTableModel modelo=(DefaultTableModel) tablaXml.getModel(); //Obtengo el modelo existente por defecto     
        Object [] fila = new Object[3];
        
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

                    control.controlLectorFacturas(files);

                    System.out.println("Hagase Grande" + listaArchivosArrastrados.size());

                } catch (Exception ex) {
                    System.out.println("Error" + ex);

                }

            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaXml;
    // End of variables declaration//GEN-END:variables
}
