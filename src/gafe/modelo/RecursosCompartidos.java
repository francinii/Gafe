
package gafe.modelo;

public class RecursosCompartidos {
    
    public static String ruta; //Almacena la ruta del proyecto abierto 
    
    //ARchivo de configuracion
    //public static String directorio ="../gafe//src//recursos//config.txt";
    public static String directorio ="config.data";
    public static int nodoSeleccionado = 0;  
    public static String cedulaJuridicaProyecto;
    public static String fechaLicencia;
    public static int cantidadDeProyectos;

    public RecursosCompartidos() {
    }
    
    public static String getDiretorioArchivoConfiguracion(){
        return directorio;
    }
    public static String getRuta() {
        return ruta;
    }
    
    public static int getNodoSeleccionado(){
        return nodoSeleccionado;
    }
    
     public static void setNodoSeleccionado(int nodo){
        nodoSeleccionado = nodo;
    }

    public static void setRuta(String ruta) {
        RecursosCompartidos.ruta = ruta;
    }

    public static String getCedulaJuridicaProyecto() {
        return cedulaJuridicaProyecto;
    }

    public static void setCedulaJuridicaProyecto(String cedulaJuridicaProyecto) {
        RecursosCompartidos.cedulaJuridicaProyecto = cedulaJuridicaProyecto;
    }

    public static String getDirectorio() {
        return directorio;
    }

    public static void setDirectorio(String directorio) {
        RecursosCompartidos.directorio = directorio;
    }

    public static String getFechaLicencia() {
        return fechaLicencia;
    }

    public static void setFechaLicencia(String fechaLicencia) {
        RecursosCompartidos.fechaLicencia = fechaLicencia;
    }

    public static int getCantidadDeProyectos() {
        return cantidadDeProyectos;
    }

    public static void setCantidadDeProyectos(int cantidadDeProyectos) {
        RecursosCompartidos.cantidadDeProyectos = cantidadDeProyectos;
    }
    
    
    
  
    
    
}
