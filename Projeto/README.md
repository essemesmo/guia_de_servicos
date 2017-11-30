Arquivos .class estão em build/classes/

Arquivos .java estão em src/

Arquvios .jar do MongoDB estão em lib/

LEMBRANDO que as .class e .java pertecem ao package guia_de_servicos, logo devem estar em um diretório com esse nome para funcionarem.

Melhor FORMATO de diretórios:

    Guia_de_Servicos/

                    /lib/ (arquivos .jar aqui)
                
                    /build/classes /Modelo/ (arquivos .class aqui)
                                   /Visualizacao/ (arquivos .class aqui)
                                   /Controlador/ (arquivos .class aqui)
                
                    /src /Modelo/ (arquivos .java aqui)
                         /Visualizacao/ (arquivos .java aqui)
                         /Controlador/ (arquivos .java aqui)
               
Para executar o programa com o FORMATO acima:

    1- Iniciar o serviço MongoDB em UM PROMPT SEPARADO em modo de PRIVILÉGIO. 
    
    2- Executar o arquivo Guia_de_Servicos.jar , presente na pasta /jar/.
    
    4- O Menu do programa deve rodar em seguida.
    
    5- Ao finalizar o programa, também encerre o serviço MongoDB.
