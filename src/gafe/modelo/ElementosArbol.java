package gafe.modelo;

public enum ElementosArbol {
    XML("Cargar Facturas"), REPORTES("Reportes"), PROYECTO("Proyecto");

    private ElementosArbol(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
		return nombre;
	}
    private String nombre;
}
