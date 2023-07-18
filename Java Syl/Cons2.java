class Student {
    int age;
    String name;
    Student(int age,String name) {
        System.out.println(age + name);
    }
}

public class Cons2 {
    public static void main(String[] args) {
        Student S1 = new Student(19,"shiva");
        Student S2 =new Student(20,"shiv");

    }
}