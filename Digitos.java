import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de cinco dígitos: ");
        int numero = scanner.nextInt();
        
        if (numero < 10000 || numero > 99999) {
            System.out.println("Número inválido. Por favor, insira um número com exatamente cinco dígitos.");
        } else {
            int digito1 = numero / 10000;
            int digito2 = (numero / 1000) % 10;
            int digito3 = (numero / 100) % 10;
            int digito4 = (numero / 10) % 10;
            int digito5 = numero % 10;

            System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);
        }
        
        scanner.close();
    }
}
