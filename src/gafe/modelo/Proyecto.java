
package gafe.modelo;

import java.util.ArrayList;
import java.util.List;


public class Proyecto {
    Proyecto(String nombre, String cedula, String descripcion,ArrayList<Factura>listaFacturas ){
        this.nombre = nombre;
        this.cedula = cedula;
        this.descripcion = descripcion;        
        listadoFacturas = new ArrayList<>(listaFacturas);
    }
    
 
    
    private String nombre;
    private String cedula;
    private String descripcion;
    List<Factura> listadoFacturas;
    
}
