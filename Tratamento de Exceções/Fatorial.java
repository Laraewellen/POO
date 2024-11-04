import java.util.Scanner;
public class Fatorial {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Digite um número inteiro positivo para calcular o
fatorial: ");
int numero = entrada.nextInt();
if (numero < 0) {
throw new AssertionError("Erro: O número deve ser não
negativo.");
}
12
System.out.println("Fatorial de " + numero + " é: " +
calcularFatorial(numero));
entrada.close();
}
public static long calcularFatorial(int numero) {
long resultado = 1;
for (int i = 1; i <= numero; i++) {
resultado *= i;
}
return resultado;
}
}
