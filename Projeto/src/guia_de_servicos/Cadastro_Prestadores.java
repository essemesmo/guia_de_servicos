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
        setCampo(Console.getLine(campoDePesquisa()));
        String txt = Console.getLine("Buscar por: ");
        collection.find(eq(getCampo(), txt)).forEach(printBlock);
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
     * Método
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
            + "por especificacao: especificacao" + "\n"
            + "por descricao: descricao" + "\n"
            + "Campo: ";
    }  
    
    private final MongoCollection collection;
    private String campo;
}