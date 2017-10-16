package guia_de_servicos;

/**
 *
 */
public class Menu_Console extends Menu
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
            case '1': 
                new SubMenu_Console(new Cadastro_Prestadores()).loop();
                break;
            case '2':
                new SubMenu_Console(new Cadastro_Clientes()).loop();
                break;
        }       
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
