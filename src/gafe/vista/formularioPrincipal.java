package gafe.vista;

import gafe.control.Control;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class formularioPrincipal extends javax.swing.JFrame {    
    Control control;
      
    public formularioPrincipal(Control control) {
        this.control = control;       
        init();            
    }
    
    public void init(){
       initComponents();      
       setVisible(true);
       crearArbol(); 
    }
    
    
    public void crearArbol(){
    DefaultMutableTreeNode proyecto = new DefaultMutableTreeNode("Proyecto");
    DefaultTreeModel modelo = new DefaultTreeModel (proyecto);    
    arbol.setModel(modelo);     
    DefaultMutableTreeNode cargarXml = new DefaultMutableTreeNode("Cargar Xml");
    DefaultMutableTreeNode reportes = new DefaultMutableTreeNode("Reportes");    
    modelo.insertNodeInto(cargarXml, proyecto, 0);
    modelo.insertNodeInto(reportes, proyecto, 1);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        panelPrincipal = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nuevo2.png"))); // NOI18N
        jButton3.setToolTipText("Nuevo");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/abrir2.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar2.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

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
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
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
       // Este evento obtiene donde se esta posecionado en el arbol
        DefaultMutableTreeNode  nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();     
        String nombreNodo = nodoSeleccionado.toString();
        AbrirPaneles(nombreNodo);
        
    }//GEN-LAST:event_arbolMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void AbrirPaneles(String seleccionArbol) {
        switch (seleccionArbol) {
            case "Cargar Xml":
                System.out.println("Entre");
                control.abrirFormularioListarXml(panelPrincipal);
                break;

            case "Reportes":
                control.abrirFormularioCrearProyecto(panelPrincipal);
                break;
        }
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
}
