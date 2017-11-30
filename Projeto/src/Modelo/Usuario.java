package Modelo;

import Controlador.Senha;
import org.bson.Document;
/**
* Classe Usuario carrega as informações sobre básicas dos usuários.
*/
public class Usuario 
{

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método get do atributo saldo.
     * @return the saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método set do atributo saldo.
     * @param saldo the saldo to set.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método get do atributo regiao.
     * @return String - valor do atributo regiao.
     */
    public final String getRegiao() {
        return regiao;
    }
    
    /**
     * Método set do atributo regiao.
     * @param regiao valor do atributo regiao.
     */
    public final void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * Método get do atributo nome.
     * @return String - valor do atributo nome.
     */    
    public final String getNome() {
        return nome;
    }
    
    /**
     * Método set do atributo nome.
     * @param nome valor do atributo nome.
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método get do atributo email.
     * @return String - valor do atributo email.
     */    
    public final String getEmail() {
        return email;
    }
    
    /**
     * Método set do atributo email.
     * @param email valor do atributo email.
     */
    public final void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get do atributo telefone.
     * @return String - valor do atributo telefone.
     */    
    public final String getTelefone() {
        return telefone;
    }
    
    /**
     * Método set do atributo telefone.
     * @param telefone valor do atributo telefone.
     */
    public final void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método get do atributo endereco.
     * @return String - valor do atributo endereco.
     */    
    public final String getEndereco() {
        return endereco;
    }
    
    /**
     * Método set do atributo endereco.
     * @param endereco valor do atributo endereco.
     */
    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Método retorna as informações básicas de Usuario em formato String.
     * @return String - informações da classe Usuario.
     */
    @Override
    public String toString()
    {
        return String.format
        ( 
            "Username: %s\n"
            + "Nome: %s\n"
            + "Telefone: %s\n"
            + "Email: %s\n"
            + "Endereco: %s\n"
            + "Regiao: %s"
            , getUsername(), getNome(), getTelefone()
            , getEmail(), getEndereco(), getRegiao()
        );
    }
    
    /**
     * Método recolhe informações de cadastramento de usuário pelo console.
     */    
    public void preencherCampos()
    {
        setNome(Console.getLine("Informe nome: "));
        
        setUsername(Console.getLine("Informe username: "));
        
        setSenha(Console.getLine("Informe senha: "));
        
        setTelefone(Console.getLine("Informe telefone: ")); 
        
        setEmail(Console.getLine("Informe email: "));
        
        setEndereco(Console.getLine("Informe endereco: "));
        
        setRegiao(Console.getLine("Informe regiao: "));   
    }    
    
    /**
     * Construtor inicializa os atributos do objeto Usuario com valores 
     * padrão.
     */
    public Usuario()
    {
        String txt = "<nao especificado>";
        this.nome = txt;
        this.telefone = txt;
        this.email = txt;
        this.endereco = txt; 
        this.regiao = txt;
        this.saldo = 10000.00;
    }
    
    /**
     * 
     * @return 
     */
    public Document criarDocumento()
    {
        Document usuario = new Document();
        
        usuario.append("_id", getUsername())
            .append("nome", getNome())
            .append("email", getEmail())
            .append("telefone", getTelefone())
            .append("endereco", getEndereco())
            .append("regiao", getRegiao())
            .append("saldo", getSaldo())
            .append("senha", getSenha());      
        
        return usuario;
    }
    
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String regiao;
    private String username;
    private String senha;
    private double saldo;
}