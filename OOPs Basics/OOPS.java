public class OOPS {

    public static void main(String args[]) {
        Pen p1 = new Pen();  // created a pen object called p1 
        p1.setColor("Blue");
        System.out.println(p1.getColor());  // dot operator is used for accessing properties of a function or object 
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Amit Kumar Goyal";
       // myAcc.setPassword("abcdefghi");  // this not accessible bcos we use private access modifier.
       myAcc.setPassword("abcdefghi");
    }

}

class BankAccount 
{
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
    
}

class Pen 
{   
    //Properties + function
    String color;
    private int tip;

    String getColor()
    {
        return this.color;     //this keyword is used to refer to the current object
    }
    
    int getTip()
    {
        return this.tip;
    }
    
    void setColor(String newColor) 
    {
        color = newColor;
    }

    void setTip(int newTip)  
    {
        tip = newTip;
    }
}

class Student 
{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math)
    {
        percentage = (phy + chem + math)/3;
    }
}