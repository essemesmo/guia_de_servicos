package Modelo;

import org.bson.Document;

/**
 * Classe Cliente carrega informações básicas da superclasse
 * Usuario somados à caracteristicas próprias.
 */
public class Cliente extends Usuario
{
    /*
    * Construtor incializa os atributos do objeto Cliente
    * com valores padrão.
    */
    public Cliente()
    {
        cpf = "<nao especificado>";
    }
    
    /**
     * Método get do atributo cpf.
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método set do atributo cpf.
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     * Método sobrepõe ao da classe Usuario, lê entradas de
     * cadastramento dos clientes.
     */
    @Override
    public void preencherCampos() 
    {    
        super.preencherCampos();
        setCpf(Console.getLine("Informe cpf: "));
    }
    
    @Override
    public void preencherCampos(Document documento) 
    {    
        super.preencherCampos(documento);
        setCpf(documento.getString("cpf"));
    }    
    
    /**
     * Método sobrepõe ao da classe Usuario, retorna
     * as informações dos Clientes.
     * @return String - informações da classe Cliente.
     */
    @Override 
    public String toString()
    {
        return String.format
        (
            "%s\n"
            + "Cpf: %s\n"
            , super.toString(), getCpf()
        );
    }
    
    /**
     * @return 
     */
    @Override
    public Document criarDocumento()
    {
        Document cliente = super.criarDocumento();
        cliente.append("cpf", getCpf());
        return cliente;
    }
 
    private String cpf;
}
