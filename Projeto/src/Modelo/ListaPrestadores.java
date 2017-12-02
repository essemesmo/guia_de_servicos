package Modelo;

import org.bson.Document;

/**
 *
 * @author PMF
 */
public class ListaPrestadores 
{
    /**
     * 
     * @param lista 
     */
    public static void setLista(Document[] lista) {
        ListaPrestadores.documentos = lista;
    }
    
    /**
     * 
     * @return 
     */
    public static Document[] getLista() {
        return ListaPrestadores.documentos;
    } 
    
    /**
     * 
     */
    public static void limpar() {
        ListaPrestadores.documentos = null;
    }

    /**
     * 
     * @return 
     */
    public static int tamanho() {
        return ListaPrestadores.documentos.length;
    }
    
    private static Document[] documentos;
}
