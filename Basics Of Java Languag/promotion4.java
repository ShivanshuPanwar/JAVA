// What will be the type of result in the following Java code?
// (Hint : Look at the largest data type among these)

public class promotion4 {
    public static void main(String atrgs[])
    {
        byte b = 4;
        char c ='a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);

        System.out.println(result);
 

    }
}
