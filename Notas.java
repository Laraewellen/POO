import java.util.Scanner;
public class Notas {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Quantas notas você deseja inserir? ");
int quantidadeNotas = scanner.nextInt();
double[] notas = new double[quantidadeNotas];
for (int i = 0; i < quantidadeNotas; i++) {
System.out.printf("Digite a nota %d: ", i + 1);
try {
double nota = scanner.nextDouble();
verificarIntervaloNota(nota);
notas[i] = nota;
} catch (NotaForaDoIntervaloException e) {
System.out.println("Erro: " + e.getMessage());
i--; // Permite ao usuário inserir a nota novamente
}
}
System.out.println("Notas inseridas com sucesso:");
for (int i = 0; i < quantidadeNotas; i++) {
System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
}
scanner.close();
}
public static void verificarIntervaloNota(double nota) throws
NotaForaDoIntervaloException {
if (nota < 0 || nota > 10) {
throw new NotaForaDoIntervaloException("A nota deve estar entre
0 e 10.");
}
}
}
class NotaForaDoIntervaloException extends Exception {
public NotaForaDoIntervaloException(String mensagem) {
super(mensagem);
}
}
