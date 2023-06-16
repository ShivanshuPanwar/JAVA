public class INHERITANCE1 {
    public static void main(String args[])
    {
        // now we make a object of dog
        Dog seezer = new Dog();
        seezer.eat();
        seezer.legs = 4;
        System.out.println(seezer.legs); 
    }
    
}

// base class
class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animals 
{
    int legs;
}

class Dog extends Mammal {
    String breed;
}