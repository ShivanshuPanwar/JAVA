public class CONSTRUCTOR {
    public static void main(String args[]) {
        Student s1 = new Student("Shiva");
        System.out.println(s1.name);
        //Student s1 = new Student();

    }
    
}

class Student {
    String name;
    int roll;

    Student(String name)   //parameterized constructor
    {
        this.name = name;
    }

    /*
    Student()   //this is called non parameterized constructor
    {
        System.out.println("constructor is called..");
    } 
    */
}