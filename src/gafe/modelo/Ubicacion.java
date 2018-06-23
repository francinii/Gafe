/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafe.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ubicacion")
public class Ubicacion {

    public Ubicacion(String provincia, String canton, String distrito,String barrio, String otraSenas) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.barrio = barrio;
        this.otraSenas = otraSenas;        
    }
    
   public Ubicacion() {
        this("","","","","");     
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getBarrio() {
        return barrio;
    }

    
    public String getOtraSenas() {
        return otraSenas;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    
    
    public void setOtraSenas(String otraSenas) {
        this.otraSenas = otraSenas;
    }
    
    
    private String provincia;
    private String canton;
    private String distrito;
    private String barrio;
    private String otraSenas;

}
