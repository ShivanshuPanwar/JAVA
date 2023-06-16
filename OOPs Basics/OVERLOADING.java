//method overloading example

public class OVERLOADING {
    public static void main(String args[])
    {
         Calculate calc = new Calculate();
         System.out.println(calc.sum(1,2));
         System.out.println(calc.sum((float)1.5, (float)2.5));  // we use float before value of a is due to it not accept double result
         System.out.println(calc.sum(1,5,7));
    }

}

class Calculate
{
    //this is method overloading(Compile time Polymorphism)
    int sum(int a,int b)
    {
        return a + b;
    }

    float sum(float a,float b)
    {
        return a + b;
    }

    int sum(int a,int b,int c)
    {
        return a + b + c;
    }
}
