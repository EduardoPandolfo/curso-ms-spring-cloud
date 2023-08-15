# curso-ms-spring-cloud
Utilização de conceitos cloud para comunicação entre microserviços utilizando várias bibliotecas do Spring Framework

    Feign - requisições entre os microserviços

    Ribbon - balanceamento de carga

    Servidor Eureka - registro de microserviços para funcionarem de forma dinâmica

    API Gateway Zuul - porta da arquitetura dos microserviços

    Hystrix - tolerância a falhas

    OAuth - token JWT - autenticação

    Servidor de configuração externo - busca de valores através de repositório git

    Criada branch para configurações de cada microserviços em dockers

Variáveis Postman:
- api-gateway: http://localhost:8765
- config-host: http://localhost:8888
- client-name: CLIENT-NAME
- client-secret: CLIENT-SECRET
- username: leia@gmail.com
- password: 123456
- token:

Script para atribuir token à variável de ambiente do Postman:
```js
if (responseCode.code >= 200 && responseCode.code < 300) {
    var json = JSON.parse(responseBody);
    postman.setEnvironmentVariable('token', json.access_token);
}
```