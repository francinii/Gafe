
package gafe.modelo;


public class LineaDetalle {

    public LineaDetalle(String numeroLinea, CodigoLineaDetalle codigo, String cantidad, String unidadMedida, String unidadMedidaComercial, String detalle, String precioUnitario, String montoTotal, String montoDescuento, String Naturalezadescuento, String subTotal, Impuesto impuesto, String montoTotalLinea) {
        this.numeroLinea = numeroLinea;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.unidadMedidaComercial = unidadMedidaComercial;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
        this.montoTotal = montoTotal;
        this.montoDescuento = montoDescuento;
        this.Naturalezadescuento = Naturalezadescuento;
        this.subTotal = subTotal;
        this.impuesto = impuesto;
        this.montoTotalLinea = montoTotalLinea;
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

    public String getMontoDescuento() {
        return montoDescuento;
    }

    public String getNaturalezadescuento() {
        return Naturalezadescuento;
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

    public void setMontoDescuento(String montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public void setNaturalezadescuento(String Naturalezadescuento) {
        this.Naturalezadescuento = Naturalezadescuento;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public void setMontoTotalLinea(String montoTotalLinea) {
        this.montoTotalLinea = montoTotalLinea;
    }
    
    
    private String numeroLinea;
    private CodigoLineaDetalle codigo; // verificar Codigo que tiene Hijo
    private String cantidad;
    private String unidadMedida;
    private String unidadMedidaComercial;
    private String detalle;
    private String precioUnitario;
    private String montoTotal;
    private String montoDescuento;
    private String Naturalezadescuento;
    private String subTotal;
    private Impuesto impuesto; // tiene hijos 
    private String montoTotalLinea;              
}
