package guia_de_servicos;

/**
 * Classe abstrata generaliza o funcionamento de um laço por Do While.
 */
abstract public class Menu 
{
    /**
     * Método loop é o laço principal, não pode ser sobrescrito.
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
     * Método abstrato indica a importância de imprimir
     * informações de uso para o usuário.
     */
    abstract protected void imprimirOpcoes();
    
    /**
     * Método principal a ser executado dentro do laço.
     * @param opcao Carácter inserido pelo usuário.
     */
    abstract protected void funcaoPrincipal(char opcao);
    
    /**
     * Método inidica o char de saída do laço.
     * @return Char Carácter de saída do laço.
     */
    abstract protected char sairChar();
    
    /**
     * Método set do atributo (char) opcao.
     * @param opcao Carácter a ser setado.
     */    
    private void setOpcao(char opcao) {
        this.opcao = opcao;
    }  
    
    /**
     * Método get do atributo (char) opcao.
     * @return char Carácter do atributo opcao.
     */
    private char getOpcao() {
        return opcao;
    }    
    
    private char opcao;
}
