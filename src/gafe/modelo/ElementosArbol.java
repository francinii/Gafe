package gafe.modelo;

public enum ElementosArbol {
    XML("Cargar Facturas"), REPORTES("Reportes"), PROYECTO("Proyecto"), CLIENTE("Clientes"), PROVEEDOR("Proovedores");

    private ElementosArbol(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
		return nombre;
	}
    private final String nombre;
}
