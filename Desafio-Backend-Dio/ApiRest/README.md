### Introdução
Este projeto é uma aplicação Spring Boot que fornece uma API REST para gerenciar produtos. A API permite operações CRUD (**Criar, Ler, Atualizar, Deletar**) em produtos, onde cada produto possui atributos como: `nome`, `preço`, `quantidade`, `número` de `série`, `descrição`, `categoria` e `validade`. A aplicação utiliza o Spring Data JPA para interagir com um banco de dados MySQL, facilitando a persistência dos dados dos produtos.

### Para rodar a API, o usuário deve ter o seguinte mínimo configurado:

- Ambiente de Desenvolvimento Java:

- JDK (Java Development Kit) instalado na máquina para compilar e executar a aplicação Spring Boot.
- IDE (Ambiente de Desenvolvimento Integrado):
- Spring Boot: Dependências do Spring Boot configuradas no projeto, incluindo Spring Web, Spring Data JPA, e o driver do MySQL.
Banco de Dados MySQL:

- MySQL Server instalado e em execução.
- Uma base de dados criada com o nome produtosApiRest (conforme especificado na configuração spring.datasource.url do arquivo application.properties).
- Tabela de Produtos:  
- Ferramentas de Construção e Gerenciamento de Projetos:

- Maven ou Gradle configurado para gerenciar as dependências do projeto e facilitar a construção e execução da aplicação.
- Postman ou qualquer cliente HTTP:
  
## Tecnologias Utilizadas no Projeto
>Java: Linguagem de programação usada para desenvolver o backend da aplicação.

>Spring Boot: Framework Java utilizado para facilitar a configuração e o desenvolvimento de aplicações.

>Spring Data JPA: Módulo do Spring para facilitar a implementação de repositórios baseados em JPA.

>H2 Database: Pode ser utilizado como banco de dados em memória para desenvolvimento e testes.

>Maven: Ferramenta de automação de compilação utilizada para gerenciar as dependências do projeto e seu ciclo de vida.

## Descrição dos Códigos
`ApiRestApplication.java:` Classe principal que inicia a aplicação Spring Boot.

`ProdutoRepository.java:` Interface do repositório que estende JpaRepository, facilitando operações CRUD para a entidade Produto.

`Produto.java:` Classe de modelo que representa a entidade Produto no banco de dados, incluindo atributos como id, nome, preco, etc.

`ProdutoController.java:` Controlador REST que expõe endpoints para operações CRUD na entidade Produto.

## Ultilizando a Api

**Cadastrar um novo produto (`POST /produtos`)**<br>
**Descrição:** Adiciona um novo produto ao banco de dados.<br>
**Como usar:** Envie uma requisição `POST` para `/produtos` com um corpo de requisição `JSON` contendo os detalhes do produto.<br>

**Exemplo:**
```
Post: host:port/produtos
    
    {
    "nome": "ProdutoName",
    "preco": 00.00,
    "qtd": 1,
    "nSerie": "123456789",
    "descricao": "Descrição do produto",
    "categoria": "CategoriaName",
    "validade": "2023-12-31"
    }

Return: 200 OK
```
>.

**Atualizar um produto existente (`PUT /produtos/{id}`)**<br>
**Descrição:** Atualiza os detalhes de um produto existente com base no `ID` fornecido.<br>
**Como usar:** Envie uma requisição `PUT` para `/produtos/{id}` com o `ID` do produto na `URL` e um corpo de requisição `JSON` com os detalhes atualizados do produto.<br>

**Exemplo:**
```
Put: host:port/produtos/10
    
    {
    "nome": "Nome do Produto Atualizado",
    "preco": 9.99,
    "quantidade": 10
    }

Return: 200 OK
```

>.

**Buscar um produto pelo ID (GET /produtos/{id})**<br>
**Descrição:** Retorna os detalhes de um produto com base no `ID` fornecido.<br>
**Como usar:** Envie uma requisição `GET` para `/produtos/{id}` com o `ID` do produto na URL.<br>

**Exemplo;**
```
Get: host:port/produtos/1
    
Return: 200 OK

    {
    "id": 1,
    "nome": "Nome do Produto Atualizado",
    "preco": 9.99,
    "qtd": 10,
    "descricao": "Descrição do produto",
    "categoria": "Categoria Teste",
    "validade": " ",
    "nserie": "123456789" 
    }
```

>.

**Listar todos os produtos (GET /produtos)**

**Descrição:** Retorna uma lista de todos os produtos no banco de dados.<br>
**Como usar:** Envie uma requisição `GET` para `/produtos`.<br>

**Exemplo;**
```
Get: host:port/produtos/1
    
Return: 200 OK

    [
    {
    "id": 1,
    "nome": "Nome do Produto Atualizado",
    "preco": 9.99,
    "qtd": null,
    "descricao": "Descrição do produto",
    "categoria": "Categoria Teste",
    "validade": " ",
    "nserie": "123456789"
    },
    {
    "id": 3,
    "nome": "Produto Teste01",
    "preco": 99.99,
    "qtd": 10,
    "descricao": "Descrição do produto teste",
    "categoria": "Categoria Teste",
    "validade": " ",
    "nserie": "123456789"
    }
    ]
```

>.

**Deletar um produto pelo ID (DELETE /produtos/{id})**
**Descrição:** Remove um produto do banco de dados com base no `ID` fornecido.<br>
**Como usar:** Envie uma requisição `DELETE` para `/produtos/{id}` com o `ID` do produto na `URL`.<br>

**Exemplo;**
```
Delete: host:port/produtos/2

Return: 200 OK
```
# 