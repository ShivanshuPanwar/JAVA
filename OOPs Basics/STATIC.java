public class STATIC {
    public static void main(String args[])
    {
      Student.school = "DPS";
      // jisko hum static bna the hai unko hum class ke naam se access kar sak the hai 
      
     Student student1 = new Student();
     // student1.name = "tony";
     System.out.println(student1.school);
    }
    
}


class Student 
{
    String name;
    static String school; // ab jitne bhi object bnenge student ke unke school ka name common hoga

    // static function

    public static void changeSchool()
    {
        school = "newschool";
    }

}
