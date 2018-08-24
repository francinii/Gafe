
package gafe.vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class formatoTabla extends DefaultTableCellRenderer{

    /*
    Tabla 0 = Reportes
    Tabla 1 = listarXMl
    tabla 2 = proveedores
    tabla 3 = clientes
    
    */
    
    
    int identificadorTabla;
    Color MiVerde = new Color(226, 239, 218);
    Color MiNegro = new Color(217,217,217);
    Color MiAzul = new Color(217,225,242);
    Color MiAmarillo = new Color(255,242,204);
    
    
    Color seleccionado = new Color(102, 179, 255);

    public formatoTabla(int identificadorTabla) {
        this.identificadorTabla = identificadorTabla;
    }
    
    
    
    public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
    {

        if (identificadorTabla == 0) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                this.setBackground(MiVerde);

            } else {
                this.setBackground(Color.WHITE);
            }
            
            if (isSelected) {
                this.setBackground(seleccionado);
            }
            
            
            
       }if (identificadorTabla == 1) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                this.setBackground(MiNegro);

            } else {
                this.setBackground(Color.WHITE);
            }  
            
            if (isSelected) {
                this.setBackground(seleccionado);
            }
       }
       if (identificadorTabla == 2) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                this.setBackground(MiAzul);

            } else {
                this.setBackground(Color.WHITE);
            } 
            
            if (isSelected) {
                this.setBackground(seleccionado);
            }
            
       }if (identificadorTabla == 3) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (row % 2 == 0) {
                this.setBackground(MiAmarillo);

            } else {
                this.setBackground(Color.WHITE);
            }
            
            if (isSelected) {
                this.setBackground(seleccionado);
            }
       }
       
       
       
      return this;
   }  
}