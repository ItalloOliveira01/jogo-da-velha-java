# 🎮 Jogo da Velha (Tic-Tac-Toe) em Java

Este projeto apresenta uma implementação simples e funcional do **Jogo da Velha (Tic-Tac-Toe)** em **Java**, projetada para ser executada diretamente no **console (terminal)**.

---

## 🧩 Descrição Geral

O programa reproduz a lógica clássica do Jogo da Velha, em que dois jogadores — **'X'** e **'O'** — se alternam para marcar posições em um **tabuleiro 3x3**.

O objetivo é formar uma sequência de **três símbolos iguais** na horizontal, vertical ou diagonal.
Caso todas as posições sejam preenchidas sem que nenhum jogador alcance esse objetivo, o jogo termina em **empate**.

---

## ⚙️ Funcionalidades

* **Tabuleiro 3x3:** Estrutura clássica do jogo.
* **Dois Jogadores:** Alternância automática entre os jogadores `'X'` e `'O'`.
* **Entrada de Usuário:** Cada jogador informa a **linha (0–2)** e a **coluna (0–2)** onde deseja jogar.
* **Validação de Jogadas:** O sistema impede jogadas inválidas (fora dos limites ou em posições já ocupadas).
* **Verificação de Vitória:** Após cada jogada, o programa verifica se o jogador atual venceu (linhas, colunas ou diagonais).
* **Verificação de Empate:** Detecta automaticamente quando o tabuleiro está cheio e não há vencedor.
* **Exibição do Tabuleiro:** Mostra o estado atualizado do jogo após cada rodada.

---

## ▶️ Como Executar

### Pré-requisitos

* Ter o **JDK (Java Development Kit)** instalado na sua máquina.

### Passos

1. **Salve o código** em um arquivo chamado `JogoDaVelha.java`.

2. **Abra o terminal** e navegue até o diretório onde o arquivo foi salvo.

3. **Compile o código** com o comando:

   ```bash
   javac JogoDaVelha.java
   ```

4. **Execute o programa** com:

   ```bash
   java JogoDaVelha
   ```

---

## 🎯 Como Jogar

1. O jogo começa com o **jogador 'X'**.
2. Quando solicitado, digite o número da **linha (0, 1 ou 2)** e pressione **Enter**.
3. Em seguida, digite o número da **coluna (0, 1 ou 2)** e pressione **Enter**.
4. Os jogadores alternam turnos até que um vença ou ocorra empate.
5. O resultado final (vitória ou empate) é exibido no console.

---

## 💻 Estrutura do Código

A lógica do jogo está organizada na classe principal `JogoDaVelha`, que contém os seguintes métodos:

### `main(String[] args)`

Controla o fluxo principal do jogo (game loop).
Responsável por inicializar o tabuleiro, alternar os jogadores, capturar entradas do usuário e chamar os métodos de verificação.

### `exibirTabuleiro(char[][] tabuleiro)`

Imprime o estado atual do tabuleiro no console de forma legível e organizada.

### `verificarVitoria(char[][] t, char jogador)`

Verifica se o jogador atual venceu, analisando todas as **8 condições possíveis de vitória** (3 linhas, 3 colunas e 2 diagonais).
Retorna `true` em caso de vitória e `false` caso contrário.

### `verificarEmpate(char[][] t)`

Confere se todas as posições do tabuleiro estão preenchidas sem vencedor.
Retorna `true` em caso de empate, e `false` se ainda houver jogadas disponíveis.

---

## 🏁 Conclusão

Este projeto é um excelente exercício introdutório para quem está aprendendo **Java**, pois envolve:

* Estruturas condicionais
* Laços de repetição
* Manipulação de arrays
* Interação com o usuário pelo console

Além de divertido, é uma ótima forma de praticar **lógica de programação** e **controle de fluxo**.

