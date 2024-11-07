package Crescente;
11
import java.util.Scanner;
public class OrdemCrescente {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.print("Informe o primeiro número: ");
int primeiroNumero = entrada.nextInt();
System.out.print("Informe o segundo número: ");
int segundoNumero = entrada.nextInt();
System.out.print("Informe o terceiro número: ");
int terceiroNumero = entrada.nextInt();
if (!(primeiroNumero < segundoNumero && segundoNumero <
terceiroNumero)) {
throw new AssertionError("Erro: Os números precisam estar em
ordem crescente.");
}
System.out.println("Os números estão em ordem crescente: " +
primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
entrada.close();
}
}
