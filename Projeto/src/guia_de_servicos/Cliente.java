package guia_de_servicos;

/**
 * Classe Cliente carrega informações básicas da superclasse somados
 * à caracteristicas próprias.
 */
public class Cliente extends Usuario
{
    /*
    * Construtor incializa os atributos do objeto Cliente
    * com valores padrão.
    */
    public Cliente()
    {
        cpf = "<nao informado>";
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
     * Método sobrecarregado da classe Usuario lê entradas de
     * cadastramento dos prestadores de serviço. 
     */
    @Override
    public void preencherCampos() 
    {    
        super.preencherCampos();
        
        System.out.print("Informe cpf: ");
        setCpf(Console.getLine());
    }
    
    /**
     * Método sobrecarregado da classe Usuario, apresenta
     * no console as informações do Cliente.
     */
    @Override 
    public void informacao() 
    {    
        super.informacao();
        
        System.out.println
        ( "CNPJ: " + getCpf() + "\n" );
    }
 
    private String cpf;
}
