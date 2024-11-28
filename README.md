                                      Projeto Aluno Online - Disciplina de Back-end com Professor Kelson Almeida


-  Criei o Banco de dados no DBeaver "alunos_online_em_sala" e dentro desse banco de dados criei
a tabela "aluno", "disciplina", "professor" e "matriculaaluno".
-  Implementei o Endpoint com Spring Boot com as dependências Spring web, Spring Data JPA, Swagger e Mysqldriver.
-  
- Criei a Entidade Aluno, o AlunoRepository, Aluno Service, AlunoController, Entidade Professor, ProfessorController, ProfessorService, Entidade Disciplinas, DisciplinasRepository, DisciplinasService.
- Utilizei as anotações @RestController @RequestMapping @PostMapping @Autowired @ResponseStatus
- Criei uma  requisição do tipo POST, GET, PUT e DEL e defini a URL como _.baseurl/Aluno e selecionei
o formato JSON no corpo da requisição.
- Criei uma requisição do tipo POST, PUT, GET, DELETE e defini a URL como  _.baseurl/professor e selecionei
o formato JSON no corpo da requisição.
- Criei uma requisição do tipo POST, PUT, GET, DELETE e defini a URL como  _.baseurl/disciplinas e selecionei
o formato JSON no corpo da requisição.
- Criei uma requisição do tipo POST, PUT, GET, DELETE e PTCH e defini a URL como  _.baseurl/matricula-aluno e selecionei
o formato JSON no corpo da requisição.
---
   Ou seja, criei um banco de dados e uma tabela para armazenar dados dos alunos, professor, disciplinas e matriculas pelo DBeaver.
  Utilizei o Spring Initializr para configurar um projeto Spring Boot com as dependências necessárias,
  criei uma entidade Aluno, um repositório, um serviço e um controlador para implementar um endpoint
  que adiciona um aluno à tabela. Utilizei o Insomnia para testar o endpoint e garantir que o aluno foi
  adicionado corretamente ao banco de dados.


![Captura de tela 2024-10-15 224519](https://github.com/user-attachments/assets/c298de28-256f-4981-b48c-0810dd30ad31)

![Captura de tela 2024-10-15 224838](https://github.com/user-attachments/assets/64143686-ffee-45a7-834e-e91696ba5990)
