public class INTERFACES {

    public static void main(String args[])
    {
       Horse horse = new Horse();
       horse.walk();
    }
    
}


interface Animal  // interface is a keyword
{
    public void walk();  // walk define here //walk is a function here
    //Animal()     // Interfaces can not have constructors
   // void eat() {}   // no abstract method is not possible in inside interface


}


class Horse implements Animal  // interfaces are implements(means use interface) in java not extend
{
    public void walk()
     {
        System.out.println("walks on 4 legs");
     }
}
