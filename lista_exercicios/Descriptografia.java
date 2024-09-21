import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de quatro dígitos criptografado para descriptografar: ");
        int numero = scanner.nextInt();

        int descriptografado = descriptografar(numero);
        System.out.printf("Número descriptografado: %04d\n", descriptografado);

        scanner.close();
    }

    public static int descriptografar(int numero) {
        int[] digitos = separarDigitos(numero);

        int temp = digitos[0];
        digitos[0] = digitos[2];
        digitos[2] = temp;

        temp = digitos[1];
        digitos[1] = digitos[3];
        digitos[3] = temp;

        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = (digitos[i] + 3) % 10;
        }

        return juntarDigitos(digitos);
    }

    private static int[] separarDigitos(int numero) {
        int[] digitos = new int[4];
        for (int i = 3; i >= 0; i--) {
            digitos[i] = numero % 10;
            numero /= 10;
        }
        return digitos;
    }

    private static int juntarDigitos(int[] digitos) {
        int numero = 0;
        for (int digito : digitos) {
            numero = numero * 10 + digito;
        }
        return numero;
    }
}
