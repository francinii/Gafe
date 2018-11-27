
package gafe.vista;

import gafe.control.Control;
import gafe.modelo.RecursosCompartidos;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.xml.bind.JAXBException;


public class formularioPrincipal extends javax.swing.JFrame {

        
    public formularioPrincipal(Control control, ControlFormularioPrincipal controlFormularioPrincipal) {
        this.setTitle("Gestor de Facturación Electrónica CAMELOT");
        Image icon = new ImageIcon(getClass().getResource("/recursos/Camelot.png")).getImage();
        setIconImage(icon);
        this.MiControl = control; //puede que no se use mas adelante
        this.controlFormularioPrincipal = controlFormularioPrincipal;
        
        init();
        
    }
    public void init() {
        initComponents();  
        this.setLocationRelativeTo(null); // centrar la pantalla.
        //Abre proyectos recientes
        try {
            this.controlFormularioPrincipal.abrirProyectosRecientes(arbol);
        } catch (JAXBException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }        
        controlFormularioPrincipal.expandirArbol(arbol);
        setVisible(true);   
    }


    public JTree arbol() {
        return arbol;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuContextual = new javax.swing.JPopupMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        panelPrincipalNuevo = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem10.setText("Cerrar");
        jMenuItem10.setToolTipText("");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuContextual.add(jMenuItem10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(800, 500));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(110, 23));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Proyectos");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.setComponentPopupMenu(menuContextual);
        arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbol);

        jSplitPane1.setLeftComponent(jScrollPane1);

        panelPrincipalNuevo.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipalNuevo.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(panelPrincipalNuevo);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setBackground(new java.awt.Color(52, 21, 0));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        btnNuevo.setBackground(new java.awt.Color(52, 21, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new32.png"))); // NOI18N
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

        btnAbrir.setBackground(new java.awt.Color(52, 21, 0));
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Open32.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbrir);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBackground(new java.awt.Color(66, 114, 215));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setText("Archivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevo.png"))); // NOI18N
        jMenuItem1.setText("Nuevo proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/abrir.png"))); // NOI18N
        jMenuItem2.setText("Abrir proyecto");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salir.png"))); // NOI18N
        jMenuItem5.setText("Cerrar todos los proyectos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/exit.png"))); // NOI18N
        jMenuItem6.setText("Salir");
        jMenuItem6.setToolTipText("");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Preferencias");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Filter List.png"))); // NOI18N
        jMenuItem7.setText("Filtrar reportes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/help.png"))); // NOI18N
        jMenuItem8.setText("Ayuda");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/about.png"))); // NOI18N
        jMenuItem9.setText("Acerca de");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getPanelPrincipal(){
        return panelPrincipalNuevo;
    }      
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controlFormularioPrincipal.abrirFormularioCrearProyecto(panelPrincipalNuevo);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        controlFormularioPrincipal.abrirFormularioCrearProyecto(panelPrincipalNuevo);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            controlFormularioPrincipal.abrirNuevoProyecto(arbol,MiControl.getPanelPrincipal());
        } catch (JAXBException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        controlFormularioPrincipal.cerrarTodosLosProyectos(arbol);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       // dispose();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        filtroReporte ventanaFiltros = new filtroReporte(MiControl);
        ventanaFiltros.leerArchivoConfiguracion();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        MiControl.mostrarAcercaDe();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
         try {
            controlFormularioPrincipal.abrirNuevoProyecto(arbol,MiControl.getPanelPrincipal());
        } catch (JAXBException ex) {
            Logger.getLogger(formularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
        controlFormularioPrincipal.arbolMouseClicked(arbol, panelPrincipalNuevo);
    }//GEN-LAST:event_arbolMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        System.out.println("Entre manual ...");

        //ruta del archivo en el pc
        String file = new String("Manual.pdf");

        try {
            //definiendo la ruta en la propiedad file
            Runtime.getRuntime().exec("cmd /c start " + file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (RecursosCompartidos.getNodoSeleccionado() == 0) {
            controlFormularioPrincipal.cerrarTodosLosProyectos(arbol);
        } else {
            controlFormularioPrincipal.cerrarUnProyecto(arbol);
            controlFormularioPrincipal.expandirArbol(arbol);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPopupMenu menuContextual;
    private javax.swing.JPanel panelPrincipalNuevo;
    // End of variables declaration//GEN-END:variables

    private final Control MiControl;
    private final ControlFormularioPrincipal controlFormularioPrincipal;
}
