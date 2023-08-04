# nuti-backend

Sistema que realiza a contagem de Tags Html de uma lista de Urls. O armazenamento dos dados está sendo realizado primariamente pelo MongoDB, que é de onde o front-end busca os dados para visualização. Também foi implementado o armazenamento de dados pelo MySQL, sendo utilizado apenas para salvar os dados.

## Instruções de uso
Antes de iniciar a aplicação, rode o comando do docker compose abaixo:

    docker compose up

Para executar o programa, rode o comando abaixo para buildar:

    ./gradlew clean build

E por fim, execute o comando abaixo:

    java -jar .\build\libs\html-0.0.1-SNAPSHOT.jar

# Entrega relacionada a análise de sistemas

Prototipação das páginas - Figma

    https://www.figma.com/file/fAR1LXPuP71QbVAJ2fF2yr/Prototipo-teste-NUTI?type=design&t=DYRqnGKZH7NYtFiM-6

O diagrama DER, especificação de casos de uso e também o link do figma serão enviados pelo email.
