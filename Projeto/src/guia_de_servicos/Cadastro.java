package guia_de_servicos;

import com.mongodb.*;
import com.mongodb.client.*;
//import com.mongodb.client.result.*;
import org.bson.codecs.configuration.*;
import org.bson.codecs.pojo.*;

//import java.util.List;
//import static java.util.Arrays.asList;

import static com.mongodb.client.model.Filters.*;
//import static com.mongodb.client.model.Updates.*;
import static org.bson.codecs.configuration.CodecRegistries.*;

public class Cadastro 
{
    public Cadastro() 
    {
        mongoClient = new MongoClient( "localhost" , 27017 );
        
        pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build())); 
        
        database = mongoClient.getDatabase("guia-de-servicos").withCodecRegistry(pojoCodecRegistry);
        
        collection = database.getCollection("cadastro", Prestador.class);
        
    }
    
    Block<Prestador> printBlock = (final Prestador person) -> {
        person.informacao();
    };    
    
    public void adicionar(Prestador novoTopico) {
        collection.insertOne(novoTopico);
    }
    
    public void buscar(String campo, String txt) {
        collection.find(eq(campo, txt)).forEach(printBlock);
    }
    
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);        
    }
    
    public void closeConnection() {
        this.mongoClient.close();
    }
    
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final CodecRegistry pojoCodecRegistry;
    private final MongoCollection<Prestador> collection;
}