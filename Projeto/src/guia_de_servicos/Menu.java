package guia_de_servicos;

/**
 * Classe Menu carrega o laço principal de cadastramento de Usuários.
 */
public class Menu 
{    
    /**
     * Método responsável pelo laço que lê entradas de opção do usuário, 
     * chama os métodos correspondentes aos processos escolhidos.
     */
    private void lacoInterno() 
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
     * Laço responsável por ler entrada do usuário e acessar a coleção relacionada.
     */
    public void lacoExterno()
    {
        char op;
        do 
        {
            System.out.print
            ( "1: Menu Prestadores" + "\n"
            + "2: Menu Clientes" + "\n"
            + "S: Sair" + "\n"        
            + "Opcao: "        
            ); 

            op = Console.getChar();

            switch (op)
            {
                case '1': cadastro = new Cadastro_Prestadores(); break;
                case '2': cadastro = new Cadastro_Clientes(); break;
            }
            
            if (cadastro != null) {lacoInterno();}
            
            cadastro = null;
            
        } while(op != 'S');
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
        ( getMenuHeader() + "\n"
        + "Informe uma das opcoes: " + "\n"
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
    
    private String getMenuHeader()
    {
        if (cadastro instanceof Cadastro_Prestadores)
            return "Menu Prestadores";
        
        return "Menu Clientes";
    }

    private Colecao cadastro;
    private static char opcao;
}