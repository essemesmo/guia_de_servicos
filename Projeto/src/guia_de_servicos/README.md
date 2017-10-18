Arquivos .java do Projeto.

Construtores: 

    classe Usuario, classe Prestador, classe Cliente, 
    classe Banco, classe Colecao, classe MenuOperadorColecao.

Sobrecarga de Métodos:

    Métodos da class Console.

Herença simples:

    Prestador e Cliente são subclasses de Usuario.
    
Container:

    ArrayList é utilizada na classe Colecao para carregar objetos na memória virtual para operações.
    
Classe Abstrata:

    Classes Login e MenuOperadorColecao herdam da classe abstrata Menu, implementando os métodos abstratos.
    
Interface:

    nah.
    
Genéricos:

    Classe Colecao apresenta parâmetro de tipo para criar ArrayLists e coleções no MongoDB em tempo de execução.

Polimorfismo:

    Referência da classe Object pode ser utilizado para indicar objetos Prestador e Cliente, que são subclasses.
    Essa referência então apresenta o comportamento "toString()" sobrescrito da classe concreta referenciada.
    Uso é feito na classe Colecao.
