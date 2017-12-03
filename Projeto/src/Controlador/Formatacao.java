package Controlador;

import java.text.DecimalFormat;

/**
 *
 * @author PMF
 */
public class Formatacao 
{
    /**
     * 
     * @param valor
     * @return 
     */
    public static String truncar(double valor) {
         return new DecimalFormat("#.##").format(valor);
    }
}
