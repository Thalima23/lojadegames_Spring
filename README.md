# 🎮 Loja de Games

## 🧩 1. Sobre o projeto

A **Loja de Games** é uma aplicação desenvolvida em **Spring Boot** que simula um e-commerce de jogos eletrônicos.  
O sistema permite o **cadastro, atualização, listagem e exclusão de produtos e categorias**, além de consultas personalizadas por preço e nome.

Este projeto foi desenvolvido como parte do **Bootcamp Generation Brasil – Full Stack Java**, com foco em aplicar os conceitos de **CRUD, relacionamento entre entidades e boas práticas com Spring Framework**.

---

## ⚙️ 2. Funcionalidades

### 🕹️ Produto
- Criar, listar, atualizar e deletar produtos  
- Consultar produtos por nome  
- Consultar produtos com **preço maior ou menor** que um valor definido (em ordem crescente ou decrescente)  
- Cada produto pertence a uma categoria específica  

### 🗂️ Categoria
- Criar, listar, atualizar e deletar categorias  
- Consultar categorias por nome  
- Relacionamento **1:N** com produtos

---

## 🧱 3. Diagrama de Classes

O diagrama abaixo representa a estrutura das classes e o relacionamento entre elas:

```mermaid
classDiagram
    class Categoria {
        - id : Long
        - nome : String
        - descricao : String
        - produto : List<Produto>
    }

    class Produto {
        - id : Long
        - nome : String
        - descricao : String
        - preco : Double
        - plataforma : String
        - foto : String
        - categoria : Categoria
    }

    Categoria "1" --> "0..*" Produto : contém
```

## 💾 4. Estrutura do Banco de Dados

Tabela: tb_categorias

id

nome

descricao

Tabela: tb_produtos

id

nome

descricao

preco

plataforma

foto

categoria_id (chave estrangeira)

| Item                   | Descrição               |
| ---------------------- | ----------------------- |
| ☕ **Linguagem**        | Java 17                 |
| 🌱 **Framework**       | Spring Boot             |
| 🧩 **ORM**             | JPA / Hibernate         |
| 🗄️ **Banco de Dados** | MySQL                   |
| 🧾 **Documentação**    | SpringDoc / Swagger     |
| 🧪 **Testes de API**   | Insomnia / Postman      |
| 💻 **IDE**             | Spring Tool Suite (STS) |
| 🚀 **Servidor**        | Tomcat (Spring Boot)    |

## 🧰 5. Tecnologias utilizadas

| Item                   | Descrição               |
| ---------------------- | ----------------------- |
| ☕ **Linguagem**        | Java 17                 |
| 🌱 **Framework**       | Spring Boot             |
| 🧩 **ORM**             | JPA / Hibernate         |
| 🗄️ **Banco de Dados** | MySQL                   |
| 🧾 **Documentação**    | SpringDoc / Swagger     |
| 🧪 **Testes de API**   | Insomnia / Postman      |
| 💻 **IDE**             | Spring Tool Suite (STS) |
| 🚀 **Servidor**        | Tomcat (Spring Boot)    |

## 🚀 6. Como Executar o Projeto

## 6.1. Requisitos:

Java JDK 17+
MySQL
Spring Tool Suite (STS)
Insomnia ou Postman

## 6.2. Passos para execução

1. Clone o repositório

git clone https://github.com/thalima23/lojadegames_Spring


2. Abra o projeto no Spring Tool Suite (STS)

3. Configure seu banco de dados no arquivo application.properties

4. Execute a aplicação (Run as > Spring Boot App)

## 👩‍💻 7. Desenvolvido por

Desenvolvido por [**Thalita**](https://github.com/rafaelq80) 💜
Como parte do Bootcamp Generation Brasil – Full Stack Java 83.

📫 Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue! 🚀
