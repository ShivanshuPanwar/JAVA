class Car {
    void speed() {
        System.out.println("max speed 180");
    }
}

class Alto extends Car {
    void speed() {
        System.out.println("max speed is 100");
    }

    void display() {  // Note that display() is only in Student class
        speed();   // will invoke or call current class message() method
        super.speed();  // will invoke or call parent class message() method

    }
}

public class SuperM {
    public static void main(String[] args) {
        Alto Z = new Alto();
        Z.display();  // calling display() of Alto
    }
}