package guia_de_servicos;

/**
 * Classe SubMenu_Console carrega o laço principal de cadastramento de Usuários.
 */
public class SubMenu_Console extends Menu
{    
    /**
     * 
     * @param colecao 
     */
    public SubMenu_Console(Colecao colecao) {
        this.colecao = colecao;
    }
    
    /**
     * 
     */
    @Override
    protected void funcaoPrincipal(char opcao)
    {
        switch (opcao) 
        {
            case '1' : case_1(); break;

            case '2' : case_2(); break;

            case '3' : case_3(); break;
        }
    }
    
    /**
     * Método executado quando a opção 1 é escolhida.
     */
    private void case_1() {
        colecao.adicionar();
    }

    /**
     * Método executado quando a opção 2 é escolhida.
     */
    private void case_2() {
        colecao.buscar();   
    }
    
    /**
     * Método executado quando a opção 4 é escolhida.
     */
    private void case_3() {
        colecao.imprimirTodos();   
    }
    
    /**
     * 
     */
    @Override
    protected void imprimirOpcoes() 
    {    
        System.out.print
        ( getMenuHeader() + "\n"
        + "Informe uma das opcoes: " + "\n"
        + "1: Cadastrar" + "\n"
        + "2: Procurar" + "\n"
        + "3: Imprimir Lista" + "\n"
        + "0: Sair" + "\n"
        + "Opcao: " );    
    }
    
    /**
     * 
     * @return 
     */
    @Override
    protected char sairChar() {
        return '0';
    }
        
    /**
     * 
     * @return 
     */
    private String getMenuHeader()
    {
        if (colecao instanceof Cadastro_Prestadores)
            return "Menu Prestadores";

        return "Menu Clientes";
    }

    private final Colecao colecao;
}