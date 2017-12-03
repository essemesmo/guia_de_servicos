package Controlador;

import Modelo.Cliente;
import Modelo.Colecao;
import Modelo.ListaPrestadores;
import Modelo.Prestador;
import Modelo.SessaoId;
import Modelo.Usuario;
import org.bson.Document;

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
        ListaPrestadores.setIndex(index);
    }
    
    /**
     * 
     * @return 
     */
    private Usuario carregarUsuario() 
    {
        colecao = new Colecao(SessaoId.getTipoUsuario());
        if ("clientes".equals(colecao.nomeColecao()))
            usuario = new Cliente();
        else usuario = new Prestador();
            
        Document doc = colecao.procurarUm("_id", SessaoId.getId());
        usuario.preencherCampos(doc);
        return usuario;
    }
    
    
    /**
     * 
     * @return 
     */
    public double atualizarSaldoUsuario() 
    {
        colecao = new Colecao(SessaoId.getTipoUsuario());
        Document doc = colecao.procurarUm("_id", SessaoId.getId());
        return doc.getDouble("saldo");
    }
    
    /**
     * 
     * @return 
     */
    public boolean pagar() {
        usuario = carregarUsuario();
        return Pagamento.transferir(usuario, prestador);
    }
        
    private int index = 0;
    public Prestador prestador;
    public Usuario usuario;
    private Colecao colecao;
}
