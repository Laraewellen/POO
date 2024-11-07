
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lugares_vagos = {10, 2, 1, 3, 0}; // Salas 1, 2, 3, 4, 5
        int sala, lugaresSolicitados;

        while (true) {
            System.out.print("Digite o número da sala (1 a 5) ou 0 para sair: ");
            sala = scanner.nextInt();

            if (sala == 0) {
                break;
            }

            if (sala < 1 || sala > 5) {
                System.out.println("Sala inválida. Escolha entre 1 e 5.");
                continue;
            }

            System.out.print("Digite a quantidade de lugares solicitados: ");
            lugaresSolicitados = scanner.nextInt();

            if (lugaresSolicitados <= lugares_vagos[sala - 1]) {
                lugares_vagos[sala - 1] -= lugaresSolicitados;
                System.out.println("Venda realizada! Lugares restantes na sala " + sala + ": " + lugares_vagos[sala - 1]);
            } else {
                System.out.println("Não há lugares suficientes. Lugares vagos na sala " + sala + ": " + lugares_vagos[sala - 1]);
            }
        }

        scanner.close();
    }
}

