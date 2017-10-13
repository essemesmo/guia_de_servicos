Arquivos .class do Projeto

Construtores: 

    classe Usuario, classe Prestador, classe Cliente, classe Banco, 
    classe Cadastro_Prestadores, classe Cadastro_Clientes, classe Menu.

Herença:

    Prestador e Cliente são subclasses de Usuario,
    
    Cadastro_Prestadores e Cadastro_Clientes são subclasses de Banco.

Sobrecarga de Métodos: 

    Subclasses Prestador e Cliente sobrecarregam métodos da superclasse Usuario,

    Subclasses Cadastro_Clientes e Cadastro_Prestadores sobrecarregam métodos da superclasse Banco.

Polimorfismo:
  
    Uma referênciada da superclasse abstrata Banco pode ser utilizada para invocar polimorficamente
    funcionalidades de objetos concretos das subclasses Cadastro_Prestadores e Cadastro_Clientes.

Classes abstratas:
    
    Classe abstrata Cliente não possui métodos abstratos, não deve ser instânciada,
    
    Classe abstrata Banco possui métodos abstratos, não deve ser instânciada.
