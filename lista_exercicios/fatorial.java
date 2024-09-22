import java.util.Scanner;
 public class fatorial {
 public static void main(String[] args)
 {
 int num, fatorial = 1;
 Scanner input = new Scanner(System.in);
 System.out.println("Digite um numero:");
 num = input.nextInt();
 for(int count = num; count>=1; count--)
 {
 fatorial = fatorial * count;
 }
 System.out.printf("O fatorial de %d e igual a %d", num,
 fatorial);
 input.close();
 }
 }
