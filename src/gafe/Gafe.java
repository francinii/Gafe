package gafe;

import gafe.control.Control;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Gafe {
    public static void main(String[] args) {
        
      
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            System.err.println(e.getMessage());
        }

        java.util.Date fecha = new Date();
        System.out.println("Esta es la feha " + fecha);
        
        Control gestorPrincipal = new Control();
    }

}
