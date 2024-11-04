import java.util.Scanner;
public class Fatorial {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Digite um número para calcular o fatorial:
");
3
int numero = Integer.parseInt(scanner.nextLine());
int resultado = calcularFatorial(numero);
System.out.printf("O fatorial de %d é: %d%n", numero,
resultado);
} catch (NegativeNumberException ex) {
System.out.println("Erro: " + ex.getMessage());
} catch (NumberFormatException ex) {
System.out.println("Erro: Por favor, insira um número inteiro
válido.");
} finally {
scanner.close();
}
}
// Método recursivo para calcular o fatorial
public static int calcularFatorial(int numero) throws
NegativeNumberException {
if (numero < 0) {
throw new NegativeNumberException("Número negativo: o fatorial
não pode ser calculado.");
}
if (numero == 0 || numero == 1) {
return 1;
}
return numero * calcularFatorial(numero - 1);
}
}
class NegativeNumberException extends Exception {
public NegativeNumberException(String mensagem) {
super(mensagem);
}
}
