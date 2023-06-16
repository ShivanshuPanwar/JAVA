import java.util.*;
public class fewer {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        System.out.println("Body Temperature is:" + temp);
        if(temp>100)
        {
            System.out.println("You have a Fewer");
        }
        else {
            System.out.println("You don't have a fewer");
        }
    }
}