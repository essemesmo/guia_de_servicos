package guia_de_servicos;

/**
* Classe Pessoa carrega as informações sobre os prestadores de serviços.
*/

public class Pessoa 
{
    /**
     * Método get do atributo regiao.
     * @return String - valor do atributo regiao.
     */
    public String getRegiao() {
        return regiao;
    }
    
    /**
     * Método set do atributo regiao.
     * @param regiao valor do atributo regiao.
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * Método get do atributo nome.
     * @return String - valor do atributo nome.
     */    
    public String getNome() {
        return nome;
    }
    
    /**
     * Método set do atributo nome.
     * @param nome valor do atributo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método get do atributo email.
     * @return String - valor do atributo email.
     */    
    public String getEmail() {
        return email;
    }
    
    /**
     * Método set do atributo email.
     * @param email valor do atributo email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método get do atributo telefone.
     * @return String - valor do atributo telefone.
     */    
    public String getTelefone() {
        return telefone;
    }
    
    /**
     * Método set do atributo telefone.
     * @param telefone valor do atributo telefone.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método get do atributo endereco.
     * @return String - valor do atributo endereco.
     */    
    public String getEndereco() {
        return endereco;
    }
    
    /**
     * Método set do atributo endereco.
     * @param endereco valor do atributo endereco.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Construtor inicializa os atributos do objeto (tipo: Topicos) com valores 
     * padrão.
     */
    public Pessoa()
    {
        String txt = "<nao especificado>";
        this.nome = txt;
        this.telefone = txt;
        this.email = txt;
        this.endereco = txt; 
        this.regiao = txt;
    }
    
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String regiao;
}