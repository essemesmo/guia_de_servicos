package guia_de_servicos;

import java.util.Scanner;

public class Prestador extends Pessoa {
    
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
    public String getEspecificacao() {
        return especificacao;
    }
    
    /**
     * Método set do atributo especificacao.
     * @param especificacao valor do atributo especificacao.
     */    
    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }    
    
    /**
     * Método get do atributo descricao.
     * @return String - valor do atributo descricao.
     */    
    public String getDescricao() {
        return descricao;
    }

    /**
     * Método set do atributo descricao.
     * @param descricao valor do atributo descricao.
     */    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
    
    /**
     * Método get do atributo custo.
     * @return double - valor do atributo custo.
     */    
    public double getCusto() {
        return custo;
    }
    
    /**
     * Método set do atributo custo.
     * @param custo valor do atributo custo.
     */    
    public void setCusto(double custo) {
        this.custo = custo;
    }    
    
    /**
     * Método get do atributo cnpj.
     * @return String - valor do atributo cnpj.
     */    
    public String getCnpj() {
        return cnpj;
    }
    
    /**
     * Método set do atributo cnpj.
     * @param cnpj valor do atributo cnpj.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }    
    
    /**
     * Método get do atributo classificacao.
     * @return String - valor do atributo classificacao.
     */    
    public char getClassificacao() {
        return classificacao;
    }    
    
    /**
     * Método set do atributo classificacao.
     * @param classificacao valor do atributo classificacao.
     */
    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }   

    /**
     * Método lê entradas de cadastramento dos prestadores de serviço.
     * @param INPUT
     */    
    public void preencherCampos(Scanner INPUT) 
    {    
        System.out.print("Informe nome: ");
        setNome(INPUT.nextLine());
        
        System.out.print("Informe telefone: ");
        setTelefone(INPUT.nextLine()); 
        
        System.out.print("Informe email: ");
        setEmail(INPUT.nextLine());
        
        System.out.print("Informe cnpj: ");
        setCnpj(INPUT.nextLine());
        
        System.out.print("Informe endereco: ");
        setEndereco(INPUT.nextLine());
        
        System.out.print("Informe regiao: ");
        setRegiao(INPUT.nextLine());       
        
        System.out.print("Informe especificacao: ");
        setEspecificacao(INPUT.nextLine());

        System.out.print("Informe descricao: ");
        setDescricao(INPUT.nextLine());
 
        System.out.print("Informe custo: ");
        setCusto(INPUT.nextDouble());
    } 
    
    public void informacao() 
    {    
        System.out.println
        ( getNome() + "\n"
        + getTelefone() + "\n"        
        + getEmail() + "\n"
        + getCnpj() + "\n"
        + getEndereco() + "\n"
        + getRegiao() + "\n"
        + getEspecificacao() + "\n"        
        + getClassificacao() + "\n"
        + getCusto() + "\n"        
        + getDescricao() + "\n" );
    }
    
    private double custo;
    private String cnpj;
    private String especificacao;
    private String descricao;
    private char classificacao;     
}
