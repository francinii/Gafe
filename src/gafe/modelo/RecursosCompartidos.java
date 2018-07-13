
package gafe.modelo;

public class RecursosCompartidos {
    
    public static String ruta; //Almacena la ruta del proyecto abierto 
    public static String directorio ="../gafe//src//recursos//config.txt";
          

    public RecursosCompartidos() {
    }
    
    public static String getDiretorioArchivoConfiguracion(){
        return directorio;
    }
    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        RecursosCompartidos.ruta = ruta;
    }
  
}
