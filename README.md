# People Api
## O Projeto
Desafio de projeto realizado no bootcamp Code Anywhere, através da plataforma [Digital Innovation One](https://digitalinnovation.one/)
Desenvolvido em Java e utilizando Spring Boot e Heroku.
Grande agradecimento a [Rodrigo Peleias](https://github.com/rpeleias), pelos vídeos de acompanhamento do projeto.

## Funcionalidades

Para utilizar o que foi desenvolvido ao longo do projeto, deve-se acessar `https://people-api-brunoctt.herokuapp.com/people` e utilizar alguma das funções desenvolvidas,
sendo elas:
- Adição de uma pessoa no banco de dados, usando o método POST e passando as informações da pessoa no corpo da solicitação;
- Listagem de todas as pessoas cadastradas;
- Encontrar uma pessoa pela sua ID (caso exista), usando o método GET e adicionando `/id` ao fim do endereço;
- Excluir uma pessoa pela sua ID (caso exista), usando o método DELETE e adicionando `/id` ao fim do endereço;
- Atualizar o cadastro de uma pessoa pela sua ID (caso exista), usando o método PUT e adicionando `/id` ao fim do endereço e os dados da pessoa, incluindo sua id, no corpo da solicitação;
  OBS.: *id* representa o inteiro da ID da pessoa, por exemplo *\1*

### Exemplos de Uso
- `https://people-api-brunoctt.herokuapp.com/people` método POST, corpo da solicitação:
```shell script 
{
  "firstName" : "Bruno",
  "lastName" : "Teles",
  "cpf" : "111.222.333-44",
  "birthDate" : "21-12-1998",
  "phones" : [
  {
  "type" : "MOBILE",
  "number" : "(81)999999999"
  }
  ]
}
```

- `https://people-api-brunoctt.herokuapp.com/people` método GET;
- `https://people-api-brunoctt.herokuapp.com/people/1` método GET;
- `https://people-api-brunoctt.herokuapp.com/people/1` método DELETE;
- `https://people-api-brunoctt.herokuapp.com/people/1` T, corpo da solicitação:
```shell script 
 {
        "id": 1,
        "firstName": "Bruno",
        "lastName": "Teles 2",
        "cpf": "111.222.333-44",
        "birthDate": "21-12-1998",
        "phones": [
            {
                "id": 1,
                "type": "MOBILE",
                "number": "(81)999999999"
            }
        ]
    }
```