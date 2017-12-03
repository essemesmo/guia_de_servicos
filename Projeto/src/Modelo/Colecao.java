package Modelo;

import com.mongodb.Block;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.MongoException;
import org.bson.Document;
import com.mongodb.MongoNamespace;
import java.util.ArrayList;

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
        lista  = new ArrayList<>();
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
    public Document procurarUm(String campo, String busca) {
        return colecao.find(eq(campo, busca)).first();
    }
    
   /**
     * 
     * @param campo
     * @param busca
     * @return 
     */
    public Document procurarUm(String campo, double busca) {
        return colecao.find(eq(campo, busca)).first();
    }   
    
    /**
     * 
     * @return 
     */
    public String nomeColecao()
    {
        MongoNamespace namespace = colecao.getNamespace();
        return namespace.getCollectionName();
    }
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca 
     */
    public void deletarUm(String campoBusca, String valorBusca) {
        colecao.deleteOne(eq(campoBusca, valorBusca));
    }
    
    /**
     * 
     */
    Block<Document> printBlock = (final Document document) -> {
        System.out.println(document.toJson());
    };

    /**
     * 
     */
    Block<Document> carregarLista = new Block<Document>() {
           @Override
           public void apply(final Document document) {
               lista.add(document);
           }
    };   
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca
     * @param excluir
     * @return 
     */
    public Document[] encontraMuitos(String campoBusca, Object valorBusca, Object excluir)
    {
        colecao.find(and(eq(campoBusca, valorBusca),ne("_id",excluir))).forEach(carregarLista);
        Document[] documentos = new Document[lista.size()];
        documentos = lista.toArray(documentos);
        lista.clear();
        return documentos;
    }
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca
     * @return 
     */
    public Document[] encontraMuitos(String campoBusca, Object valorBusca)
    {
        colecao.find(eq(campoBusca, valorBusca)).forEach(carregarLista);
        Document[] documentos = new Document[lista.size()];
        documentos = lista.toArray(documentos);
        lista.clear();
        return documentos;
    }    
    
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca
     * @param documento 
     */
    public void sobreporUm(String campoBusca, String valorBusca, Document documento) {
        colecao.replaceOne(eq(campoBusca, valorBusca), documento);
    }
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca
     * @param updateCampo
     * @param updateValor 
     */
    public void atualizarUm(String campoBusca, String valorBusca,String updateCampo ,String updateValor) {
        colecao.updateOne( eq(campoBusca, valorBusca), new Document("$set", new Document(updateCampo, updateValor)) );
    }
    
    /**
     * 
     * @param campoBusca
     * @param valorBusca
     * @param updateCampo
     * @param updateValor 
     */
    public void atualizarUm(String campoBusca, String valorBusca,String updateCampo ,double updateValor) {
        colecao.updateOne( eq(campoBusca, valorBusca), new Document("$set", new Document(updateCampo, updateValor)) );
    }   
    
    private final MongoCollection<Document> colecao;
    private ArrayList<Document> lista;
}