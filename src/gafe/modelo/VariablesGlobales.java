package gafe.modelo;

public class VariablesGlobales {   

    private static VariablesGlobales instance = null;

    protected VariablesGlobales() {}
    public static VariablesGlobales getInstance() {
        if(instance == null) {instance = new VariablesGlobales(); }
        return instance;
    }

    public String getNombreProyectoActual() {
        return nombreProyectoActual;
    }
    
    public String getRutaProyectoActual() {
        return ruta;
    }
    
    public void setRutaProyectoActual(String ruta) {
        this.ruta = ruta;
    }
    
    public void setNombreProyectoActual(String nombreProyectoActual) {
        this.nombreProyectoActual = nombreProyectoActual;
    }
    
    private String nombreProyectoActual="";
    private String ruta="";


}// fin de la clase de variables globales