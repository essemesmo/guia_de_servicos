package Controlador;

import Modelo.Colecao;
import Modelo.Prestador;
import Modelo.SessaoId;
import Modelo.Usuario;

/**
 * Classe opera a transferência monetária entre Cliente e
 * Prestador.
 */
public class Pagamento
{      
    /**
     * Método transfere credito.
     * @param cliente Cliente que deve pagar.
     * @param prestador Prestador que deve receber.
     * @param numHoras
     * @return 
     */
    public static boolean transferir(Usuario cliente, Prestador prestador, int numHoras) 
    {
        double custo = prestador.getCusto() * numHoras;
        
        if (cliente.getSaldo() < custo) {
            System.out.print("Custo superior ao saldo");
            return false;
        }
       
        cliente.setSaldo(cliente.getSaldo() - custo);
        prestador.setSaldo(prestador.getSaldo() + custo);
        return true;
    }
    
     /**
     * Método transfere credito.
     * @param usuario
     * @param prestador Prestador que deve receber.
     * @return 
     */
    public static boolean transferir(Usuario usuario, Prestador prestador) 
    {
        double custo = prestador.getCusto();
        
        if (usuario.getSaldo() < custo) {
            System.out.print("Custo superior ao saldo");
            return false;
        }
       
        usuario.setSaldo(usuario.getSaldo() - custo);
        prestador.setSaldo(prestador.getSaldo() + custo);
        
        Colecao colecao = new Colecao("prestadores");
        colecao.atualizarUm("_id", prestador.getUsername(), "saldo", prestador.getSaldo());
        
        colecao = new Colecao(SessaoId.getTipoUsuario());
        colecao.atualizarUm("_id", usuario.getUsername(), "saldo", usuario.getSaldo());
        
        return true;
    }       
 }
