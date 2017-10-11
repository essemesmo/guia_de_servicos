package guia_de_servicos;

import com.mongodb.*;
import static com.mongodb.client.model.Filters.*;

/**
 *
 *
 */
public class Cadastro_Clientes extends Banco
{
    public Cadastro_Clientes() {
        collection = database.getCollection("Cadastro_Clientes", Cliente.class);   
    }    
    
    Block<Cliente> printBlock = (final Cliente cliente) -> {
        cliente.informacao();   
    };
    
    @Override
    public void buscar(String campo, String txt) {
        collection.find(eq(campo, txt)).forEach(printBlock);
    }
    
    @Override
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);        
    }

    public void adicionar(Cliente cliente) {
        collection.insertOne(cliente);    
    }
}
