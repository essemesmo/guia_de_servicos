package guia_de_servicos;

import com.mongodb.*;
import static com.mongodb.client.model.Filters.*;

/**
 * Classe representa o cadastro de Prestadores no banco, abrigando as
 * manipulações da coleção Cadastro_Prestadores.
 */
public class Cadastro_Prestadores extends Banco
{
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     */
    public Cadastro_Prestadores()
    {
        collection = database.getCollection("Cadastro_Prestadores", Prestador.class);   
    }
    
    private final Block<Prestador> printBlock = (final Prestador prestador) -> {
        prestador.informacao();   
    };
    
     /** 
     * Método busca na coleção os objetos Prestador que correspondem
     * aos campos inseridos no console. 
     * @param campo
     * @param txt 
     */
    @Override
    public void buscar(String campo, String txt) {
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
     * @param prestador 
     */
    public void adicionar(Prestador prestador) {
        collection.insertOne(prestador);    
    }
}