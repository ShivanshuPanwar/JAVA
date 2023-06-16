import java.util.*;
public class positiveneg {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("Enter a number:" + n);
       if(n>0) {
        System.out.println("Number is positive");
       }
       else {
        System.out.println("Number is negative");
       }
    }
    
}
