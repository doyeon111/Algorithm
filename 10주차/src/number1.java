import java.util.Scanner;
public class number1
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input: N= ");
      int number = sc.nextInt();
      if((number & 1) == 0)
      {
         System.out.println("Output: Even");
      }
      else
      {
         System.out.println("Output: Odd");
      }
      sc.close();
   }
}