package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="otros")
public class Otros {
   
    public Otros(String texto) {
        this.texto = texto;        
    }
    
     public Otros() {
        this("");       
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

 
    
    private String texto;
  
    
    
    
    
}
