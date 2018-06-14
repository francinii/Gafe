package gafe.modelo;

import java.util.ArrayList;
import java.util.List;

public class Receptor {
    //verificar los GET y SET del TELEFONO

    public Receptor(String nombre, Identificacion identicacion, String identificacionExtranjero, String nombreComercial, Ubicacion ubicacion, String correo) {
        this.nombre = nombre;
        this.identicacion = identicacion;
        this.identificacionExtranjero = identificacionExtranjero;
        this.nombreComercial = nombreComercial;
        this.ubicacion = ubicacion;
        telefonos = new ArrayList<>();
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public Identificacion getIdenticacion() {
        return identicacion;
    }

    public String getIdentificacionExtranjero() {
        return identificacionExtranjero;
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

    public void setIdentificacionExtranjero(String identificacionExtranjero) {
        this.identificacionExtranjero = identificacionExtranjero;
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
    private String identificacionExtranjero;
    private String nombreComercial;
    private Ubicacion ubicacion;
    final private List<Telefono> telefonos;
    private String correo;
    }
