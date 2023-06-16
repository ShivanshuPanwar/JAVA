import java.util.*;
public class typeconversion1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       float number = sc.nextInt(); // value of int is passed to float
        //int number = sc.nextFloat(); // this gives error of type not convert float into int
        System.out.println(number);
    }
}
