package Controlador;

import Modelo.Colecao;
import Modelo.SessaoId;
import org.bson.Document;

/**
 *
 */
public class Login 
{
    public Login()
    {
        SessaoId.setId("");
        SessaoId.setTipoUsuario("");
    }
    
    /**
     * 
     * @param username
     * @param senha
     * @return 
     */
    public boolean validar(String username, String senha)
    {
        for (String nomesCol1 : nomesCol) 
        {
            colecao = new Colecao(nomesCol1);
            Document doc = colecao.procurarUm("_id", username);
            
            if (doc != null) 
            {
                String hashedAndSalted = doc.get("senha").toString();
                String salt = hashedAndSalted.split(",")[1];
                
                if (hashedAndSalted.equals(Senha.criarHash(senha, salt))) 
                {
                    System.out.println("Encontrado!");
                    
                    SessaoId.setId(username);
                    SessaoId.setTipoUsuario(colecao.nomeColecao());  
                    
                    return true;
                }
            }
        }
        System.out.println("Nao encontrado!");
        return false;
    }
 
    private static final String nomesCol[] = {"clientes", "prestadores"};
    private Colecao colecao;
}
