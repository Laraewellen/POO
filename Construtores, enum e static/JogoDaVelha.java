import java.util.Scanner;
public class JogoDaVelha {
private enum ValorCelula { X, O, VAZIO }
private final ValorCelula[][] tabuleiro;
private boolean turnoX;
public JogoDaVelha() {
tabuleiro = new ValorCelula[3][3];
1
turnoX = true;
inicializarTabuleiro();
}
private void inicializarTabuleiro() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
tabuleiro[i][j] = ValorCelula.VAZIO;
}
}
}
public void exibirTabuleiro() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(tabuleiro[i][j] == ValorCelula.VAZIO ? "-"
: tabuleiro[i][j]);
if (j < 2) System.out.print(" | ");
}
System.out.println();
}
}
public boolean realizarJogada(int linha, int coluna) {
if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 ||
tabuleiro[linha][coluna] != ValorCelula.VAZIO) {
System.out.println("Movimento inválido. Tente novamente.");
return false;
}
tabuleiro[linha][coluna] = turnoX ? ValorCelula.X : ValorCelula.O;
turnoX = !turnoX;
return true;
}
public boolean verificarVitoria() {
for (int i = 0; i < 3; i++) {
if (tabuleiro[i][0] != ValorCelula.VAZIO && tabuleiro[i][0] ==
tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2])
return true;
if (tabuleiro[0][i] != ValorCelula.VAZIO && tabuleiro[0][i] ==
tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i])
return true;
}
if (tabuleiro[0][0] != ValorCelula.VAZIO && tabuleiro[0][0] ==
tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2])
return true;
if (tabuleiro[0][2] != ValorCelula.VAZIO && tabuleiro[0][2] ==
tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0])
return true;
2
return false;
}
public boolean verificarEmpate() {
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
if (tabuleiro[i][j] == ValorCelula.VAZIO) return false;
}
}
return true;
}
public String jogadorAtual() {
return turnoX ? "X" : "O";
}
public static void main(String[] args) {
JogoDaVelha jogo = new JogoDaVelha();
Scanner scanner = new Scanner(System.in);
System.out.println("Bem-vindo ao Jogo da Velha!");
jogo.exibirTabuleiro();
while (true) {
System.out.printf("Jogador %s, faça sua jogada (linha e
coluna): ", jogo.jogadorAtual());
int linha = scanner.nextInt();
int coluna = scanner.nextInt();
if (jogo.realizarJogada(linha, coluna)) {
jogo.exibirTabuleiro();
if (jogo.verificarVitoria()) {
System.out.printf("Parabéns! O jogador %s venceu!%n",
jogo.jogadorAtual().equals("X") ? "O" : "X");
break;
} else if (jogo.verificarEmpate()) {
System.out.println("Empate! O jogo terminou sem
vencedores.");
break;
}
}
}
scanner.close();
}
}
