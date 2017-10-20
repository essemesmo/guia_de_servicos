package guia_de_servicos;

/**
 * Classe Prestador carrega informações básicas da superclasse somados
 * à caracteristicas próprias.
 */
public class Prestador extends Usuario 
{
    /**
    * Construtor incializa os atributos do objeto Prestador
    * com valores padrão.
    */
    public Prestador()
    {
        String txt = "<nao especificado>";
        this.cnpj = txt;
        this.especificacao = txt;
        this.descricao = txt;
        this.classificacao = 'C';
        this.custo = 1.0;        
    }

    /**
     * Método get do atributo especificacao.
     * @return String - valor do atributo especificacao.
     */
    public final String getEspecificacao() {
        return especificacao;
    }
    
    /**
     * Método set do atributo especificacao.
     * @param especificacao valor do atributo especificacao.
     */    
    public final void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }    
    
    /**
     * Método get do atributo descricao.
     * @return String - valor do atributo descricao.
     */    
    public final String getDescricao() {
        return descricao;
    }

    /**
     * Método set do atributo descricao.
     * @param descricao valor do atributo descricao.
     */    
    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
    
    /**
     * Método get do atributo custo.
     * @return double - valor do atributo custo.
     */    
    public final double getCusto() {
        return custo;
    }
    
    /**
     * Método set do atributo custo.
     * @param custo valor do atributo custo.
     */    
    public final void setCusto(double custo) {
        this.custo = custo;
    }    
    
    /**
     * Método get do atributo cnpj.
     * @return String - valor do atributo cnpj.
     */    
    public final String getCnpj() {
        return cnpj;
    }
    
    /**
     * Método set do atributo cnpj.
     * @param cnpj valor do atributo cnpj.
     */
    public final void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }    
    
    /**
     * Método get do atributo classificacao.
     * @return String - valor do atributo classificacao.
     */    
    public final char getClassificacao() {
        return classificacao;
    }    
    
    /**
     * Método set do atributo classificacao.
     * @param classificacao valor do atributo classificacao.
     */
    public final void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }   

    /**
     * Método sobrepõe ao da classe Usuario, lê as entradas de
     * cadastramento dos prestadores.
     */    
    @Override
    public void preencherCampos() 
    {    
        super.preencherCampos();
        
        setCnpj(Console.getLine("Informe cnpj: "));       
        
        setEspecificacao(Console.getLine("Informe especificacao: "));

        setDescricao(Console.getLine("Informe descricao: "));
 
        setCusto(Console.getDouble("Informe custo: "));
    } 
    
    /**
     * Método sobrepõe ao da classe Usuario, retorna
     * as informações dos Prestadores de serviço.
     * @return String - informações da classe Prestador.
     */
    @Override
    public String toString()
    {
        return String.format
        (
            "%s\n"
            + "Cnpj: %s\n"
            + "Especificacao: %s\n"
            + "Classificacao: %s\n"
            + "Custo: %.2f\n"
            + "Descricao: %s\n"
            , super.toString(), getCnpj(), getEspecificacao()
            , getClassificacao(), getCusto(), getDescricao()
        );
    }
    
    private double custo;
    private String cnpj;
    private String especificacao;
    private String descricao;
    private char classificacao;     
}
