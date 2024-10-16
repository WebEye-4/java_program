class ovrld{
    public void ovr(int a)
    {
        
        System.out.println("first method"+a);
    }
    public void ovr(String b)
    {
System.out.println("second method  "+b);
    }
    public void ovr()
    {
        System.out.println("third method");
    }
}

public class Method_overloading {
    public static void main(String[] args)
    {
        ovrld obj=new ovrld();
//create a method with same name but different parameters is called method overloading
        obj.ovr();
        obj.ovr(5);
        obj.ovr("hello");
    }
}
