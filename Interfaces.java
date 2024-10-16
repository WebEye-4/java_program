interface I{
    void fun1();
}
interface I2{
    void fun2();
}
interface I3{
    void fun3();
}
class Inhrt implements I,I2,I3{
public  void fun1()//its necessary to define a function with ppublic keyword
{
    System.out.println("its function from interface1");
}
public void fun2()
{
    System.out.println("its function from interface2");
}
public void fun3()
{
    System.out.println("its function from interface 3");
}

}
public class Interfaces {
    public static void main(String[] args)
    {
//we cant create object of interface but we can take a reference of interface
   Inhrt obj=new Inhrt();
   I obj1=new Inhrt();
   obj.fun1();//but we call only these function which is belong to (I1)
   obj.fun1();

}
}
