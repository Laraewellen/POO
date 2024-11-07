import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparacaoListas {
    private List<Integer> arrayList;
    private List<Integer> linkedList;
    private Random random;

    public ComparacaoListas() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        random = new Random();
    }

    public void adicionarElementos(int quantidade) {
        long tempoInicioArrayList = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            arrayList.add(0, random.nextInt(100000));
        }
        long tempoFimArrayList = System.currentTimeMillis();
        long tempoArrayList = tempoFimArrayList - tempoInicioArrayList;

        long tempoInicioLinkedList = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            linkedList.add(0, random.nextInt(100000));
        }
        long tempoFimLinkedList = System.currentTimeMillis();
        long tempoLinkedList = tempoFimLinkedList - tempoInicioLinkedList;

        System.out.println("ArrayList - Tempo de adição na primeira posição: " + tempoArrayList + " ms");
        System.out.println("LinkedList - Tempo de adição na primeira posição: " + tempoLinkedList + " ms");
    }

    public void percorrerListas() {
        long tempoInicioArrayList = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long tempoFimArrayList = System.currentTimeMillis();
        long tempoArrayList = tempoFimArrayList - tempoInicioArrayList;

        long tempoInicioLinkedList = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long tempoFimLinkedList = System.currentTimeMillis();
        long tempoLinkedList = tempoFimLinkedList - tempoInicioLinkedList;

        System.out.println("ArrayList - Tempo de percorrer com get: " + tempoArrayList + " ms");
        System.out.println("LinkedList - Tempo de percorrer com get: " + tempoLinkedList + " ms");
    }
}

