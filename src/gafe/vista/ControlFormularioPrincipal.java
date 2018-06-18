package gafe.vista;

import gafe.control.Control;
import gafe.modelo.ElementosArbol;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ControlFormularioPrincipal {

    public ControlFormularioPrincipal(Control control) {
        this.control = control;
    }

    public void abrirFormularioCrearProyecto(JPanel panelPrincipal) {
        formularioCrearProyecto formCrearProyecto=control.getFormularioCrearProyecto();
        panelPrincipal.removeAll();
        panelPrincipal.add(formCrearProyecto);
        formCrearProyecto.setSize(587, 402);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    }

    public void arbolMouseClicked(JTree arbol, JPanel panelPrincipal) {
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
        if (nodoSeleccionado != null) {
            String nombreNodo = nodoSeleccionado.toString();
            AbrirPaneles(nombreNodo, panelPrincipal);
        }
    }

    private void AbrirPaneles(String seleccionArbol, JPanel panelPrincipal) {
        if (seleccionArbol.equals(ElementosArbol.XML.getNombre())) {
            abrirFormularioListarXml(panelPrincipal);
        } else if (seleccionArbol.equals(ElementosArbol.REPORTES.getNombre())) {
            //   control.abrirFormularioCrearProyecto(panelPrincipal);
        }

    }
    
        public void abrirFormularioListarXml(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioListarXml formlarioListarXml=control.getFormularioListarXml();
        panelPrincipal.add(formlarioListarXml);
        formlarioListarXml.setSize(599, 284);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    

    public void crearArbol(JTree arbol) {
        DefaultMutableTreeNode proyecto = new DefaultMutableTreeNode(ElementosArbol.PROYECTO.getNombre());
        DefaultTreeModel modelo = new DefaultTreeModel(proyecto);
        arbol.setModel(modelo);
        DefaultMutableTreeNode cargarXml = new DefaultMutableTreeNode(ElementosArbol.XML.getNombre());
        DefaultMutableTreeNode reportes = new DefaultMutableTreeNode(ElementosArbol.REPORTES.getNombre());
        DefaultMutableTreeNode clientes = new DefaultMutableTreeNode(ElementosArbol.REPORTES.getNombre());
        DefaultMutableTreeNode proveedores = new DefaultMutableTreeNode(ElementosArbol.REPORTES.getNombre());
        modelo.insertNodeInto(cargarXml, proyecto, 0);
        modelo.insertNodeInto(reportes, proyecto, 1);
        modelo.insertNodeInto(clientes, proyecto, 2);
        modelo.insertNodeInto(proveedores, proyecto, 3);
    }
    
    private Control control;

}
