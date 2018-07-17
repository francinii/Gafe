package gafe.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoConfiguracion {

    public LectorArchivoConfiguracion() {
    }

    public void escribirArchivo(String ruta, List<String> listaEstados, boolean noSobreescribir) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            if (noSobreescribir) {
                fichero = new FileWriter(ruta,true);
            } else {
                fichero = new FileWriter(ruta);
            }
            pw = new PrintWriter(fichero);
            System.out.println("Entro al try");
            if (listaEstados != null) {
                for (int i = 0; i < listaEstados.size(); i++) {
                    System.out.println("Entro" + i);
                    pw.println(listaEstados.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public List<String> leerArchivo(String ruta) {
        File archivo = null;
        File existenciaRuta = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<String> listaEstados = new ArrayList<>();
        try {
            archivo = new File(ruta);
            if (archivo.exists()) {
                System.out.println("El fichero " + archivo + " existe");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                System.out.println("Leyendo el contendio del archivo.txt");
                String linea;
                while ((linea = br.readLine()) != null) {

                    existenciaRuta = new File(linea);

                    if (existenciaRuta.exists()) {
                        listaEstados.add(linea);
                        System.out.println(linea);
                    }

                }
                escribirArchivo(ruta, listaEstados, false);
            } else {
                System.out.println("NO existe ");
                escribirArchivo(ruta, null, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return listaEstados;
    }

}
