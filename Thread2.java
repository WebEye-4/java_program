import java.util.*;

class Myth extends Thread
{
     public void run()
         {
         int n=0;
         while(n!=200)
         {
              System.out.println("Hello i am thread");
              n++;
             try{
                 sleep(400);
             }catch(Exception e)
             {
                  e.printStackTrace();
             }
        }
         }
}
class Myth2 extends Thread{
  @Override
    public void run()
    {
        int n=0;
while(n!=200)
{
    System.out.println("hello i am also a thread");
        n++;
}

}

}
public class Thread2  {
    public static void main(String[] args)
    {
        Myth obj2=new Myth();
        Myth2 obj=new Myth2();
      obj.start();
      obj2.start();
    


    }
}
