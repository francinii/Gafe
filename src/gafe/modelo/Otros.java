package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="otros")
public class Otros {
   
    public Otros(String texto, String contenido) {
        this.texto = texto;        
    }
    
     public Otros() {
        this("","");       
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
 
    
    private String texto;
    private String contenido;
    
    
    
    
}
