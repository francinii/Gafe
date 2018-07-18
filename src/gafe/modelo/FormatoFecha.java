
package gafe.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.MaskFormatter;


public class FormatoFecha extends MaskFormatter {

    public FormatoFecha() throws ParseException {
        // Las # son cifras y representa "dd/mm/yy"
        super("##/##/####");
    }

    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Object stringToValue(String text) throws ParseException {
        return formato.parseObject(text);
    }

    public String valueToString(Object value) throws ParseException {
        if (value instanceof Date) {
            return formato.format((Date) value);
        }
        return formato.format(new Date());
    }
}
