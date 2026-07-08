# Sobre o projeto
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/CarlosAlbuqM/springboot-jpa-webservice/blob/main/LICENSE) 

API REST desenvolvida em Java com Spring Boot para estudo de **web services**, modelagem de domínio, persistência com JPA/Hibernate e operações CRUD.

- Criar um projeto Spring Boot Java.
- Implementar modelo de domínio.
- Estruturar camadas lógicas: `resource`, `service` e `repository`.
- Configurar banco de dados de teste com H2.
- Povoar o banco de dados.
- Implementar operações CRUD: Create, Retrieve, Update e Delete.
- Realizar tratamento de exceções.

## Modelo de domínio

O projeto utiliza um modelo de domínio com as entidades **User**, **Order**, **Product**, **Category**, **OrderItem** e **Payment**, além do enum **OrderStatus** para controlar o estado dos pedidos. O diagrama também mostra os relacionamentos entre usuários, pedidos, produtos, categorias, itens do pedido e pagamento.

## Modelo Conceitual


## Tecnologias utilizadas

- ![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white)
- ![Spring Boot](https://img.shields.io/badge/Spring_Boot-Framework-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
- ![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
- ![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
- ![H2](https://img.shields.io/badge/H2-Database-003B57?style=for-the-badge)
- ![Postman](https://img.shields.io/badge/Postman-API_Testing-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## Arquitetura

O projeto foi organizado em camadas para separar responsabilidades e melhorar a manutenção do código. A estrutura usada no curso é baseada nas camadas `resource`, `service` e `repository`. 

- **Resource**: expõe os endpoints da API.
- **Service**: contém a lógica de negócio.
- **Repository**: faz o acesso aos dados com JPA.
- **Entities**: representa o modelo de domínio da aplicação.

## Funcionalidades

- Cadastro de entidades do sistema.
- Busca por id e listagem de registros.
- Atualização de dados.
- Remoção de registros.
- Carga inicial de dados no banco.
- Tratamento de exceções da API.

## Como executar o projeto

### Pré-requisitos

- Java instalado.
- Maven configurado.
- IDE Java, como IntelliJ IDEA, Eclipse ou STS.

### Passos

1. Clone este repositório.
2. Abra o projeto em sua IDE.
3. Aguarde o Maven baixar as dependências.
4. Execute a classe principal do projeto Spring Boot.
5. Teste os endpoints no Postman.

## Banco de dados de teste

O projeto utiliza H2 como banco de dados de teste, o que facilita a execução local sem depender de um banco externo. Essa escolha faz parte dos objetivos do projeto e também aparece nas tecnologias usadas.

## Aprendizados

Este projeto permitiu praticar conceitos importantes do ecossistema Spring:

- Mapeamento de entidades com JPA.
- Relacionamentos entre entidades.
- Uso de enums no domínio.
- Serialização e desserialização JSON.
- Organização em camadas.
- CRUD completo.
- Tratamento de exceções.

## Status do projeto

Projeto concluído para fins de estudo.

## Autor
Carlos Albuquerque
