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
public class Banco 
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
     * Método encerra conexão com o banco MongoDB.
     */
    public void closeConnection() {
        mongoClient.close();
    };   
    
    private static MongoClient mongoClient;
    public static MongoDatabase database;
    private final CodecRegistry pojoCodecRegistry;
}