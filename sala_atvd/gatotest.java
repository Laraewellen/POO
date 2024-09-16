import java.util.Scanner;
import javax.swing.JOptionPane;

// Mantendo o nome da classe principal como está
public class gatotest {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criando uma instância da classe Gato
        gato gatinho = new gato("Garfield", "20/05/2018", 0.5);

        // Imprimindo o nome do gatinho
        System.out.printf("O nome do gatinho é: %s\n", gatinho.getNome());

        // Chamando os métodos da classe Gato
        gatinho.miar();
        gatinho.lamber();

        // Usando JOptionPane para obter o nome do gatinho do usuário
        String texto = JOptionPane.showInputDialog(null, "Qual o nome do gatinho?");
        System.out.println("Nome do gatinho fornecido: " + texto);

        // Atualizando o nome do gatinho com o nome fornecido pelo usuário
        gatinho.setNome(texto);

        // Imprimindo o nome atualizado do gatinho
        System.out.printf("O nome atualizado do gatinho é: %s\n", gatinho.getNome());

        // Encerrando o Scanner
        entrada.close();
    }
}