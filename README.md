# Cadastro de Alunos

Este projeto acadêmico é um aplicativo Android que permite o cadastro de alunos, utilizando a API ViaCEP para buscar endereços a partir do CEP fornecido.

## Funcionalidades

- Cadastro de Alunos com os seguintes dados:
  - RA (Registro de Aluno)
  - Nome
  - CEP
  - Logradouro
  - Complemento
  - Bairro
  - Cidade
  - UF (Unidade Federativa)

- Validação de CEP e busca automática do endereço através do serviço ViaCEP.

- Exibição de mensagens de feedback para o usuário ao cadastrar um aluno ou ao buscar um endereço.

## Estrutura da Classe MainActivity

A classe `MainActivity` possui as seguintes funcionalidades principais:

- **Inicialização da Interface**: Configura os componentes da interface gráfica no método `onCreate`.

- **Busca de Endereço pelo CEP**: Um `TextWatcher` que observa mudanças no campo CEP e faz uma chamada à API ViaCEP para preencher os campos de endereço automaticamente, se o CEP tiver 8 dígitos.

- **Cadastro de Aluno**: Um método que cria um objeto `Aluno` com os dados fornecidos e o envia ao serviço correspondente. A interface é limpa após o sucesso do cadastro.

- **Gerenciamento de Erros**: Exibe mensagens Toast em caso de falha na busca do endereço ou no cadastro do aluno.

## Como Usar

1. **Instalação**: Clone este repositório e abra o projeto em um IDE compatível com Android, como Android Studio.

2. **Configuração da API**: Certifique-se de que as dependências do Retrofit estejam configuradas no seu arquivo `build.gradle`.

3. **Executar o Aplicativo**: Após configurar o ambiente, execute o aplicativo em um dispositivo ou emulador Android.

4. **Cadastro de Alunos**: Preencha os campos e clique no botão "Cadastrar Aluno". O endereço será preenchido automaticamente ao digitar um CEP válido.
