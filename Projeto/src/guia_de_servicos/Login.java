package guia_de_servicos;

/**
 *
 */
public class Login extends Menu
{
    /**
     * 
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
     * 
     * @param opcao 
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
     * 
     */
    private void case_1()
    {
        Colecao<Prestador> colecao = new Colecao<>("Cadastro_Prestadores",Prestador.class);
        new MenuOperadorColecao(colecao).loop();
    }
    
    /**
     * 
     */
    private void case_2()
    {
        Colecao<Cliente> colecao = new Colecao<>("Cadastro_Clientes",Cliente.class);
        new MenuOperadorColecao(colecao).loop();        
    }
    
    /**
     * 
     * @return 
     */
    @Override
    protected char sairChar() {
        return 'S';
    }    
}
