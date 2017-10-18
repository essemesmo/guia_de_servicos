package guia_de_servicos;

import com.mongodb.*;
//import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;
//import java.util.List;

/**
 * Classe representa o cadastro de Usuarios no banco, abrigando as
 manipulações de coleções.
 * @param <T>
 */
public class Colecao<T>
{

    /**
     * @return the classType
     */
    public final Class getClassType() {
        return classType;
    }

    /**
     * @param classType the classType to set
     */
    public final void setClassType(Class classType) {
        this.classType = classType;
    }
    /**
     * @return the busca
     */
    public final String getBusca() {
        return busca;
    }

    /**
     * @param busca the busca to set
     */
    public final void setBusca(String busca) {
        this.busca = busca;
    }
    /**
     * @return the campo
     */
    public final String getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }
    
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     * @param collectionName
     * @param classType
     */
    public Colecao(String collectionName, Class classType) 
    {
        setClassType(classType);
        listaOperavel = new ArrayList<>();
        collection = Banco.database.getCollection(collectionName, getClassType());   
    }    
    
    /**
     * 
     */
    @SuppressWarnings("Convert2Lambda")
    private final Block<Object> printBlock = new Block<Object>() 
    {
        @Override
        public void apply(final Object obj) {
            System.out.println(obj.toString());
        }
    };  
    
    /**
     * 
     */
    private final Block<T> pushCollection = new Block<T>() 
    {
        @Override
        public void apply(final T obj) {
            listaOperavel.add(obj);
        }
    };
    
    /**
     * Método busca na coleção os objetos que correspondem
     * aos campos inseridos na pesquisa. 
     */
    public void buscar() 
    {
        setCampo(Console.getLine(camposDePesquisa()));
        setBusca(Console.getLine("Buscar por: "));
        collection.find(eq(getCampo(), getBusca())).forEach(printBlock);
    }
    
    /**
     * Método imprimi no console todas as informações dos objetos
     * cadastrados na coleção.
     */
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);
    }

     /**
     * Método adiciona um objeto na coleção.
     * @param obj
     */
    public void adicionar(T obj) 
    {
        if (obj.getClass() == classType)
            collection.insertOne(obj);
    }
    
    /**
     * Método retorna o campo a ser pesquisado no banco.
     * @return - String
     */
    public String camposDePesquisa()
    {        
        return
            "Campos de Busca:" + "\n"
            + "por nome: nome" + "\n"
            + "por endereco: endereco" + "\n"
            + "por regiao: regiao" + "\n"        
            + "por telefone: telefone" + "\n"
            + "Campo: ";
    }

    private final MongoCollection<T> collection; 
    private Class classType;
    private String campo;
    private String busca;
    public ArrayList<T> listaOperavel;
}