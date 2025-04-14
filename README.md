Spring Boot Web API — Projeto de Vendas

Este projeto é uma API RESTful desenvolvida com Spring Boot, simulando um sistema de vendas com as entidades Usuário, Pedido, Produto, Categoria e Itens de Pedido. O projeto inclui camadas de serviços, tratamento de exceções personalizado e armazenamento em banco de dados H2 em memória.

📌 Tecnologias e Dependências
Java 17
Spring Boot
Spring Web
Spring Data JPA
Hibernate ORM
Banco de Dados H2 (memória)
Postman (para testar os endpoints)
Maven (gestão de dependências)

🗂️ Funcionalidades
	📄 CRUD completo de Usuários
	🛒 Cadastro de Pedidos com associação de:
		Produtos
		Itens de Pedido (OrderItem)
		Categorias

📑 Relacionamentos JPA:
@OneToMany, @ManyToOne, @ManyToMany

⚙️ Tratamento de exceções customizadas:
	ResourceNotFoundException
	DatabaseException
	Mapeamento global com @ControllerAdvice
	📦 Povoamento inicial de dados no banco H2 via CommandLineRunner
	📡 API RESTful estruturada
	📚 Documentação organizada e endpoints testáveis via Postman

🎯 Endpoints principais
Usuários
	GET /users
	GET /users/{id}
	POST /users
	PUT /users/{id}
	DELETE /users/{id}

Produtos
	GET /products
	POST /products

Pedidos
	GET /orders
	POST /orders

📝 Banco de Dados H2

A aplicação utiliza o H2 Database em memória, acessível via:
Console H2: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

✅ Aprendizados
	✔️ Utilização de Spring Boot para estruturar APIs REST
	✔️ Mapeamento de relacionamentos JPA
	✔️ Tratamento de exceções customizadas e global com @ControllerAdvice
	✔️ Testes e simulação com Postman
	✔️ Uso de banco de dados H2 em memória

 
