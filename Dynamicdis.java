class Super{
   void meth1()
    {
System.out.println("I am meth 1 in Super");
    }
}
class Sub extends Super{
    void meth()
    {
        System.out.println("i am mehtod in SUb");
    }
}
public class Dynamicdis {
    public static void main(String[] args)
    {
  er obj=new Sub();
 // obj.meth();  //here we cant call a sub class method . its possible only from override technique

obj.meth1(); 
    }
    
}
