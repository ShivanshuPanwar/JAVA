// MULTIPLE INHERITANCE 

public class MULINH {

    public static void main(String args[])
    {
       Horse horse = new Horse();
       horse.walk();
    }
    
}


interface Animal 
{
    int eyes = 2;
    public void walk();  

}

interface Herbivore   // an animal that only eats grass and plants
{

}


class Horse implements Animal,Herbivore //Multiple inheritance is possible in java with the help of interface
{
    public void walk()
     {
        System.out.println("walks on 4 legs");
     }
}

