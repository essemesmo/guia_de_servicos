package guia_de_servicos;

/**
 *
 */
abstract public class Menu 
{
    /**
     * 
     */
    public final void loop() 
    {      
        do 
        {
            imprimirOpcoes();
            
            setOpcao(Console.getChar());
            
            funcaoPrincipal(getOpcao());
            
        } while(getOpcao() != sairChar());
    }
    
    /**
     * 
     */
    abstract protected void imprimirOpcoes();
    
    /**
     * 
     * @param opcao 
     */
    abstract protected void funcaoPrincipal(char opcao);
    
    /**
     * 
     * @return Char
     */
    abstract protected char sairChar();
    
    /**
     * Método set do atributo (char) opcao.
     * @param opcao
     */    
    private void setOpcao(char opcao) {
        this.opcao = opcao;
    }  
    
    /**
     * Método get do atributo (char) opcao.
     * @return char - atributo opcao da classe.
     */
    private char getOpcao() {
        return opcao;
    }    
    
    private char opcao;
}
