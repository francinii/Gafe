package gafe.vista;

import gafe.control.Control;
import gafe.modelo.ElementosArbol;
import gafe.modelo.Factura;
import gafe.modelo.Proyecto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class ControlFormularioPrincipal {

    public ControlFormularioPrincipal(Control control) {
        this.control = control;
    }

    public void abrirFormularioCrearProyecto(JPanel panelPrincipal) {
        formularioCrearProyecto formCrearProyecto = control.getFormularioCrearProyecto();
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
            abrirFormularioReportes(panelPrincipal);
        } else if (seleccionArbol.equals(ElementosArbol.REPORTES.getNombre())) {
            //   control.abrirFormularioCrearProyecto(panelPrincipal);
        }
    }

    public void abrirFormularioListarXml(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioListarXml formlarioListarXml = control.getFormularioListarXml();
        formlarioListarXml.setSize(599, 284);
        panelPrincipal.add(formlarioListarXml);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void abrirFormularioReportes(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioReporte fomrReporte = control.getFormReporte();
        fomrReporte.setSize(599, 284);
        panelPrincipal.add(fomrReporte);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void agregarNodoArbol(JTree arbol) {
        DefaultMutableTreeNode proyecto = new DefaultMutableTreeNode(ElementosArbol.PROYECTO.getNombre());
        DefaultTreeModel modelo = new DefaultTreeModel(proyecto);
        arbol.setModel(modelo);
        DefaultMutableTreeNode cargarXml = new DefaultMutableTreeNode(ElementosArbol.XML.getNombre());
        DefaultMutableTreeNode reportes = new DefaultMutableTreeNode(ElementosArbol.REPORTES.getNombre());
        DefaultMutableTreeNode clientes = new DefaultMutableTreeNode(ElementosArbol.CLIENTE.getNombre());
        DefaultMutableTreeNode proveedores = new DefaultMutableTreeNode(ElementosArbol.PROVEEDOR.getNombre());
        modelo.insertNodeInto(cargarXml, proyecto, 0);
        modelo.insertNodeInto(reportes, proyecto, 1);
        modelo.insertNodeInto(clientes, proyecto, 2);
        modelo.insertNodeInto(proveedores, proyecto, 3);
    }

    public String obtenerRutaFileChooser() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Seleccione la ruta: ");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = jfc.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            if (jfc.getSelectedFile().isDirectory()) {
                //txtRuta.setText(jfc.getSelectedFile().toString());
                return jfc.getSelectedFile().toString();
            }
        }
        return "";
    }

    public void controlLectorFacturas(File[] files) {
        List<Factura> listadoFacturas;
        listadoFacturas = control.obtenerListadoFacturas(files);
        for (int i = 0; i < listadoFacturas.size(); i++) {
            Factura factura = listadoFacturas.get(i);
            control.obtenerListadoProyectos().get(0).agregarXMLProyecto(factura);
        }
        crearXml(control.obtenerListadoProyectos().get(0)); // llenar el Archivo .GAFE hay q cambiarlo para que sea el que queremos seleccionar

    }

    public void crearXml(Proyecto proyecto) {
        String rutaProyecto = proyecto.getRuta();
        String nombreProyecto = proyecto.getCedula();
        String rutaTolta = rutaProyecto + "/" + nombreProyecto + ".gafe";
        File file = new File(rutaTolta);
        try {
            JAXBContext context = JAXBContext.newInstance(Proyecto.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); // Se habilita el Append para que pueda agregar  los datos si sobreescribir. 
            //StringWriter sw = new StringWriter();
            m.marshal(proyecto, file);
            m.marshal(proyecto, fw);
        } catch (JAXBException e) {
            System.out.println("Error Crear XML " + e);
        } catch (IOException e) {

        }
    }

    public File[] abrirFileChooser(String nombreArchivo, String extension, boolean multipleEleccion) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter xmlFilter = new FileNameExtensionFilter(nombreArchivo, extension);
        jfc.setDialogTitle("Seleccione los archivos");
        jfc.setMultiSelectionEnabled(multipleEleccion);
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.setFileFilter(xmlFilter);
        File[] files = null;
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            files = jfc.getSelectedFiles();
        }
        return files;
    }

    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Alerta",JOptionPane.INFORMATION_MESSAGE);
    }
    
        public void crearXmlProyecto(String nombre, String cedula, String descripcion,String ruta) throws PropertyException, JAXBException, FileNotFoundException, IOException{
    		JAXBContext context = JAXBContext.newInstance(Proyecto.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Proyecto proyecto = control.crearObjetoProyecto(nombre, cedula, descripcion, ruta);
		//Anadimos el proyecto creado a la lista de proyectos
                control.listadoProyectos(proyecto);
                
		//marshaller.marshal(proyecto, System.out);		
		FileOutputStream fos = new FileOutputStream(ruta);
		marshaller.marshal(proyecto, fos);
		fos.close();                 		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//Deserealizamos a partir de un documento XML
		Proyecto provincaAux = (Proyecto) unmarshaller.unmarshal(new File(ruta));
		System.out.println("********* Provincia cargado desde fichero XML***************");
		marshaller.marshal(provincaAux, System.out);
    
    }
    
    
    private final Control control;

}
