package Controlador;

import Modelo.Usuario;
import Modelo.Cliente;
import Modelo.Prestador;
import Modelo.Colecao;
import Modelo.SessaoId;
import org.bson.Document;
/**
 *
 * @author PMF
 */
public class Cadastro 
{
    /**
     * @return the user
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * @return the nomeColecao
     */
    public String getNomeColecao() {
        return nomeColecao;
    }

    /**
     * @param nomeColecao the nomeColecao to set
     */
    public void setNomeColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }
    
    /**
     * 
     */
    public Cadastro()
    {
        this.user = new Cliente();
        this.nomeColecao = "clientes";  
        this.colecao = new Colecao("clientes");
    }
    
    /**
     * 
     */
    public void novoCliente()
    {
        this.user = new Cliente();
        setNomeColecao("clientes");
    }
    
    /**
     * 
     */
    public void novoPrestador()
    {
        this.user = new Prestador();
        setNomeColecao("prestadores");
    }    
    
    /**
     * 
     * @param username
     * @param senha
     * @return 
     */
    public boolean adicionar(String username, String senha)
    {
        if (!encontrou(username)) 
        {
            user.setUsername(username);
            user.setSenha(Senha.criarHash(senha)); 

            this.colecao = new Colecao(getNomeColecao());
            boolean entrar = (colecao.inserirDoc(getUser().criarDocumento()));

            if (entrar) {
                SessaoId.setId(getUser().getUsername());
                SessaoId.setTipoUsuario(getNomeColecao());            
            }
        
            return entrar;
        }
        
        else return false;
    }
    
    private boolean encontrou(String username)
    {
        for (String nomesCol1 : nomesCol) 
        {
            colecao = new Colecao(nomesCol1);
            Document doc = colecao.procurarUm("_id", username);
            
            if (doc != null) return true;
        }
        return false;
    }       

            
    private static final String nomesCol[] = {"clientes", "prestadores"};    
    private Usuario user;
    private String nomeColecao;
    private Colecao colecao;
}
