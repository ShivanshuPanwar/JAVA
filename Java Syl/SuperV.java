// Java code to show use of super keyword with variables
 

class Car {
    int maxspeed =180;
}

class Swift extends Car {
    int maxspeed = 200;

    void display() {
        // print maxSpeed of base class Car
        System.out.println(super.maxspeed);
    }
}

public class SuperV {
    public static void main(String[] args) {
        Swift D = new Swift();
        D.display();

    }
}
