import java.util.Scanner;


public class soma
{
  public static void main(String [] args){

      int num1, num2; 
    
      Scanner input = new Scanner(System.in); //instanciar e declarar

      System.out.println("Digite um número: ");

      num1 = input.nextInt();

      System.out.println("Digite um número: ");

      num2 = input.nextInt();

      System.out.printf("%d+%d=%d", num1, num2, num1+num2);
  }

}