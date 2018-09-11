package gafe.modelo;

import java.awt.Color;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.UnderlineStyle;
import jxl.read.biff.BiffException;
import jxl.write.Colour;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExportarReporte {

    private File file;
    private List<JTable> tabla;
    private List<String> nom_files;
    boolean resultado;

    public ExportarReporte(File file, List<JTable> tabla, List<String> nom_files) throws Exception {
        this.file = file;
        this.tabla = tabla;
        this.nom_files = nom_files;
        if (nom_files.size() != tabla.size()) {
            throw new Exception("Error");
        }
    }

    public boolean export() {
        boolean existencia = false;
        try {
            existencia = verificarExistencia();

        } catch (IOException ex) {
            Logger.getLogger(ExportarReporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(ExportarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (existencia) {
            // ya existe
            int dialogResult = JOptionPane.showConfirmDialog(null, "El archivo ya existe, desea sobreescribirlo", "Advertencia", JOptionPane.YES_NO_OPTION);

            if (dialogResult == 0) {
                try {
                    
                    File af = new File(file.getPath());
                    af.delete();
                    
                    // se le quita la eel .xls por si el usuario lo puso y despues lo vuelvo a poner
                    String obtenerPath = new File(file.getPath()).toString();
                    String sinExtencion = obtenerPath.replace(".xls","");
                    
                    DataOutputStream out = new DataOutputStream(new FileOutputStream(sinExtencion+".xls"));
                    WritableWorkbook w = Workbook.createWorkbook(out);

                    // for (int index = 0; index < tabla.size(); index++) {
                    int index = 0;
                    JTable table = tabla.get(index);
                    WritableSheet s = w.createSheet(nom_files.get(index), 0);
                    WritableFont cellFont = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE);
                    //cellFont.setBoldStyle(WritableFont.BOLD);
                    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
                    cellFormat.setBackground(jxl.format.Colour.ICE_BLUE);

                    WritableCellFormat cellFormatBody = new WritableCellFormat(new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE));

                    cellFormatBody.setBackground(jxl.format.Colour.ICE_BLUE);
                    int k = 0;
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {

                            s.addCell(new Label(k, 0, table.getColumnName(i), cellFormat));
                            k = k + 1;
                        }
                    }
                    k = 0;
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {
                            //ANTES DE ENTRAR A ESTE FOR VERIFICO SI EL SIZE DE LA COLUMNA QUE OBTENGO ES 0 SI ES CERO NO LO MUESTRO Y ME BRINCO LA COLUMNA
                            for (int j = 0; j < table.getRowCount(); j++) {
                                Object object = table.getValueAt(j, i);
                                if (object != null) {
                                    if (j % 2 != 0) {
                                        s.addCell(new Label(k, j + 1, String.valueOf(object), cellFormatBody));
                                    } else {
                                        s.addCell(new Label(k, j + 1, String.valueOf(object)));
                                    }

                                } else {
                                    if (j % 2 != 0) {
                                        s.addCell(new Label(k, j + 1, "", cellFormatBody));
                                    } else {
                                        s.addCell(new Label(k, j + 1, ""));
                                    }
                                }
                            }
                            k = k + 1;
                        }
                        //   }
                    }
                    w.write();
                    w.close();
                    resultado = true;
                } catch (IOException ex) {
                    Logger.getLogger(ExportarReporte.class.getName()).log(Level.SEVERE, null, ex);
                 
                } catch (WriteException ex) {
                    Logger.getLogger(ExportarReporte.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Archivo no generado", "Mensaje", JOptionPane.ERROR_MESSAGE);
                resultado  = false;
            }

        } else {
            // sino existe lo crea
            crearArchivoDesdeCero();
            resultado = true;
        }
        return resultado;
    }

    public void crearArchivoDesdeCero() {

        try {
            String obtenerPath = new File(file.getPath()).toString();
            String sinExtencion = obtenerPath.replace(".xls","");
                    
            DataOutputStream out = new DataOutputStream(new FileOutputStream(sinExtencion+".xls"));
            WritableWorkbook w = Workbook.createWorkbook(out);

            // for (int index = 0; index < tabla.size(); index++) {
            int index = 0;
            JTable table = tabla.get(index);
            WritableSheet s = w.createSheet(nom_files.get(index), 0);
            WritableFont cellFont = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE);
            //cellFont.setBoldStyle(WritableFont.BOLD);
            WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
            cellFormat.setBackground(jxl.format.Colour.ICE_BLUE);

            WritableCellFormat cellFormatBody = new WritableCellFormat(new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE));

            cellFormatBody.setBackground(jxl.format.Colour.ICE_BLUE);
            int k = 0;
            for (int i = 0; i < table.getColumnCount(); i++) {
                if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {

                    s.addCell(new Label(k, 0, table.getColumnName(i), cellFormat));
                    k = k + 1;
                }
            }
            k = 0;
            for (int i = 0; i < table.getColumnCount(); i++) {
                if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {
                    //ANTES DE ENTRAR A ESTE FOR VERIFICO SI EL SIZE DE LA COLUMNA QUE OBTENGO ES 0 SI ES CERO NO LO MUESTRO Y ME BRINCO LA COLUMNA
                    for (int j = 0; j < table.getRowCount(); j++) {
                        Object object = table.getValueAt(j, i);
                        if (object != null) {
                            if (j % 2 != 0) {
                                s.addCell(new Label(k, j + 1, String.valueOf(object), cellFormatBody));
                            } else {
                                s.addCell(new Label(k, j + 1, String.valueOf(object)));
                            }

                        } else {
                            if (j % 2 != 0) {
                                s.addCell(new Label(k, j + 1, "", cellFormatBody));
                            } else {
                                s.addCell(new Label(k, j + 1, ""));
                            }
                        }
                    }
                    k = k + 1;
                }
                //   }
            }
            w.write();
            w.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema al crear el excel", "Mensaje", JOptionPane.ERROR_MESSAGE);

        } catch (WriteException ex) {
            Logger.getLogger(ExportarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean verificarExistencia() throws IOException, BiffException {

        boolean verificarExistencia = false;
        
        //Esta validacion es por si se agregar el .xls a la generar el reporte.
        String obtenerPath = new File(file.getPath()).toString();
        String sinExtencion = obtenerPath.replace(".xls","");
        
        File af = new File(sinExtencion+".xls");
        //Workbook workbook = Workbook.getWorkbook(file);
        
        if (af.exists()) {
            System.out.println("Existe");
            return true;
        } else {
            System.out.println("No existe");
            return false;
        }
    }

}
