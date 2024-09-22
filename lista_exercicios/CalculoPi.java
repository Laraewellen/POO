public class CalculoPi {
    public static void main(String[] args) {
        double pi = 0.0;
        int termos = 200000;
        boolean encontrado = false;
        int termosPara314159 = 0;

        System.out.printf("%-10s %-20s\n", "Termos", "Valor de Pi");

        for (int i = 0; i < termos; i++) {
            if (i % 2 == 0) {
                pi += 4.0 / (2 * i + 1);
            } else {
                pi -= 4.0 / (2 * i + 1);
            }

            if (i % 1000 == 0) {
                System.out.printf("%-10d %-20.15f\n", i, pi);
            }

            if (!encontrado && String.format("%.6f", pi).equals("3.14159")) {
                termosPara314159 = i + 1;
                encontrado = true;
            }
        }

        System.out.printf("\nNúmero de termos necessários para obter 3.14159: %d\n", termosPara314159);
    }
}
