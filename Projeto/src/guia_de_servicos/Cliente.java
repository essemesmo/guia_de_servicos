package guia_de_servicos;

import java.util.Scanner;

/**
 *
 * 
 */
public class Cliente extends Pessoa
{
    public Cliente()
    {
        cpf = "<nao informado>";
    }
    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     * Método lê entradas de cadastramento dos prestadores de serviço.
     * @param INPUT referência ao objeto tipo Scanner do menu. 
     */
    @Override
    public void preencherCampos(Scanner INPUT) 
    {    
        System.out.print("Informe nome: ");
        setNome(INPUT.nextLine());
        
        System.out.print("Informe telefone: ");
        setTelefone(INPUT.nextLine()); 
        
        System.out.print("Informe email: ");
        setEmail(INPUT.nextLine());
        
        System.out.print("Informe cpf: ");
        setCpf(INPUT.nextLine());
        
        System.out.print("Informe endereco: ");
        setEndereco(INPUT.nextLine());
        
        System.out.print("Informe regiao: ");
        setRegiao(INPUT.nextLine());       
        
    }
    
    /**
     *Método override da classe abstrata Pessoa
     */
    @Override 
    public void informacao() 
    {    
        System.out.println
        ( "Nome: " + getNome() + "\n"
        + "Telefone: " + getTelefone() + "\n"        
        + "Email: " + getEmail() + "\n"
        + "CNPJ: " + getCpf() + "\n"
        + "Endereço: " + getEndereco() + "\n"
        + "Regiao: " + getRegiao() + "\n" );
    }
 
    private String cpf;
}
