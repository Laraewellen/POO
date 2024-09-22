import java.util.Scanner;
 public class QuadradoSoma {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.print("Digite um numero: ");
 int n = input.nextInt();
 int soma = 0;
 int impar = 1;
 for (int i = 0; i < n; i++) {
 soma += impar;
 impar += 2; // Atualiza para o próximo número ímpar
 }
 System.out.println("O quadrado de " + n + " e: " + soma);
 input.close();
 }
 }