import java.lang.Thread;
class thrd extends Thread{
  public void run()
  {
        for(int i=0;i<200;i++)
        {
            System.out.println("first thread.......");
        }
  }
}
class thrd2 extends Thread{
  
   public void run(){
   for(int i=0;i<200;i++)
   {
    System.out.println("its our  second thread///////");
   }
    }
}
public class Thread_j {
    public static void main(String[] args)
{

      thrd t1=new thrd();
      thrd2 t2=new thrd2();

      t1.start();
      t2.start();


}
}
