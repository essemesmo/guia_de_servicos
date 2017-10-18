Arquivos .java do Projeto.

Construtores: 

    classe Usuario, classe Prestador, classe Cliente, 
    classe Banco, classe Colecao, classe MenuOperadorColecao.

Sobrecarga de Métodos:

    Métodos da class Console.
    
Sobrecarga de Operador:

    Scripts em C++ estão na pasta LAB.

Herença simples:

    Prestador e Cliente são subclasses de Usuario.

Container:

    ArrayList é utilizada na classe Colecao para carregar objetos na memória virtual para operações.
    
Classe Abstrata:

    Classes Login e MenuOperadorColecao herdam da classe abstrata Menu, implementando os métodos abstratos.
    
Interface:

    Ainda nenhum motivo interessante para ser usado no projeto.
    
Genéricos:

    Classe Colecao apresenta parâmetro de Tipo, assim generalizando a criação de ArrayList, coleções do MongoDB, em tempo de execução.

Polimorfismo:

    Referência da classe Object pode ser utilizada para indicar objetos Prestador e Cliente, que são subclasses.
    Essa referência então apresenta o comportamento "toString()" sobrescrito pela classe concreta referenciada.
    Uso é feito na classe Colecao.
    
    Referência da classe Usuario pode ser utilizadad para indicar objetos Presetador e Cliente, que são sublcasses.
    Essa refêrencia então apresenta o comportamento "preencherCampos()" sobrescrito pela classe concreta referenciada.
   
    
