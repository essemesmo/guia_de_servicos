package guia_de_servicos;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;

/**
 * Classe representa o cadastro de Clientes no banco, abrigando as
 * manipulações da coleção Cadastro_Clientes.
 */
public class Cadastro_Clientes implements Colecao
{

    /**
     * @return the campo
     */
    public String getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    @Override
    public void setCampo(String campo) {
        this.campo = campo;
    }
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     */
    public Cadastro_Clientes() 
    {
        collection = Banco.database.getCollection("Cadastro_Clientes", Cliente.class);   
    }    
    
    private final Block<Cliente> printBlock = (final Cliente cliente) -> {
        System.out.println(cliente.toString());
    };
    
    /**
     * Método busca na coleção os objetos Cliente que correspondem
     * aos campos inseridos no console. 
     */
    @Override
    public void buscar() 
    {
        setCampo(Console.getLine(campoDePesquisa()));
        String txt = Console.getLine("Buscar por: ");
        collection.find(eq(getCampo(), txt)).forEach(printBlock);
    }
    
    /**
     * Método imprimi no console todas as informações dos objetos Cliente
     * cadastrados no banco.
     */
    @Override
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);        
    }

    /**
     * Método adiciona um objeto Cliente na coleção.
     */
    @Override
    public void adicionar() 
    {
        Cliente cliente = new Cliente();
        cliente.preencherCampos();
        collection.insertOne(cliente);    
    }
    
    /**
     * Método retorna o campo a ser pesquisado no banco.
     * @return - String
     */
    @Override
    public String campoDePesquisa()
    {        
        return
            "Campos de Busca:" + "\n"
            + "por nome: nome" + "\n"
            + "por endereco: endereco" + "\n"
            + "por regiao: regiao" + "\n"        
            + "por telefone: telefone" + "\n"
            + "Campo: ";
    }

    private final MongoCollection collection;  
    private String campo;
}