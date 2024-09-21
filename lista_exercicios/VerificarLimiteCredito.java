import java.util.Scanner;

public class VerificarLimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo no início do mês: ");
        int saldoInicial = scanner.nextInt();

        System.out.print("Digite o total de itens cobrados no mês: ");
        int totalCobrancas = scanner.nextInt();

        System.out.print("Digite o total de créditos aplicados no mês: ");
        int totalCreditos = scanner.nextInt();

        System.out.print("Digite o limite de crédito autorizado: ");
        int limiteCredito = scanner.nextInt();

        Cliente cliente = new Cliente(numeroConta, saldoInicial, totalCobrancas, totalCreditos, limiteCredito);
        int novoSaldo = cliente.calcularNovoSaldo();

        System.out.printf("Novo saldo: %d\n", novoSaldo);

        if (cliente.excedeuLimite()) {
            System.out.println("Limite de crédito excedido");
        } else {
            System.out.println("Limite de crédito não excedido");
        }

        scanner.close();
    }
}
