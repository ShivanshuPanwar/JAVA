// program of constructor overloading
class Student {
    int id;
    String name;
    int age;
    Student(int i,String n) {
        id = i;
        name = n;
        System.out.println(id + name);
    }
    Student(int i,String n,int a) {
        id = i;
        name = n;
        age = a;
        System.out.println(id + name + age);
    }
}

public class ConsOL {
    public static void main(String[] args) {
        Student S1 = new Student(1,"shiva");
        Student S2 = new Student(2,"shivam",19);
    }
}