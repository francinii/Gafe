package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="resumenFactura")
public class ResumenFactura {

    public ResumenFactura(String codigoMoneda, String tipoCambio, String totalServiciosGravados, String totalServiciosExcentos, String totalMercanciasGravadas, String totalMercanciasExcentas, String totalGravado, String totalExcento, String totalVenta, String totalDescuentos, String totalVentaNeta, String totalImpuesto, String totalComprobante) {
        this.codigoMoneda = codigoMoneda;
        this.tipoCambio = tipoCambio;
        this.totalServiciosGravados = totalServiciosGravados;
        this.totalServiciosExcentos = totalServiciosExcentos;
        this.totalMercanciasGravadas = totalMercanciasGravadas;
        this.totalMercanciasExcentas = totalMercanciasExcentas;
        this.totalGravado = totalGravado;
        this.totalExcento = totalExcento;
        this.totalVenta = totalVenta;
        this.totalDescuentos = totalDescuentos;
        this.totalVentaNeta = totalVentaNeta;
        this.totalImpuesto = totalImpuesto;
        this.totalComprobante = totalComprobante;
    }
    
        public ResumenFactura() {
            this("","","","","","","","","","","","","");
        }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public String getTipoCambio() {
        return tipoCambio;
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

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
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
    
    private String codigoMoneda;
    private String tipoCambio;
    private String totalServiciosGravados;
    private String totalServiciosExcentos;
    private String totalMercanciasGravadas;
    private String totalMercanciasExcentas;
    private String totalGravado;
    private String totalExcento;
    private String totalVenta;
    private String totalDescuentos;
    private String totalVentaNeta;
    private String totalImpuesto;
    private String totalComprobante;
    
}
