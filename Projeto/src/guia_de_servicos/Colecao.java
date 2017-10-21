package guia_de_servicos;

import com.mongodb.*;
//import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;
//import java.util.List;

/**
 * Classe representa o cadastro de Usuarios no banco, abrigando as
 * manipulações de coleções.
 * @param <T> Tipo Genérico que será definido em tempo de execução.
 */
public class Colecao<T>
{

    /**
     * Método get do atributo classType.
     * @return the classType.
     */
    public final Class getClassType() {
        return classType;
    }

    /**
     * Método set do atributo classType.
     * @param classType the classType to set.
     */
    public final void setClassType(Class classType) {
        this.classType = classType;
    }
    
    /**
     * Método get do atributo busca.
     * @return the busca.
     */
    public final String getBusca() {
        return busca;
    }

    /**
     * Método set do atributo busca.
     * @param busca the busca to set.
     */
    public final void setBusca(String busca) {
        this.busca = busca;
    }
    
    /**
     * Método get do atributo campo.
     * @return the campo.
     */
    public final String getCampo() {
        return campo;
    }

    /**
     * Método set do atributo campo.
     * @param campo the campo to set.
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }
    
    /**
     * Construtor define a coleção onde as manipulações de dados serão
     * feitas e o tipo de objeto a ser inserido.
     * @param collectionName Nome da Coleção no MongoDB.
     * @param classType Objeto do tipo Class que define a estrutura do documento.
     */
    public Colecao(String collectionName, Class classType) 
    {
        setClassType(classType);
        listaOperavel = new ArrayList<>();
        collection = Banco.database.getCollection(collectionName, getClassType());   
    }    
    
    @SuppressWarnings("Convert2Lambda")
    private final Block<Object> printBlock = new Block<Object>() 
    {
        /**
         * Método sobrescrito imprime informações de objetos do banco
         * no prompt.
         * @param obj Objeto a ser operado.
         */
        @Override
        public void apply(final Object obj) {
            System.out.println(obj.toString());
        }
    };  

    private final Block<T> pushCollection = new Block<T>() 
    {
        /**
         * Método adiciona objetos à uma ArrayList.
         * @param obj Objeto a ser operado.
         */
        @Override
        public void apply(final T obj) {
            listaOperavel.add(obj);
        }
    };
    
    /**
     * Método busca na coleção os objetos que correspondem
     * aos campos inseridos na pesquisa e imprime-os no console.
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
     * @param obj Objeto a ser operado.
     */
    public void adicionar(T obj) 
    {
        if (obj.getClass() == classType)
            collection.insertOne(obj);
    }
    
    /**
     * Método apresenta os campos de pesquisa da coleção.
     * @return String Texto com os campos de pesquisa.
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