import java.util.Scanner;

public class ValoresUnicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int quantidadeNumeros = 0;

        Verificador verificador = new Verificador();

        for (int i = 0; i < 5; i++) {
            System.out.print("Insira o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 100) {
                if (!verificador.ehDuplicado(numeros, quantidadeNumeros, numero)) {
                    numeros[quantidadeNumeros] = numero;
                    quantidadeNumeros++;
                    verificador.exibirNumerosUnicos(numeros, quantidadeNumeros);
                }
            }
        }
        scanner.close();
    }
}

