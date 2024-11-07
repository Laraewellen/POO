import java.util.ArrayList;
import java.util.List;

public class ColecaoDados {
    private List<Integer> dados;

    public ColecaoDados(List<Integer> dados) {
        this.dados = dados;
    }

    public int maiorElemento() {
        int maior = dados.get(0);
        for (int num : dados) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public int menorElemento() {
        int menor = dados.get(0);
        for (int num : dados) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public List<Integer> numerosPares() {
        List<Integer> pares = new ArrayList<>();
        for (int num : dados) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    public int ocorrenciasPrimeiroElemento() {
        int primeiroElemento = dados.get(0);
        int contagem = 0;
        for (int num : dados) {
            if (num == primeiroElemento) {
                contagem++;
            }
        }
        return contagem;
    }

    public double mediaElementos() {
        int soma = 0;
        for (int num : dados) {
            soma += num;
        }
        return (double) soma / dados.size();
    }

    public int somaNegativos() {
        int soma = 0;
        for (int num : dados) {
            if (num < 0) {
                soma += num;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        List<Integer> dados = List.of(12, 2, 4, 8, 29, 45, 78, 36, 17, 2, 12, 8, 3, 3, 52);
        ColecaoDados colecao = new ColecaoDados(dados);

        System.out.println("Maior elemento: " + colecao.maiorElemento());
        System.out.println("Menor elemento: " + colecao.menorElemento());
        System.out.println("Números pares: " + colecao.numerosPares());
        System.out.println("Ocorrências do primeiro elemento: " + colecao.ocorrenciasPrimeiroElemento());
        System.out.println("Média dos elementos: " + colecao.mediaElementos());
        System.out.println("Soma dos elementos negativos: " + colecao.somaNegativos());
    }
}