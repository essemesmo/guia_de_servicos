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

abstract public class Banco 
{
    public Banco() 
    {
        mongoClient = new MongoClient( "localhost" , 27017 );
        
        pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build())); 
        
        database = mongoClient.getDatabase("guia-de-servicos").withCodecRegistry(pojoCodecRegistry);     
    }
    
    /**
     * @param campo
     * @param txt
     */
    abstract public void buscar(String campo, String txt);

    /**
     * 
     */    
    abstract public void imprimirTodos();
    
    /**
     *
     */
    public void closeConnection() {
        this.mongoClient.close();
    };
    
    protected final MongoClient mongoClient;
    protected final MongoDatabase database;
    protected MongoCollection collection;
    private final CodecRegistry pojoCodecRegistry;
}