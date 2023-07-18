class Student {
    static void display() {
        System.out.println("mca");
    }
}

class Student1 extends Student {
    static void display() {
        System.out.println("mba");
    }
}

public class Overhidden {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.display();
        Student s2 = new Student1();
        s2.display();  // method overhidden
    }
}
