
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="descuento")
public class Descuento {

    public Descuento(String montoDescuento, String Naturalezadescuento) {
        this.montoDescuento = montoDescuento;
        this.Naturalezadescuento = Naturalezadescuento;
    }
    
    public Descuento() {
        this("","");
    }

    public String getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(String montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public String getNaturalezadescuento() {
        return Naturalezadescuento;
    }

    public void setNaturalezadescuento(String Naturalezadescuento) {
        this.Naturalezadescuento = Naturalezadescuento;
    }
        
    private String montoDescuento;
    private String Naturalezadescuento;
    
}
