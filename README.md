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

**🧾 Configuração do Banco de Dados**
No arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

**💡 Certifique-se de que o banco taskmanager foi criado no seu MySQL.**

---

**▶️ Como Executar**

Clone o repositório:

git clone https://github.com/seu-usuario/TaskManagerFaculdade.git
Importe o projeto em sua IDE (IntelliJ, VSCode, Eclipse etc.)

Configure o banco de dados no application.properties.

Execute a aplicação a partir da classe TaskManagerFaculdadeApplication.

---

🧪 Testes com Postman
Você pode testar todos os endpoints utilizando o Postman.

[API REST Trabalho Faculdade.postman_collection.json](https://github.com/user-attachments/files/20445197/API.REST.Trabalho.Faculdade.postman_collection.json)
{
	"info": {
		"_postman_id": "f3a79144-a46c-4c35-aeb5-9e2198681b38",
		"name": "API REST Trabalho Faculdade",
		"schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json",
		"_exporter_id": "32815818"
	},
	"item": [
		{
			"name": "Cadastro de Tarefa",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nome\": \"Cadastrar\",\r\n    \"dataEntrega\": \"2025-05-10\",\r\n    \"responsavel\": \"Maria\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:8080/tasks"
			},
			"response": []
		},
		{
			"name": "Atualizar uma tarefa",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"nome\": \"Atualizando\",\r\n    \"dataEntrega\": \"2025-12-12\",\r\n    \"responsavel\": \"Fabricio - 4462893\"\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:8080/tasks/1"
			},
			"response": []
		},
		{
			"name": "Deletar uma tarefa",
			"request": {
				"method": "DELETE",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:8080/tasks/1"
			},
			"response": []
		},
		{
			"name": "Buscar todas as Tarefas",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:8080/tasks"
			},
			"response": []
		},
		{
			"name": "Buscar tarefa por ID",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": "http://localhost:8080/tasks/1"
			},
			"response": []
		}
	]
}
