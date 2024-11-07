import java.util.ArrayList;

public class Forca {
    private String palavra;
    private ArrayList<Character> letrasErradas;
    private ArrayList<Character> letrasTentadas;
    private int tentativasMaximas;

    public Forca(String palavra) {
        this.palavra = palavra.toLowerCase();
        this.letrasErradas = new ArrayList<>();
        this.letrasTentadas = new ArrayList<>();
        this.tentativasMaximas = 3;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getPalavraOculta() {
        StringBuilder palavraOculta = new StringBuilder();
        for (char letra : palavra.toCharArray()) {
            if (letrasTentadas.contains(letra)) {
                palavraOculta.append(letra);
            } else {
                palavraOculta.append('_');
            }
            palavraOculta.append(' ');
        }
        return palavraOculta.toString();
    }

    public ArrayList<Character> getLetrasErradas() {
        return letrasErradas;
    }

    public int getTentativasRestantes() {
        return tentativasMaximas - letrasErradas.size();
    }

    public boolean adicionarTentativa(char letra) {
        letra = Character.toLowerCase(letra);
        if (letrasTentadas.contains(letra) || letrasErradas.contains(letra)) {
            return false;
        }

        letrasTentadas.add(letra);
        if (!palavra.contains(String.valueOf(letra))) {
            letrasErradas.add(letra);
        }

        return true;
    }

    public boolean verificarVitoria() {
        for (char letra : palavra.toCharArray()) {
            if (!letrasTentadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }
}

