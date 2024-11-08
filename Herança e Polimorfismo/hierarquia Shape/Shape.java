abstract class Forma {
    public abstract String getDescricao();
}

abstract class FormaBidimensional extends Forma {
    public abstract double obterArea();
}

abstract class FormaTridimensional extends Forma {
    public abstract double obterArea();
    public abstract double obterVolume();
}

class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String getDescricao() {
        return "Círculo com raio " + raio;
    }
}

class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public String getDescricao() {
        return "Quadrado com lado " + lado;
    }
}

class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String getDescricao() {
        return "Esfera com raio " + raio;
    }
}

class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obterVolume() {
        return lado * lado * lado;
    }

    @Override
    public String getDescricao() {
        return "Cubo com lado " + lado;
    }
}
