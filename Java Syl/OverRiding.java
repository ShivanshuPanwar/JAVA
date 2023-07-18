class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Horse extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}

public class OverRiding {
    public static void main(String args[]) {
        Horse John = new Horse();
        John.eat();
          
    }
}