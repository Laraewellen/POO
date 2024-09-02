import java.util.Scanner;


public class calculo
{
  public static void main(String [] args){

      int num1, num2; 
    
      Scanner input = new Scanner(System.in); //instanciar e declarar

      System.out.println("Digite um número: ");

      num1 = input.nextInt();

      System.out.println("Digite um número: ");

      num2 = input.nextInt();

      System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
      System.out.printf("raiz quadrada de %d = %f/n", num1, Math.sqrt(num1));
      System.out.printf("%d ao quadrado é %f", num2, Math.pow(num2, 2));
  }

}