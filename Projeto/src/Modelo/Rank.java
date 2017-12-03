package Modelo;

import org.bson.Document;

/**
 *
 * @author PMF
 */
public class Rank 
{

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the classificacao
     */
    public double getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the numeroVotos
     */
    public int getNumeroVotos() {
        return numeroVotos;
    }

    /**
     * @param numeroVotos the numeroVotos to set
     */
    public void setNumeroVotos(int numeroVotos) {
        this.numeroVotos = numeroVotos;
    }
    
    /**
     * 
     * @param valor
     */
    public void atualizarClassificacao(double valor) {
        this.setTotal(this.getTotal() + valor);
        this.numeroVotos += 1;
        this.classificacao = getTotal() / numeroVotos;
    }
    
    /**
     * 
     * @return 
     */
    public Document criarDoc() 
    {
        Document doc = new Document();
        doc.append("total", total);
        doc.append("classificacao", classificacao);
        doc.append("votos", numeroVotos);
        
        return doc;
    }
    
    private int numeroVotos;
    private double classificacao;
    private double total;
}
