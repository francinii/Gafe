package gafe.modelo;

import gafe.control.Encriptar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    listaEstados.add(linea);
                    System.out.println(linea);
                }
            } else {
                System.out.println("NO existe ");
                escribirArchivo(ruta, null,false);
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

    // escribir en el contador
    public void escribirArchivo(String ruta) {

        FileWriter fichero = null;
        PrintWriter pw = null;

        List<String> conteFichero = leerArchivo(ruta);

        if (conteFichero.size() <= 0) {
            try {
                fichero = new FileWriter(ruta);
                pw = new PrintWriter(fichero);

                pw.println(Encriptar.Encriptado("1"));
                System.out.println("Entre 1 Encriptado");
            } catch (IOException ex) {
                Logger.getLogger(LectorArchivoConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        } else {

            String contadorProyectos = conteFichero.get(0);
            int contador = 0;
            try {
                contador = Integer.parseInt(Encriptar.Desencriptar(contadorProyectos));

            } catch (Exception ex) {

                Logger.getLogger(LectorArchivoConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador = contador + 1;
            System.out.println("Este es el numero de poryectos creado " + contador);

            try {
                fichero = new FileWriter(ruta);
                pw = new PrintWriter(fichero);

                pw.println(Encriptar.Encriptado(String.valueOf(contador)));

                System.out.println("Sume uno");

            } catch (IOException ex) {

                Logger.getLogger(LectorArchivoConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
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
    }

}
