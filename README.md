# Finance Manager
Aplicativo para gestão pessoal de transações financeiras

# 📝 Descrição
O Finance manager existe para simplificar a gestão pessoal de finanças.

# ✅ Principais Funcionalidades
• Cadastro de usuários <br>
• Login / Autenticação de usuários <br>
• CRUD de transações financeiras (Débitos / Créditos) <br>
• Cadastro de categorias personalizáveis <br>
• Documentação em Swagger <br>

# ⚙️ Tecnologias Usadas
<table>
  <thead>
    <tr>
      <td><h3>Tecnologia</h3></td>
      <td><h3>Descrição</h3></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Java 21</td>
      <td>Linguagem de programação Java na versão 21</td>
    </tr>
    <tr>
      <td>Maven</td>
      <td>Gerenciador de dependências, responsável por garantir que todas as dependências do projeto estão instaladas e prontas para serem usadas</td>
    </tr>
    <tr>
      <td>Spring Boot 3.5.3</td>
      <td>Framework para criação de aplicações Java</td>
    </tr>
    <tr>
      <td>Spring Boot Starter Validation</td>
      <td>Valida dados a partir de anotações, garantindo que obrigatoriedades de dados sejam cumpridas.</td>
    </tr>
    <tr>
      <td>Banco de Dados: H2 (Banco de dados em memória)</td>
      <td>Banco de dados volátil (os dados são deletados quando a aplicação é parada), utilizado para testes e prototipagem.</td>
    </tr>
    <tr>
      <td>Hibernate ORM (JPA)</td>
      <td>Realiza o mapeamento objeto-relacional (ORM), permitindo o code-first e manipulação de dados do banco de dados diretamente através das entidades.</td>
    </tr>
    <tr>
      <td>Lombok</td>
      <td>Reduz os códigos repetitivos (boilerplate code) de criação de Getters, Setters e Constructors</td>
    </tr>
  </tbody>
</table>

# 🏛️ Arquitetura / Patterns
<table>
  <thead>
    <tr>
      <td><h3>Pattern</h3></td>
      <td><h3>Descrição</h3></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Arquitetura em Camadas</td>
      <td>Utilizada separação em camadas para garantir o SRP do SOLID, garantindo que cada camada tenha suas próprias responsabilidades e seja especializada naquilo que faz</td>
    </tr>
    <tr>
      <td>DTOs</td>
      <td>Utilizados DTOs (Data Transfer Object) para garantir que tanto o envio quanto o recebimento de dados esteja desacoplado da entidade respectiva, além de garantir a segurança de dados sigilosos também reduz o envio / recebimento de dados desnecessários em certas requisições</td>
    </tr>
    <tr>
      <td>Service Layer</td>
      <td>Camada intermediária entre os Controllers e Repositories, onde fica a lógica de negócio</td>
    </tr>
    <tr>
      <td>Repository</td>
      <td>Repositories especializados em acesso aos dados do banco de dados, implementando o JPA (Hibernate)</td>
    </tr>
    <tr>
      <td>Exception Handling</td>
      <td>Centralização das tratativas de exceptions do sistema, através de um @ControllerAdvice</td>
    </tr>
  </tbody>
</table>
