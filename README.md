                                      Exercicio 1


-  Criei o Banco de dados no DBeaver "alunos_online_em_sala" e dentro desse banco de dados criei
a tabela "aluno".
-  Implementei o Endpoint com Spring Boot com as dependências Spring web, Spring Data JPA e Mysqldriver
- Criei a Entidade Aluno, o AlunoRepository, Aluno Service, AlunoController, Entidade Professor, ProfessorController, ProfessorService, Entidade Disciplinas, DisciplinasRepository, DisciplinasService.
- Utilizei as anotações @RestController @RequestMapping @PostMapping @Autowired @ResponseStatus
- Criei uma nova requisição do tipo POST e defini a URL como http://localhost:8080/alunos e selecionei
o formato JSON no corpo da requisição.
- Criei uma nova requisição do tipo POST, PUT, GET, DELETE e defini a URL como http://localhost:8080/professor e selecionei
o formato JSON no corpo da requisição.
- Criei uma nova requisição do tipo POST, PUT, GET, DELETE e defini a URL como http://localhost:8080/disciplinas e selecionei
o formato JSON no corpo da requisição.

---
   Ou seja, criei um banco de dados e uma tabela para armazenar dados dos alunos, professor e disciplinas pelo DBeaver.
  Utilizei o Spring Initializr para configurar um projeto Spring Boot com as dependências necessárias,
  criei uma entidade Aluno, um repositório, um serviço e um controlador para implementar um endpoint
  que adiciona um aluno à tabela. Utilizei o Insomnia para testar o endpoint e garantir que o aluno foi
  adicionado corretamente ao banco de dados.


![Captura de tela 2024-10-15 224519](https://github.com/user-attachments/assets/c298de28-256f-4981-b48c-0810dd30ad31)

![Captura de tela 2024-10-15 224838](https://github.com/user-attachments/assets/64143686-ffee-45a7-834e-e91696ba5990)
