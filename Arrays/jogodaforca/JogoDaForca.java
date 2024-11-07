import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forca forca = new Forca("programacao");
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            System.out.println("Palavra: " + forca.getPalavraOculta());
            System.out.print("Letras erradas: " + forca.getLetrasErradas() + "\n");
            System.out.print("Tentativas restantes: " + forca.getTentativasRestantes() + "\n");
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (forca.adicionarTentativa(letra)) {
                if (forca.verificarVitoria()) {
                    System.out.println("Parabéns! Você adivinhou a palavra: " + forca.getPalavra());
                    jogoAtivo = false;
                }
            } else {
                System.out.println("Letra já tentada ou inválida!");
            }

            if (forca.getTentativasRestantes() == 0) {
                System.out.println("Game Over! A palavra era: " + forca.getPalavra());
                jogoAtivo = false;
            }
        }

        scanner.close();
    }
}

