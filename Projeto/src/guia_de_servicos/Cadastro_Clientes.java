package guia_de_servicos;

import com.mongodb.*;
import static com.mongodb.client.model.Filters.*;

/**
 * Classe representa o cadastro de Clientes no banco, abrigando as
 * manipulações da coleção Cadastro_Clientes.
 */
public class Cadastro_Clientes extends Banco
{
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     */
    public Cadastro_Clientes() 
    {
        collection = database.getCollection("Cadastro_Clientes", Cliente.class);   
    }    
    
    private final Block<Cliente> printBlock = (final Cliente cliente) -> {
        cliente.informacao();   
    };
    
    /**
     * Método busca na coleção os objetos Cliente que correspondem
     * aos campos inseridos no console. 
     */
    @Override
    public void buscar() 
    {
        String campo = entrarCampo();
        String txt = entrarBusca();
        collection.find(eq(campo, txt)).forEach(printBlock);
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
    public String entrarCampo()
    {        
        System.out.print
        ( "Campos de Busca:" + "\n"
        + "por nome: nome" + "\n"
        + "por endereco: endereco" + "\n"
        + "por telefone: telefone" + "\n"
        + "Campo: ");
        
        return Console.getLine();
    }    
}