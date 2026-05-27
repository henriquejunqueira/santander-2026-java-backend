# 📅 Cronograma Semanal de Estudos (30 Dias)

Este é o seu roteiro de estudos detalhado dia a dia. Marque o progresso à medida que avança na sua jornada backend.

---

## 🗺️ Índice de Atalhos
- [Semana 1: O Pensamento Backend e a Base do Node.js](#-semana-1-o-pensamento-backend-e-a-base-do-nodejs)
- [Semana 2: Construindo APIs com Express e Rotas](#-semana-2-construindo-apis-com-express-e-rotas)
- [Semana 3: Conectando com o Banco de Dados (Persistência)](#-semana-3-conectando-com-o-banco-de-dados-persistencia)
- [Semana 4: Avançando para o Nível Profissional (Segurança e Arquitetura)](#-semana-4-avancando-para-o-nivel-profissional-seguranca-e-arquitetura)

---

## 🛠️ Semana 1: O Pensamento Backend e a Base do Node.js
> **Objetivo:** Entender como o código roda no servidor e não no navegador.

- [ ] **Dia 1: Como o Node.js funciona (Parte 1)**
  - Foco: Event Loop, arquitetura Single Thread vs Multi-thread.
  - Atividade: Entender por que o Node.js é rápido e como ele lida com I/O assíncrono.
- [ ] **Dia 2: Como o Node.js funciona (Parte 2)**
  - Foco: Praticar conceitos assíncronos no Node (callbacks, Promises, async/await).
  - Atividade: Escrever pequenos scripts que demonstrem execução não-bloqueante.
- [ ] **Dia 3: Módulos do Node & Ecossistema NPM**
  - Foco: CommonJS (`require`/`module.exports`) vs ES Modules (`import`/`export`), e gerenciamento de dependências com NPM.
  - Atividade: Criar um projeto com `npm init` e experimentar importar/exportar módulos locais e externos.
- [ ] **Dia 4: Servidor HTTP Nativo (Parte 1)**
  - Foco: Entender a arquitetura de redes, protocolo HTTP e o módulo nativo `http`.
  - Atividade: Criar um servidor básico que responda com texto plano ao acessar `localhost:3000`.
- [ ] **Dia 5: Servidor HTTP Nativo (Parte 2)**
  - Foco: Entender os conceitos de Request (requisição) e Response (resposta), headers e roteamento básico nativo.
  - Atividade: Retornar diferentes formatos de resposta (como JSON) dependendo do endpoint acessado (ex: `/api/users`).
- [ ] **Dia 6: Manipulação de Arquivos (Parte 1)**
  - Foco: Módulo nativo `fs` (FileSystem). Métodos síncronos vs assíncronos.
  - Atividade: Criar um script que crie e leia um arquivo de texto de forma assíncrona (`fs/promises`).
- [ ] **Dia 7: Manipulação de Arquivos (Parte 2) & Revisão**
  - Foco: Consolidação de `fs` e revisão geral da semana.
  - Atividade: Construir uma mini-ferramenta de CLI que salve logs em um arquivo `.txt` local.

---

## 🔌 Semana 2: Construindo APIs com Express e Rotas
> **Objetivo:** Aqui você começa a construir o que o mercado realmente usa no dia a dia.

- [ ] **Dia 8: Introdução ao Express.js (Parte 1)**
  - Foco: Instalação, inicialização e rota base com Express.
  - Atividade: Migrar o seu servidor HTTP nativo para Express e sentir a diferença de simplicidade.
- [ ] **Dia 9: Introdução ao Express.js (Parte 2)**
  - Foco: Roteamento modular utilizando `express.Router`.
  - Atividade: Organizar rotas separadas por entidades em sua aplicação.
- [ ] **Dia 10: Métodos HTTP**
  - Foco: GET, POST, PUT e DELETE. Quando usar cada um na arquitetura REST.
  - Atividade: Criar uma lista em memória para simular inserção, leitura, atualização e remoção de registros.
- [ ] **Dia 11: HTTP Status Codes**
  - Foco: Entender semânticas (200, 201, 400, 404, 500) e como enviá-los nas rotas do Express.
  - Atividade: Tratar cenários (ex: retornar `404` se o recurso não existir e `400` se faltarem dados no envio).
- [ ] **Dia 12: Envio de Dados para a API**
  - Foco: Route Params (`/users/:id`), Query Params (`/users?role=admin`) e Request Body (`req.body`).
  - Atividade: Criar rotas que extraiam e manipulem dados usando cada uma dessas formas de recebimento.
- [ ] **Dia 13: Conceito de Middlewares (Parte 1)**
  - Foco: O que é um middleware, fluxo de execução (Req -> Middleware -> Res).
  - Atividade: Criar um middleware global que faça o log das requisições (método HTTP e URL acessada).
- [ ] **Dia 14: Conceito de Middlewares (Parte 2) & Revisão**
  - Foco: Middlewares de rota (validação de dados de entrada).
  - Atividade: Criar um middleware que verifique se os campos necessários existem no body da requisição antes de salvar.

---

## 🗄️ Semana 3: Conectando com o Banco de Dados (Persistência)
> **Objetivo:** Chega de salvar dados em variáveis na memória. Hora de usar um banco de dados real.

- [ ] **Dia 15: SQL vs NoSQL**
  - Foco: Diferença conceitual de bancos Relacionais (PostgreSQL/MySQL) e Não-Relacionais (MongoDB).
  - Atividade: Estudar a estrutura de tabelas, chaves primárias e estrangeiras. Focar em bancos SQL.
- [ ] **Dia 16: Introdução a ORMs e Query Builders**
  - Foco: O que é um ORM (Object-Relational Mapping). Conhecer o **Prisma ORM** ou **Knex.js**.
  - Atividade: Instalar e inicializar o Prisma ORM no seu projeto de estudos com banco local (como SQLite para fins de facilidade inicial ou PostgreSQL).
- [ ] **Dia 17: Modelagem de Dados**
  - Foco: Criação de esquemas (Schemas) e geração de Migrations.
  - Atividade: Criar o schema do banco de dados e aplicar a primeira migração (`prisma migrate dev`).
- [ ] **Dia 18: CRUD com ORM (Parte 1)**
  - Foco: Operações de Criação (Create) e Leitura (Read) no banco via API.
  - Atividade: Conectar as rotas POST e GET do Express para persistir e buscar dados diretamente no banco de dados.
- [ ] **Dia 19: CRUD com ORM (Parte 2)**
  - Foco: Operações de Atualização (Update) e Remoção (Delete) no banco.
  - Atividade: Conectar as rotas PUT e DELETE da API com os métodos correspondentes do Prisma ORM.
- [ ] **Dia 20: Relacionamentos entre Tabelas**
  - Foco: Relação 1:N (Um usuário tem muitos posts / uma lista de tarefas pertence a um usuário).
  - Atividade: Modelar um relacionamento no schema do ORM e buscar registros populados (ex: buscar usuário trazendo suas tarefas associadas).
- [ ] **Dia 21: Prática Geral & Consolidação**
  - Foco: Refatorar o código da API, garantindo boas práticas de isolamento do banco.
  - Atividade: Criar um script populador de dados fake (Seed) para testes rápidos no banco.

---

## 🔒 Semana 4: Avançando para o Nível Profissional (Segurança e Arquitetura)
> **Objetivo:** O diferencial que separa iniciantes de profissionais e protege sua aplicação.

- [ ] **Dia 22: Criptografia de Senhas (Parte 1)**
  - Foco: Por que nunca salvar senhas em texto puro? Conceito de Hashing e Salt.
  - Atividade: Instalar e configurar a biblioteca `bcrypt` no projeto.
- [ ] **Dia 23: Criptografia de Senhas (Parte 2)**
  - Foco: Fluxo de registro de usuário com hash de senha e fluxo de validação (login).
  - Atividade: Desenvolver um método que compare de forma segura a senha digitada com a criptografada no banco.
- [ ] **Dia 24: Autenticação com JWT (Parte 1)**
  - Foco: Conceito de tokens, cabeçalho, payload e assinatura de um JSON Web Token.
  - Atividade: Criar uma rota de login que assine e devolva um JWT válido após autenticar usuário e senha.
- [ ] **Dia 25: Autenticação com JWT (Parte 2)**
  - Foco: Proteção de rotas da API.
  - Atividade: Escrever um middleware `ensureAuthenticated` que leia o token do header `Authorization` e libere/bloqueie o acesso à rota.
- [ ] **Dia 26: Tratamento de Erros Global**
  - Foco: Captura centralizada de exceções (`try/catch` em middlewares) para que a API nunca pare de responder (crash).
  - Atividade: Configurar um middleware customizado de erro no Express que capture exceções e retorne respostas limpas (ex: `500 Internal Server Error` sem expor detalhes sensíveis).
- [ ] **Dia 27: Variáveis de Ambiente**
  - Foco: Uso da biblioteca `dotenv` para separar segredos (chaves JWT, credenciais de banco) do código fonte.
  - Atividade: Criar um arquivo `.env` e `.env.example`, migrando toda configuração sensível para ele.
- [ ] **Dia 28: Projeto Final (Dia 1) - Planejamento**
  - Foco: Integração completa em um único app de API (ex: Gerenciador de Tarefas com autenticação).
  - Atividade: Modelar o banco, rotas necessárias e criar o esqueleto do projeto final.
- [ ] **Dia 29: Projeto Final (Dia 2) - Codificação**
  - Foco: Implementar as regras de negócio, middlewares, validações e autenticação.
  - Atividade: Concluir o desenvolvimento do CRUD completo e seguro do projeto.
- [ ] **Dia 30: Publicação & Conclusão**
  - Foco: Organização do repositório e publicação.
  - Atividade: Escrever um `README.md` excelente para o projeto final, criar um repositório limpo no GitHub e comemorar a conclusão da sua transição backend! 🎉

---

### 📝 Dicas para se manter firme:
1. **Não pule etapas**: A segurança da Semana 4 depende de você entender as rotas da Semana 2 e o banco da Semana 3.
2. **Faça commits frequentes**: Pratique criar commits claros (ex: `feat: add jwt auth middleware`) para construir um histórico profissional no seu GitHub.
3. **Use a pasta `anotacoes`**: Use-a ativamente para registrar as dores e aprendizados diários.
