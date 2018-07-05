package gafe.vista;

import gafe.control.Control;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTree;
import javax.xml.bind.JAXBException;

public class formularioPrincipal extends javax.swing.JFrame {

    public formularioPrincipal(Control control, ControlFormularioPrincipal controlFormularioPrincipal) {
        this.control = control; //puede que no se use mas adelante
        this.controlFormularioPrincipal = controlFormularioPrincipal;
        init();
    }

    public void init() {
        initComponents();
        setVisible(true);
      //  controlFormularioPrincipal.agregarNodoArbol(arbol);
    }

    public JTree arbol() {
        return arbol;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        panelPrincipal = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(110, 23));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbol);

        jSplitPane1.setLeftComponent(jScrollPane1);

        panelPrincipal.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(panelPrincipal);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevo2.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/abrir2.png"))); // NOI18N
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar2.png"))); // NOI18N
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnGuardar);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir proyecto");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Guardar como");
        jMenuItem4.setToolTipText("");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Cerrar todos los proyectos");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Salir");
        jMenuItem6.setToolTipText("");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Preferencias");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Acerca de");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
        controlFormularioPrincipal.arbolMouseClicked(arbol, panelPrincipal);
    }//GEN-LAST:event_arbolMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controlFormularioPrincipal.abrirFormularioCrearProyecto(panelPrincipal);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        controlFormularioPrincipal.abrirFormularioCrearProyecto(panelPrincipal);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
         try {
            controlFormularioPrincipal.abrirNuevoProyecto(arbol);
        } catch (JAXBException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            controlFormularioPrincipal.abrirNuevoProyecto(arbol);
        } catch (JAXBException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
    
    private final Control control;
    private final ControlFormularioPrincipal controlFormularioPrincipal;
}
