package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="impuesto")
public class Impuesto {

    public Impuesto(String codigo, String codigoTarifa, String tarifa, String FactorIVA, String monto, Exoneracion exoneracion) {
        this.codigo = codigo;
        this.codigoTarifa = codigoTarifa;
        this.tarifa = tarifa;
        this.FactorIVA = FactorIVA;
        this.monto = monto;
        this.exoneracion = exoneracion;
    }


    
    public Impuesto(){
        this("","","","","",new Exoneracion());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoTarifa() {
        return codigoTarifa;
    }

    public void setCodigoTarifa(String codigoTarifa) {
        this.codigoTarifa = codigoTarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getFactorIVA() {
        return FactorIVA;
    }

    public void setFactorIVA(String FactorIVA) {
        this.FactorIVA = FactorIVA;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Exoneracion getExoneracion() {
        return exoneracion;
    }

    public void setExoneracion(Exoneracion exoneracion) {
        this.exoneracion = exoneracion;
    }


    
    private String codigo;
    private String codigoTarifa;
    private String tarifa; // se obtiene de la multiplicacion del campo subtotal por la tarifa del impuesto;
    private String FactorIVA;
    private String monto;
    private Exoneracion exoneracion;
    
}
