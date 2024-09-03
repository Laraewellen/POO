import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c, x, x1, x2;
        double delta;
        // Solicita ao usuário que insira os coeficientes a, b e c
        System.out.print("Digite o coeficiente a: ");
        a = input.nextDouble();
        
        System.out.print("Digite o coeficiente b: ");
        b = input.nextDouble();
        
        System.out.print("Digite o coeficiente c: ");
        c = input.nextDouble();
        
        delta = b * b - 4 * a * c;
        
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raizes da equacao sao: x' = " + x1 + " e x'' = " + x2);
        } else if (delta == 0) {
            x = -b / (2 * a);
            System.out.println("A equacao tem uma raiz real: x = " + x);
        } else {
            System.out.println("A equacao nao possui raizes reais.");
        }
        
    }
}