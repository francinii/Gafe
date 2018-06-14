
package gafe.modelo;


public class Normativa {

    public Normativa(String numeroResolucion, String fechaResolucion) {
        this.numeroResolucion = numeroResolucion;
        this.fechaResolucion = fechaResolucion;
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
