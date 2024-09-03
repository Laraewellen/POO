import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de segundos: ");
        int totalSegundos = scanner.nextInt();
        
        int dias = totalSegundos / 86400;
        int horasRestantes = totalSegundos % 86400;
        int horas = horasRestantes / 3600;
        int minutosRestantes = horasRestantes % 3600;
        int minutos = minutosRestantes / 60;
        int segundos = minutosRestantes % 60;
        
        System.out.println(totalSegundos + " segundos equivalem a:");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
        
        scanner.close();
    }
}
