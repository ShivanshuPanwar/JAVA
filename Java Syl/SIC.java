// example of static , instance , constructor execution 

class Student {
    static {  // static block execute once in class life time 
        System.out.println("STATIC Block");
    }
    {  // instance block execute every time when object created
        System.out.println("Instance Block");
    }
    Student() {
        System.out.println("Constructor");
    }
}

public class SIC {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

    }
}