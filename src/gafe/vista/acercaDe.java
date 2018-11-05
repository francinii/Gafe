
package gafe.vista;

import gafe.control.configuracion.Configuracion;
import gafe.modelo.RecursosCompartidos;
import java.awt.Cursor;
import java.awt.Dimension;
import static java.awt.Frame.NORMAL;
import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;


public class acercaDe extends javax.swing.JFrame {
    public acercaDe() {
        
        this.setTitle("Acerca de...");
        Image icon = new ImageIcon(getClass().getResource("/recursos/acercade.png")).getImage();
        setIconImage(icon);
        initComponents();
        configurar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aplicacion = new javax.swing.JLabel();
        derechos = new javax.swing.JLabel();
        organizacion = new javax.swing.JLabel();
        proyecto = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        lblLicencia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblProyectos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(247, 238, 212));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Camelot.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        jPanel1.add(jLabel1, gridBagConstraints);

        aplicacion.setText("aplicacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(aplicacion, gridBagConstraints);

        derechos.setText("derechos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(derechos, gridBagConstraints);

        organizacion.setText("organizacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(organizacion, gridBagConstraints);

        proyecto.setText("proyecto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(proyecto, gridBagConstraints);

        version.setText("version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(version, gridBagConstraints);

        lblLicencia.setText("Licencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(lblLicencia, gridBagConstraints);

        jLabel3.setText("Licencia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Terminos y Condiciones");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setText("#Proyectos");
        jPanel1.add(jLabel4, new java.awt.GridBagConstraints());

        lblProyectos.setText("lblProyectos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(lblProyectos, gridBagConstraints);

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(52, 21, 0));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        
        String file = new String("Licencia.pdf");
        
        try {
            //definiendo la ruta en la propiedad file
            Runtime.getRuntime().exec("cmd /c start " + file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void configurar() {
        this.setLocationRelativeTo(null); // centrar la pantalla.
        setSize(600,400);
        setResizable(false); 
        //Dimension d = getSize();
        //setMinimumSize(d);
        //setResizable(false);
        //setLocationRelativeTo(null);

        try {
            Configuracion c = Configuracion.obtenerInstancia();
            aplicacion.setText(c.obtenerValorPropiedad("aplicacion"));
            derechos.setText(c.obtenerValorPropiedad("derechos"));
            organizacion.setText(c.obtenerValorPropiedad("organizacion"));
            proyecto.setText(c.obtenerValorPropiedad("proyecto"));
            version.setText(String.format("Versión %s", c.obtenerValorPropiedad("version")));
            lblLicencia.setText(RecursosCompartidos.getFechaLicencia());
            lblProyectos.setText(String.valueOf(RecursosCompartidos.getCantidadDeProyectos()));
        } catch (Exception e) {
            System.err.println("No se puede obtener la información de configuración..");
        }

        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void cerrarVentana() {
        setVisible(false);
    }

    public void activarVentana() {
        setVisible(true);
        setLocationRelativeTo(null);
        requestFocus();
        setExtendedState(NORMAL);
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aplicacion;
    private javax.swing.JLabel derechos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLicencia;
    private javax.swing.JLabel lblProyectos;
    private javax.swing.JLabel organizacion;
    private javax.swing.JLabel proyecto;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
