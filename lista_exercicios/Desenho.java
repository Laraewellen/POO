public class Desenho {
    private int tamanho;

    public Desenho(int tamanho) {
        if (tamanho < 1 || tamanho > 20) {
            throw new IllegalArgumentException("Tamanho inválido. Por favor, insira um valor entre 1 e 20.");
        }
        this.tamanho = tamanho;
    }

    public void desenhar() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
