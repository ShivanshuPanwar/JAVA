public class Variables {
    static int a =10;  // static variable
    void lc() {
        int b =20; //local variable
    }

public static void main(String args[]) {
    int c=30; // instance variable
    System.out.println(a + b + c);  // it gives an error on b becauce b is a local variable 
 }
}