
class Stc{
    private static int a;//by default value is 0
   
    static 
    {
 //static initilization block execute only one(first time) time   
   System.out.println("value of a="+a);
       a=5;
    }

   public Stc()
   {
    System.out.println("value of a="+a);
   }

}
public class Static_initilization {
    public static void main(String[] args)
    {
  Stc obj=new Stc();
   Stc obj2=new Stc();//for all differnt obj a will be same
    }
}
