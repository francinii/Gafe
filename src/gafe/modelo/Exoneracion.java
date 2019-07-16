
package gafe.modelo;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="exoneracion")
public class Exoneracion {
    public Exoneracion(String tipoDocumento, String numeroDocumento, String nombreInstitucion, String fecheEmision, String porecentajeExoneracion, String montoExoneracion) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreInstitucion = nombreInstitucion;
        this.fecheEmision = fecheEmision;
        this.porecentajeExoneracion = porecentajeExoneracion;
        this.montoExoneracion = montoExoneracion;
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

    public String getPorecentajeExoneracion() {
        return porecentajeExoneracion;
    }

    public void setPorecentajeExoneracion(String porecentajeExoneracion) {
        this.porecentajeExoneracion = porecentajeExoneracion;
    }

    public String getMontoExoneracion() {
        return montoExoneracion;
    }

    public void setMontoExoneracion(String montoExoneracion) {
        this.montoExoneracion = montoExoneracion;
    }

    


           
    private String  tipoDocumento;
    private String numeroDocumento;
    private String nombreInstitucion;
    private String fecheEmision;
    private String porecentajeExoneracion;
    private String montoExoneracion;
        
}
