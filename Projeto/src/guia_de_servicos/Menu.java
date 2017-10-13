package guia_de_servicos;

/**
 * Classe Menu carrega o laço principal de cadastramento de Usuários.
 */
public class Menu 
{    
    /**
     * Construtor inicializa atributos padrão do objeto tipo Menu.
     * @param cadastro referência à um objeto do tipo ArrayList.
     */
    public Menu(Banco cadastro) 
    {
        Menu.opcao = '\0';
        this.cadastro = cadastro;
    }
    
    /**
     * Método responsável pelo laço que lê entradas de opção do usuário, 
     * chama os métodos correspondentes aos processos escolhidos.
     */
    public void loop() 
    {       
        do 
        {
            setOpcao(entrarOpcao());
            
            switch (Menu.opcao) 
            {
                case '1' : case_1(); break;
                
                case '2' : case_2(); break;
                
                case '3' : case_3(); break;
            }
            
        } while(getOpcao() != '0');
    }
    
    /**
     * Método executado quando a opção 1 é escolhida.
     */
    private void case_1() {
        this.cadastro.adicionar();
    }

    /**
     * Método executado quando a opção 2 é escolhida.
     */
    private void case_2() {
        this.cadastro.buscar();   
    }
    
    /**
     * Método executado quando a opção 4 é escolhida.
     */
    private void case_3() {
        this.cadastro.imprimirTodos();   
    }
    
    /**
     * Método exibe o menu, lê entrada de opção pelo console.
     * @return char - entrada de opção do menu.
     */
    private char entrarOpcao() 
    {    
        System.out.print
        ( "Informe uma das opcoes: " + "\n"
        + "1: Cadastrar" + "\n"
        + "2: Procurar" + "\n"
        + "3: Imprimir Lista" + "\n"
        + "0: Sair" + "\n"
        + "Opcao: " );    
                
        return Console.getChar();
    }       
    
    /**
     * Método get do atributo (char) opcao.
     * @return char - opção: entrada pelo console.
     */
    private char getOpcao() {
        return Menu.opcao;
    }
    
    /**
     * Método set do atributo (char) opcao.
     * @param opcao - entrada pelo console.
     */
    private void setOpcao(char opcao) {
        Menu.opcao = opcao;
    }

    private final Banco cadastro;
    private static char opcao;
}
