public class Cliente {
    private int numeroConta;
    private int saldoInicial;
    private int totalCobrancas;
    private int totalCreditos;
    private int limiteCredito;

    public Cliente(int numeroConta, int saldoInicial, int totalCobrancas, int totalCreditos, int limiteCredito) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.totalCobrancas = totalCobrancas;
        this.totalCreditos = totalCreditos;
        this.limiteCredito = limiteCredito;
    }

    public int calcularNovoSaldo() {
        return saldoInicial + totalCobrancas - totalCreditos;
    }

    public boolean excedeuLimite() {
        return calcularNovoSaldo() > limiteCredito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public int getTotalCobrancas() {
        return totalCobrancas;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }
}
