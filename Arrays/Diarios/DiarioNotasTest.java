import java.util.Scanner;

public class DiarioNotasTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do curso: ");
        String curso = scanner.nextLine();

        DiarioNotas diario = new DiarioNotas(curso);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            diario.adicionarNota(nota);
        }

        System.out.println("\nCurso: " + diario.getCurso());
        System.out.println("Maior nota: " + diario.maiorNota());
        System.out.println("Menor nota: " + diario.menorNota());
        System.out.println("Média das notas: " + diario.mediaNotas());
        System.out.println("\nDistribuição das notas:");
        diario.graficoBarras();

        scanner.close();
    }
}

