Arquivos .java estão em src/

Arquvios .jar do MongoDB estão em lib/

Guia_de_Servicos.jar está na pasta Projeto/jar

FORMATO de diretórios:

    Guia_de_Servicos/
                    Guia_de_Servicos.jar (.jar executável)
                    
                    /lib/ (drivers do MongoDB .jar aqui)
                
                    /build/classes /Modelo/ (arquivos .class aqui)
                                   /Visualizacao/ (arquivos .class aqui)
                                   /Controlador/ (arquivos .class aqui)
                
                    /src /Modelo/ (arquivos .java aqui)
                         /Visualizacao/ (arquivos .java aqui)
                         /Controlador/ (arquivos .java aqui)
           
           
1- Iniciar o serviço MongoDB em UM PROMPT SEPARADO em modo de PRIVILÉGIO. 
    
2- Executar o arquivo Guia_de_Servicos.jar , presente na pasta /jar/.
        ** Importante existir o sub-diretório /lib com os drivers para a
        ** aplicação funcionar.
    
4- O Menu do programa deve rodar em seguida.
    
5- Ao finalizar o programa, também encerre o serviço MongoDB.
