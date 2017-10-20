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
     * @param databaseName Nome do database no MongoDB.
     */
    public Banco(String databaseName) 
    {
        mongoClient = new MongoClient( "localhost" , 27017 );
        
        pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build())); 
        
        database = mongoClient.getDatabase(databaseName).withCodecRegistry(pojoCodecRegistry);     
    }
    
    /**
     * Método encerra conexão com o banco MongoDB.
     */
    public final void closeConnection() {
        getMongoClient().close();
    }; 
    
   /**
    * Método get do atributo mongoClient.
     * @return the mongoClient
     */
    public static MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * Método set do atributo mongoClient
     * @param aMongoClient the mongoClient to set
     */
    public static void setMongoClient(MongoClient aMongoClient) {
        mongoClient = aMongoClient;
    }    
    
    private static MongoClient mongoClient;
    public static MongoDatabase database;
    private final CodecRegistry pojoCodecRegistry;
}