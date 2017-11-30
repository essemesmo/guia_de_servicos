package Modelo;

/**
 *
 * @author PMF
 */
public class SessaoId 
{

    /**
     * @return the id
     */
    public static String getId() {
        System.out.println("(get)id de usuario: " + id);
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(String aId) {
        id = aId;
        System.out.println("(set)id de usuario: " + id);
    }

    /**
     * @return the tipoUsuario
     */
    public static String getTipoUsuario() {
        System.out.println("(get)tipo de usuario: " + tipoUsuario);
        return tipoUsuario;
    }

    /**
     * @param aTipoUsuario the tipoUsuario to set
     */
    public static void setTipoUsuario(String aTipoUsuario) {
        tipoUsuario = aTipoUsuario;
        System.out.println("(set)tipo de usuario: " + tipoUsuario);
    }
    

    private static String id;
    private static String tipoUsuario;
}
