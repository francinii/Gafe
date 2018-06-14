package gafe.vista;

import gafe.control.Control;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class formularioPrincipal extends javax.swing.JFrame {
    
    Control control;
      
    public formularioPrincipal(Control control) {
        initComponents();
        this.control = control;
        init();
        crearArbol();  
        
    
    }
    
    public void init(){
       setVisible(true);
       
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arbol);

        jSplitPane1.setLeftComponent(jScrollPane1);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(panelPrincipal);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
       // Este evento obtiene donde se esta posecionado en el arbol
        DefaultMutableTreeNode  nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();     
        String nombreNodo = nodoSeleccionado.toString();
        AbrirPaneles(nombreNodo);
        
    }//GEN-LAST:event_arbolMouseClicked

    
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
