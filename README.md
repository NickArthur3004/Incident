# Incident

Eu estou usando como servidor o Tomcat 9.0 e para executar o projeto usei o eclipse

Após executar o programa entre nesse link "http://localhost:8080/h2-console" 
-para ver se o banco foi criado com sucesso.

-execute o seguinte codigo "SELECT * FROM INCIDENT " para visualizar os dados do banco.

Para atualizar, inserir e deletar eu utilizei o Postman;

Dentro do postman escolha a opção GET e coloquer esse link "http://localhost:8080/incidents" para visualizar os dados do banco .

-Para cadastrar um incident escolha a opção POST, va para o body e coloque o seguinte codigo para o exemplo e execute.

    {
        "name": "Carreta tombada",
        "description": "Uma carreta tombou no quilomentro 30 da marginal"
    }

agora execute de novo "SELECT * FROM INCIDENT " no h2 para ver se foi cadastrado o novo incident.

-Para atualizar um incident escolha a opção PUT e no body insira o numero do id do incident e o dado que vc quer atualizar.
*Exemplo

    {
        "idIndent": 2,
        "name": "Acidente de Transito",
        "description": "Uma carreta bateu em um fox no quilometro 27 da marginal"
    }

agora execute de novo "SELECT * FROM INCIDENT " no h2 para ver se foi atualizado o incident

-Para excluir um incident escolha a opção DELETE no postman e no bory insira só o id do incident que deseja excluir
*exemplo

 	  {
 	    "idIndent": 2
 	  } 

