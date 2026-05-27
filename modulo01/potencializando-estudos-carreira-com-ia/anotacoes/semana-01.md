# 📝 Anotações de Estudo: Semana 01

Use este documento como um diário de aprendizado para registrar resumos, códigos criados, problemas resolvidos e insights ao longo da semana.

---

## 🎯 Objetivo da Semana
> *Escreva aqui o principal objetivo desta semana. Ex: Entender como o Node.js roda no servidor de forma assíncrona e manipular arquivos localmente.*

---

## 📅 Resumo Diário

### 🔹 Dia 1: [Tema do Dia]
- **O que aprendi hoje:**
  - *Escreva os principais conceitos teóricos ou práticos explicados nos materiais.*
  - *Ex: Entendi que o Event Loop delega operações pesadas para o sistema operacional, mantendo a thread única livre.*
- **Dificuldades/Dúvidas:**
  - *Teve algo confuso? Anote aqui para pesquisar depois ou tirar dúvidas.*
  - *Ex: Como o Node sabe quando um arquivo terminou de ler se ele executa de forma assíncrona?*

---

### 🔹 Dia 2: [Tema do Dia]
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

### 🔹 Dia 3: [Tema do Dia]
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

### 🔹 Dia 4: [Tema do Dia]
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

### 🔹 Dia 5: [Tema do Dia]
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

### 🔹 Dia 6: [Tema do Dia]
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

### 🔹 Dia 7: [Tema do Dia] & Revisão
- **O que aprendi hoje:**
  - ...
- **Dificuldades/Dúvidas:**
  - ...

---

## 💻 Laboratório Prático (Snippets & Experimentos)

Espaço para você colocar códigos que escreveu durante os exercícios diários. Pratique o uso de blocos de código markdown.

### Exemplo de Servidor HTTP Nativo (Dia 4/5)
```javascript
// Escreva ou cole o seu código aqui!
const http = require('http');

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'application/json' });
  res.end(JSON.stringify({ message: "Olá do Backend nativo!" }));
});

server.listen(3000, () => {
  console.log("Servidor rodando em http://localhost:3000");
});
```

---

## 💡 Insights & Lições Aprendidas
- **Descoberta da Semana:** *(Escreva algo que te deu um estalo de mente ("Aha! moment"))*
- **Frontend vs Backend:** *(Como o conceito que você estudou se conecta ou se diferencia do que você já fazia no Frontend?)*
- **Minhas Palavras-Chave da Semana:**
  - `Assíncrono`
  - `Non-blocking I/O`
  - `Event Loop`

---

## 🏁 Autoavaliação da Semana
Avalie de 1 a 5 o quanto você se sente confiante nos temas estudados esta semana:

- [ ] **Funcionamento do Node (Thread/Event Loop):** ⭐⭐⭐⭐⭐
- [ ] **Sistemas de Módulos (CJS vs ESM):** ⭐⭐⭐⭐⭐
- [ ] **HTTP Nativo (Request/Response):** ⭐⭐⭐⭐⭐
- [ ] **Módulo FileSystem (fs):** ⭐⭐⭐⭐⭐

---

*💡 **Dica:** Duplique este arquivo no final da semana e renomeie-o para `semana-02.md` para começar o próximo período!*
