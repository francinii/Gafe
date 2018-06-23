/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP_810G2
 */
@XmlRootElement(name="identificacion")
public class Identificacion {
    
    public Identificacion(String tipoIdentificacion, String numeroIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
     public Identificacion() {
        this("","");
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    
    private String tipoIdentificacion; 
    private String numeroIdentificacion; 
    
}
