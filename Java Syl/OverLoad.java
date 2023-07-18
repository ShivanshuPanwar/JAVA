class Calculate {
    int sum(int a,int b) {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class OverLoad {
    public static void main(String args[]) {
        Calculate c = new Calculate();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
    }
}