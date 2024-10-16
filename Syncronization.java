
import java.lang.*;

class Syncronize{
    void print(char a)
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(a);
        }
    }
}
class THr1 extends Thread{
    Syncronize var;
    THr1(Syncronize var)
    {
        this.var=var;
    }

    public void run()
    {
        var.print('a');
        
    }
}
class THr2 extends Thread{
    Syncronize var2;
    THr2(Syncronize var2)
    {

        this.var2=var2;
    }
    public void run()
    {
        var2.print('b');//here print() method is from parentgs class
        
    }
}
public class Syncronization{
    public static void main(String[] args)
    {
       Syncronize obj-

    }
}