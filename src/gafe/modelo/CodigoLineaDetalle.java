
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="codigoDetalle")
public class CodigoLineaDetalle {

    public CodigoLineaDetalle(String tipoCodigo, String nombreCodigo) {
        this.tipoCodigo = tipoCodigo;
        this.nombreCodigo = nombreCodigo;
    }
    
    public CodigoLineaDetalle(){
        this("","");
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public String getNombreCodigo() {
        return nombreCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public void setNombreCodigo(String nombreCodigo) {
        this.nombreCodigo = nombreCodigo;
    }
            
    private String tipoCodigo;
    private String nombreCodigo;
    
    
    
    
}
