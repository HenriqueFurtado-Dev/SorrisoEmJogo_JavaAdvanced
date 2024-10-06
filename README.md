# Projeto: Sorriso em Jogo
O Sorriso Em Jogo é um aplicativo desenvolvido para incentivar as pessoas a registrarem seus hábitos diários de saúde bucal e a realizarem uma análise desses hábitos. Os usuários podem trocar pontos acumulados por recompensas em parcerias com dentistas afiliados à OdontoPrev. O aplicativo visa promover a saúde bucal e a conscientização sobre a importância dos cuidados diários. 

## Integrantes 
- Carlos Henrique Furtado  | RM: 553597 (Desenvolvimento dos endpoints)
- Fabíola Falcão Neris     | RM: 552715 (Diagramação e regras  de negócios)
- Rafael de Novaes         | RM: 553934 (Testes e validação)

## Rodando a aplicação
  1 - Configure um usuário e senha para o banco de dados Oracle em: application.properties
  
  2 - Em project structure garanta que o SDK esteja para o java 18.0.2(Amazon Corretto)

  3 - Start a classe de execução SorrisoEmJogoApplication

## Link para vídeo de inserção das informações no banco:
https://www.youtube.com/watch?v=BcV4CheBA9U

## Diagramas
![Logical](https://github.com/user-attachments/assets/f44d8528-4ada-424b-b081-f122a762d1c2)
![Relacional](https://github.com/user-attachments/assets/b3d09662-4d7d-4aa1-a447-c640ab9bb064)

## Endpoints - Um exemplo de JSON está disponível na collection do Postman
Usuários: http://localhost:8080/api/usuarios

Recompensa: http://localhost:8080/api/recompensas

Habitos: http://localhost:8080/api/habitos

Registro Habito: http://localhost:8080/api/registro-habitos

Unidades: http://localhost:8080/api/unidades

Procedimentos: http://localhost:8080/api/procedimentos
