import java.util.ArrayList;

interface PegadaDeCarbono {
    double obterPegadaDeCarbono();
}

class Edificio implements PegadaDeCarbono {
    private double consumoEletricidade;
    private double consumoGas;

    public Edificio(double consumoEletricidade, double consumoGas) {
        this.consumoEletricidade = consumoEletricidade;
        this.consumoGas = consumoGas;
    }

    @Override
    public double obterPegadaDeCarbono() {
        return (consumoEletricidade * 0.5) + (consumoGas * 2.0);
    }

    @Override
    public String toString() {
        return "Edifício com consumo de eletricidade: " + consumoEletricidade + " kWh e gás: " + consumoGas + " m³";
    }
}

class Carro implements PegadaDeCarbono {
    private double combustivelConsumido;
    private double emissaoPorLitro;

    public Carro(double combustivelConsumido, double emissaoPorLitro) {
        this.combustivelConsumido = combustivelConsumido;
        this.emissaoPorLitro = emissaoPorLitro;
    }

    @Override
    public double obterPegadaDeCarbono() {
        return combustivelConsumido * emissaoPorLitro;
    }

    @Override
    public String toString() {
        return "Carro com combustível consumido: " + combustivelConsumido + " L e emissão por litro: " + emissaoPorLitro + " kg CO2/L";
    }
}

class Bicicleta implements PegadaDeCarbono {
    private double quilometragem;

    public Bicicleta(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public double obterPegadaDeCarbono() {
        return quilometragem * 0.05;
    }

    @Override
    public String toString() {
        return "Bicicleta com quilometragem: " + quilometragem + " km";
    }
}
