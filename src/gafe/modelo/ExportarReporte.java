package gafe.modelo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExportarReporte {

    private File file;
    private List<JTable> tabla;
    private List<String> nom_files;

    public ExportarReporte(File file, List<JTable> tabla, List<String> nom_files) throws Exception {
        this.file = file;
        this.tabla = tabla;
        this.nom_files = nom_files;
        if (nom_files.size() != tabla.size()) {
            throw new Exception("Error");
        }
    }

    public boolean export() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(out);
            // for (int index = 0; index < tabla.size(); index++) {
            int index = 0;
            JTable table = tabla.get(index);
            WritableSheet s = w.createSheet(nom_files.get(index), 0);
           int k = 0;
            for (int i = 0; i < table.getColumnCount(); i++) {
                if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {
                    s.addCell(new Label(k, 0, table.getColumnName(i)));
                    k = k+1;
                }
            }
            k = 0;
            for (int i = 0; i < table.getColumnCount(); i++) {
                if (tabla.get(index).getColumnModel().getColumn(i).getMinWidth() != 0) {
                    //ANTES DE ENTRAR A ESTE FOR VERIFICO SI EL SIZE DE LA COLUMNA QUE OBTENGO ES 0 SI ES CERO NO LO MUESTRO Y ME BRINCO LA COLUMNA
                    for (int j = 0; j < table.getRowCount(); j++) {
                        Object object = table.getValueAt(j, i);
                        if (object != null) {
                            s.addCell(new Label(k, j+1, String.valueOf(object)));
                        } else {
                            s.addCell(new Label(k, j+1, "hola"));
                        }
                    }
                    k = k +1;
                }
                //   }
            }
            w.write();
            w.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
