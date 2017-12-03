package Controlador;

import Modelo.Colecao;
import Modelo.ListaPrestadores;
import Modelo.Prestador;
import org.bson.Document;

/**
 *
 * @author PMF
 */
public class Classificar 
{
    /**
     * 
     */
    public Classificar() {
        this.colecao = new Colecao("prestadores");
    }
    
    /**
     * 
     */
    public void atualiazarNota() 
    {
        Prestador prestador = new Prestador();
        prestador.preencherCampos(ListaPrestadores.getLista()[ListaPrestadores.getIndex()]);
        prestador.rank.atualizarClassificacao(novaNota);
        Document doc = prestador.criarDocumento();
        colecao.sobreporUm("_id", prestador.getUsername(), doc);
    }
    
    /**
     * 
     * @param nota 
     */
    public void setNovaNota(double nota) {
        this.novaNota = nota;
    }
    
    /**
     * 
     * @return 
     */
    public double getNovaNota() {
        return this.novaNota;
    }
    
    private final Colecao colecao;
    private double novaNota;
}
