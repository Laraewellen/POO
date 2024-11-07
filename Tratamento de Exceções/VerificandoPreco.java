import java.util.Scanner;
public class VerificandoPreco {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Digite o preço do produto: R$");
double preco = scanner.nextDouble();
verificarPreco(preco);
System.out.printf("Preço válido: R$%.2f%n", preco);
} catch (PrecoInvalidoException e) {
System.out.println("Erro: " + e.getMessage());
} catch (Exception e) {
System.out.println("Erro: Entrada inválida. Por favor, insira
um número válido.");
} finally {
scanner.close();
}
}
public static void verificarPreco(double preco) throws
PrecoInvalidoException {
if (preco <= 0) {
throw new PrecoInvalidoException("O preço do produto deve ser
maior que zero.");
}
}
}
class PrecoInvalidoException extends Exception {
public PrecoInvalidoException(String mensagem) {
super(mensagem);
}
}