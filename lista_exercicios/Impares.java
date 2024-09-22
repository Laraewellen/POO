public class Impares {
    public static void main(String[] args) {
        int produto = 1;

        // Loop para calcular o produto dos números ímpares de 1 a 15
        for (int i = 1; i <= 15; i += 2) {
            produto *= i;
        }

        // Exibe o resultado
        System.out.println("O produto dos números ímpares de 1 a 15 é: " + produto);
    }
}
