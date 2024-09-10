                                      Exercicio 1


-  Criei o Banco de dados no DBeaver "alunos_online_em_sala" e dentro desse banco de dados criei
a tabela "aluno".
-  Implementei o Endpoint com Spring Boot com as dependências Spring web, Spring Data JPA e Mysqldriver
- Criei a Entidade Aluno, o AlunoRepository, Aluno Service, AlunoController.
- Utilizei as anotações @RestController @RequestMapping @PostMapping @Autowired @ResponseStatus
- Criei uma nova requisição do tipo POST e defini a URL como http://localhost:8080/alunos e selecionei
o formato JSON no corpo da requisição.

---
   Ou seja, criei um banco de dados e uma tabela para armazenar dados dos alunos pelo DBeaver.
  Utilizei o Spring Initializr para configurar um projeto Spring Boot com as dependências necessárias,
  criei uma entidade Aluno, um repositório, um serviço e um controlador para implementar um endpoint
  que adiciona um aluno à tabela. Utilizei o Insomnia para testar o endpoint e garantir que o aluno foi
  adicionado corretamente ao banco de dados.

![dbeaver](https://github.com/user-attachments/assets/4a98e8d0-8ab3-40ab-bc60-aa57a6ddf31b)
![insomnia](https://github.com/user-attachments/assets/04c0862d-cb72-4e36-8e3c-9a6a8733cab9)
