package gafe.modelo;

import java.util.Date;

public class InformacionReferencia {

    public InformacionReferencia(String tipoDocumento, String numeroDoumento, String fechaEmision, String codigo, String razon) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDoumento = numeroDoumento;
        this.fechaEmision = fechaEmision;
        this.codigo = codigo;
        this.razon = razon;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDoumento() {
        return numeroDoumento;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getrazon() {
        return razon;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumeroDoumento(String numeroDoumento) {
        this.numeroDoumento = numeroDoumento;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setrazon(String Referncia) {
        this.razon = Referncia;
    }
       
    private String tipoDocumento;
    private String numeroDoumento;
    private String fechaEmision;
    private String codigo;
    private String razon;
    
        
}
