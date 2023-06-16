public class C1 {
    public static void main (String args[]) {
        Village s1 = new Village("Mawana");
        System.out.println(s1.name);

    } 
}

class Village {
    String name;
    int popl;

    Village(String name) {
        this.name =name;

    }
}
