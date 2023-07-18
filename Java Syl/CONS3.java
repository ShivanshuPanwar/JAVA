// explain how sub class constructor implicitly call super class constructor in java.

class A {
    A() {
        System.out.println("Default constructor");
    }
}

class B extends A {

}

public class CONS3 {
    public static void main(String[] args) {
        B b = new B();
    }
}