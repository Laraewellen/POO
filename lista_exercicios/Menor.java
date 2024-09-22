public class Menor {
    private int menorValor;

    public Menor() {
        // Inicializa a variável com o maior valor possível de um inteiro
        this.menorValor = Integer.MAX_VALUE;
    }

    // Método para atualizar o menor valor
    public void atualizarMenor(int valor) {
        if (valor < menorValor) {
            menorValor = valor;
        }
    }

    // Método para obter o menor valor
    public int getMenorValor() {
        return menorValor;
    }
}
