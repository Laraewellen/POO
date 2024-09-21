import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quilometragemTotal = 0;
        int litrosTotais = 0;

        while (true) {
            System.out.print("Digite os quilômetros dirigidos (ou -1 para sair): ");
            int quilometros = scanner.nextInt();
            if (quilometros == -1) {
                break;
            }

            System.out.print("Digite os litros de gasolina consumidos: ");
            int litros = scanner.nextInt();

            Viagem viagem = new Viagem(quilometros, litros);
            double consumo = viagem.calcularConsumo();
            quilometragemTotal += quilometros;
            litrosTotais += litros;

            System.out.printf("Consumo desta viagem: %.2f km/l\n", consumo);
            System.out.printf("Quilometragem total: %d km\n", quilometragemTotal);
            System.out.printf("Total de litros consumidos: %d litros\n", litrosTotais);
        }

        scanner.close();
    }
}
