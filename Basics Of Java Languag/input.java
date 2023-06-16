// Input in Java
import java.util.*; //package in java
public class input
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
      // String input = sc.next(); It provides only single text. next() not contain space 
       
      String input = sc.nextLine();
      System.out.println(input);
       
      int a=sc.nextInt();
      System.out.println(a);

      float price =sc.nextFloat();
      System.out.println(price);

    }
}