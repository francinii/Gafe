package gafe.vista;

import gafe.control.Control;
import gafe.modelo.Proyecto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class formularioCrearProyecto extends javax.swing.JPanel {

    ControlFormularioPrincipal controlVentanas;

    public formularioCrearProyecto(ControlFormularioPrincipal c) {
        initComponents();
        validacion.setVisible(false);
        this.controlVentanas = c;
        this.FramePrincipal = c.getControl().getPanelPrincipal();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtDescripcionProyecto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        txtNombreProyecto = new javax.swing.JTextField();
        txtRuta = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        validacion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 238, 212));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(512, 137));
        setLayout(new java.awt.GridBagLayout());

        txtDescripcionProyecto.setColumns(20);
        txtDescripcionProyecto.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(txtDescripcionProyecto, gridBagConstraints);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 3, 4, 54);
        add(jButton1, gridBagConstraints);

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(txtCedula, gridBagConstraints);

        txtNombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProyectoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(txtNombreProyecto, gridBagConstraints);

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(txtRuta, gridBagConstraints);

        btnGuardar.setText("Crear");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        add(btnGuardar, gridBagConstraints);

        jLabel5.setForeground(new java.awt.Color(52, 21, 0));
        jLabel5.setText("Nombre del proyecto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel5, gridBagConstraints);

        jLabel6.setForeground(new java.awt.Color(52, 21, 0));
        jLabel6.setText("Ruta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel6, gridBagConstraints);

        jLabel7.setForeground(new java.awt.Color(52, 21, 0));
        jLabel7.setText("Cédula");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel7, gridBagConstraints);

        jLabel8.setForeground(new java.awt.Color(52, 21, 0));
        jLabel8.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        add(jLabel8, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 21, 0));
        jLabel1.setText("Nuevo Proyecto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        add(jLabel1, gridBagConstraints);

        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 54);
        add(jButton2, gridBagConstraints);

        validacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/invalid.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 3);
        add(validacion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ruta = controlVentanas.obtenerRutaFileChooser();
        if (!ruta.equals("")) {
            txtRuta.setText(ruta);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProyectoActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            String ruta = txtRuta.getText();
            String nombreProyecto = txtNombreProyecto.getText();
            String descripcionProyecto = txtDescripcionProyecto.getText();
            String cedula = txtCedula.getText();
            if (ruta.equals("") || nombreProyecto.equals("") || descripcionProyecto.equals("")|| cedula.equals("")) {
                controlVentanas.mensaje("Debes ingresar todos los campos");
            } else {
                String guardarEn = ruta + '\\' + nombreProyecto + ".gafe";
                limpiarFormulario();
                controlVentanas.crearXmlProyecto(nombreProyecto, cedula, descripcionProyecto, guardarEn);
                controlVentanas.mensaje("Proyecto creado satisfactoriamente");
                validacion.setVisible(false);

            }
        } catch (IOException e) {
        } catch (JAXBException ex) {
            Logger.getLogger(formularioCrearProyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File ruta = controlVentanas.abrirFileChooser("xml", "xml",FramePrincipal);
        if (ruta != null) {
            String cedula = txtCedula.getText();
            if (controlVentanas.validarCedulaProyecto(ruta, cedula)) {
                validacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/valid.png")));
                validacion.setVisible(true);
            } else {
                validacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/invalid.png")));
                validacion.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void limpiarFormulario() {
        txtRuta.setText("");
        txtNombreProyecto.setText("");
        txtDescripcionProyecto.setText("");
        txtCedula.setText("");

    }
    
    private JPanel FramePrincipal;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDescripcionProyecto;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JLabel validacion;
    // End of variables declaration//GEN-END:variables
}
