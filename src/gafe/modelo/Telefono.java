package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="telefono")
public class Telefono {

    public Telefono(String codigoPais, String numeroTelefono) {
        this.codigoPais = codigoPais;
        this.numeroTelefono = numeroTelefono;
    }
    
     public Telefono() {
        this("","");
     }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    private String codigoPais;
    private String numeroTelefono;
   // private int tipo; //Corresponde al tipo de telefono FAX o 
}
