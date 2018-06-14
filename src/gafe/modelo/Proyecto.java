package gafe.modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    public Proyecto(String nombre, String cedula, String descripcion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.descripcion = descripcion;
        listadoFacturas = new ArrayList<>();
    }

    public void agregarXMLProyecto(Factura f) {

        listadoFacturas.add(f);

    }

    private String nombre;
    private String cedula;
    private String descripcion;
    List<Factura> listadoFacturas;

}
