/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;

public class totalcost {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      float pencil = sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser = sc.nextFloat();
      float totalcost = pencil+pen+eraser;
      System.out.println("total amount is: " + totalcost);

      //add on 18% tax

      float newTotal = totalcost + (0.18f * totalcost);
      System.out.println("amount after 18% gst is: " + newTotal);
    }
    
}
