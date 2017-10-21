Arquivos .class estão em build/classes/guia_de_servicos

Arquivos .java estão em src/guia_de_servicos

Arquvios .jar do MongoDB estão em lib/

LEMBRANDO que as .class e .java pertecem ao package guia_de_servicos, logo devem estar em um diretório com esse nome para funcionarem.

Melhor FORMATO de diretórios:

    Guia_de_Servicos/

                    /lib/ (arquivos .jar aqui)
                
                    /build/classes/guia_de_servicos/ (arquivos .class aqui)
                
                    /src/guia_de_servicos/ (arquivos .java aqui)
               
Para executar o programa com o FORMATO acima:

    1- Iniciar o serviço MongoDB em UM PROMPT SEPARADO em modo de PRIVILÉGIO. 
    
    2- Em outro prompt cmd, vá para o diretório Guia_de_Servicos, exemplo de comando: cd C:\...\Guia_de_Servicos , sendo ... o caminho na sua maquina.
    
    3- execute o comando: java -cp lib\*;build\classes guia_de_servicos.GuiaMainApp
    
    4- O Menu do programa deve rodar em seguida.
    
    5- Ao finalizar o programa, também encerre o serviço MongoDB.
