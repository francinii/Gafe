package gafe.modelo;

import java.awt.Color;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import jxl.CellView;
import jxl.Workbook;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.UnderlineStyle;
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
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//    public WritableCellFormat getDateCellFormat(WritableFont cellFont) throws WriteException {
//
//        
//        cellFont.setFont(new WritableFont(WritableFont.ARIAL, 14, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, jxl.format.Colour.BLACK));
//
//
//    return dateCellFormat;
//}
}
