package guia_de_servicos;

import com.mongodb.*;
import com.mongodb.client.*;
//import com.mongodb.client.result.*;
import org.bson.codecs.configuration.*;
import org.bson.codecs.pojo.*;

//import java.util.List;
//import static java.util.Arrays.asList;

//import static com.mongodb.client.model.Filters.*;
//import static com.mongodb.client.model.Updates.*;
import static org.bson.codecs.configuration.CodecRegistries.*;

/**
 * Classe Banco representa a conexão com o serviço de banco de dados MongoDB.
 */
abstract public class Banco 
{
    /**
     * Contrutor inicializa a conexão com o banco MongoDB local, indica
     * o database a ser utilizado e habilitando o reconhecimento de classes
     * para serem transformadas em Documents na coleção.
     */
    public Banco() 
    {
        mongoClient = new MongoClient( "localhost" , 27017 );
        
        pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build())); 
        
        database = mongoClient.getDatabase("guia-de-servicos").withCodecRegistry(pojoCodecRegistry);     
    }
    
    /**
     * Método de busca abstrado implementado pelas subclasses.
     * @param campo
     * @param txt
     */
    abstract public void buscar(String campo, String txt);

    /**
     * Método de impressão abstrato implementado pelas subclasses.
     */    
    abstract public void imprimirTodos(); 
    
    /**
     * Método encerra conexão com o banco MongoDB.
     */
    public final void closeConnection() {
        Banco.mongoClient.close();
    };
    
    protected static MongoClient mongoClient;
    protected final MongoDatabase database;
    protected MongoCollection collection;
    private final CodecRegistry pojoCodecRegistry;
}