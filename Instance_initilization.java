
class Intc{
    private int x;//by default value is 0

    {//this is instance block initilization .here we only use breacket not any method
    //its also run every time whenever we will run this program
        System.out.println("the value of x="+x);
    }
    public Intc()//if we declare any return type to function the it will become normal method not constructor
    {
        x=5;
        System.out.println("value of x="+x);
    }
}

public class Instance_initilization{
    public static void main(String[] args)
    {
Intc obj=new Intc();
Intc obj2=new Intc();
//for all different obj x will be new in instance
    }
}
