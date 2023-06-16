public class A {
    public static void main(String args[]) {
       Department A = new Department();
       A.student();
       
    }
}

abstract class KIET {
    void employee() {
        System.out.println("total emp is 500");
    }
    abstract void student();
}

class Department extends KIET {
    void student() {
        System.out.println("total student is 5000+");
    }
}