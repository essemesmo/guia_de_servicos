package Controlador;

import Modelo.Cliente;
import Modelo.Colecao;
import Modelo.SessaoId;
import org.bson.Document;

/**
 *
 * @author PMF
 */
public class AtualizarCliente 
{   
    /**
     * 
     */
    public AtualizarCliente()
    {
        this.colecao = new Colecao("clientes");
        this.id = SessaoId.getId();
        this.cliente = new Cliente();
        this.documento = colecao.procurarUm("_id", id);
        cliente.preencherCampos(documento);
        System.out.println(documento.toJson());
    }
    
    /**
     * 
     */
    public void atualizarDocumento() {
        colecao.sobreporUm("_id", cliente.getUsername(), cliente.criarDocumento());
    }
    
    public final Cliente cliente;   
    
    private final String id;
    private final Colecao colecao;
    private final Document documento;
}
