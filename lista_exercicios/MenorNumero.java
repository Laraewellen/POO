import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de valores a serem inseridos
        System.out.print("Digite o número de valores: ");
        int numValores = scanner.nextInt();

        // Cria uma instância da classe que encontra o menor valor
        Menor menor = new Menor();

        // Loop para ler os valores do usuário
        for (int i = 0; i < numValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            menor.atualizarMenor(valor);
        }

        // Exibe o menor valor
        System.out.println("O menor valor é: " + menor.getMenorValor());
    }
}
