
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="normativa")
public class Normativa {

    public Normativa(String numeroResolucion, String fechaResolucion) {
        this.numeroResolucion = numeroResolucion;
        this.fechaResolucion = fechaResolucion;
    }
    
    public Normativa(){
        this("", "");
    }

    public String getNumeroResolucion() {
        return numeroResolucion;
    }

    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    public String getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }
    
        
    private String numeroResolucion;
    private String fechaResolucion;
    
}
