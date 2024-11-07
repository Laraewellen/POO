public class Verificador {
    public boolean ehDuplicado(int[] numeros, int quantidade, int numero) {
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void exibirNumerosUnicos(int[] numeros, int quantidade) {
        System.out.print("Números únicos inseridos: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}

