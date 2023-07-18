// Calling constructor with in another constructor Java

class Sum {
    float num1,num2;
    Sum(int num1,int num2) {
        this((float)num1,(float)num2);
    }
    Sum(float num1,float num2) {
        this.num1=num1;
        this.num2=num2;
    }

    float getAdd() {
        return num1+num2;
    }
}

public class CONS5 {
    public static void main(String[] args) {
        Sum s1 = new Sum(35,45);
        Sum s2 = new Sum(35.7f,25.8f);
        System.out.println(s1.getAdd());
        System.out.println(s2.getAdd());

    }
}