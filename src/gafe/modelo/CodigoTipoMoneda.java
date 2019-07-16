
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="codigoTipoMoneda")
public class CodigoTipoMoneda {

    public CodigoTipoMoneda(String codigoMoneda, String tipoCambio) {
        this.codigoMoneda = codigoMoneda;
        this.tipoCambio = tipoCambio;
    }

    public CodigoTipoMoneda() {
        this("","");
    }

    
    
    
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
    
    
    
    
    
    
    private String codigoMoneda;
    private String tipoCambio;
    
}
