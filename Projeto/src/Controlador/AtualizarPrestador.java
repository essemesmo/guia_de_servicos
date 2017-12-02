package Controlador;

import Modelo.Prestador;
import Modelo.Colecao;
import Modelo.SessaoId;
import org.bson.Document;

/**
 *
 * @author PMF
 */
public class AtualizarPrestador 
{
    /**
     * 
     */
    public AtualizarPrestador() 
    {
        this.colecao = new Colecao(SessaoId.getTipoUsuario());
        this.id = SessaoId.getId();
        this.prestador = new Prestador();
        this.documento = colecao.procurarUm("_id", id);
        prestador.preencherCampos(documento);
        System.out.println(documento.toJson());        
    }
    
    /**
     * 
     */
    public void atualizarDocumento() {
        colecao.sobreporUm("_id", prestador.getUsername(), prestador.criarDocumento());
    }    
    
    public final Prestador prestador;   
    
    private final String id;
    private final Colecao colecao;
    private final Document documento;    
}
