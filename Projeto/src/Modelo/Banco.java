package Modelo;

import com.mongodb.*;
import com.mongodb.client.*;

/**
 * Classe Banco representa a conexão com o serviço de banco de dados MongoDB.
 */
public class Banco 
{
    /**
     * Contrutor inicializa a conexão com o banco MongoDB local, indica
     * o database a ser utilizado e habilitando o reconhecimento de classes
     * para serem transformadas em Documents na coleção.
     * @param host
     * @param port
     */
    public Banco(String host, int port) {       
        mongoClient = new MongoClient( host, port );    
    }
    
    /**
     * Método encerra conexão com o banco MongoDB.
     */
    public void closeConnection() {
        mongoClient.close();
    }; 
    
   /**
    * Método get do atributo mongoClient.
     * @return the mongoClient
     */
    public static MongoClient getMongoClient() {
        return mongoClient;
    }
    
    /**
     * 
     * @return 
     */
    public static MongoDatabase getDatabase() {
        return database;
    }
    
    /**
     * 
     * @param databaseName
     */
    public final void setDatabase(String databaseName) {
        database = mongoClient.getDatabase(databaseName);
    }
    
    /**
     * Método set do atributo mongoClient
     * @param aMongoClient the mongoClient to set
     */
    public static void setMongoClient(MongoClient aMongoClient) {
        mongoClient = aMongoClient;
    }    
    
    private static MongoClient mongoClient;
    private static MongoDatabase database;
}