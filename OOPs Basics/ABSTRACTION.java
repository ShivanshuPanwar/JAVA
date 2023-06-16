public class ABSTRACTION {
    public static void main(String args[])
    {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);

       // Animal a = new Animal();   it gives error because it is abstract class
    }
}

abstract class Animal 
{
    String color;

    Animal()   // constructor
    {
        color = "brown";
    }
    void eat()
    {
        System.out.println("animal eats");

    }
    
    abstract void walk();   // it is only idea
}

class Horse extends Animal
{
    void changeColor() 
    {
        color = "dark brown";
    }
   void walk()     // it is idea which is implemented by Horse
   {
    System.out.println("walks on 4 legs");
   }
}

class Chicken extends Animal
{
   void walk() {
    System.out.println("walks on 2 legs");
   }
}