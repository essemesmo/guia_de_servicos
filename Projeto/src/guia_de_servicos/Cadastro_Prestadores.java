package guia_de_servicos;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;

/**
 * Classe representa o cadastro de Prestadores no banco, abrigando as
 * manipulações da coleção Cadastro_Prestadores.
 */
public class Cadastro_Prestadores implements Colecao
{
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     */
    public Cadastro_Prestadores()
    {
        collection = Banco.database.getCollection("Cadastro_Prestadores", Prestador.class);   
    }
    
    private final Block<Prestador> printBlock = (final Prestador prestador) -> {
        System.out.println(prestador.toString());   
    };
    
     /** 
     * Método busca na coleção os objetos Prestador que correspondem
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
     * Método imprimi no console todas as informações dos objetos Prestador
     * cadastrados no banco.
     */
    @Override
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);        
    }
      
    /**
     * Método adiciona um objeto Prestador na coleção.
     */
    @Override
    public void adicionar() 
    {
        Prestador prestador = new Prestador();
        prestador.preencherCampos();
        collection.insertOne(prestador);    
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
        + "por regiao: regiao" + "\n"
        + "por telefone: telefone" + "\n"
        + "por especificacao: especificacao" + "\n"
        + "por descricao: descricao" + "\n"
        + "Campo: ");
        
        return Console.getLine();
    }  
    
    private final MongoCollection collection;
}