# TechBuilding - Sistema de Gestão de Condomínios

## Descrição do Projeto

Este projeto é um sistema completo de gerenciamento de condomínios, desenvolvido por mim, **Matheus**, com foco em melhorar a comunicação, organização e gestão de informações relacionadas a moradores, apartamentos, blocos, áreas de lazer, síndicos e funcionários. O sistema incluirá diversas funcionalidades que trará ao usuário final muita clareza e facilidade de acesso à qualquer lugar ou pessoa do condomínio.

Durante minha jornada como desenvolvedor backend especializado em Java, a maior parte da minha experiência foi voltada para a criação de APIs. A criação deste projeto representa um grande salto para mim, pois engloba o ciclo completo de desenvolvimento de software: desde a fase de análise (incluindo a criação de diagramas UML e de classe), passando pelo design de banco de dados, até a implementação de funcionalidades com mapeamento JPA, criação de APIs RESTful e o frontend desenvolvido em React. Neste repositório, está disponível apenas a aplicação Java. Todo o restante (Diagramas, FrontEnd e "Banco de Dados") serão postados conforme o avanço do projeto, principalmente pois o próprio JPA irá gerar o banco no momento da rodagem.

### Status do Projeto

Em desenvolvimento 🚧. 

---

## Funcionalidades Atuais

- **Autenticação de Usuários**:
  - Tela de login para moradores e administradores.
  - Senhas armazenadas com criptografia segura (usando hashing com bcrypt).

- **Gerenciamento de Moradores**:
  - Cadastro de novos moradores e associados a apartamentos específicos.
  - Visualização de informações detalhadas de moradores.
  - Relacionamento muitos-para-muitos entre moradores e apartamentos.

- **Gerenciamento de Apartamentos e Blocos**:
  - Cadastro e gerenciamento de blocos e apartamentos.
  - Associação de moradores a apartamentos.

- **Sistema de Reclamações e Sugestões**:
  - Criação de reclamações e sugestões pelos moradores diretamente na plataforma.

- **Administração do Condomínio**:
  - Área reservada para o administrador do sistema gerenciar todas as funcionalidades do condomínio.

---

## Tecnologias Utilizadas

### Backend
- **Java 11**: Linguagem principal para o backend.
- **Spring Boot**: Framework utilizado para criar APIs RESTful, gerenciar dependências e criar serviços.
- **JPA (Java Persistence API)**: Mapeamento objeto-relacional (ORM) com anotações para gerenciamento do banco de dados.
- **MySQL**: Banco de dados relacional usado para armazenar todas as informações do sistema.
- **Spring Security**: Gerenciamento da segurança da aplicação e autenticação de usuários.
- **JWT (JSON Web Token)**: Utilizado para autenticação de usuários.

### Frontend
- **React.js**: Utilizado para a criação de interfaces de usuário interativas e dinâmicas.
- **Bootstrap**: Framework CSS para um design responsivo e moderno.
- **Axios**: Utilizado para fazer as requisições HTTP do frontend para o backend.

Mais atualizações em breve...

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
