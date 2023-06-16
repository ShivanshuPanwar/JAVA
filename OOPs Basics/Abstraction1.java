public class Abstraction1 {
    public static void main(String args[])
    {
        Department MCA = new Department();
        MCA.student();
        
       
    }
}

abstract class KIET 
{ 
    void name()
    {
        System.out.println("KIET GROUP OF INSTITUTIONS:");

    }
    
    abstract void student();  
}

class Department extends KIET
{
   void student()     
   {
    System.out.println("10000");
   }
}