// example of static block and variable

class StaticB {
    static int a = 5;
    static int b;
    static {
        b = a * 5;
    }
    public static void main(String[] args) {
        System.out.println("Example of static members");
        System.out.println(a);
        System.out.println(b);
    }
}
