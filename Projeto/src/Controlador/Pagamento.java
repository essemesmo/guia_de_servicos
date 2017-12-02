package Controlador;

import Modelo.Prestador;
import Modelo.Usuario;

/**
 * Classe opera a transferência monetária entre Cliente e
 * Prestador.
 */
public class Pagamento
{

    /**
     * Método get do atributo numHoras.
     * @return the numHoras.
     */
    public double getNumHoras() {
        return numHoras;
    }

    /**
     * Método set do atributo numHoras.
     * @param numHoras the numHoras to set.
     */
    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }
    
    /**
     * Construtor com entrada de horas prestadas para calcular
     * custo a ser pago pelo serviço.
     * @param numHoras 
     */
    public Pagamento(int numHoras) {
        this.numHoras = numHoras;
    }
    
    /**
     * Construtor sem entrada de horas prestadas para calcular
     * custo a ser pago pelo serviço.
     */
    public Pagamento() {
        this.numHoras = 1;
    }    
    
    /**
     * Método transfere credito.
     * @param cliente Cliente que deve pagar.
     * @param prestador Prestador que deve receber.
     * @return 
     */
    public boolean transferir(Usuario cliente, Prestador prestador) 
    {
        double custo = prestador.getCusto() * getNumHoras();
        
        if (cliente.getSaldo() < custo) {
            System.out.print("Custo superior ao saldo");
            return false;
        }
       
        cliente.setSaldo(cliente.getSaldo() - custo);
        prestador.setSaldo(prestador.getSaldo() + custo);
        return true;
    }
    
    private double numHoras;
}
