class Hl extends Thread{
   public void run()
   {
    System.out.println("hello");
   }
}
class  Hy extends Thread{
    @Override
    public void run()
    {
        System.out.println("byyyee");
    }
}
public class Cwh3 {
    public static void main(String[] args)
    {
  
        Hl obj=new Hl();
        Hy obj1=new Hy();
        obj.setPriority(6);
        obj1.setPriority(2);
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
    }
}
