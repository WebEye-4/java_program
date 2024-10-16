class A{
   void meth1(){
   System.out.println("i am meth 1 of class A");
    }
}
class B extends A{
   @Override
    void meth1()
    {
        System.out.println("i am meth1 of class B");
    }
}
public class Overrd {
    public static void main(String[] args)
    {
A obj=new A();
obj.meth1();
B oj=new B();
oj.meth1();
    }
}
