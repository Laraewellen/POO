public class Fracao {
    private int numerador;
    private int denominador;
    public Fracao(int numerador, int denominador) {
    if (denominador == 0) {
    throw new IllegalArgumentException("Denominador não pode ser
    zero.");
    }
    int mdc = calcularMdc(numerador, denominador);
    this.numerador = numerador / mdc;
    this.denominador = denominador / mdc;
    if (this.denominador < 0) {
    this.numerador = -this.numerador;
    this.denominador = -this.denominador;
    }
    }
    public Fracao() {
    this(1, 1);
    }
    private static int calcularMdc(int a, int b) {
    if (b == 0) {
    return a;
    }
    return calcularMdc(b, a % b);
    }
    public static Fracao somar(Fracao f1, Fracao f2) {
    int novoNumerador = f1.numerador * f2.denominador + f2.numerador *
    f1.denominador;
    int novoDenominador = f1.denominador * f2.denominador;
    return new Fracao(novoNumerador, novoDenominador);
    }
    public static Fracao subtrair(Fracao f1, Fracao f2) {
    int novoNumerador = f1.numerador * f2.denominador - f2.numerador *
    7
    f1.denominador;
    int novoDenominador = f1.denominador * f2.denominador;
    return new Fracao(novoNumerador, novoDenominador);
    }
    public static Fracao multiplicar(Fracao f1, Fracao f2) {
    int novoNumerador = f1.numerador * f2.numerador;
    int novoDenominador = f1.denominador * f2.denominador;
    return new Fracao(novoNumerador, novoDenominador);
    }
    public static Fracao dividir(Fracao f1, Fracao f2) {
    if (f2.numerador == 0) {
    throw new ArithmeticException("Divisão por zero.");
    }
    int novoNumerador = f1.numerador * f2.denominador;
    int novoDenominador = f1.denominador * f2.numerador;
    return new Fracao(novoNumerador, novoDenominador);
    }
    public String toString() {
    return numerador + "/" + denominador;
    }
    public double toDouble() {
    return (double) numerador / denominador;
    }
    public static void main(String[] args) {
    Fracao f1 = new Fracao(1, 2);
    Fracao f2 = new Fracao(3, 4);
    System.out.println("Fracao 1: " + f1);
    System.out.println("Fracao 2: " + f2);
    Fracao soma = Fracao.somar(f1, f2);
    System.out.println("Soma: " + soma + " ou " + soma.toDouble());
    Fracao subtracao = Fracao.subtrair(f1, f2);
    System.out.println("Subtracao: " + subtracao + " ou " +
    subtracao.toDouble());
    Fracao multiplicacao = Fracao.multiplicar(f1, f2);
    System.out.println("Multiplicacao: " + multiplicacao + " ou " +
    multiplicacao.toDouble());
    Fracao divisao = Fracao.dividir(f1, f2);
    System.out.println("Divisao: " + divisao + " ou " +
    divisao.toDouble());
    }
    }
    