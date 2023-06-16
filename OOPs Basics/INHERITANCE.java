//INHERITANCE EXAMPLE
public class INHERITANCE {
    public static void main(String args[])
    {
       // now we make a object of fish
       Fish shark = new Fish();
       shark.eat();
    }
    
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//derived class

class Fish extends Animal      //extends is a keyword. extend access all the properties of animal class.
{
   int fins;

   void swim() {
      System.out.println("swims in water");
   }
}