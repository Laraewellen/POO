import java.util.ArrayList;
import java.util.Random;

public class TempoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        long tempoInicioInsercao = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            lista.add(random.nextInt(100000)); 
        }
        long tempoFimInsercao = System.currentTimeMillis();
        long tempoInsercao = tempoFimInsercao - tempoInicioInsercao;

        long tempoInicioBusca = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            lista.contains(random.nextInt(100000)); 
        }
        long tempoFimBusca = System.currentTimeMillis();
        long tempoBusca = tempoFimBusca - tempoInicioBusca;

        System.out.println("ArrayList - Tempo de inserção: " + tempoInsercao + " ms");
        System.out.println("ArrayList - Tempo de busca: " + tempoBusca + " ms");
    }
}

