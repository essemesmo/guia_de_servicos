package guia_de_servicos;

import java.util.Scanner;

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
     * Método sobrecarregado da classe Usuario lê as entradas de
     * cadastramento do clientes.
     * @param INPUT referência ao objeto tipo Scanner do menu. 
     */    
    @Override
    public void preencherCampos(Scanner INPUT) 
    {    
        super.preencherCampos(INPUT);
        
        System.out.print("Informe cnpj: ");
        setCnpj(INPUT.nextLine());       
        
        System.out.print("Informe especificacao: ");
        setEspecificacao(INPUT.nextLine());

        System.out.print("Informe descricao: ");
        setDescricao(INPUT.nextLine());
 
        System.out.print("Informe custo: ");
        setCusto(INPUT.nextDouble());
    } 
    
    /**
     * Método sobrecarregado da classe Usuario, apresenta
     * no console as informações dos Prestadores de serviço.
     */
    @Override 
    public void informacao() 
    {    
        super.informacao();
        
        System.out.println
        ( "CNPJ: " + getCnpj() + "\n"
        + "Especificacao: " + getEspecificacao() + "\n"        
        + "Classificacao: " + getClassificacao() + "\n"
        + "Custo: " + getCusto() + "\n"        
        + "Descricao: " + getDescricao() + "\n" );
    }
    
    private double custo;
    private String cnpj;
    private String especificacao;
    private String descricao;
    private char classificacao;     
}
