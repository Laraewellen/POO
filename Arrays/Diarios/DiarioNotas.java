import java.util.ArrayList;

public class DiarioNotas {
    private String curso;
    private ArrayList<Double> notas;

    public DiarioNotas(String curso) {
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double maiorNota() {
        return notas.stream().max(Double::compareTo).orElse(0.0);
    }

    public double menorNota() {
        return notas.stream().min(Double::compareTo).orElse(0.0);
    }

    public double mediaNotas() {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public void graficoBarras() {
        for (double nota : notas) {
            int estrelas = (int) nota; // Multiplicamos por um fator para a escala
            System.out.print(nota + ": ");
            for (int i = 0; i < estrelas; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String getCurso() {
        return curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}

