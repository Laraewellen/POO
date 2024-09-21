import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de quatro dígitos para criptografar: ");
        int numero = scanner.nextInt();

        int criptografado = criptografar(numero);
        System.out.printf("Número criptografado: %04d\n", criptografado);

        scanner.close();
    }

    public static int criptografar(int numero) {
        int[] digitos = separarDigitos(numero);

        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = (digitos[i] + 7) % 10;
        }

        int temp = digitos[0];
        digitos[0] = digitos[2];
        digitos[2] = temp;

        temp = digitos[1];
        digitos[1] = digitos[3];
        digitos[3] = temp;

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
