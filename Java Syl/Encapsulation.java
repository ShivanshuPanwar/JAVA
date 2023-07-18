class Student {
    private String name="Vipin";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());
        s1.setName("Manoj");
        System.out.println(s1.getName());
    }
}
