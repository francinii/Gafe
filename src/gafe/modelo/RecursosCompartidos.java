
package gafe.modelo;

public class RecursosCompartidos {
    
    public static String ruta; //Almacena la ruta del proyecto abierto 
          

    public RecursosCompartidos() {
    }
    
    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        RecursosCompartidos.ruta = ruta;
    }
  
}
