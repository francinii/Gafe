package gafe.vista;

import gafe.control.Control;
import gafe.control.Encriptar;
import gafe.modelo.ElementosArbol;
import gafe.modelo.ExportarReporte;
import gafe.modelo.Factura;
import gafe.modelo.Proyecto;
import gafe.modelo.RecursosCompartidos;
import gafe.modelo.TipoFactura;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileView;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class ControlFormularioPrincipal {

    public ControlFormularioPrincipal(Control control) {
        this.control = control;         
    }

    public Control getControl() {
        return control;
    }
         
    public boolean validarCedulaProyecto(File ruta, String cedula) {
        return control.validarCedulaProyecto(ruta, cedula);
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
            //AbrirPaneles(nombreNodo, panelPrincipal);
            String a = nodoSeleccionado.getRoot().toString();
            System.out.println("nombre del nodo" + a);
            if (nodoSeleccionado.toString().equals("Proyectos")) { // no entra al nodo Proyecto
                //SETEAR LOS PROYECTOS A LA VARIABLE
                System.out.println("No puedo entrar");
                RecursosCompartidos.setNodoSeleccionado(0);
            } else {
                RecursosCompartidos.setNodoSeleccionado(1);
                if (nodoSeleccionado.getChildCount() > 0) {
                    System.out.println("Tiene hijos");
                    String ruta = nodoSeleccionado.getLastChild().toString();
                    RecursosCompartidos.setRuta(ruta); // Cargo la variable estatica, cada vez que cambio de nodo

                } else {
                    DefaultMutableTreeNode padre = (DefaultMutableTreeNode) nodoSeleccionado.getParent();
                    String ruta = padre.getLastChild().toString();
                    RecursosCompartidos.setRuta(ruta); // Cargo la variable estatica, cada vez que cambio de nodo
                    Proyecto p = buscarProyecto(ruta);
                    
                    if (p != null) {
                        EmpresaGlobal = p.getNombre();
                        CedulaJuridicaGlobal = p.getCedula();
                        RecursosCompartidos.setCedulaJuridicaProyecto(CedulaJuridicaGlobal); // Almacenar la cedula juridica
                        System.out.println("listadoo " + p.getListadoFacturas().size());
                        if (nombreNodo == "Cargar Facturas") { // esto aplica solo para el nodo de Cargar Facturas
                            AbrirPaneles(nombreNodo, panelPrincipal);
                            if (p.getListadoFacturas() != null) {
                                List<Factura> lista = p.getListadoFacturas();
                                for (int i = 0; i < lista.size(); i++) {
                                    String consecutivo = lista.get(i).getClave().toString();
                                    String emisor = lista.get(i).getEmisor().getNombre().toString();
                                    String receptor = "";
                                    if (lista.get(i).getReceptor() != null) {
                                        receptor = lista.get(i).getReceptor().getNombre().toString();
                                    }
                                    String total = "";
                                    if (lista.get(i).getResumenFactura().getTotalVenta() != null) {
                                        total = lista.get(i).getResumenFactura().getTotalVenta().toString();
                                    }
                                    AgregarDatosTabla(consecutivo, emisor, receptor, total, control.tablaListar());
                                }
                            } else {
                                System.out.println("vacio");
                            }
                        } else if ((nombreNodo == "Reportes")) {                           
                            RecursosCompartidos.setRuta(ruta);
                            RecursosCompartidos.setCedulaJuridicaProyecto(CedulaJuridicaGlobal); // Almacenar la cedula juridica
                            AbrirPaneles(nombreNodo, panelPrincipal);
                        } else if (nombreNodo == "Clientes") {
                            RecursosCompartidos.setRuta(ruta);
                            RecursosCompartidos.setCedulaJuridicaProyecto(CedulaJuridicaGlobal); // Almacenar la cedula juridica
                            AbrirPaneles(nombreNodo, panelPrincipal);
                        } else if (nombreNodo == "Proovedores") {
                            RecursosCompartidos.setRuta(ruta);
                            RecursosCompartidos.setCedulaJuridicaProyecto(CedulaJuridicaGlobal); // Almacenar la cedula juridica
                            AbrirPaneles(nombreNodo, panelPrincipal);
                        }
                    }

                }
            }
        }
    }

    private void AbrirPaneles(String seleccionArbol, JPanel panelPrincipal) {
        if (seleccionArbol.equals(ElementosArbol.XML.getNombre())) {
            abrirFormularioListarXml(panelPrincipal);
        } else if (seleccionArbol.equals(ElementosArbol.REPORTES.getNombre())) {
            abrirFormularioReportes(panelPrincipal);
        } else if (seleccionArbol.equals(ElementosArbol.CLIENTE.getNombre())) {
            abrirFormularioClientes(panelPrincipal);
        } else if (seleccionArbol.equals(ElementosArbol.PROVEEDOR.getNombre())) {
            abrirFormularioProveedores(panelPrincipal);
        }
    }

    public void abrirFormularioListarXml(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioListarXml formlarioListarXml = control.getFormularioListarXml();
        limpiarTablaGenerico(control.getFormularioListarXml().ObtenerTablaListar());
        formlarioListarXml.llenarDatosProyecto(EmpresaGlobal, CedulaJuridicaGlobal); // cargar el nombre y la cedulaJ del formulario listar
        formlarioListarXml.setSize(599, 284);
        panelPrincipal.add(formlarioListarXml);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void abrirFormularioReportes(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioReporte fomrReporte = control.getFormReporte();
        limpiarTablaGenerico(control.getFormReporte().ObtenerTablaReportes());
        fomrReporte.llenarDatosProyecto(EmpresaGlobal, CedulaJuridicaGlobal); // cargar el nombre y la cedulaJ del formulario listar

        //Agregué esto
        Proyecto p = buscarProyecto(RecursosCompartidos.getRuta());
        if (p != null) {
            List<Factura> listFacturas = p.getListadoFacturas();
            //Final de la agregación
            llenarFacturaReportes(control.tablaReportes(), RecursosCompartidos.getRuta(), listFacturas);
        }
        pintarReportes(panelPrincipal, fomrReporte);
    }

    //Este abre el formulario con filtros de categoria y fecha
    public void abrirFormularioReportes(JTable TablaReportes,String fIncio, String fFinal) {
        
        String fechaComparar = "00/00/0000";
        
        DefaultTableModel modelo = (DefaultTableModel) TablaReportes.getModel();
        
        int numFilas = TablaReportes.getRowCount();
        /*for (int i = numFilas - 1; i <= numFilas; i--) {

           
                String fechaFactura = modelo.getValueAt(i, 3).toString();
                fechaComparar = fechaFactura;
                System.out.println("Fechas Facturas " + fechaComparar);
                System.out.println("num " + i);
                if (!fechaComparar.equals("")) {
                    if (compararFecha(fIncio, fFinal, fechaComparar) == false) {
                        modelo.removeRow(i);
                        numFilas = numFilas - 1;
                    }
                }
                
                System.out.println("Numero de filas "+numFilas);
                if(numFilas == 0){ // para que cuando llegue a 0 no busque el 0-1 osea num negativo.
                    break;
                }           
        }*/
        
        
        for (int i = 0; i <= numFilas; i++) {

            if (i != numFilas) { // cuando el tamano del la lista es igual a la del recorrido este termina
                String fechaFactura = modelo.getValueAt(i, 3).toString();
                fechaComparar = fechaFactura;
                System.out.println("Fechas Facturas " + fechaComparar);
                System.out.println("i " + i);
                System.out.println("tamano "+numFilas);
                if (!fechaComparar.equals("")) {
                    if (compararFecha(fIncio, fFinal, fechaComparar) == false) {
                        modelo.removeRow(i);
                        numFilas = numFilas - 1;                
                        i = i-1;
  
                        System.out.println("tamano 2 "+numFilas);
                    }
                }
                
                if(numFilas == 0){ // al ir eliminando las filas puede llegar un momento en el que el modelo vale 0, y por eso no salimos
                    break;
                }
               
            }else {
                break;
            }

        }
        TablaReportes.setModel(modelo);
                
    }
    
    public void limpiarTablaGenerico(JTable table){
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        for (int i = 0; i < table.getRowCount(); i++) {
            modelo.removeRow(i);
            i-=1;
        }
    
    
    }
    
    
    public JPanel panelPrincipal() {
        return control.getPanelPrincipal();
    }

    public Date formatoFecha(String fecha) {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
        if (!fecha.equals("")) {
            fecha = fecha.substring(0, 10);
            // 2018-02-14T10:51:04.707
            String[] fechaFinal = fecha.split("-");
            String anio = fechaFinal[0];
            String mes = fechaFinal[1];
            String dia = fechaFinal[2];
            String fechaAconvertir = dia + "/" + mes + "/" + anio;
            
            try {
                Date date = formatter.parse(fechaAconvertir);
                
                return date;
               // Date a = (DateTimeFormatter.ofPattern("dd/MM/yyyy")).format(date);
            } catch (ParseException ex) {
                System.out.println("Error al convertir la fecha");
            }
        }
        return null;
    }
    
    public String formatoFechasReporte(String fecha) {
        if (!fecha.equals("")) {
            fecha = fecha.substring(0, 10);
            // 2018-02-14T10:51:04.707
            String[] fechaFinal = fecha.split("-");
            String anio = fechaFinal[0];
            String mes = fechaFinal[1];
            String dia = fechaFinal[2];
            return dia + "/" + mes + "/" + anio;
        }
        return "";
    }

    public boolean compararFecha(String fechaI, String fechaF, String fechaComparar) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha1 = formato.parse(fechaI);
            Date fecha2 = formato.parse(fechaF);
            Date fechaComp = formato.parse(fechaComparar);
            if ((fechaComp.compareTo(fecha1) == 0 || fechaComp.compareTo(fecha1) > 0) && (fechaComp.compareTo(fecha2) == 0 || fechaComp.compareTo(fecha2) < 0)) {
                return true;
            }
//            if (!fechaComp.after(fecha1) && !fechaComp.before(fecha2)) {
//                return true;
//                /* historyDate <= todayDate <= futureDate */
//            }
        } catch (ParseException ex) {
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void pintarReportes(JPanel panelPrincipal, formularioReporte fomrReporte) {
        fomrReporte.setSize(599, 284);
        panelPrincipal.add(fomrReporte);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void abrirFormularioClientes(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioClientes formClientes = control.getFormClientes();
        limpiarTablaGenerico(control.getFormClientes().tablaClientes());
        formClientes.llenarDatosProyecto(EmpresaGlobal, CedulaJuridicaGlobal); // cargar el nombre y la cedulaJ del formulario listar
        llenarClientes();
        formClientes.setSize(599, 284);
        panelPrincipal.add(formClientes);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void abrirFormularioProveedores(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        formularioProveedores formProveedor = control.getFormProveedores();
        limpiarTablaGenerico(control.getFormProveedores().tablaProveedores());
        formProveedor.llenarDatosProyecto(EmpresaGlobal, CedulaJuridicaGlobal); // cargar el nombre y la cedulaJ del formulario listar
        llenarProveedores();
        formProveedor.setSize(599, 284);
        panelPrincipal.add(formProveedor);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    public void eliminarTodoNodoArbol(JTree arbol) {
        DefaultTreeModel modelo = (DefaultTreeModel) arbol.getModel();
        //DefaultMutableTreeNode cabeza = (DefaultMutableTreeNode) modelo.getRoot();
        final MutableTreeNode root = (MutableTreeNode) modelo.getRoot();
        while (root.getChildCount() > 0) {
            modelo.removeNodeFromParent((MutableTreeNode) root.getChildAt(0));
        }
        // modelo.removeNodeFromParent(cabeza);
    }

    public void eliminarUnNodoArbol(JTree arbol) {
        try {
            eliminarTodoNodoArbol(arbol);
            abrirProyectosRecientes(arbol);
        } catch (JAXBException ex) {
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarNodoArbol(JTree arbol, String nombre, String ruta) {
        DefaultTreeModel modelo = (DefaultTreeModel) arbol.getModel();
        DefaultMutableTreeNode proyecto = new DefaultMutableTreeNode(nombre);

        DefaultMutableTreeNode cabeza = (DefaultMutableTreeNode) modelo.getRoot();
        modelo.insertNodeInto(proyecto, cabeza, 0);
        // proyecto.setComponentPopupMenu(menuContextual);
        // DefaultTreeModel modelo = new DefaultTreeModel(proyecto);
        //  arbol.setModel(modelo);
        DefaultTreeCellRenderer renderIcono = (DefaultTreeCellRenderer) arbol.getCellRenderer();
        DefaultMutableTreeNode cargarXml = new DefaultMutableTreeNode(ElementosArbol.XML.getNombre());
        renderIcono.setLeafIcon(new ImageIcon(getClass().getResource("/recursos/Subicono.png")));
        renderIcono.setOpenIcon(new ImageIcon(getClass().getResource("/recursos/proyecto.png")));
        renderIcono.setClosedIcon(new ImageIcon(getClass().getResource("/recursos/proyecto.png")));
        DefaultMutableTreeNode reportes = new DefaultMutableTreeNode(ElementosArbol.REPORTES.getNombre());
        DefaultMutableTreeNode clientes = new DefaultMutableTreeNode(ElementosArbol.CLIENTE.getNombre());
        DefaultMutableTreeNode proveedores = new DefaultMutableTreeNode(ElementosArbol.PROVEEDOR.getNombre());
        DefaultMutableTreeNode rutas = new DefaultMutableTreeNode(ruta);
        modelo.insertNodeInto(cargarXml, proyecto, 0);
        modelo.insertNodeInto(reportes, proyecto, 1);
        modelo.insertNodeInto(clientes, proyecto, 2);
        modelo.insertNodeInto(proveedores, proyecto, 3);
        modelo.insertNodeInto(rutas, proyecto, 4);

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

    public File[] abrirFileChooser(String nombreArchivo, String extension, boolean multipleEleccion,JPanel frame) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        
        FileFilter xmlFilter = new FileNameExtensionFilter(nombreArchivo, extension);
        
        jfc.setDialogTitle("Seleccione los archivos");
        jfc.setMultiSelectionEnabled(multipleEleccion);      
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(xmlFilter);
        jfc.setAcceptAllFileFilterUsed(false);
        
        File[] files = null;
        int returnValue = jfc.showOpenDialog(frame); // este frame es para que traiga el icono del principio y lo muestre en el JChooser
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            files = jfc.getSelectedFiles();
        } 
        return files;
    }

    public File abrirFileChooser(String nombreArchivo, String extension, JPanel frame) {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileFilter xmlFilter = new FileNameExtensionFilter(nombreArchivo, extension);
        jfc.setDialogTitle("Seleccione los archivos");
        jfc.setMultiSelectionEnabled(false);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(xmlFilter);
        jfc.setAcceptAllFileFilterUsed(false);
        File files = null;
        int returnValue = jfc.showOpenDialog(frame);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            files = jfc.getSelectedFile();
        }

        return files;
    }

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

    public void crearXmlProyecto(String nombre, String cedula, String descripcion, String ruta) throws PropertyException, JAXBException, FileNotFoundException, IOException {
        JAXBContext context = JAXBContext.newInstance(Proyecto.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Proyecto proyecto = control.crearObjetoProyecto(nombre, cedula, descripcion, ruta);
        //  Factura f = new Factura();
        // proyecto.agregarXMLProyecto(f);
        //Anadimos el proyecto creado a la lista de proyectos      
        marshaller.marshal(proyecto, System.out);
        FileOutputStream fos = new FileOutputStream(ruta);
        marshaller.marshal(proyecto, fos);
        fos.close();
        agregarNodoArbol(control.arbol(), nombre, ruta);
        control.agregarElementolistadoProyectos(proyecto);
        //Agrega al archivo de configuracion la ruta del proyecto donde se encuentra para poder dejarlo abierto.
        List<String> rutas = new ArrayList<String>();
        rutas.add(ruta);
        control.escribirArchivoConfiguracion(directorioGlobalConfig, rutas, true);
    }

    
    public void agregarFacturaProyecto(String ruta, String nombreArchivo, String extension, boolean multipleEleccion, JTable tabla,JPanel frame) throws JAXBException, PropertyException, IOException {
        
        List<Factura> lista = null;
        File[] files = abrirFileChooser(nombreArchivo, extension, multipleEleccion,frame);
        JAXBContext context = JAXBContext.newInstance(Proyecto.class);
        Marshaller m = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //Deserealizamos a partir de un documento XML
        Proyecto proyecto = (Proyecto) unmarshaller.unmarshal(new File(ruta));
        Proyecto proyect = new Proyecto(proyecto.getNombre(), proyecto.getCedula(), proyecto.getDescripcion(), proyecto.getRuta());
        if (proyecto.getListadoFacturas() != null) {
            lista = proyecto.getListadoFacturas();
            for (int i = 0; i < lista.size(); i++) {
                proyect.agregarXMLProyecto(lista.get(i));
            }
        }
        if (files != null) { // Validacion para cuando el Chooser se cancela

            List<Factura> list = control.obtenerListadoFacturas(files); // aqui se agregan las facturas nuevas, retorna mi lista de tipo facturas que estan incluyendose
            boolean insertaronNuevasFacturas = false;
            if (list != null) { // caundo no se agregar una factura retona null
                for (int i = 0; i < list.size(); i++) {
                    proyect.agregarXMLProyecto(list.get(i));
                    insertaronNuevasFacturas = true;
                }
                eliminarFacturasRepetidas(proyect, m, tabla, ruta);
                modificarProyecto(proyect);

                List<String> listadosErrores = control.obtenerListadoError(); //Esta lista se carga cuando hay errores a la hora de crear las facturas

                if (listadosErrores.size() > 0) {
                    String factuasMalas = "";
                    for (int i = 0; i < listadosErrores.size(); i++) {
                        factuasMalas += listadosErrores.get(i) + "\n";
                    }
                    System.out.println("Facturas malas " + factuasMalas);
                    JOptionPane.showMessageDialog(null, "Problemas en las siguientes facturas " + factuasMalas, "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
                
                if (insertaronNuevasFacturas) {
                    JOptionPane.showMessageDialog(null, "Las facturas han sido cargadas con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }            
            }
        }
        control.limpiarListadoError();
    }

    public void modificarProyecto(Proyecto proyect) {
        int tamanio = control.obtenerListadoProyectos().size();
        for (int i = 0; i < tamanio; i++) {
            if (control.obtenerListadoProyectos().get(i).getRuta().equals(proyect.getRuta())) {
                control.obtenerListadoProyectos().set(i, proyect);
                break;
                //control.obtenerListadoProyectos();
                // agregarProyectoAlista(proyect);
            }
        }
    }

   
    public void eliminarFacturasRepetidas(Proyecto p, Marshaller m, JTable tabla, String ruta) throws JAXBException {
        List<Factura> listaFacturas = p.getListadoFacturas();
        List<Factura> listaSinRepetidos = new ArrayList<>();
        Map<String, Factura> mapFacturas = new HashMap<String, Factura>(listaFacturas.size());

        for (Factura f : listaFacturas) {
            mapFacturas.put(f.getClave(), f);
        }

        for (Entry<String, Factura> f : mapFacturas.entrySet()) {
            listaSinRepetidos.add(f.getValue());
        }

        p.getListadoFacturas().clear(); // limpiar la lista, para que ingresen sin repeticiones
        limpiarTablaListadoF(tabla); //limpiar la tabla de listadosFacturas.

        for (int i = 0; i < listaSinRepetidos.size(); i++) { // llenar nueva lista de facturas sin repeticiones   
            p.agregarXMLProyecto(listaSinRepetidos.get(i));
            String consecutivo = listaSinRepetidos.get(i).getClave().toString();
            String emisor = listaSinRepetidos.get(i).getEmisor().getNombre().toString();

            String receptor = "";
            if (listaSinRepetidos.get(i).getReceptor() != null) {
                receptor = listaSinRepetidos.get(i).getReceptor().getNombre().toString();
            }

            String total = "";
            if (listaSinRepetidos.get(i).getResumenFactura().getTotalVenta() != null) {
                total = listaSinRepetidos.get(i).getResumenFactura().getTotalVenta().toString();
            }

            AgregarDatosTabla(consecutivo, emisor, receptor, total, tabla);
        }

        m.marshal(p, System.out);
        try (FileOutputStream fos = new FileOutputStream(ruta)) {
            m.marshal(p, fos);
            fos.close();
        } catch (Exception e) {
            System.out.println("Error a la hora de crear el xml " + e);
        }
    }
    
    //Resscribrir el archivo cuando se elimina una factura.
    public void agregarFacturaProyecto(List<Factura> lista, Proyecto p, String ruta) throws JAXBException, FileNotFoundException, IOException {
        JAXBContext context = JAXBContext.newInstance(Proyecto.class);
        Marshaller m = context.createMarshaller();
        Unmarshaller unmarshaller = context.createUnmarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        p = new Proyecto(p.getNombre(), p.getCedula(), p.getDescripcion(), p.getRuta());
        for (int i = 0; i < lista.size(); i++) {
            p.agregarXMLProyecto(lista.get(i));
        }
        //m.marshal(p, System.out);
        try (FileOutputStream fos = new FileOutputStream(ruta)) {
            m.marshal(p, fos);
        }
    }

    public void AgregarDatosTabla(String numero, String emisor, String receptor, String total, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); //Obtengo el modelo existente por defecto     

        Object[] fila = new Object[4];
        fila[0] = numero;
        fila[1] = emisor;
        fila[2] = receptor;
        fila[3] = total;
        modelo.addRow(fila);
    }

    public void limpiarTablaListadoF(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int filas = tabla.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
            System.out.println("Limpiar");
        }
    }
    
    public void abrirNuevoProyecto(JTree arbol,JPanel frame) throws JAXBException {
        File files = abrirFileChooser("Gafe", "gafe",frame);
        if (files != null) {
            String ruta = files.getPath();
            List<Factura> lista = null;

            boolean verificarExistencia = noAbrirElmismoProyecto(ruta);

            if (verificarExistencia == false) { // si es falso es porque no existe por lo que se puede abrir
                JAXBContext context = JAXBContext.newInstance(Proyecto.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                Proyecto proyecto = (Proyecto) unmarshaller.unmarshal(new File(ruta));
                Proyecto proyect = new Proyecto(proyecto.getNombre(), proyecto.getCedula(), proyecto.getDescripcion(), proyecto.getRuta());
                if (proyecto.getListadoFacturas() != null) {
                    lista = proyecto.getListadoFacturas();
                    for (int i = 0; i < lista.size(); i++) {
                        proyect.agregarXMLProyecto(lista.get(i));
                    }
                }
                agregarNodoArbol(arbol, proyecto.getNombre(), ruta);
                agregarProyectoAlista(proyect.getNombre(), proyecto.getCedula(), proyecto.getDescripcion(), ruta, lista);

                //Escribir los archivos para arbir proyectos recientes
                List<String> listaEstados = new ArrayList<>();
                listaEstados.add(ruta);
                control.escribirArchivoConfiguracion(directorioGlobalConfig, listaEstados, true);
                expandirArbol(arbol);

            }

        }
    }
    
    public boolean noAbrirElmismoProyecto(String rutaAbrir){
    
        List<String> rutasArchivosRecientes = control.leerArchivoConfiguracion(directorioGlobalConfig);
        boolean existencia = false;
        for (String rutas : rutasArchivosRecientes) {
            
            if (rutas.equals(rutaAbrir)) {
                existencia = true; // Si existe
                System.out.println("Si existe en el arbol, por lo tanto no se abre");
                break;
            }     
        }
        return existencia;
    }
    
    

    public void abrirProyectosRecientes(JTree arbol) throws JAXBException {
        List<String> rutasArchivosRecientes = control.leerArchivoConfiguracion(directorioGlobalConfig);

        List<String> listadoArchivosExistentes = verificarSiExistenProyectosRecientes(rutasArchivosRecientes);

        if (listadoArchivosExistentes != null) {
            try {
                for (String ruta : listadoArchivosExistentes) {
                    List<Factura> lista = null;
                    JAXBContext context = JAXBContext.newInstance(Proyecto.class);
                    Unmarshaller unmarshaller = context.createUnmarshaller();
                    Proyecto proyecto = (Proyecto) unmarshaller.unmarshal(new File(ruta));
                    Proyecto proyect = new Proyecto(proyecto.getNombre(), proyecto.getCedula(), proyecto.getDescripcion(), proyecto.getRuta());
                    if (proyecto.getListadoFacturas() != null) {
                        lista = proyecto.getListadoFacturas();
                        for (int i = 0; i < lista.size(); i++) {
                            proyect.agregarXMLProyecto(lista.get(i));
                        }
                    }
                    //control.escribirArchivoConfiguracion(ruta, listadoArchivosExistentes, true);
                    agregarNodoArbol(arbol, proyecto.getNombre(), ruta);
                    agregarProyectoAlista(proyect.getNombre(), proyecto.getCedula(), proyecto.getDescripcion(), ruta, lista);

                }

            } catch (Exception e) {
                System.out.println("Problemas con proyectos recientes - Control Formulario prinicpal" + e);
            }

        }
    }

    public List<String> verificarSiExistenProyectosRecientes(List<String> listadoProyectos) {
        File file;
        // List<String> listaProyectosExistentes = new ArrayList<String>(); 

        for (int i = 0; i < listadoProyectos.size(); i++) {
            file = new File(listadoProyectos.get(i));

            if (!file.exists()) {
                listadoProyectos.remove(i);
                //  listaProyectosExistentes.add(agregarElementolistadoProyectos.get(i));
            }

        }

        if (listadoProyectos.size() > 0) { // Sobreescribir archivo de las rutas con los archivos que si existen
            control.escribirArchivoConfiguracion(directorioGlobalConfig, listadoProyectos, false);
        }

        return listadoProyectos;
        //  return listaProyectosExistentes;

    }

    //Este metodo se usa para cargar los proyectos que son abiertos.
    public void agregarProyectoAlista(String nombre, String cedula, String descripcion, String ruta, List<Factura> facturas) {
        Proyecto proyecto = control.crearObjetoProyecto(nombre, cedula, descripcion, ruta, facturas);
        control.agregarElementolistadoProyectos(proyecto);
    }

    public Proyecto buscarProyecto(String rutaProyecto) {
        List<Proyecto> listado = control.obtenerListadoProyectos();
        Proyecto p = null;
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getRuta().equals(rutaProyecto)) {
                p = listado.get(i);
            }
        }
        return p;
    }

    public void eliminarFacturas(JTable tabla) throws JAXBException, IOException {
        String ruta = RecursosCompartidos.getRuta();
        Proyecto p = buscarProyecto(ruta);
        List<Factura> listado = p.getListadoFacturas();
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int[] row = tabla.getSelectedRows();
        String dato = "";
        for (int i = 0; i < row.length; i++) {
            dato = String.valueOf(model.getValueAt(tabla.getSelectedRow(), 0));
            model.removeRow(row[i] - i);

            try {
               eliminarFacturaListadoProyecto(dato,p,ruta,listado);
               
            } catch (IOException ex) {
                Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        agregarFacturaProyecto(listado, p, ruta);
        
        
    }

    public void eliminarFacturaListadoProyecto(String consecutivoEliminar, Proyecto p,String ruta,List<Factura> listado) throws JAXBException, IOException {
        
        if (p != null) {          
            for (int i = 0; i < listado.size(); i++) {
                //System.out.println("Consecutivo " + listado.get(i).getConsecutivo().toString());
                if (listado.get(i).getClave().toString().equals(consecutivoEliminar)) {
                    listado.remove(i);
                }
            }
            
        }
    }

    /*  Esto es para el formulario de reportes    */
    public void ocultarMostrarColumnas(int columna, boolean status) {
        JTable tablaReportes = control.tablaReportes();
        if (status == true) { // 1 cuando quiero mostrar

            tablaReportes.getColumnModel().getColumn(columna).setMaxWidth(500);
            tablaReportes.getColumnModel().getColumn(columna).setMinWidth(75);
            tablaReportes.getColumnModel().getColumn(columna).setPreferredWidth(175);
            tablaReportes.getColumnModel().getColumn(columna).setResizable(true);
        } else { // 0 cuando quiero ocultar
            tablaReportes.getColumnModel().getColumn(columna).setMaxWidth(0);
            tablaReportes.getColumnModel().getColumn(columna).setMinWidth(0);
            tablaReportes.getColumnModel().getColumn(columna).setPreferredWidth(0);
            // tablaReportes.getTableHeader().getColumnModel().getColumn(columna).setMaxWidth(0);
            // tablaReportes.getTableHeader().getColumnModel().getColumn(columna).setMinWidth(0);
        }
    }

    public void llenarProveedores() {
        DefaultTableModel modelo = (DefaultTableModel) control.tablaProveedores().getModel();
        Proyecto p = buscarProyecto(RecursosCompartidos.getRuta());
        if (p != null) {
            List<Factura> listFacturas = p.getListadoFacturas();
            int numeroColumnasTabla = 5;
            List<String> cedulas = new ArrayList<>();
            //ESTOY CAMBIANDO ESTO QUE EMPIECE CON 1 POR QUE LA PRIMERA FACTURA ESTA VACIA SE DEBE CAMBAIR
            for (int i = 0; i < listFacturas.size(); i++) {
                Object[] columna = new Object[numeroColumnasTabla];
                if (listFacturas.get(i).getReceptor() != null && listFacturas.get(i).getEmisor() != null && listFacturas.get(i).getEmisor().getIdenticacion() != null) {
                    String cedula = listFacturas.get(i).getEmisor().getIdenticacion().getNumeroIdentificacion();
                    if (!cedulas.contains(cedula)) {
                        if (p.getCedula().equals(listFacturas.get(i).getReceptor().getIdenticacion().getNumeroIdentificacion())) {
                            cedulas.add(cedula);
                            columna[0] = listFacturas.get(i).getEmisor().getNombre();
                            columna[1] = cedula;
                            if (listFacturas.get(i).getEmisor().getTelefono() != null && !listFacturas.get(i).getReceptor().getTelefono().isEmpty()) {
                                columna[2] = listFacturas.get(i).getEmisor().getTelefono().get(0).getNumeroTelefono();
                            }
                            columna[3] = listFacturas.get(i).getEmisor().getCorreo();
                            //columna[4] = listFacturas.get(i).getEmisor().getUbicacion().getProvincia();
                            modelo.addRow(columna);
                        }
                    }
                }
            }
        }
    }

    public void llenarClientes() {
        DefaultTableModel modelo = (DefaultTableModel) control.tablaClientes().getModel();
        Proyecto p = buscarProyecto(RecursosCompartidos.getRuta());
        if (p != null) {
            List<Factura> listFacturas = p.getListadoFacturas();
            int numeroColumnasTabla = 5;
            List<String> cedulas = new ArrayList<>();
            //ESTOY CAMBIANDO ESTO QUE EMPIECE CON 1 POR QUE LA PRIMERA FACTURA ESTA VACIA SE DEBE CAMBAIR
            for (int i = 0; i < listFacturas.size(); i++) {
                Object[] columna = new Object[numeroColumnasTabla];
                if (listFacturas.get(i).getReceptor() != null && listFacturas.get(i).getEmisor() != null && listFacturas.get(i).getReceptor().getIdenticacion() != null) {
                    String cedula = listFacturas.get(i).getReceptor().getIdenticacion().getNumeroIdentificacion();
                    if (p.getCedula().equals(listFacturas.get(i).getEmisor().getIdenticacion().getNumeroIdentificacion())) {
                        if (!cedulas.contains(cedula)) {
                            cedulas.add(cedula);
                            columna[0] = listFacturas.get(i).getReceptor().getNombre();
                            columna[1] = cedula;
                            if (listFacturas.get(i).getReceptor().getTelefono() != null && !listFacturas.get(i).getReceptor().getTelefono().isEmpty()) {
                                columna[2] = listFacturas.get(i).getReceptor().getTelefono().get(0).getNumeroTelefono();
                            }
                            columna[3] = listFacturas.get(i).getReceptor().getCorreo();
                            modelo.addRow(columna);
                        }
                    }
                }
            }
        }
    }

    public void exportarReporte(JTable jTable1,JPanel frame) {
        if (jTable1.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo como");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
                List tb = new ArrayList();
                List nom = new ArrayList();
                tb.add(jTable1);
                nom.add("Reporte de facturas");
                //String file = chooser.getSelectedFile().toString().concat(".xls");
                String file = chooser.getSelectedFile().toString();
                try {
                    ExportarReporte e = new ExportarReporte(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos para exportar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiarTabla(Object[] columna) {
        for (int i = 0; i < columna.length; i++) {
            columna[i] = "";
        }
    }
    
    

    public void llenarFacturaReportes(JTable tabla, String ruta, List<Factura> listFacturas) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        String categoria = "";
        String clave = "";
        String consecutivo = "";
        String nombreEmisor = "";
        String nombreComercialEmisor = "";  
        String cedulaEmisor = "";
        String nombreReceptor = "";
        String nombreComercialReceptor = "";
        String cedulaReceptor = "";
        String fechaEmision = "";
        String emitidaRecibida = "";
        String fechaReporte = "";
        
        int numeroColumnasTabla = 67;
        Object[] columna = new Object[numeroColumnasTabla];
        for (int i = 0; i < listFacturas.size(); i++) {
            
                categoria = listFacturas.get(i).getCategoria();
                clave = listFacturas.get(i).getClave();
                consecutivo = listFacturas.get(i).getConsecutivo();
                nombreEmisor = listFacturas.get(i).getEmisor().getNombre();
                nombreComercialEmisor = listFacturas.get(i).getEmisor().getNombreComercial();
                cedulaEmisor = listFacturas.get(i).getEmisor().getIdenticacion().getNumeroIdentificacion();
                nombreReceptor = listFacturas.get(i).getReceptor().getNombre();
                nombreComercialReceptor = listFacturas.get(i).getReceptor().getNombreComercial();
                cedulaReceptor = listFacturas.get(i).getReceptor().getIdenticacion().getNumeroIdentificacion();               
                Date formFecha = formatoFecha(listFacturas.get(i).getFechaEmision());
                fechaReporte = formatoFechasReporte(listFacturas.get(i).getFechaEmision()); // esta fecha es para los reportes.
                
                /*Validacion para el status si es recibida o emitida*/
                if (cedulaEmisor.equals(RecursosCompartidos.getCedulaJuridicaProyecto())) {
                    emitidaRecibida = "Emitida";
                }else if(cedulaReceptor.equals(RecursosCompartidos.getCedulaJuridicaProyecto())){
                    emitidaRecibida = "Recibida";
                }else{
                    emitidaRecibida = "N/A";
                }
                                       
                columna[4] = listFacturas.get(i).getCondicionVenta();
                columna[5] = listFacturas.get(i).getPlazoCredito();
                columna[6] = listFacturas.get(i).getMedioPago();
                columna[10] = "";
                columna[11] = "";
                int a = 10;
                for (int j = 0; j < listFacturas.get(i).getEmisor().getTelefono().size(); j++) {
                    columna[a] = listFacturas.get(i).getEmisor().getTelefono().get(j).getNumeroTelefono();
                    a = a++;
                }
                columna[12] = listFacturas.get(i).getEmisor().getCorreo();
                columna[13] = listFacturas.get(i).getEmisor().getUbicacion().getProvincia();
                columna[14] = listFacturas.get(i).getEmisor().getUbicacion().getCanton();
                columna[15] = listFacturas.get(i).getEmisor().getUbicacion().getDistrito();
                columna[19] = listFacturas.get(i).getReceptor().getIdentificacionExtranjero();
                columna[20] = "";
                columna[21] = "";
                a = 20;
                for (int j = 0; j < listFacturas.get(i).getReceptor().getTelefono().size(); j++) {
                    columna[a] = listFacturas.get(i).getReceptor().getTelefono().get(j).getNumeroTelefono();
                    a = a++;
                }
                columna[22] = listFacturas.get(i).getReceptor().getCorreo();
                columna[23] = listFacturas.get(i).getReceptor().getUbicacion().getProvincia();
                columna[24] = listFacturas.get(i).getReceptor().getUbicacion().getCanton();
                columna[25] = listFacturas.get(i).getReceptor().getUbicacion().getDistrito();

                columna[46] = listFacturas.get(i).getResumenFactura().getCodigoMoneda();
                columna[47] = listFacturas.get(i).getResumenFactura().getTipoCambio();
                columna[48] = listFacturas.get(i).getResumenFactura().getTotalServiciosGravados();
                columna[49] = listFacturas.get(i).getResumenFactura().getTotalServiciosExcentos();
                columna[50] = listFacturas.get(i).getResumenFactura().getTotalMercanciasGravadas();
                columna[51] = listFacturas.get(i).getResumenFactura().getTotalMercanciasExcentas();
                columna[52] = listFacturas.get(i).getResumenFactura().getTotalGravado();
                columna[53] = listFacturas.get(i).getResumenFactura().getTotalExcento();
                columna[54] = listFacturas.get(i).getResumenFactura().getTotalVenta();
                columna[55] = listFacturas.get(i).getResumenFactura().getTotalDescuentos();
                columna[56] = listFacturas.get(i).getResumenFactura().getTotalVentaNeta();
                columna[57] = listFacturas.get(i).getResumenFactura().getTotalImpuesto();
                columna[58] = listFacturas.get(i).getResumenFactura().getTotalComprobante();

                for (int j = 0; j < listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().size(); j++) {
                    
                    columna[0] = categoria;
                    columna[1] = clave;
                    columna[2] = consecutivo;
                    columna[3] = formFecha;
                    columna[7] = cedulaEmisor;
                    columna[8] = nombreEmisor;
                    columna[9] = nombreComercialEmisor;
                    columna[16] = cedulaReceptor;
                    columna[17] = nombreReceptor;
                    columna[18] = nombreComercialReceptor;   
                    columna[59] = emitidaRecibida;
                    columna[60] = fechaReporte;
                    
                    columna[26] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getNumeroLinea();
                    columna[27] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getCodigo().getTipoCodigo();
                    columna[28] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getCantidad();
                    columna[29] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getUnidadMedida();
                    columna[30] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getUnidadMedidaComercial();
                    columna[31] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getDetalle();
                    columna[32] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getPrecioUnitario();
                    columna[33] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getMontoDescuento();
                    columna[34] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getNaturalezadescuento();
                    columna[35] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getSubTotal();
                      
                    columna[36] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getMontoTotalLinea();
                    
                    
                    columna[37] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getCodigo();
                    columna[38] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getTarifaImpuesto();
                    columna[39] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getMonto();
                    columna[40] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getMontoImpuesto();
                    columna[41] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getTipoDocumento();
                    columna[42] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getNumeroDocumento();
                    columna[43] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getNombreInstitucion();
                    columna[44] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getFecheEmision();
                    columna[45] = listFacturas.get(i).getDetalleServicio().getListaLineaDetalle().get(j).getImpuesto().getExoneracion().getPorcentajeCompra();
                    
                    columna[61] = listFacturas.get(i).getInformacionReferencia().getTipoDocumento();
                    columna[62] = listFacturas.get(i).getInformacionReferencia().getNumeroDoumento();
                    columna[63] = listFacturas.get(i).getInformacionReferencia().getFechaEmision();
                    columna[64] = listFacturas.get(i).getInformacionReferencia().getCodigo();
                    columna[65] = listFacturas.get(i).getInformacionReferencia().getrazon();
                    
                    modelo.addRow(columna);
                    limpiarTabla(columna);

                }
            
        }
    }

    public void cerrarTodosLosProyectos(JTree arbol) {
        List<String> listaEstados = new ArrayList<>();
        control.escribirArchivoConfiguracion(directorioGlobalConfig, listaEstados, false);// al ser false sobreescirbe el archivo
        eliminarTodoNodoArbol(arbol);
        abrirFormularioCrearProyecto(control.getPanelPrincipal());
    }

    public void cerrarUnProyecto(JTree arbol) {
        String ruta = RecursosCompartidos.getRuta();
        List<String> rutas = control.leerArchivoConfiguracion(directorioGlobalConfig);
        for (int i = 0; i < rutas.size(); i++) {
            if (rutas.get(i).equals(ruta)) {
                rutas.remove(i);
            }
        }
        control.escribirArchivoConfiguracion(directorioGlobalConfig, rutas, false);
        eliminarUnNodoArbol(arbol);
    }

    public void expandirArbol(JTree arbol) {      
        arbol.expandRow(0);   
    }
    
    public void escribirArchivoContador(){
        control.escrbirArchivoContador(directorioCantidadProyecto);
    }
    
    public  int leerCantidadDeProyectosContador(){
        List<String> proyecto = control.leerArchivoConfiguracion(directorioCantidadProyecto);
        
        int num = 0;
        try {
            num = Integer.parseInt(Encriptar.Desencriptar(proyecto.get(0)));
        } catch (Exception ex) {
            Logger.getLogger(ControlFormularioPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return num;
    }
    
    //Variables Globales que se cargan, para enviarlas al formulario listar, "Empresa y cedula Juridica"
    String EmpresaGlobal;
    String CedulaJuridicaGlobal;
    private final Control control;
    //String directorioGlobalConfig = "../gafe//src//recursos//GlobalConfig.txt";

    public String directorioGlobalConfig = "GlobalConfig.data";
    public String directorioCantidadProyecto = "Cantidad.data";
    
    
}
