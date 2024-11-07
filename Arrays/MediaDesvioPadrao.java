package MediaDesvioPadrao;

import java.util.Scanner;

public class MediaDesvioPadrao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de numeros: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("A quantidade de numeros deve ser maior que zero.");
            return;
        }
        double[] numeros = new double[n];
        double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        double media = soma / n;
        System.out.println("Media: " + media);
        double somaQuadrados = 0;
        for (int i = 0; i < n; i++) {
            somaQuadrados += Math.pow(numeros[i] - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / n);
        System.out.println("Desvio padrão: " + desvioPadrao);
        scanner.close();
    }
}

