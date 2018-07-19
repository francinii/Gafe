/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafe.modelo;

/**
 *
 * @author HP_810G2
 */
public enum TipoFactura {
    TODASFACTURAS("Todos"), FACTURAELECTRONICA("FacturaElectronica"), NOTADEBITO("NotaDebito"), NOTACREDITO("NotaCredito"), TIQUETEELECTRONICO("TiqueteElectronico");

    private TipoFactura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    private final String nombre;
}
