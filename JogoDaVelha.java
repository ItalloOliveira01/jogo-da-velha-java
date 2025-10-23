import java.util.Scanner;
public class JogoDaVelha {
    public static void main(String[] args) {
        
        char[][] tabuleiro = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
       
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        Scanner scanner = new Scanner(System.in);
       
        while (jogoAtivo) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", escolha linha (0-2) e coluna (0-2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
          
            // Verifica se a posição é válida
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida! Tente novamente.");
                continue;
            }
            if (tabuleiro[linha][coluna] != '-') {
                System.out.println("Posição ocupada! Tente novamente.");
                continue;
            }
            tabuleiro[linha][coluna] = jogadorAtual;
            
            // Verifica vitória
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
                break;
            }
            
            // Verificar empate
            if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Empate! Ninguém venceu.");
                jogoAtivo = false;
                break;
            }

            // Alternar jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
    
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean verificarVitoria(char[][] t, char jogador) {
        
        // Verificar linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) || // linha
            (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador)) { // coluna
                return true;
            }
        }
        
        // Verificar diagonais
        if ((t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) || // diagonal principal
        (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador)) { // diagonal secundária
            return true;
        }
        return false;
    }
    public static boolean verificarEmpate(char[][] t) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}