public class Investimento {
    private double principal;
    private double taxaJuros;

    public Investimento(double principal, double taxaJuros) {
        this.principal = principal;
        this.taxaJuros = taxaJuros;
    }

    public double calcularMontante(int anos) {
        return principal * Math.pow(1 + taxaJuros, anos);
    }
}
