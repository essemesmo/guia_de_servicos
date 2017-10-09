package guia_de_servicos;

/**
 * Classe Menu carrega o laço principal de cadastramento.
 */

import java.util.Scanner;

public class Menu 
{    
    /**
     * Construtor inicializa atributos padrão do objeto tipo Menu.
     * @param cadastro referência à um objeto do tipo ArrayList.
     */
    public Menu(Cadastro cadastro) 
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
            Menu.setOpcao(entrarOpcao());
            
            switch (Menu.opcao) 
            {
                case '1' : case_1(); break;
                
                case '2' :
                    this.cadastro.buscar( entrarCampo(), entrarBusca() );
                break;
                
                case '4' :
                    this.cadastro.imprimirTodos();
                break;
            }
            
        } while(Menu.getOpcao() != '0');
    }
    
    private void case_1()
    {
        Prestador prestador = new Prestador();
        prestador.preencherCampos(INPUT);
        this.cadastro.adicionar(prestador);
    }

    /**
     * Método exibe o menu, lê entrada de opção pelo console.
     * @return char - entrada de opção do menu.
     */
    private char entrarOpcao() 
    {    
        System.out.println
        ( "Informe uma das opcoes: " + "\n"
        + "1: Cadastrar" + "\n"
        + "2: Procurar" + "\n"
        + "3: Remover" + "\n"
        + "4: Imprimir Lista" + "\n"
        + "0: Sair" );    
        
        char temp = INPUT.next().charAt(0);
        INPUT.nextLine();
        
        return temp;
    }   
    
    private String entrarBusca() 
    {
        System.out.print("Buscar por: ");
        return INPUT.nextLine();
    }
    
    private String entrarCampo()
    {        
        System.out.print
        ( "Campos de Busca:" + "\n"
        + "por nome: nome" + "\n"
        + "por endereco: endereco" + "\n"
        + "por telefone: telefone" + "\n"
        + "por especificacao: especificacao" + "\n"
        + "por descricao: descricao" + "\n"
        + "buscar por: ");
        
        return INPUT.nextLine();
    }    
    
    /**
     * Método get do atributo (char) opcao.
     * @return char - opção: entrada pelo console.
     */
    private static char getOpcao() {
        return Menu.opcao;
    }
    
    /**
     * Método set do atributo (char) opcao.
     * @param opcao - entrada pelo console.
     */
    private static void setOpcao(char opcao) {
        Menu.opcao = opcao;
    }

    private final Cadastro cadastro;
    private static char opcao;
    private static Scanner INPUT;    
}