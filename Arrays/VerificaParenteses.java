import java.util.Scanner;
import java.util.Stack;

public class VerificaParenteses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma expressão com parênteses: ");
        String expressao = scanner.nextLine();
        
        if (verificarParenteses(expressao)) {
            System.out.println("OK");
        } else {
            System.out.println("Erro");
        }
        
        scanner.close();
    }

    public static boolean verificarParenteses(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(') {
                pilha.push(caractere);
            } else if (caractere == ')') {
                if (pilha.isEmpty() || pilha.pop() != '(') {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }
}

