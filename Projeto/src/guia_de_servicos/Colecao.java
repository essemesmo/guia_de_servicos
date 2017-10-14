package guia_de_servicos;

/**
 * Interface de operações das Coleções do MongoDB.
 * Métodos abstratos devem ser implementados pelas classes
 * que manipulam dados nas coleções diversas.
 */
public interface Colecao 
{
    /**
     * Assinatura de métodos de busca de dados nas coleções.
     */
    void buscar();
    
    /**
     * Assisnatura de métodos de adição de dados nas coleções.
     */
    void adicionar();
    
    /**
     * Assinatura de impressão dos objetos de determinada coleção.
     */
    void imprimirTodos();
    
    /**
     * Assinatura de métodos que retornam campos de busca de pesquisa.
     * @return - String
     */
    String entrarCampo();
    
    /**
     * Método retorna uma string de busca sem nenhuma forma de tratamento
     * de entrada.
     * @return - String
     */
    default String entrarBusca() 
    {
        System.out.print("Buscar por: ");
        return Console.getLine();
    };
}
