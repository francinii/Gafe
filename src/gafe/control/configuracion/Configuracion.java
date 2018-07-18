package gafe.control.configuracion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {

    public static Configuracion obtenerInstancia() throws IOException {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }


    private Configuracion(String ubicacion) throws IOException {
        prop = new Properties();
        InputStream entrada = getClass().getResourceAsStream(ubicacion);
        if (entrada != null) {
            prop.load(entrada);
        } else {
            throw new FileNotFoundException(
                    String.format("No se encontró el archivo de configuración ('%s')..",
                            ubicacion));
        }
    }

    private Configuracion() throws IOException {
        this(CONFIGURACION_BASE);
    }

    public String obtenerValorPropiedad(String nombrePropiedad) {
        return prop.getProperty(nombrePropiedad);
    }

    private static Configuracion instancia = null;
    private static final String CONFIGURACION_BASE = "configuracion.properties";
    private Properties prop;
}
