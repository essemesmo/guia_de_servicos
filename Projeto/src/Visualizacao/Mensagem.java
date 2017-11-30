package Visualizacao;

import javax.swing.JOptionPane;

/**
 *
 * @author PMF
 */
public class Mensagem
{
    /**
     * 
     * @param texto 
     */
    public static void mostrarJanela(String texto) 
    {
        JOptionPane.showMessageDialog
        (
            null,
            texto, 
            "Mensagem de erro",
            JOptionPane.PLAIN_MESSAGE
        );           
    }
}
