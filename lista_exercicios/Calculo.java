
public class Calculo {
    public static void main(String[] args) {
        double principal = 1000.0;
        double taxaJuros = 0.05;

        Investimento investimento = new Investimento(principal, taxaJuros);

        System.out.println("Ano\tMontante");
        for (int ano = 1; ano <= 10; ano++) {
            double montante = investimento.calcularMontante(ano);
            System.out.printf("%d\t%.2f\n", ano, montante);
        }
    }
}
