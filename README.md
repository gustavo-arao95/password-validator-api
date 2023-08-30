# password-validator-api

A API de Validação de Senha é um serviço que verifica se uma senha atende a critérios de segurança específicos.

## Funcionalidades

- Verifica se a senha possui pelo menos 9 caracteres.
- Deve conter pelo menos um número.
- Deve conter pelo menos uma letra minúscula.
- Deve conter pelo menos uma letra maiúscula.
- Deve conter pelo menos um caractere especial.
- Não deve possuir caracteres repetidos.

## Como Usar

Para usar a API, você pode fazer uma requisição POST para o endpoint `/validate-password` com a senha que deseja validar no corpo da requisição.

### Endpoint

`POST /validate-password`

#### Parâmetros de Entrada

| Parâmetro | Tipo   | Descrição               |
|-----------|--------|-------------------------|
| password  | String | A senha a ser validada. |

#### Exemplo de Requisição

```json
{
  "password": "SenhaSegura123!"
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
## Cconfiguração
1. Copie este repositório para o seu ambiente local.
2. Abra o projeto em uma IDE Java, como o IntelliJ IDEA.
3. Execute o aplicativo.
4. Faça solicitações POST para http://localhost:8080/validate-password para validar senhas.

## Tecnologia Usadas
* Java;
* Spring Boot;
* Postman;

## Autor
Gustavo A. S. Moreira




