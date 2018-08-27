
package gafe.vista;

import gafe.control.configuracion.Configuracion;
import java.awt.Dimension;
import static java.awt.Frame.NORMAL;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;


public class acercaDe extends javax.swing.JFrame {
    public acercaDe() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(aplicacion, gridBagConstraints);

        derechos.setText("derechos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(derechos, gridBagConstraints);

        organizacion.setText("organizacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(organizacion, gridBagConstraints);

        proyecto.setText("proyecto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(proyecto, gridBagConstraints);

        version.setText("version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 27, 4, 27);
        jPanel1.add(version, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(12, 23, 0, 23);
        jPanel1.add(jScrollPane1, gridBagConstraints);

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

    private void configurar() {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel organizacion;
    private javax.swing.JLabel proyecto;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
