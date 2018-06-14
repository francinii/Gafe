package gafe.control;

import gafe.modelo.Factura;
import gafe.modelo.LectorFacturasXML;
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
        
        
        /*Prueba crera XML Factura*/
        for (int i = 0; i < listadoFacturas.size(); i++) {
            Factura factura= listadoFacturas.get(i);
            crearXml(factura);
        }
        
        
    }
    
    public void abrirFormularioCrearProyecto(JPanel panelPrincipal) {
        panelPrincipal.removeAll();
        panelPrincipal.add(formCrearProyecto);
        formCrearProyecto.setSize(587, 402);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    } 
    
   /*------------------CREAR XML -----------------*/
    
    
    public void crearXml(Factura factura){
    String xmlString;
    File file = new File("C:\\file.xml");
    
    try{
        JAXBContext context = JAXBContext.newInstance(Factura.class);
        Marshaller m = context.createMarshaller();       
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true); // Se habilita el Append para que pueda agregar  los datos si sobreescribir. 
        //StringWriter sw = new StringWriter();
        m.marshal(factura, file);
        m.marshal(factura, fw);
        
        //xmlString = sw.toString();
        
        //System.out.println(""+xmlString);
    } catch(JAXBException e) {
        System.out.println("Error Crear XML " +e);
    } catch(IOException e){
        
        
    }}
    
    
    //PRUEBA GITTTTT
    
    
    
    
    
    
    
    
    
    
    
    
    

    formularioPrincipal formularioPrincipal;
    formularioListarXml formularioListarXml;
    formularioCrearProyecto formCrearProyecto;
    LectorFacturasXML claseLectorFacturas;
   
}