package gafe.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="detalleServicio")
public class DetalleServicio {

    public DetalleServicio() {
        listaLineaDetalle = new ArrayList<>();
    } 

    public void agregarLinea(LineaDetalle e) {
        listaLineaDetalle.add(e);
    }
    
    @XmlElementWrapper(name="wrapperLineaDetalle")
    @XmlElement(name="lineaDetalle")
    public List<LineaDetalle> getListaLineaDetalle() {
        return listaLineaDetalle;
    }
    
    private List<LineaDetalle> listaLineaDetalle;

   
    
    
    
}
