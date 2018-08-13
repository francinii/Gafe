
package gafe.modelo;

public class RecursosCompartidos {
    
    public static String ruta; //Almacena la ruta del proyecto abierto 
    
    //ARchivo de configuracion
    //public static String directorio ="../gafe//src//recursos//config.txt";
    public static String directorio ="config.txt";
    public static int nodoSeleccionado = 0;      

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
  
}
