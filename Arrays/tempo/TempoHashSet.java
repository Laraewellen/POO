import java.util.HashSet;
import java.util.Random;

public class TempoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        Random random = new Random();

        long tempoInicioInsercao = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            conjunto.add(random.nextInt(100000)); 
        }
        long tempoFimInsercao = System.currentTimeMillis();
        long tempoInsercao = tempoFimInsercao - tempoInicioInsercao;

        long tempoInicioBusca = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            conjunto.contains(random.nextInt(100000)); 
        }
        long tempoFimBusca = System.currentTimeMillis();
        long tempoBusca = tempoFimBusca - tempoInicioBusca;

        System.out.println("HashSet - Tempo de inserção: " + tempoInsercao + " ms");
        System.out.println("HashSet - Tempo de busca: " + tempoBusca + " ms");
    }
}

