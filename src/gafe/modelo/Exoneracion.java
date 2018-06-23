
package gafe.modelo;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exoneracion")
public class Exoneracion {
    public Exoneracion(String tipoDocumento, String numeroDocumento, String nombreInstitucion, String fecheEmision, String montoImpuesto, String porcentajeCompra) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreInstitucion = nombreInstitucion;
        this.fecheEmision = fecheEmision;
        this.montoImpuesto = montoImpuesto;
        this.porcentajeCompra = porcentajeCompra;
    }
    
    public Exoneracion(){
        this("", "", "", "", "", "");
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return the nombreInstitucion
     */
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * @param nombreInstitucion the nombreInstitucion to set
     */
    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    /**
     * @return the fecheEmision
     */
    public String getFecheEmision() {
        return fecheEmision;
    }

    /**
     * @param fecheEmision the fecheEmision to set
     */
    public void setFecheEmision(String fecheEmision) {
        this.fecheEmision = fecheEmision;
    }

    /**
     * @return the montoImpuesto
     */
    public String getMontoImpuesto() {
        return montoImpuesto;
    }

    /**
     * @param montoImpuesto the montoImpuesto to set
     */
    public void setMontoImpuesto(String montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }

    /**
     * @return the porcentajeCompra
     */
    public String getPorcentajeCompra() {
        return porcentajeCompra;
    }

    /**
     * @param porcentajeCompra the porcentajeCompra to set
     */
    public void setPorcentajeCompra(String porcentajeCompra) {
        this.porcentajeCompra = porcentajeCompra;
    }



           
    private String  tipoDocumento;
    private String numeroDocumento;
    private String nombreInstitucion;
    private String fecheEmision;
    private String montoImpuesto;
    private String porcentajeCompra;
        
}
