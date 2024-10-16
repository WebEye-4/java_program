
class A{
 public A()
 {
    System.out.println("A1");
 }   
}
class B extends A{
    public B()
    {
        this(10);//this() use for call present class cons/method
        System.out.println("B1");
    }
    public B(int a)
    {
 //here is inbuilt super() so before executing B2 its called parent class cons
       
 System.out.println("B2");
    }
}
public class Cons_chaning {
    public static void main(String[] args)
    {
   B obj=new B();
    }
}
