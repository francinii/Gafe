package gafe.modelo;

import java.util.ArrayList;
import java.util.List;

public class Emisor {

    public Emisor(String nombre, Identificacion identicacion, String nombreComercial, Ubicacion ubicacion, String correo) {
        this.nombre = nombre;
        this.identicacion = identicacion;
        this.nombreComercial = nombreComercial;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefonos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Identificacion getIdenticacion() {
        return identicacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdenticacion(Identificacion identicacion) {
        this.identicacion = identicacion;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void agregarTelefono(Telefono e) {
        telefonos.add(e);
    }

    private String nombre;
    private Identificacion identicacion;
    private String nombreComercial;
    private Ubicacion ubicacion;
    private String correo;
    final private List<Telefono> telefonos;
    //Hacer un metodo agregar telefonos al array esto seria en el caso que haya fax y telefono

}
