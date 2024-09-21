public class Viagem {
    private int quilometros;
    private int litros;

    public Viagem(int quilometros, int litros) {
        this.quilometros = quilometros;
        this.litros = litros;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public int getLitros() {
        return litros;
    }

    public double calcularConsumo() {
        return (double) quilometros / litros;
    }
}
