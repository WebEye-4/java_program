class Runablethread implements Runnable{
    public void run()
    {
int i=0;
while(i!=100)
{
    System.out.println("hello");
    System.out.println("i am thread 1");
    i++;
    
}
    }
}
class Runablethread2 implements Runnable{
    public void run()
    {
        int i=0;
        while (i!=100) {
            System.out.println("heyyyuuyyuu");
        System.out.println("i am a thread 2");
        i++;
            
        }
    }
}
public class Thread2rnbl {
    public static void main(String[] args)
    {
  Runablethread obj1=new Runablethread();
  Runablethread2 obj2=new Runablethread2();
  Thread t1=new Thread(obj1);
  Thread t2=new Thread(obj2);
  t1.start();
  t2.start();
    }
}
