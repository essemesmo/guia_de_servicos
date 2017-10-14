Arquivos .java do Projeto.

Construtores: 

    classe Usuario, classe Prestador, classe Cliente, 
    classe Banco, classe Cadastro_Prestadores, classe Cadastro_Clientes.

Herença:

    Prestador e Cliente são subclasses de Usuario.
    
Classe Abstrata:

    Classes Menu_Console e SubMenu_Console herdam da classe abstrara Menu, implementando os métodos abstratos.
    
Interface:

    Cadastro_Prestadores e Cadastro_Clientes implementam Interface Colecao.
    Interface Colecao determina as assinaturas importantes para a manipulção de dados de diversas
    coleções de objetos gravadas no banco.

Polimorfismo:
  
    Uma referênciada da Interface Colecao pode ser utilizada para invocar polimorficamente
    funcionalidades de objetos concretos das classes Cadastro_Prestadores e Cadastro_Clientes.
