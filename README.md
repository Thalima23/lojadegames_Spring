🕹️  ## Projeto Loja de Games - Backend com Spring Boot

<br />

<div align="center">
    <img src="https://i.imgur.com/w8tTOuT.png" title="source: imgur.com" /> 
</div>

<br />

<div align="center">
  <img src="https://img.shields.io/github/languages/top/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/repo-size/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/languages/count/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/last-commit/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/issues/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/github/issues-pr/rafaelq80/aulas_java_t82?style=flat-square" />
  <img src="https://img.shields.io/badge/status-construção-yellow" alt="Status: Em Construção">

</div>

<br />

🎯 1. Descrição

A Loja de Games é uma aplicação backend desenvolvida com Spring Boot que simula o funcionamento de uma loja virtual de jogos.
O sistema permite o cadastro, atualização, listagem e exclusão de produtos (jogos) e categorias, aplicando os princípios do CRUD e do modelo RESTful.

Entre os principais recursos, destacam-se:

Cadastro de categorias de jogos (como Aventura, Terror, RPG etc.)

Cadastro de produtos com nome, descrição, preço, plataforma e link da imagem

Associação de cada produto a uma categoria

Consultas personalizadas, como:

Produtos com preço maior que X (em ordem crescente)

Produtos com preço menor que X (em ordem decrescente)

Persistência dos dados em um banco MySQL

<br />

⚙️ 2. Sobre a API

A API segue a arquitetura MVC (Model - View - Controller) e expõe endpoints RESTful para os recursos Produto e Categoria.
Ela permite que um cliente (como o Insomnia ou o Postman) realize operações CRUD de forma organizada e segura.

🧩 Principais funcionalidades:

Criar, listar, atualizar e deletar categorias

Criar, listar, atualizar e deletar produtos

Buscar produtos por nome, categoria, preço maior que X ou menor que X

Exibir os produtos com seus dados completos, incluindo imagem e categoria associada

<br />

🧱 3. Diagrama de Classes

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
<br />

🧰 5. Tecnologias utilizadas
Item	Descrição
Servidor	Tomcat (Spring Boot)
Linguagem	Java 17
Framework	Spring Boot
ORM	JPA / Hibernate
Banco de dados	MySQL
Documentação	SpringDoc / Swagger
Ferramentas de teste	Insomnia / Postman
IDE recomendada	Spring Tool Suite (STS)
<br />

🚀 6. Como Executar o Projeto
6.1. Requisitos

Java JDK 17+

MySQL

Spring Tool Suite (STS)

Insomnia

<br />
6.2. Passos para executar

Clone o repositório: git clone https://github.com/Thalima23/lojadegames_Spring

Abra o projeto no STS

Configure seu banco de dados MySQL no arquivo application.properties

Execute a aplicação

Acesse os endpoints através do Insomnia ou Swagger

Swagger: http://localhost:8080/swagger-ui/index.html

<br />

👩‍💻 9. Desenvolvido por

Projeto desenvolvido pela **Thalita** (https://github.com/thalima23), como parte do bootcamp Generation Brasil – Full Stack Java 83. Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!

