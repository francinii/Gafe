
package gafe.modelo;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // este es para crear el XML
public class Factura {

    public Factura(){};
    
    public Factura(String clave, String consecutivo, String fechaEmision, Emisor emisor, Receptor receptor, String condicionVenta, String plazoCredito, String medioPago, DetalleServicio detalleServicio, ResumenFactura resumenFactura, InformacionReferencia informacionReferencia, Normativa normativa) {
        this.clave = clave;
        this.consecutivo = consecutivo;
        this.fechaEmision = fechaEmision;
        this.emisor = emisor;
        this.receptor = receptor;
        this.condicionVenta = condicionVenta;
        this.plazoCredito = plazoCredito;
        this.medioPago = medioPago;
        this.detalleServicio = detalleServicio;
        this.resumenFactura = resumenFactura;
        this.informacionReferencia = informacionReferencia;
        this.normativa = normativa;
    }

    public String getClave() {
        return clave;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public String
         getFechaEmision() {
        return fechaEmision;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public String getCondicionVenta() {
        return condicionVenta;
    }
          
    public String getPlazoCredito() {
        return plazoCredito;
    }

    public String getMedioPago() {
        return medioPago;
    } 

    public DetalleServicio getDetalleServicio() {
        return detalleServicio;
    }

    public ResumenFactura getResumenFactura() {
        return resumenFactura;
    }

    public InformacionReferencia getInformacionReferencia() {
        return informacionReferencia;
    }

    public Normativa getOtros() {
        return normativa;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public void setCondicionVenta(String condicionVenta) {
        this.condicionVenta = condicionVenta;
    }


    public void setPlazoCredito(String plazoCredito) {
        this.plazoCredito = plazoCredito;
    }

    
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public void setDetalleServicio(DetalleServicio detalleServicio) {
        this.detalleServicio = detalleServicio;
    }

    public void setResumenFactura(ResumenFactura resumenFactura) {
        this.resumenFactura = resumenFactura;
    }

    public void setInformacionReferencia(InformacionReferencia informacionReferencia) {
        this.informacionReferencia = informacionReferencia;
    }

    public void setNormativa(Normativa otros) {
        this.normativa = otros;
    }
    
    private String clave;
    private String consecutivo;
    private String fechaEmision;
    private Emisor emisor;
    private Receptor receptor;
    private String condicionVenta;
    private String plazoCredito;
    private String medioPago;
    private DetalleServicio detalleServicio;
    private ResumenFactura resumenFactura;
    private InformacionReferencia informacionReferencia;
    private Normativa normativa;
    
    
    
    
    
    
    
}
