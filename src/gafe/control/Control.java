package gafe.control;

import gafe.modelo.Factura;
import gafe.modelo.LectorFacturasXML;
import gafe.modelo.Proyecto;
import gafe.modelo.RecursosCompartidos;
import gafe.vista.ControlFormularioPrincipal;
import gafe.vista.formularioCrearProyecto;
import gafe.vista.formularioListarXml;
import gafe.vista.formularioPrincipal;
import gafe.vista.formularioReporte;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Control {

    public Control() {
        controlVentanas = new ControlFormularioPrincipal(this);
        formularioPrincipal = new formularioPrincipal(this, controlVentanas);
        formularioListarXml = new formularioListarXml(controlVentanas);
        formCrearProyecto = new formularioCrearProyecto(controlVentanas);
        claseLectorFacturas = new LectorFacturasXML();
        formReporte = new formularioReporte(controlVentanas);
        recursosCompartidos = new RecursosCompartidos();     
    }

    public formularioCrearProyecto getFormularioCrearProyecto() {
        return formCrearProyecto;
    }

    public formularioListarXml getFormularioListarXml() {
        return formularioListarXml;
    }

    public formularioReporte getFormReporte() {
        return formReporte;
    }

    public List<Factura> obtenerListadoFacturas(File[] files) {
        return claseLectorFacturas.listarFacturas(files);
    }

    
    public List<Proyecto> obtenerListadoProyectos() {
        return listadoProyecto;
    }
    
    public Factura crearFactura(String ruta){
        return claseLectorFacturas.crearFactura(ruta);
    }
    
    public JTree arbol(){
        return formularioPrincipal.arbol();
    }



    /*------------------CREAR XML -----------------*/
    //public void crearXml(Factura factura){

    public Proyecto crearObjetoProyecto(String nombre, String cedula, String descripcion, String ruta) {
        return new Proyecto(nombre, cedula, descripcion, ruta);
        //Crear un metodo que escriba en un txt el nombre y la ruta del proyecto
        //listadoProyectos(proyecto);
    }

    public Proyecto crearObjetoProyecto(String nombre, String cedula, String descripcion, String ruta, List<Factura> facturas) {
        return new Proyecto(nombre, cedula, descripcion, ruta, facturas);
        //Crear un metodo que escriba en un txt el nombre y la ruta del proyecto
        //listadoProyectos(proyecto);
    }

    public void listadoProyectos(Proyecto p) {
        listadoProyecto.add(p);
    }
    
    
    // este meotodo me retorna la tabla del fromulario principal, para poder cargarl cuando abro el archivo .Gafe
    public JTable obtenerTabla(){
        JTable tabla = formularioListarXml.obtenerTabla();
        return tabla;
    }
    
    
    
    List<Proyecto> listadoProyecto = new ArrayList<>();
    formularioPrincipal formularioPrincipal;
    formularioListarXml formularioListarXml;
    formularioCrearProyecto formCrearProyecto;
    LectorFacturasXML claseLectorFacturas;
    formularioReporte formReporte;
    ControlFormularioPrincipal controlVentanas;
    RecursosCompartidos recursosCompartidos;

}
