package gafe.control;
import gafe.modelo.Factura;
import gafe.modelo.LectorArchivoConfiguracion;
import gafe.modelo.LectorFacturasXML;
import gafe.modelo.Proyecto;
import gafe.modelo.RecursosCompartidos;
import gafe.vista.ControlFormularioPrincipal;
import gafe.vista.acercaDe;
import gafe.vista.cargarLicencia;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Control {

    public Control() {

        lectorArchivoConfiguracion = new LectorArchivoConfiguracion();
        List<String> licencia = null;
        licencia = lectorArchivoConfiguracion.leerArchivo(directorioLicencia);
        String lic;
        
        
        if (licencia.size() > 0) {
            // si el arhivo licencia tiene algo, lo convertimos y comparamos las fechas
            lic = licencia.get(0);

            Date date = leerLicencia(lic);
            int resultadoFechas = compararFechaLicencia(date);

            if (resultadoFechas >= 0) {
                //Fechas correctas porque es positivo, la licencia esta bien
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
            } else {
                //formulario que indica que esta vencido el sitema.
                formularioLicencia = new cargarLicencia(directorioLicencia);
                formularioLicencia.setVisible(true);
            }

        } else {
            //Si el archivo licencia esta vacio debe mostrar que se necesita la licencia para poder iniciar
            formularioLicencia = new cargarLicencia(directorioLicencia);
            formularioLicencia.setVisible(true);
        }

    }

    public Date leerLicencia(String licencia) {

        DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy", Locale.US);
        Date date;
        try {
            // desencripta la fecha.
            String fechaDesencriptada = Encriptar.Desencriptar(licencia);
            date = formatter.parse(fechaDesencriptada);
            System.out.println("fechaaa " + date);

        } catch (Exception ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            date = null;
        }

        return date;

    }

    public int compararFechaLicencia(Date fechaVecimiento) {

        /* 
        s1 > s2, it returns positive number  
        s1 < s2, it returns negative number  
        s1 == s2, it returns 0  
        
        Pare este caso mi fecha de vencimiento tiene que se mayor que la facha actual, por lo tanto 
        devuelve positivo 1.
        
         */
        int resultado;

        Date miFechaActual = new Date();

        resultado = fechaVecimiento.compareTo(miFechaActual);

        return resultado;
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
        return formReporte.ObtenerTablaReportes();
    }

    public JTable tablaClientes() {
        return formClientes.tablaClientes();
    }

    public JTable tablaProveedores() {
        return formProveedores.tablaProveedores();
    }
    
    public JTable tablaListar() {
        return formularioListarXml.ObtenerTablaListar();
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
    
    public JPanel getPanelPrincipal(){
        return formularioPrincipal.getPanelPrincipal();
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

    public void agregarElementolistadoProyectos(Proyecto p) {
        listadoProyecto.add(p);
        System.out.println("ESTO ES EL NUEMRO DE LOS PROYECTOS:"+listadoProyecto.size() );
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
    
    
    public List<String> obtenerListadoError(){
        return claseLectorFacturas.getListadoError();
    }
    
    public void limpiarListadoError(){
        claseLectorFacturas.vaciarListaError();
    }
    
    
        
    List<Proyecto> listadoProyecto = new ArrayList<>();
    cargarLicencia formularioLicencia;
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
   
    
    
    
    private String directorio = "config.txt";
    
    private String directorioLicencia = "licencia.lic";
    //private String directorioGlobalConfig = "../gafe//src//recursos//GlobalConfig.txt";

}
