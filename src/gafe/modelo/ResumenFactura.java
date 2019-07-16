package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="resumenFactura")
public class ResumenFactura {

    public ResumenFactura(CodigoTipoMoneda codigoMoneda, String totalServiciosGravados, String totalServiciosExcentos, String totalServiciosExonerados, String totalMercanciasGravadas, String totalMercanciasExcentas, String totalMercaderiaExonerada, String totalGravado, String totalExcento, String totalExonerado, String totalVenta, String totalDescuentos, String totalVentaNeta, String totalImpuesto, String totaIVAdevuelto, String totalOtrosCargos, String totalComprobante) {
        this.codigoMoneda = codigoMoneda;
        this.totalServiciosGravados = totalServiciosGravados;
        this.totalServiciosExcentos = totalServiciosExcentos;
        this.totalServiciosExonerados = totalServiciosExonerados;
        this.totalMercanciasGravadas = totalMercanciasGravadas;
        this.totalMercanciasExcentas = totalMercanciasExcentas;
        this.totalMercaderiaExonerada = totalMercaderiaExonerada;
        this.totalGravado = totalGravado;
        this.totalExcento = totalExcento;
        this.totalExonerado = totalExonerado;
        this.totalVenta = totalVenta;
        this.totalDescuentos = totalDescuentos;
        this.totalVentaNeta = totalVentaNeta;
        this.totalImpuesto = totalImpuesto;
        this.totaIVAdevuelto = totaIVAdevuelto;
        this.totalOtrosCargos = totalOtrosCargos;
        this.totalComprobante = totalComprobante;
    }


    
        public ResumenFactura() {
            this(new CodigoTipoMoneda(),"","","","","","","","","","","","","","","","");
        }


    public String getTotalServiciosGravados() {
        return totalServiciosGravados;
    }

    public String getTotalServiciosExcentos() {
        return totalServiciosExcentos;
    }

    public String getTotalMercanciasGravadas() {
        return totalMercanciasGravadas;
    }

    public String getTotalMercanciasExcentas() {
        return totalMercanciasExcentas;
    }

    public String getTotalGravado() {
        return totalGravado;
    }

    public String getTotalExcento() {
        return totalExcento;
    }

    public String getTotalVenta() {
        return totalVenta;
    }

    public String getTotalDescuentos() {
        return totalDescuentos;
    }

    public String getTotalVentaNeta() {
        return totalVentaNeta;
    }

    public String getTotalImpuesto() {
        return totalImpuesto;
    }

    public String getTotalComprobante() {
        return totalComprobante;
    }

    public CodigoTipoMoneda getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(CodigoTipoMoneda codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

 

    public void setTotalServiciosGravados(String totalServiciosGravados) {
        this.totalServiciosGravados = totalServiciosGravados;
    }

    public void setTotalServiciosExcentos(String totalServiciosExcentos) {
        this.totalServiciosExcentos = totalServiciosExcentos;
    }

    public void setTotalMercanciasGravadas(String totalMercanciasGravadas) {
        this.totalMercanciasGravadas = totalMercanciasGravadas;
    }

    public void setTotalMercanciasExcentas(String totalMercanciasExcentas) {
        this.totalMercanciasExcentas = totalMercanciasExcentas;
    }

    public void setTotalGravado(String totalGravado) {
        this.totalGravado = totalGravado;
    }

    public void setTotalExcento(String totalExcento) {
        this.totalExcento = totalExcento;
    }

    public void setTotalVenta(String totalVenta) {
        this.totalVenta = totalVenta;
    }

    public void setTotalDescuentos(String totalDescuentos) {
        this.totalDescuentos = totalDescuentos;
    }

    public void setTotalVentaNeta(String totalVentaNeta) {
        this.totalVentaNeta = totalVentaNeta;
    }

    public void setTotalImpuesto(String totalImpuesto) {
        this.totalImpuesto = totalImpuesto;
    }

    public void setTotalComprobante(String totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    public String getTotalServiciosExonerados() {
        return totalServiciosExonerados;
    }

    public void setTotalServiciosExonerados(String totalServiciosExonerados) {
        this.totalServiciosExonerados = totalServiciosExonerados;
    }

    public String getTotalMercaderiaExonerada() {
        return totalMercaderiaExonerada;
    }

    public void setTotalMercaderiaExonerada(String totalMercaderiaExonerada) {
        this.totalMercaderiaExonerada = totalMercaderiaExonerada;
    }

    public String getTotalExonerado() {
        return totalExonerado;
    }

    public void setTotalExonerado(String totalExonerado) {
        this.totalExonerado = totalExonerado;
    }

    public String getTotaIVAdevuelto() {
        return totaIVAdevuelto;
    }

    public void setTotaIVAdevuelto(String totaIVAdevuelto) {
        this.totaIVAdevuelto = totaIVAdevuelto;
    }

    public String getTotalOtrosCargos() {
        return totalOtrosCargos;
    }

    public void setTotalOtrosCargos(String totalOtrosCargos) {
        this.totalOtrosCargos = totalOtrosCargos;
    }
    
    
    
    private CodigoTipoMoneda codigoMoneda;
    private String totalServiciosGravados;
    private String totalServiciosExcentos;
    private String totalServiciosExonerados;
    
    private String totalMercanciasGravadas;
    private String totalMercanciasExcentas;
    private String totalMercaderiaExonerada;
    
    private String totalGravado;
    private String totalExcento;
    private String totalExonerado;
    private String totalVenta;
    private String totalDescuentos;
    private String totalVentaNeta;
    private String totalImpuesto;
    private String totaIVAdevuelto;
    private String totalOtrosCargos;
    private String totalComprobante;

    
}
