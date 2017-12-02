package Controlador;

import Modelo.ListaPrestadores;
import Modelo.Prestador;

/**
 *
 * @author PMF
 */
public class Servicos
{
    /**
     * 
     */
    public Servicos() {
        prestador = new Prestador();
        prestador.preencherCampos(ListaPrestadores.getLista()[0]);
    }

    /**
     * 
     * @param posicao 
     */
    public void iterarLista(int posicao) 
    {
        index = index + posicao;
        
        if(index >= ListaPrestadores.tamanho())
            index = 0;
        else if (index < 0)
            index = ListaPrestadores.tamanho() - 1;
        
        prestador.preencherCampos(ListaPrestadores.getLista()[index]);
    }
    
    private int index = 0;
    public Prestador prestador;
}
