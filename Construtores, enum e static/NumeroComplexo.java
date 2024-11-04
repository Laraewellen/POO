public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;
    public NumeroComplexo(double parteReal, double parteImaginaria) {
    this.parteReal = parteReal;
    this.parteImaginaria = parteImaginaria;
    }
    public NumeroComplexo() {
    this(0.0, 0.0);
    }
    public NumeroComplexo somar(NumeroComplexo outro) {
    double novaParteReal = this.parteReal + outro.parteReal;
    double novaParteImaginaria = this.parteImaginaria +
    outro.parteImaginaria;
    return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public NumeroComplexo subtrair(NumeroComplexo outro) {
    double novaParteReal = this.parteReal - outro.parteReal;
    double novaParteImaginaria = this.parteImaginaria -
    outro.parteImaginaria;
    return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }
    public void imprimir() {
    System.out.printf("(%.2f, %.2f)%n", parteReal, parteImaginaria);
    }
    public static void main(String[] args) {
    NumeroComplexo num1 = new NumeroComplexo(3.5, 2.5);
    NumeroComplexo num2 = new NumeroComplexo(1.5, 4.0);
    System.out.print("Número 1: ");
    num1.imprimir();
    System.out.print("Número 2: ");
    num2.imprimir();
    NumeroComplexo soma = num1.somar(num2);
    System.out.print("Soma: ");
    soma.imprimir();
    4
    NumeroComplexo subtracao = num1.subtrair(num2);
    System.out.print("Subtração: ");
    subtracao.imprimir();
    }
    }