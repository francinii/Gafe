package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="impuesto")
public class Impuesto {

    public Impuesto(String codigo, String tarifaImpuesto, String monto, Exoneracion exoneracion) {
        this.codigo = codigo;
        this.tarifaImpuesto = tarifaImpuesto;
        this.monto = monto;
        this.exoneracion = exoneracion;
    }
    
    public Impuesto(){
        this("","","",null);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTarifaImpuesto() {
        return tarifaImpuesto;
    }

    public String getMonto() {
        return monto;
    }

    public Exoneracion getExoneracion() {
        return exoneracion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTarifaImpuesto(String tarifaImpuesto) {
        this.tarifaImpuesto = tarifaImpuesto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public void setExoneracion(Exoneracion exoneracion) {
        this.exoneracion = exoneracion;
    }
    
    private String codigo;
    private String tarifaImpuesto;
    private String monto; // se obtiene de la multiplicacion del campo subtotal por la tarifa del impuesto;
    private Exoneracion exoneracion;
    
}
