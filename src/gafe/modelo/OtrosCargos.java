package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="otrosCargos")
public class OtrosCargos {


    public OtrosCargos(String tipoDocumento, String numeroIdentidadTercero, String nombreTercero, String detalle, String porcentaje, String montoCargo) {
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentidadTercero = numeroIdentidadTercero;
        this.nombreTercero = nombreTercero;
        this.detalle = detalle;
        this.porcentaje = porcentaje;
        this.montoCargo = montoCargo;
    }

    public OtrosCargos() {
        this("", "", "", "", "", "");
    }



    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentidadTercero() {
        return numeroIdentidadTercero;
    }

    public void setNumeroIdentidadTercero(String numeroIdentidadTercero) {
        this.numeroIdentidadTercero = numeroIdentidadTercero;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getMontoCargo() {
        return montoCargo;
    }

    public void setMontoCargo(String montoCargo) {
        this.montoCargo = montoCargo;
    }



    
    
    
private String tipoDocumento;
private String numeroIdentidadTercero;
private String nombreTercero;
private String detalle;
private String porcentaje;
private String montoCargo;
}
