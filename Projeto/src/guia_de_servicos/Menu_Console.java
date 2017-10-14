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
            case '1': colecao = new Cadastro_Prestadores(); break;
            case '2': colecao = new Cadastro_Clientes(); break;
        }

        if (colecao != null) {new SubMenu_Console(colecao).loop();}

        colecao = null;        
    }
    
    /**
     * 
     * @return 
     */
    @Override
    protected char sairChar() {
        return 'S';
    }
    
    protected Colecao colecao;
}
