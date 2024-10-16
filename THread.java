class Mythread1 extends Thread{
   public void run()
    {
        int i=0;
        while(i!=100)
        {
            System.out.println("i am watching a video");
        System.out.println("in you tube");
        i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run()
    {
       int i=0;
       while(i!=100)
       {
           System.out.println("i am reading a book");
        System.out.println("in my home");
        i++;
       }
    }
}
public class THread {
    public static void main(String[] args)
    {
   Mythread2 obj=new Mythread2();

   Mythread1 obj1=new Mythread1();

   obj1.start();//here cpu give some time to thread1 and some time thread2
   obj.start();//thats why its print alternativly
    }
}
