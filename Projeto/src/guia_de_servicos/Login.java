package guia_de_servicos;

/**
 * Menu de escolha de coleção.
 */
public class Login extends Menu
{
    /**
     * Método sobrescrito imprime informações no prompt.
     */
    @Override
    protected void imprimirOpcoes()
    {
        System.out.print
        ( "1: Menu Prestadores" + "\n"
        + "2: Menu Clientes" + "\n"
        + "S: Sair" + "\n"        
        + "Opcao: "        
        );        
    }
    
    /**
     * Método principal a ser executado no laço, indicando a escolha
     * de coleção a ser operada.
     * @param opcao Carácter que indica a opção selecionada.
     */
    @Override
    protected void funcaoPrincipal(char opcao)
    {
        switch (opcao)
        {
            case '1': case_1(); break;
            
            case '2': case_2();break;
        }       
    }
    
    /**
     * Métedo executado com a escolha de opção 1.
     */
    private void case_1()
    {
        Colecao<Prestador> colecao = new Colecao<>("Cadastro_Prestadores",Prestador.class);
        new MenuOperadorColecao(colecao).loop();
    }
    
    /**
     * Método executado com a escolha de opção 2.
     */
    private void case_2()
    {
        Colecao<Cliente> colecao = new Colecao<>("Cadastro_Clientes",Cliente.class);
        new MenuOperadorColecao(colecao).loop();        
    }
    
    /**
     * Método retorna o carácter de saída do laço.
     * @return char Carácter de saída do laço.
     */
    @Override
    protected char sairChar() {
        return 'S';
    }    
}
