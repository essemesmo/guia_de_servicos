package guia_de_servicos;

import java.util.Scanner;

/**
 * Classe Console apresenta métodos estáticos que retornam entradas
 * pelo prompt de comando, utilizando Scanner(System.in).
 */
public class Console 
{   
    /**
     * Método estático retorna String de entrada no prompt de comando.
     * @return String
     */
    public static String getLine() {
        return new Scanner(System.in).nextLine();
    }
    
    /**
     * 
     * @param txt
     * @return 
     */
    public static String getLine(String txt)
    {
        System.out.print(txt);
        return new Scanner(System.in).nextLine();
    }
    
    /**
     * Método estático retorna Double de entrada no prompt de comando.
     * @return Double
     */    
    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }
    
    /**
     * Método estático retorna Double de entrada no prompt de comando.
     * @param txt
     * @return Double
     */    
    public static double getDouble(String txt)
    {
        System.out.print(txt);
        return new Scanner(System.in).nextDouble();
    }    
    
    /**
     * Método estático retorna Char de entrada no prompt de comando.
     * @return Char
     */    
    public static char getChar()
    {
        String temp = new Scanner(System.in).nextLine();
        return temp.charAt(0);
    } 
    
    /**
     * Método estático retorna Char de entrada no prompt de comando.
     * @param txt
     * @return Char
     */    
    public static char getChar(String txt)
    {
        System.out.print(txt);
        String temp = new Scanner(System.in).nextLine();
        return temp.charAt(0);
    }    
}
