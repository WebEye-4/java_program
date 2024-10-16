import java.lang.Thread;

class Mythrd1 implements Runnable{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            //runnable is a interface 
            System.out.println("thread using runnable interface/......");
        }
    }

}

class mythrd2 extends Thread{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            //thread is class
            System.out.println("thread using Thread class");
        }
        
    }
}

public class Thread_using_runnable {
    public static void main(String[] args)
    {
        Mythrd1 t1=new Mythrd1();
        Thread th=new Thread(t1);//we assign the interface class reference into the thread objects
 
        mythrd2 t2=new mythrd2();

        th.start();
        t2.start();
    }
}
