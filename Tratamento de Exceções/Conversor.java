import java.util.Scanner;
public class Conversor {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
boolean executando = true;
while (executando) {
System.out.println("Selecione o tipo de conversão:");
System.out.println("1. Converter de Celsius para Fahrenheit");
System.out.println("2. Converter de Fahrenheit para Celsius");
System.out.println("3. Sair");
try {
System.out.print("Digite a opção desejada: ");
int escolha = Integer.parseInt(entrada.nextLine());
switch (escolha) {
case 1:
System.out.print("Informe a temperatura em Celsius:
");
double tempCelsius =
Double.parseDouble(entrada.nextLine());
double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
System.out.printf("Temperatura em Fahrenheit:
%.2f°F%n", tempFahrenheit);
break;
case 2:
System.out.print("Informe a temperatura em
Fahrenheit: ");
double tempF =
Double.parseDouble(entrada.nextLine());
double tempC = (tempF - 32) * 5 / 9;
System.out.printf("Temperatura em Celsius:
%.2f°C%n", tempC);
break;
case 3:
System.out.println("Encerrando o programa. Até
1
logo!");
executando = false;
break;
default:
System.out.println("Opção inválida. Por favor,
tente novamente.");
}
} catch (NumberFormatException ex) {
System.out.println("Erro: Entrada inválida, por favor
insira um número.");
}
}
entrada.close();
}
}