# 📋 TaskManagerFaculdade

API RESTful para gerenciamento de tarefas desenvolvida com **Java**, **Spring Boot**, **Spring Data JPA** e **MySQL**, como parte de um trabalho prático da disciplina de **Desenvolvimento Web Back-end**.

## 🚀 Funcionalidades

A API permite:

- ✅ Criar uma nova tarefa
- 📄 Listar todas as tarefas
- 🔍 Consultar uma tarefa específica por ID
- ✏️ Atualizar os dados de uma tarefa existente
- ❌ Remover uma tarefa

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Postman (para testes e documentação)
- Maven

---

📌 Listar Todas as Tarefas
GET /tasks

📌 Buscar Tarefa por ID
GET /tasks/{id}

📌 Atualizar Tarefa
PUT /tasks/{id}

📌 Deletar Tarefa
DELETE /tasks/{id}

---

## 🧾 Configuração do Banco de Dados
No arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

## 💡 Certifique-se de que o banco taskmanager foi criado no seu MySQL.

---

## ▶️ Como Executar.

Clone o repositório:

git clone https://github.com/seu-usuario/TaskManagerFaculdade.git
Importe o projeto em sua IDE (IntelliJ, VSCode, Eclipse etc.)

Configure o banco de dados no application.properties.

Execute a aplicação a partir da classe TaskManagerFaculdadeApplication.

---

## 🧪 Testes com Postman

[API REST Trabalho Faculdade.postman_collection.json](https://github.com/user-attachments/files/20445197/API.REST.Trabalho.Faculdade.postman_collection.json)
