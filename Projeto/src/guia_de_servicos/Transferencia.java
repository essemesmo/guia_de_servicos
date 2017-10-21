package guia_de_servicos;

/**
 * Classe abstrata abriga assinaturas de métodos para
 * a transferência monetária por serviço prestado.
 */
public interface Transferencia 
{

    /**
     * Assinatura de método de transferência monetária. 
     * @param cliente Cliente.
     * @param prestador Prestador de serviço.
     */
    void transferir(Usuario cliente, Prestador prestador);
}
