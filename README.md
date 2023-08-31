# password-validator-api

A API de Validação de Senha é um serviço que verifica se uma senha atende a critérios de segurança específicos.

## Funcionalidades
- Validar se a senha atende aos critério de segurança

## Regras
- A senha deve conter pelo menos 9 caracteres.
- Deve conter pelo menos um número.
- Deve conter pelo menos uma letra minúscula.
- Deve conter pelo menos uma letra maiúscula.
- Deve conter pelo menos um caractere especial.
- Não deve possuir caracteres repetidos.

## Desenho Solução
![alt text](https://github.com/gustavo-arao95/password-validator-api/blob/main/Diagrama%20sem%20nome.png)
## Como Usar

Para usar a API, você pode fazer uma requisição POST para o endpoint `/validations/validate?password` com a senha que deseja validar no corpo da requisição.

### Endpoint

`POST /validations/validate?password`

#### Parâmetros de Entrada

| Parâmetro | Tipo   | Descrição               |
|-----------|--------|-------------------------|
| password  | String | A senha a ser validada. |

#### Exemplo de Requisição

```json
{
  "password": "A@roiu"
}
```
#### Exemplo de Resposta (Senha Válida)
```json
{
  "valid": true
}
```
#### Exemplo de Resposta (Senha Inválida)
```json
{
  "valid": false
  }
```
## Configuração
1. Copie este repositório para o seu ambiente local.
2. Abra o projeto em uma IDE Java, como o IntelliJ IDEA.
3. Execute o aplicativo.
4. Faça solicitações POST para http://localhost:8080/validations/validate?password para validar senhas.

## Tecnologia Usadas
* Java;
* Spring Boot;
* Postman;

  ## Demo
https://drive.google.com/file/d/1YoKVVfT6GRfcK7r3wxE_3uGBYAQukKcj/view?usp=drive_link

## Autor
Gustavo A. S. Moreira




