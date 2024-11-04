import java.util.Scanner;
public class RegistroCliente {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Digite o nome do cliente: ");
String nome = scanner.nextLine();
System.out.print("Digite a idade do cliente: ");
int idade = Integer.parseInt(scanner.nextLine());
Cliente novoCliente = new Cliente(nome, idade);
System.out.printf("Cliente cadastrado com sucesso: %s | Idade:
%d%n", novoCliente.getNome(), novoCliente.getIdade());
} catch (IdadeInvalidaException ex) {
System.out.println("Erro ao registrar cliente: " +
ex.getMessage());
} catch (NumberFormatException ex) {
System.out.println("Erro: A idade deve ser um número
inteiro.");
2
} finally {
scanner.close();
}
}
}
class Cliente {
private String nome;
private int idade;
public Cliente(String nome, int idade) throws IdadeInvalidaException {
if (idade < 18) {
throw new IdadeInvalidaException("A idade precisa ser maior que
18 anos para o cadastro.");
}
this.nome = nome;
this.idade = idade;
}
public String getNome() {
return this.nome;
}
public int getIdade() {
return this.idade;
}
}
class IdadeInvalidaException extends Exception {
public IdadeInvalidaException(String mensagem) {
super(mensagem);
}
}