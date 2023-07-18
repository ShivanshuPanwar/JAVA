// example of constructor explicitly call
//also exmaple of super with constructor

class Student {
    Student() {
      System.out.println("Kietian");
    }
}

class MCA extends Student {
      MCA() {
        super();
      }
}

public class CONS4 {
    public static void main(String[] args) {
       MCA C = new MCA();
    }
}