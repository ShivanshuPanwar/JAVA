// sum of 1 to n natural number
import java.util.*;
public class For1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n= sc.nextInt();
        System.out.println("Enter a natural number for sum:" +n);
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of n natural number is:" +sum);
    }
}