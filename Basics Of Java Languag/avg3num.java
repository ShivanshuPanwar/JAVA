/*In a program, input 3 numbers : A, B and C.You have to output the average of these 3 numbers.*/

import java.util.*;
public class avg3num {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);


    }
}
