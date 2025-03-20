<div align='center', id='topo'/>

# Projeto Foodly
## Plataforma de Delivery de Alimentos

![Banner do Projeto Foodly](#)

</div>

O projeto **Foodly** é uma aplicação backend desenvolvida em Java com o Spring Framework, integrada a um banco de dados SQL. Seu principal objetivo é oferecer uma API CRUD eficiente para a gestão de produtos e categorias no setor de delivery, garantindo um fluxo de informações organizado, estruturado e eficiente.

******

<div align='center'/>

  ![Java](https://a11ybadges.com/badge?logo=java)
  ![Spring](https://a11ybadges.com/badge?logo=spring)
  ![MySQL](https://a11ybadges.com/badge?logo=mysql)
  ![Insomnia](https://a11ybadges.com/badge?logo=insomnia)

</div>

******

## 📖 Tabela de Conteúdo
- [💡 Conhecimentos Mobilizados](#conhecimentosMobilizados)
- [🏗️ Estrutura do Projeto](#estruturaDoProjeto)
- [📂 Código Desenvolvido](#codigoDesenvolvido)
- [🛠️ Tecnologias Utilizadas](#tecnologiasUtilizadas)
- [🤝 Desenvolvedoras do Projeto](#devas)

---

<div id='conhecimentosMobilizados'/> 

## 💡 Conhecimentos Mobilizados

- **Spring Framework:** Uso do Spring Boot para a construção de APIs RESTful, seguindo boas práticas de desenvolvimento.
- **JPA e Hibernate:** Mapeamento objeto-relacional para integração com o banco de dados MySQL, garantindo uma persistência eficiente.
- **Padrões de Projeto:** Implementação da arquitetura em camadas (Model, Repository, Controller) para uma melhor organização do código.
- **Banco de Dados:** Configuração e gerenciamento do banco de dados MySQL, utilizando Spring Data JPA para persistência dos dados.
- **RESTful API:** Desenvolvimento de endpoints para manipulação das entidades do sistema, permitindo operações CRUD para usuários, categorias e produtos.
- **Swagger:** Documentação da API utilizando Swagger, permitindo testes interativos e facilitando a comunicação entre desenvolvedores e clientes.
- **Autenticação e Segurança:** Implementação de autenticação e proteção de dados dos usuários por meio de hashing de senhas.
- **Testes de API:** Uso do Insomnia para validar os endpoints e garantir o correto funcionamento da aplicação.
- **Regra de Negócio:** Implementação da funcionalidade de aplicação automática de desconto para compras acima de R$100,00, com valores configuráveis conforme necessidade da empresa usuária.
- **Deploy:** Disponibilização da aplicação em ambiente de produção utilizando a plataforma Render, garantindo acessibilidade e funcionamento contínuo.

<div id='estruturaDoProjeto'/>

## 🏗️ Estrutura do Projeto

```
foodly/
├── controller/
│   ├── UsuarioController.java
│   ├── CategoriaController.java
│   └── ProdutoController.java
├── model/
│   ├── Usuario.java
│   ├── Categoria.java
│   └── Produto.java
├── repository/
│   ├── UsuarioRepository.java
│   ├── CategoriaRepository.java
│   └── ProdutoRepository.java
├── service/
│   ├── UsuarioService.java
│   ├── CategoriaService.java
│   └── ProdutoService.java
├── config/
│   ├── SwaggerConfig.java
│   ├── SecurityConfig.java
│   └── CorsConfig.java
├── resources/
│   ├── application.properties
│   └── data.sql
├── FoodlyApplication.java
```

<div id='codigoDesenvolvido'/> 

## 📂 Código Desenvolvido

Para melhor visualização, aqui estão os principais componentes do sistema:

- `UsuarioController` / `CategoriaController` / `ProdutoController`: Controladores responsáveis pela manipulação das respectivas entidades, implementando métodos como `getAll()`, `getById()`, `create()`, `update()` e `delete()`, garantindo operações CRUD eficientes.
- `Usuario` / `Categoria` / `Produto`: Modelos que representam as entidades do sistema, definindo atributos essenciais para a estrutura e persistência dos dados.
- `UsuarioRepository` / `CategoriaRepository` / `ProdutoRepository`: Interfaces que estendem `JpaRepository`, permitindo a comunicação eficiente com o banco de dados MySQL e simplificando as operações de persistência.
- `UsuarioService` / `ProdutoService`: Camada de serviço que contém a lógica de negócio, garantindo uma melhor separação de responsabilidades e a aplicação de boas práticas no desenvolvimento.
- `application.properties`: Arquivo de configuração que define a conexão com o banco de dados, especificando credenciais, configurações do Hibernate e propriedades do Spring Boot.
- `FoodlyApplication`: Classe principal que inicializa a aplicação Spring Boot, garantindo a execução da API e a configuração dos componentes do sistema.

---

<div id='tecnologiasUtilizadas'/> 

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java  
- **Framework**: Spring Boot  
- **Banco de Dados**: MySQL  
- **JPA/Hibernate**: Para persistência de dados e mapeamento objeto-relacional  
- **IDE utilizada**: Spring Tools Suite (STS)  
- **Ferramenta de Testes**: Insomnia, utilizada para testar os endpoints da API  
- **Documentação da API**: Swagger, para facilitar a interação com os endpoints  
- **Gerenciamento de Dependências**: Maven, para controle de bibliotecas e plugins do projeto  
- **Segurança**: Spring Security, para controle de autenticação e autorização  
- **Deploy**: Plataforma Render, garantindo a disponibilização do backend em ambiente de produção  

---

<div id='devas'/> 
  
## 🤝 Desenvolvedoras do Projeto

Este projeto foi possível graças às contribuições das seguintes desenvolvedoras:

<div align="center">
  <table>
    <tr>
      <td align="center">
        <a href="https://www.linkedin.com/in/larissa-mata-a32a5a104/" title="Linkedin da Larissa Mata">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8ZGW05SThzA/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1698075416577?e=1747267200&v=beta&t=MZQra9MZhtWWZqrZx6Re7loE6-KZIhHj9kj5Rbxe_Ds" width="100px;" alt="Foto da Larissa Mata"/><br>
          <sub>
            <b>Larissa Mata</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://www.linkedin.com/in/elianempontes/" title="Linkedin da Eliane Medeiros">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQGppzwuto4Skw/profile-displayphoto-shrink_400_400/B4DZOzMU5sHUAg-/0/1733878173890?e=1747267200&v=beta&t=dYk2XBvZ6Be-J99J4sp9kljf2TF3ZZ5YZ8lEu72U7oA" width="100px;" alt="Foto da Eliane Medeiros"/><br>
          <sub>
            <b>Eliane Medeiros</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/willaevangelista" title="GitHub da Willa Evangelista">
          <img src="https://avatars.githubusercontent.com/u/84138876?v=4" width="100px;" alt="Foto da Willa Evangelista"/><br>
          <sub>
            <b>Willa Evangelista</b>
          </sub>
        </a>
      </td>
    </tr>
  </table>
  <table>
    <tr>
      <td align="center">
        <a href="https://www.linkedin.com/in/larissa-alves-s/" title="Linkedin da Larissa Alves">
          <img src="https://media.licdn.com/dms/image/v2/D4D03AQFZaBaC-aUVow/profile-displayphoto-shrink_400_400/B4DZSqh72uHYAg-/0/1738027811288?e=1747267200&v=beta&t=6DM_y3QMq47Kb_qSkOcxjFlPsaBcqwZ_0JxLYxL1Bm8" width="100px;" alt="Foto da Larissa Alves"/><br>
          <sub>
            <b>Larissa Alves</b>
          </sub>
        </a>
      </td>
      <td align="center">
        <a href="https://github.com/MariPimentelCarmo" title="GitHub da Mariana Carmo">
          <img src="https://avatars.githubusercontent.com/u/99743029?v=4" width="100px;" alt="Foto da Mariana Carmo"/><br>
          <sub>
            <b>Mariana Carmo</b>
          </sub>
        </a>
    </tr>
  </table>
</div>

<div align='right'>
  
[Voltar ao topo ⬆️](#topo)
