package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "factura")
public class Factura {

    public Factura() {
        this("","", "" ,"", "", new Emisor(), new Receptor(), "", "", "", new DetalleServicio(), new OtrosCargos(), new ResumenFactura(), new InformacionReferencia(), new Otros());
    }
    
    public Factura(String categoria, String clave, String codigoActividad,String consecutivo, String fechaEmision, Emisor emisor, Receptor receptor, String condicionVenta, String plazoCredito, String medioPago, DetalleServicio detalleServicio,OtrosCargos otrosCargos, ResumenFactura resumenFactura, InformacionReferencia informacionReferencia, Otros otros) {
        this.clave = clave;
        this.codigoActividad = codigoActividad;
        this.categoria = categoria;
        this.consecutivo = consecutivo;
        this.fechaEmision = fechaEmision;
        this.emisor = emisor;
        this.receptor = receptor;
        this.condicionVenta = condicionVenta;
        this.plazoCredito = plazoCredito;
        this.medioPago = medioPago;
        this.detalleServicio = detalleServicio;
        this.otrosCargos = otrosCargos;
        this.resumenFactura = resumenFactura;
        this.informacionReferencia = informacionReferencia;
        this.otros = otros;
    }

    public String getClave() {
        return clave;
    }

    public String getCodigoActividad() {
        return codigoActividad;
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


    
    public String getCategoria(){
        return categoria;
    }

  
       
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public void setCodigoActividad(String codigoActividad) {
        this.codigoActividad = codigoActividad;
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

   
    public OtrosCargos getOtrosCargos() {
        return otrosCargos;
    }

    public void setOtrosCargos(OtrosCargos otrosCargos) {
        this.otrosCargos = otrosCargos;
    }
    
    
    private String categoria;
    private String clave;
    private String codigoActividad;
    private String consecutivo;
    private String fechaEmision;
    private Emisor emisor;
    private Receptor receptor;
    private String condicionVenta;
    private String plazoCredito;
    private String medioPago;
    private DetalleServicio detalleServicio;
    private OtrosCargos otrosCargos;
    private ResumenFactura resumenFactura;
    private InformacionReferencia informacionReferencia;
    private Otros otros;
}
