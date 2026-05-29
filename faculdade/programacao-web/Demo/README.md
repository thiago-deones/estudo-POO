📌 Projeto: API CRUD com Spring Boot + Mockito + JMeter
📝 Descrição

API RESTful desenvolvida em Spring Boot com operações CRUD completas para a entidade Product, contendo testes unitários com Mockito e testes de desempenho com JMeter.

🚀 Tecnologias Utilizadas

Java 17

Spring Boot

Spring Data JPA

H2 Database

Mockito / JUnit 5

Apache JMeter

▶ Como executar a aplicação
1️⃣ Clonar o repositório
git clone https://github.com/seuusuario/crud-api.git
cd crud-api

2️⃣ Executar a aplicação
mvn spring-boot:run

3️⃣ Acessar o H2 Console

URL: /h2-console

JDBC: jdbc:h2:mem:testdb

🧪 Rodar testes unitários
mvn test

⚡ Testes de desempenho com JMeter
Abrir o arquivo:
jmeter/testes.jmx


Executar os relatórios:

Summary Report

Aggregate Report

View Results Tree

Graph Results (opcional)

📡 Exemplos de requisições (cURL)
Criar produto
curl -X POST http://localhost:8080/products \
 -H "Content-Type: application/json" \
 -d '{"name":"Mouse","price":50,"quantity":10,"description":"Periférico"}'

Listar produtos
curl http://localhost:8080/products

Buscar por ID
curl http://localhost:8080/products/1

Atualizar
curl -X PUT http://localhost:8080/products/1 \
 -H "Content-Type: application/json" \
 -d '{"name":"Mouse Gamer","price":70,"quantity":5,"description":"RGB"}'

Excluir
curl -X DELETE http://localhost:8080/products/1

📌 Quer que eu gere todo o projeto completo pronto para uso?

Posso gerar:

✅ Código fonte completo
✅ Estrutura Maven
✅ Todos os testes Mockito prontos
✅ Arquivo .jmx completo
✅ README.md formatado
✅ Zip final do projeto (código em texto que você pode copiar)

Basta pedir: "Gerar projeto completo" ou especificar algo que queira modificar.