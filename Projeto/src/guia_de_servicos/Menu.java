package guia_de_servicos;

import java.util.Scanner;

/**
 * Classe Menu carrega o laço principal de cadastramento de Prestadores.
 */
public class Menu 
{    
    /**
     * Construtor inicializa atributos padrão do objeto tipo Menu.
     * @param cadastro referência à um objeto do tipo ArrayList.
     */
    public Menu(Cadastro_Prestadores cadastro) 
    {
        Menu.opcao = '\0';
        this.cadastro = cadastro;
        INPUT = new Scanner(System.in);
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
    private void case_1()
    {
        Prestador prestador = new Prestador();
        prestador.preencherCampos(INPUT);
        this.cadastro.adicionar(prestador);
    }

    /**
     * Método executado quando a opção 2 é escolhida.
     */
    private void case_2() {
        this.cadastro.buscar( entrarCampo(), entrarBusca() );   
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
        
        char op = INPUT.next().charAt(0);
        INPUT.nextLine();
        
        return op;
    }   
    
    /**
     * Método retorna a String que deve ser reconhecida no banco.
     * @return - String
     */
    private String entrarBusca() 
    {
        System.out.print("Buscar por: ");
        return INPUT.nextLine();
    }
    
    /**
     * Método retorna o campo a ser pesquisado no banco.
     * @return - String
     */
    private String entrarCampo()
    {        
        System.out.print
        ( "Campos de Busca:" + "\n"
        + "por nome: nome" + "\n"
        + "por endereco: endereco" + "\n"
        + "por telefone: telefone" + "\n"
        + "por especificacao: especificacao" + "\n"
        + "por descricao: descricao" + "\n"
        + "Campo: ");
        
        return INPUT.nextLine();
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

    private final Cadastro_Prestadores cadastro;
    private static char opcao;
    private static Scanner INPUT;    
}