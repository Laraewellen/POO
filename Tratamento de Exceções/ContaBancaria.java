import java.util.Scanner;
public class ContaBancaria {
private double saldo;
4
public ContaBancaria(double saldoInicial) {
this.saldo = saldoInicial;
}
public double getSaldo() {
return saldo;
}
public void depositar(double valor) {
if (valor > 0) {
saldo += valor;
System.out.printf("Depósito de R$%.2f realizado com
sucesso.%n", valor);
} else {
System.out.println("Erro: Valor de depósito inválido.");
}
}
public void sacar(double valor) throws SaldoInsuficienteException {
if (valor > saldo) {
throw new SaldoInsuficienteException("Erro: Saldo insuficiente
para realizar o saque.");
} else if (valor <= 0) {
System.out.println("Erro: Valor de saque inválido.");
} else {
saldo -= valor;
System.out.printf("Saque de R$%.2f realizado com sucesso.%n",
valor);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Informe o saldo inicial da conta: ");
double saldoInicial = Double.parseDouble(scanner.nextLine());
ContaBancaria conta = new ContaBancaria(saldoInicial);
boolean continuar = true;
while (continuar) {
System.out.println("\nEscolha uma operação:");
System.out.println("1. Consultar saldo");
System.out.println("2. Depositar");
System.out.println("3. Sacar");
System.out.println("4. Sair");
System.out.print("Opção: ");
int opcao = Integer.parseInt(scanner.nextLine());
5
try {
switch (opcao) {
case 1:
System.out.printf("Saldo atual: R$%.2f%n",
conta.getSaldo());
break;
case 2:
System.out.print("Informe o valor para depósito:
");
double valorDeposito =
Double.parseDouble(scanner.nextLine());
conta.depositar(valorDeposito);
break;
case 3:
System.out.print("Informe o valor para saque: ");
double valorSaque =
Double.parseDouble(scanner.nextLine());
conta.sacar(valorSaque);
break;
case 4:
System.out.println("Saindo do sistema. Obrigado!");
continuar = false;
break;
default:
System.out.println("Opção inválida. Tente
novamente.");
}
} catch (SaldoInsuficienteException ex) {
System.out.println(ex.getMessage());
} catch (NumberFormatException ex) {
System.out.println("Erro: Insira um número válido.");
}
}
scanner.close();
}
}
class SaldoInsuficienteException extends Exception {
public SaldoInsuficienteException(String mensagem) {
super(mensagem);
}
}
