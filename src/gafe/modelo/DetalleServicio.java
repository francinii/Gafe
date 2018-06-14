package gafe.modelo;

import java.util.ArrayList;
import java.util.List;

public class DetalleServicio {

    public DetalleServicio() {
        listaLineaDetalle = new ArrayList<>();
    }

    public void agregarLinea(LineaDetalle e) {
        listaLineaDetalle.add(e);
    }
    private List<LineaDetalle> listaLineaDetalle;
}
