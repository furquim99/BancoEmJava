package agenciabancariajava;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitarios {
    
    static NumberFormat formatadosOsNumeros = new DecimalFormat("R$ #,##0.00");
    static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy");

    public static String doubleToString(Double valor){
        return Utilitarios.formatadosOsNumeros.format(valor);
    }
    
    public static String dateToString(Date data){
        return Utilitarios.formatandoData.format(data);
    }
}
