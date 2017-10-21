package guia_de_servicos;

/**
 * Classe MenuOperadorColecao carrega o laço principal de cadastramento de Usuários.
 */
public class MenuOperadorColecao extends Menu
{    
    /**
     * Construtor tem como parâmetro uma refêrencia de objeto da classe
     * Coleção.
     * @param colecao Coleção do MongoDB correspondente.
     */
    public MenuOperadorColecao(Colecao colecao) {
        this.colecao = colecao;
    }
    
    /**
     * Método sobrescrito da classe abstrata Menu, recebe uma opção
     * para então executar o método privado correnspondente.
     * @param opcao Carácter a ser manipulado no switch.
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
     * Comportamento polimorfico apartir de uma refêrencia a Usuario,
     * métodos são determinidos pelos objetos concretos.
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
     * Método executado quando a opção 3 é escolhida.
     */
    private void case_3() {
        colecao.imprimirTodos();
    }
    
    /**
     * Imprimi texto para o usuário.
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
     * Método utilizado para determinar o char de saída do laço.
     * @return char Carácter de saída do laço.
     */
    @Override
    protected char sairChar() {
        return '0';
    }

    private final Colecao colecao;
}