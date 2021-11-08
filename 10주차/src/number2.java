import java.util.Scanner;

public class number2
{

    static int x=32;
    static String toggleCase(char[] a)
    {
        for (int i=0; i<a.length; i++) {
       

            a[i]^=32;
        }
        return new String(a);
    }
     

    public static void main(String[] args)
    {
        System.out.print("Input: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = toggleCase(str.toCharArray());
        System.out.println("Output: " + str);

 
    }
}