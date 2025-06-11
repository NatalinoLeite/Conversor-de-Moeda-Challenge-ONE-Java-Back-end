# Conversor de Moedas - Challenge Back-End Alura

![Status](https://img.shields.io/badge/status-concluído-green)
![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)

<p align="center">
  <img src="https://github.com/NatalinoLeite/Conversor-de-Moeda-Challenge-ONE-Java-Back-end/blob/main/src/Captura%20de%20tela%202025-06-10%20232648.png" width="600" />
</p>

## :scroll: Sobre o Projeto

Este é um conversor de moedas interativo que opera via console, desenvolvido como parte do **Challenge de Back-End da Alura em parceria com a Oracle (ONE)**. O principal objetivo do projeto é colocar em prática os fundamentos da linguagem Java, incluindo o consumo de APIs externas, a manipulação de dados em formato JSON e a interação com o usuário através do terminal.

A aplicação consome a API **ExchangeRate-API** para obter cotações de câmbio em tempo real, permitindo que o usuário escolha entre diferentes pares de moedas e informe um valor para realizar a conversão de forma rápida e precisa.

## :sparkles: Funcionalidades

-   **Conversão em tempo real:** Utiliza taxas de câmbio atualizadas fornecidas por uma API externa.
-   **Menu interativo:** Interface de linha de comando (CLI) simples e intuitiva para o usuário.
-   **Suporte para múltiplos pares de moedas:** Inclui as principais conversões envolvendo Dólar (USD), Real Brasileiro (BRL), Peso Argentino (ARS), Iene Japonês (JPY), entre outras.
-   **Extensível:** O código é estruturado para facilitar a adição de novas moedas e funcionalidades.

## :rocket: Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias:

-   **Java 17+:** Versão LTS da linguagem para uma base sólida e moderna.
-   **Maven:** Ferramenta para gerenciamento de dependências do projeto.
-   **GSON:** Biblioteca do Google para desserializar (parse) a resposta JSON da API em objetos Java.
-   **ExchangeRate-API:** API externa para fornecimento das taxas de câmbio.
-   **IntelliJ IDEA:** IDE utilizada para o desenvolvimento.

## :computer: Como Executar o Projeto

Para executar este projeto localmente, siga os passos abaixo.

### Pré-requisitos

-   Ter o **Java Development Kit (JDK)** na versão 17 ou superior instalado.
-   Ter o **Apache Maven** instalado e configurado nas variáveis de ambiente.
-   Uma chave de API da [ExchangeRate-API](https://www.exchangerate-api.com/).

### Passos

1.  **Obtenha sua Chave da API:**
    -   Acesse [ExchangeRate-API.com](https://www.exchangerate-api.com/) e obtenha sua chave de API gratuita.
    -   Abra o arquivo `src/main/java/com/seupacote/ApiClient.java` (ajuste o caminho para o seu pacote).
    -   Substitua o placeholder `"SUA_API_KEY"` pela chave que você recebeu.

2.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/conversor-moedas-java.git](https://github.com/seu-usuario/conversor-moedas-java.git)
    ```

3.  **Navegue até o Diretório do Projeto:**
    ```bash
    cd conversor-moedas-java
    ```

4.  **Execute a Aplicação:**
    * **Via IntelliJ IDEA (Recomendado):**
        -   Abra o projeto no IntelliJ.
        -   Aguarde a IDE baixar as dependências do Maven.
        -   Abra o arquivo `Main.java` e clique no ícone de "play" para executar.
    * **Via Terminal (usando Maven):**
        ```bash
        # O Maven irá compilar o projeto e executá-lo
        mvn compile exec:java -Dexec.mainClass="com.seupacote.Main"
        ```
        *(Lembre-se de substituir `com.seupacote.Main` pelo caminho completo da sua classe principal)*

## :money_with_wings: Como Usar

1.  Ao executar a aplicação, um menu será exibido no console.
2.  Digite o número da conversão desejada (ex: `1`) e pressione `Enter`.
3.  Informe o valor que deseja converter (ex: `100`) e pressione `Enter`.
4.  O resultado da conversão será exibido na tela.
5.  O menu será exibido novamente para uma nova consulta ou para sair da aplicação (opção 7).

## :man_technologist: Autor

Feito com ❤️ por **[Natalino Leite dos Santos]**.

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/natalino-leite-dev/)
[![github](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/NatalinoLeite)

## :pray: Agradecimentos

Agradeço à **Alura** e à **Oracle** pelo desafio proposto no programa **ONE (Oracle Next Education)**, que foi fundamental para o desenvolvimento e aprendizado aplicados neste projeto.
