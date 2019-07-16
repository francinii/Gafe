
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="lineaDetalle")
public class LineaDetalle {

    public LineaDetalle(String numeroLinea, String codigoPrdoucto, CodigoLineaDetalle codigo, 
            String cantidad, String unidadMedida, String unidadMedidaComercial, String detalle, 
            String precioUnitario, String montoTotal, Descuento descuento, String subTotal, String baseImponible,
            Impuesto impuesto, String impuestoNeto, String montoTotalLinea) 
    {
        this.numeroLinea = numeroLinea;
        this.codigoPrdoucto = codigoPrdoucto;
        this.codigo = codigo; // este es el codigo comercial
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.unidadMedidaComercial = unidadMedidaComercial;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.montoTotal = montoTotal;
        this.descuento = descuento;
        this.subTotal = subTotal;
        this.baseImponible = baseImponible;
        this.impuesto = impuesto;
        this.impuestoNeto = impuestoNeto;
        this.montoTotalLinea = montoTotalLinea;
    }

    
    

    public LineaDetalle(){
        this("","",new CodigoLineaDetalle(),"","","","","","",new Descuento(),"","",new Impuesto(),"","");
    }  

    public String getNumeroLinea() {
        return numeroLinea;
    }

    public CodigoLineaDetalle getCodigo() {
        return codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public String getUnidadMedidaComercial() {
        return unidadMedidaComercial;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public String getMontoTotal() {
        return montoTotal;
    }


    public String getSubTotal() {
        return subTotal;
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public String getMontoTotalLinea() {
        return montoTotalLinea;
    }

    public String getCodigoPrdoucto() {
        return codigoPrdoucto;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public String getImpuestoNeto() {
        return impuestoNeto;
    }
    
    
    
    

    public void setNumeroLinea(String numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public void setCodigo(CodigoLineaDetalle codigo) {
        this.codigo = codigo;
    }


    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setUnidadMedidaComercial(String unidadMedidaComercial) {
        this.unidadMedidaComercial = unidadMedidaComercial;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }


    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    
    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public void setMontoTotalLinea(String montoTotalLinea) {
        this.montoTotalLinea = montoTotalLinea;
    }

    public void setCodigoPrdoucto(String codigoPrdoucto) {
        this.codigoPrdoucto = codigoPrdoucto;
    }

    public void setImpuestoNeto(String impuestoNeto) {
        this.impuestoNeto = impuestoNeto;
    }
    
    
    
    
    
    private String numeroLinea;
    private String codigoPrdoucto;
    private CodigoLineaDetalle codigo; // verificar Codigo que tiene Hijo
    private String cantidad;
    private String unidadMedida;
    private String unidadMedidaComercial;
    private String detalle;
    private String precioUnitario;
    private String montoTotal;
    private Descuento descuento;
    private String subTotal;
    private String baseImponible;
    private Impuesto impuesto; // tiene hijos 
    private String impuestoNeto;
    private String montoTotalLinea;              
}
