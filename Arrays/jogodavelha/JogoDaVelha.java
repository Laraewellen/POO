import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            tabuleiro.exibirTabuleiro();
            System.out.print("Jogador " + jogadorAtual + ", digite a linha (0-2) e a coluna (0-2): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (tabuleiro.fazerJogada(linha, coluna, jogadorAtual)) {
                if (tabuleiro.verificarVitoria(jogadorAtual)) {
                    tabuleiro.exibirTabuleiro();
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoAtivo = false;
                } else if (tabuleiro.verificarEmpate()) {
                    tabuleiro.exibirTabuleiro();
                    System.out.println("Empate!");
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

