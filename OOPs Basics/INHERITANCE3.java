public class INHERITANCE3 {
    public static void main(String args[])
    {
        Fish shark = new Fish();
        shark.eat();
    }
}

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
   void walk() {
    System.out.println("walks");
   }
}

class Fish extends Animals {
   void swim() {
    System.out.println("swim");
   }
}

class Bird extends Animals {
     void fly() {
        System.out.println("fly");
     }
}
