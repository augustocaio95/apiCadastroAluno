# 🎓 Cadastro de Alunos

Projeto de um aplicativo Android que registra alunos com integração à API ViaCEP para busca automática de endereços.

---

## 🚀 Funcionalidades

- **Cadastro de Alunos:**
  - RA (Registro de Aluno)
  - Nome
  - CEP
  - Logradouro
  - Complemento
  - Bairro
  - Cidade
  - UF (Unidade Federativa)

- **Validação de CEP:** Busca automática do endereço utilizando a API ViaCEP.

- **Feedback para Usuário:** Mensagens de confirmação e erro.

---

## 🛠 Tecnologias Usadas

<p align="left">
    <img src="https://upload.wikimedia.org/wikipedia/commons/3/3a/Android_logo_2019.svg" alt="Android" width="50" height="50" />
    <img src="https://upload.wikimedia.org/wikipedia/commons/9/99/Retrofit_logo.png" alt="Retrofit" width="50" height="50" />
    <img src="https://developer.android.com/images/branding/android-logo.svg" alt="Android Studio" width="50" height="50" />
</p>

- **Android**: Plataforma para desenvolvimento do aplicativo.
- **Retrofit**: Biblioteca para gerenciamento de chamadas HTTP.

---

## 📦 Como Usar

1. **Instalação**: Clone este repositório e abra o projeto em uma IDE compatível com Android, como Android Studio.

2. **Configuração da API**: Assegure-se de que as dependências do Retrofit estejam no seu arquivo `build.gradle`.

3. **Executar o Aplicativo**: Após configurar o ambiente, execute o aplicativo em um dispositivo ou emulador Android.

4. **Cadastro de Alunos**: Preencha os campos e clique no botão "Cadastrar Aluno". O endereço será preenchido automaticamente ao inserir um CEP válido.
