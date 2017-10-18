package guia_de_servicos;

/**
 * Classe MenuOperadorColecao carrega o laço principal de cadastramento de Usuários.
 */
public class MenuOperadorColecao extends Menu
{    
    /**
     * 
     * @param colecao 
     */
    public MenuOperadorColecao(Colecao colecao) {
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
    private void case_1() 
    {
        Usuario user;
        if (colecao.getClassType() == Prestador.class) {
            user = new Prestador();
            user.preencherCampos();
            colecao.adicionar(user);
        }
        else if (colecao.getClassType() == Cliente.class) {
            user = new Cliente();
            user.preencherCampos();
            colecao.adicionar(user);
        }
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
        ( "Informe uma das opcoes: " + "\n"
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

    private final Colecao colecao;
}