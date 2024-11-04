import java.util.Scanner;
public class NumIntervalo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
boolean continuar = true;
while (continuar) {
System.out.print("Digite um número entre 1 e 100: ");
int numero = scanner.nextInt();
try {
verificarIntervalo(numero);
System.out.println("Número válido: " + numero);
} catch (NumeroForaDoIntervaloException ex) {
System.out.println("Erro: " + ex.getMessage());
}
System.out.print("Deseja tentar novamente? (s/n): ");
String resposta = scanner.next();
continuar = resposta.equalsIgnoreCase("s");
}
System.out.println("Encerrando o programa. Até logo!");
scanner.close();
}
public static void verificarIntervalo(int numero) throws
NumeroForaDoIntervaloException {
if (numero < 1 || numero > 100) {
throw new NumeroForaDoIntervaloException("O número deve estar
entre 1 e 100.");
}
}
}
class NumeroForaDoIntervaloException extends Exception {
public NumeroForaDoIntervaloException(String mensagem) {
super(mensagem);
}
}