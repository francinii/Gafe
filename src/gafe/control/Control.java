package gafe.control;
import gafe.modelo.Factura;
import gafe.modelo.LectorArchivoConfiguracion;
import gafe.modelo.LectorFacturasXML;
import gafe.modelo.Proyecto;
import gafe.modelo.RecursosCompartidos;
import gafe.vista.ControlFormularioPrincipal;
import gafe.vista.acercaDe;
import gafe.vista.filtroReporte;
import gafe.vista.formularioClientes;
import gafe.vista.formularioCrearProyecto;
import gafe.vista.formularioListarXml;
import gafe.vista.formularioPrincipal;
import gafe.vista.formularioProveedores;
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
        lectorArchivoConfiguracion = new LectorArchivoConfiguracion();
        controlVentanas = new ControlFormularioPrincipal(this);
        formularioPrincipal = new formularioPrincipal(this, controlVentanas);
        formularioListarXml = new formularioListarXml(controlVentanas);
        formCrearProyecto = new formularioCrearProyecto(controlVentanas);
        claseLectorFacturas = new LectorFacturasXML();
        formReporte = new formularioReporte(controlVentanas);
        formClientes = new formularioClientes(controlVentanas);
        formProveedores = new formularioProveedores(controlVentanas);
        recursosCompartidos = new RecursosCompartidos();
        cambiarEstadoColumnasReporte(directorio);
        acercaDe = new acercaDe();
    }

    public void ocultarMostrarColumnas(int columna, boolean status) {
        controlVentanas.ocultarMostrarColumnas(columna, status);
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
    
    public formularioClientes getFormClientes(){
        return formClientes;
    }
    
    public formularioProveedores getFormProveedores(){
        return formProveedores;
    }

    public JTable tablaReportes() {
        return formReporte.tablaReportes();
    }

    public JTable tablaClientes() {
        return formClientes.tablaClientes();
    }

    public JTable tablaProveedores() {
        return formProveedores.tablaProveedores();
    }

    public List<Factura> obtenerListadoFacturas(File[] files) {
        return claseLectorFacturas.listarFacturas(files);
    }

    public List<Proyecto> obtenerListadoProyectos() {
        return listadoProyecto;
    }

    public Factura crearFactura(String ruta) {
        return claseLectorFacturas.crearFactura(ruta);
    }

    public JTree arbol() {
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
    public JTable obtenerTabla() {
        JTable tabla = formularioListarXml.obtenerTabla();
        return tabla;
    }

    public List<String> leerArchivoConfiguracion(String directorio) {
        return lectorArchivoConfiguracion.leerArchivo(directorio);
    }

    public void escribirArchivoConfiguracion(String ruta, List<String> listaEstados, boolean sobreescribir) {
        lectorArchivoConfiguracion.escribirArchivo(ruta, listaEstados,sobreescribir);
    }     
 

    public void cambiarEstadoColumnasReporte(String ruta) {
        List<String> listaEstados = leerArchivoConfiguracion(ruta);
        boolean estado;
        for (int i = 0; i < listaEstados.size(); i++) {
            estado = false;
            if (listaEstados.get(i).equals("true")) {
                estado = true;
            }
            ocultarMostrarColumnas(i, estado);
        }
    }

    public void mostrarAcercaDe() {
        acercaDe.activarVentana();
    }
    
    public boolean validarCedulaProyecto(File ruta, String cedula){
        return claseLectorFacturas.validarCedulaProyecto(ruta, cedula);
    }
        
    List<Proyecto> listadoProyecto = new ArrayList<>();
    formularioPrincipal formularioPrincipal;
    formularioListarXml formularioListarXml;
    formularioCrearProyecto formCrearProyecto;
    LectorFacturasXML claseLectorFacturas;
    formularioReporte formReporte;
    ControlFormularioPrincipal controlVentanas;
    RecursosCompartidos recursosCompartidos;
    LectorArchivoConfiguracion lectorArchivoConfiguracion;
    formularioClientes formClientes;
    formularioProveedores formProveedores;
    acercaDe acercaDe;
    //filtroReporte ventanaFiltros;
    private String directorio = "../gafe//src//recursos//config.txt";
    //private String directorioGlobalConfig = "../gafe//src//recursos//GlobalConfig.txt";

}
