package guia_de_servicos;

/**
 * @author Thyago M. do Santos - 222160202,
 * Rafael da Silva - 222160194,
 * Pedro de Matos Fedricci - 222160400,
 * Lincoln Cesar Goncalves Dias - 222150385
 */

/**
 * Classe GuiaMainApp apresenta a função main.
 */
public class GuiaMainApp 
{
    public static void main(String[] args) 
    {            
        Banco banco = new Banco();
        
        new Menu_Console().loop();
        
        banco.closeConnection();
    }
}