# API REST com Spring Boot e JPA / Hibernate

Este projeto é uma **API RESTful** desenvolvida em **Java com Spring Boot**, utilizando **JPA/Hibernate** para persistência de dados.  
O foco do projeto é aplicar boas práticas de desenvolvimento backend, arquitetura em camadas e operações CRUD com banco de dados relacional.

## 🎯 Objetivo
Consolidar conhecimentos em desenvolvimento backend com Spring Boot, modelagem de domínio, persistência de dados com JPA e construção de serviços REST.

## 🛠️ Tecnologias Utilizadas
- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Maven  
- API REST  
- JSON  
- H2 Database (ambiente de teste)  

## 🧱 Arquitetura
O projeto segue o padrão de **arquitetura em camadas**, garantindo melhor organização e manutenção do código:

- **Resource (Controller)**: exposição dos endpoints REST  
- **Service**: regras de negócio  
- **Repository**: acesso ao banco de dados com JPA  
- **Entity**: modelo de domínio  

## 📦 Modelo de Domínio
Principais entidades do sistema:
- User  
- Order  
- Product  
- Category  
- OrderItem  
- Payment  

Relacionamentos implementados:
- One-to-One  
- One-to-Many  
- Many-to-Many (com JoinTable)  
- Chave composta (`OrderItemPK`)  
- Enumerações para status  
- Datas no padrão ISO 8601 usando `Instant`

## 🔁 Funcionalidades
- CRUD completo de usuários
- Associação entre pedidos, produtos e categorias
- Cálculo de subtotal e total de pedidos
- Seed automático do banco de dados (Na classe main da aplicação)
- Uso correto dos verbos HTTP (GET, POST, PUT, DELETE)

## ⚙️ Configuração de Perfis
- **test**: banco de dados H2 em memória, ideal para testes rápidos  

O uso de **Spring Profiles** permite alternar facilmente entre os ambientes.

## 🚨 Tratamento de Exceções
- Exceções personalizadas para recursos não encontrados e erros de banco
- Handler global para retorno padronizado de erros
- Uso adequado de códigos HTTP (400, 404, 500)

## ▶️ Como Executar
Pré-requisitos:
- Java instalado
- Maven instalado

Execução:
bash mvn spring-boot:run

A aplicação estará disponível em:
http://localhost:8080


