package Controlador;

import Modelo.Colecao;
import Modelo.ListaPrestadores;
import Modelo.SessaoId;
import org.bson.Document;

/**
 *
 * @author PMF
 */
public class Pesquisar 
{
    public Pesquisar() {
        this.colecao = new Colecao("prestadores");
    }
    
    /**
     * 
     * @param indexCampoBusca
     * @param valorBusca
     * @return 
     */
    public boolean procurar(int indexCampoBusca, Object valorBusca)
    {
        String campo = camposBusca[indexCampoBusca];
        documentos = colecao.encontraMuitos(campo, valorBusca, SessaoId.getId());
        ListaPrestadores.setLista(documentos);
        
        return documentos.length != 0;
    }
    
    /**
     * 
     * @return 
     */
    public Document[] retornarDocumentos() {
        return documentos;
    }
    
    private final String[] camposBusca = {"_id", "nome", "especificacao", "regiao", "endereco"};
    private final Colecao colecao;
    private Document[] documentos;
}
