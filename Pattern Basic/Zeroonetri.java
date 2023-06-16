// 0-1 TRIANGLE

public class Zeroonetri {
    public static void main(String args[]) {
        int n=4;
        //outer loop
        for(int i=0;i<=n;i++) {
            //inner loop
            for(int j=0;j<=i;j++) {
                int sum = i+j;
                if(sum%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
