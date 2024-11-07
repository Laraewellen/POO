import java.util.ArrayList;
6
import java.util.Scanner;
public class CadastrarProduto {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Produto> produtos = new ArrayList<>();
boolean continuar = true;
while (continuar) {
System.out.println("\nEscolha uma opção:");
System.out.println("1. Cadastrar novo produto");
System.out.println("2. Listar produtos");
System.out.println("3. Sair");
System.out.print("Opção: ");
int opcao = Integer.parseInt(scanner.nextLine());
try {
switch (opcao) {
case 1:
System.out.print("Digite o nome do produto: ");
String nome = scanner.nextLine();
System.out.print("Digite o preço do produto: ");
double preco =
Double.parseDouble(scanner.nextLine());
Produto produto = new Produto(nome, preco);
produtos.add(produto);
System.out.printf("Produto '%s' cadastrado com
sucesso!%n", nome);
break;
case 2:
System.out.println("\nProdutos cadastrados:");
if (produtos.isEmpty()) {
System.out.println("Nenhum produto
cadastrado.");
} else {
for (Produto p : produtos) {
System.out.printf("Nome: %s | Preço:
R$%.2f%n", p.getNome(), p.getPreco());
}
}
break;
case 3:
System.out.println("Saindo do sistema. Até logo!");
7
continuar = false;
break;
default:
System.out.println("Opção inválida. Tente
novamente.");
}
} catch (PrecoInvalidoException ex) {
System.out.println("Erro: " + ex.getMessage());
} catch (NumberFormatException ex) {
System.out.println("Erro: Por favor, insira um valor
numérico válido.");
}
}
scanner.close();
}
}
class Produto {
private String nome;
private double preco;
public Produto(String nome, double preco) throws PrecoInvalidoException
{
if (preco <= 0) {
throw new PrecoInvalidoException("O preço do produto deve ser
positivo.");
}
this.nome = nome;
this.preco = preco;
}
public String getNome() {
return nome;
}
public double getPreco() {
return preco;
}
}
class PrecoInvalidoException extends Exception {
public PrecoInvalidoException(String mensagem) {
super(mensagem);
}
}
