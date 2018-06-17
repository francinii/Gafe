package gafe.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement // este es para crear el XML
public class Proyecto {

    public Proyecto(){};
    
    public Proyecto(String nombre, String cedula, String descripcion,String ruta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.descripcion = descripcion;
        this.ruta = ruta;
        listadoFacturas = new ArrayList<>();
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Factura> getListadoFacturas() {
        return listadoFacturas;
    }

    public void setListadoFacturas(List<Factura> listadoFacturas) {
        this.listadoFacturas = listadoFacturas;
    }

    public void agregarXMLProyecto(Factura f) {
        listadoFacturas.add(f);
    }

    private String ruta;
    private String nombre;
    private String cedula;
    private String descripcion;
    List<Factura> listadoFacturas;

}
