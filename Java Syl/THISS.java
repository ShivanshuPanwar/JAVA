class Student {
    String name;
    int Rollno;
    Student(String name,int Rollno) {
        this.name=name;
        this.Rollno=Rollno;
    }
    void display() {
        System.out.println(name + Rollno);
    }
}


public class THISS {
    public static void main(String args[]) {
        Student S1 = new Student("Shiva",145);
        Student S2 = new Student("Himani", 148);
        S1.display();
        S2.display();
    }
}