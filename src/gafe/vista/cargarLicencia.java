
package gafe.vista;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class cargarLicencia extends javax.swing.JFrame {


    public cargarLicencia(String rutLicencia) {
        this.setTitle("Advertencia");
        Image icon = new ImageIcon(getClass().getResource("/recursos/alerta.png")).getImage();
        setIconImage(icon);
        this.setLocationRelativeTo(null); // centrar la pantalla.
        initComponents();

        this.rutaLicencia = rutLicencia;
        this.setLocationRelativeTo(null); // centrar la pantalla.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRutaLicencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información");
        setBackground(new java.awt.Color(247, 238, 212));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(247, 238, 212));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 21, 0), 15, true));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(247, 238, 212));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("La licencia del programa está vencida, favor realizar la actualización respectiva ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 9, 2, 2);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
        jPanel1.add(txtRutaLicencia, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 6, 2);
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jButton2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File file = abrirFileChooserLicencia();        
       
        txtRutaLicencia.setText(file.getPath());

        String leer = leerArhivoLicencia(file);
        
        boolean estado = escribirArchivoLicencia(rutaLicencia, leer);
        
        if(estado==true){
            JOptionPane.showMessageDialog(null, "Licencia cargada, favor reiniciar la aplicacion", "Alerta", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Problemas al cargar la licencia", "Alerta", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
        public String leerArhivoLicencia(File abre){
    // Metodo que carga la Licencia.Lic
    String aux = "";
    String texto = "";
    
        if (abre != null) {
            FileReader archivos = null;
            try {
                archivos = new FileReader(abre);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader lee = new BufferedReader(archivos);

            try {
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
            } catch (IOException ex) {
                Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                lee.close();
            } catch (IOException ex) { 
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }

        return texto;

    }
    
    
    
    
    public File abrirFileChooserLicencia() {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter xmlFilter = new FileNameExtensionFilter("Archivos Lic", "lic");
        jfc.setDialogTitle("Seleccione los archivos");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(xmlFilter);
        jfc.setAcceptAllFileFilterUsed(false);
        //Image icon = new ImageIcon(getClass().getResource("/recursos/Camelot.png")).getImage();

        int returnValue = jfc.showOpenDialog(null);
        File abre = jfc.getSelectedFile();

        return abre;
    }

        public boolean escribirArchivoLicencia(String ruta,String datos){
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        File file = new File("licencia.lic");
        
        boolean estado = true;
        try{
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return estado;

    }
    
    ControlFormularioPrincipal controlVentanas;
    String rutaLicencia;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRutaLicencia;
    // End of variables declaration//GEN-END:variables
}
