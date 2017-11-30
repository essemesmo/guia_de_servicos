package Modelo;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.MongoException;
import org.bson.Document;
import com.mongodb.MongoNamespace;

/**
 * 
 * @author PMF
 */
public class Colecao 
{
    /**
     * 
     * @param nomeColecao 
     */
    public Colecao(String nomeColecao) {
        colecao = Banco.getDatabase().getCollection(nomeColecao);
    }
    
    /**
     * 
     * @param documento
     * @return 
     */
    public boolean inserirDoc(Document documento)
    {
        try {
            colecao.insertOne(documento);
            return true;
            
        } catch (MongoException e) {
            System.out.println(e + "\n" + "Username ja utilizado!");
            return false;
        }
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean existeId(String id)
    {
        Document doc = colecao.find(eq("_id", id)).first();
        
        return doc != null;
    }
    
    /**
     * 
     * @param campo
     * @param busca
     * @return 
     */
    public Document procurarUm(String campo, String busca) 
    {
        return colecao.find(eq(campo, busca)).first();
    }
    
   /**
     * 
     * @param campo
     * @param busca
     * @return 
     */
    public Document procurarUm(String campo, double busca)
    {
        return colecao.find(eq(campo, busca)).first();
    }   
    
    public String nomeColecao()
    {
        MongoNamespace namespace = colecao.getNamespace();
        return namespace.getCollectionName();
    }
    
    private final MongoCollection<Document> colecao;
}