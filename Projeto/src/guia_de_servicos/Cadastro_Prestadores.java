package guia_de_servicos;

import com.mongodb.*;
import static com.mongodb.client.model.Filters.*;

/**
 *
 *
 */
public class Cadastro_Prestadores extends Banco
{
    public Cadastro_Prestadores()
    {
        collection = database.getCollection("Cadastro_Prestadores", Prestador.class);   
    }
    
    Block<Prestador> printBlock = (final Prestador person) -> {
    person.informacao();   
    };
    
    @Override
    public void buscar(String campo, String txt) {
        collection.find(eq(campo, txt)).forEach(printBlock);
    }
    
    @Override
    public void imprimirTodos() {   
        collection.find().forEach(printBlock);        
    }
      
    public void adicionar(Prestador prestador) {
        collection.insertOne(prestador);    
    }
}