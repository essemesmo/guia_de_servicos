package Controlador;

import Modelo.SessaoId;
/**
 *
 * @author PMF
 */
public class Opcoes {
    
    /**
     * 
     * @return 
     */
    public static boolean identificarPerfil()
    {
        return "clientes".equals(SessaoId.getTipoUsuario());
        //true == clientes ; false == prestadores
    }
}
