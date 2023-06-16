// example of method overriding

public class OVERRIDING {
    public static void main(String args[])
    {
         Deer d = new Deer();   // this is object of child class
         d.eat();
    } 
}

// method overiding(Run Time Polymorphism)
class Animal      // parent class
{
    void eat()
    {
        System.out.println("eat anything");
    }
}

class Deer extends Animal    // child class
{
    void eat()
    {
        System.out.println("eats grass");
    }
}
