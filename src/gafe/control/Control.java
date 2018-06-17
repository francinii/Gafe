package gafe.control;

import gafe.modelo.Factura;
import gafe.modelo.LectorFacturasXML;
import gafe.modelo.Proyecto;
import gafe.vista.formularioCrearProyecto;
import gafe.vista.formularioListarXml;
import gafe.vista.formularioPrincipal;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Control {
        
    public Control() {
        formularioPrincipal = new formularioPrincipal(this);
        formularioListarXml = new formularioListarXml(this); 
        formCrearProyecto = new formularioCrearProyecto(this);
        claseLectorFacturas = new LectorFacturasXML();
    }

    public void abrirFormularioListarXml(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        panelPrincipal.add(formularioListarXml);
        formularioListarXml.setSize(599, 284);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }   
    
    public void controlLectorFacturas(File[] files) {
        List<Factura> listadoFacturas;
        listadoFacturas = claseLectorFacturas.listarFacturas(files);

        /*Prueba crera XML Factura y agregar las facturas en la lista Facturas de la clase Proyecto*/
        /*for (int i = 0; i < listadoFacturas.size(); i++) {
            Factura factura = listadoFacturas.get(i);
            crearXml(factura);
            // Agregar XML al proyecto  OJO cambiar esta quemado.
 
        }*/
        for (int i = 0; i < listadoFacturas.size(); i++) {
            Factura factura = listadoFacturas.get(i);
            listadoProyecto.get(0).agregarXMLProyecto(factura);
        }
        
        crearXml(listadoProyecto.get(0)); // llenar el Archivo .GAFE hay q cambiarlo para que sea el que queremos seleccionar

    }
    
    public void abrirFormularioCrearProyecto(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        panelPrincipal.add(formCrearProyecto);
        formCrearProyecto.setSize(587, 402);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    } 
    
   /*------------------CREAR XML -----------------*/
    
    
    //public void crearXml(Factura factura){
    public void crearXml(Proyecto proyecto){
    String xmlString;
    
    String rutaProyecto = proyecto.getRuta();
    String nombreProyecto = proyecto.getCedula();
    String rutaTolta = rutaProyecto+"/"+nombreProyecto+".gafe";
    File file = new File(rutaTolta);
    
    try{
        JAXBContext context = JAXBContext.newInstance(Proyecto.class);
        Marshaller m = context.createMarshaller();       
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true); // Se habilita el Append para que pueda agregar  los datos si sobreescribir. 
        //StringWriter sw = new StringWriter();
        m.marshal(proyecto, file);
        m.marshal(proyecto, fw);
        
        //xmlString = sw.toString();
            //System.out.println(""+xmlString);
        } catch (JAXBException e) {
            System.out.println("Error Crear XML " + e);
        } catch (IOException e) {

        }
    }
    
   
    public void crearObjetoProyecto(String nombre, String cedula, String descripcion, String ruta) {
        Proyecto proyecto = new Proyecto(nombre, cedula, descripcion,ruta);
        listadoProyectos(proyecto);
    }

    public void listadoProyectos(Proyecto p) {
        listadoProyecto.add(p);
    }


    List<Proyecto> listadoProyecto = new ArrayList<>();
    formularioPrincipal formularioPrincipal;
    formularioListarXml formularioListarXml;
    formularioCrearProyecto formCrearProyecto;
    LectorFacturasXML claseLectorFacturas;
   
}
