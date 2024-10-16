class Outer{
    //its non-static inner class
    class Inner{
    public void fun()
    {
        System.out.println("i am non-static inner class");
    }
    }
}
class Outer2{
    static class Inner2{
        public void fun2()
        {
            System.out.println("i am static inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args)
    {

//making a boject of non static inner class
//we first make outer class objecr 
Outer outobj=new Outer(); 
//the help of outer class name and object we will create inner class obj
   Outer.Inner inobj=outobj.new Inner();
   inobj.fun();

   //now we going to create static inner class obejct

   Outer2.Inner2 nonst=new Outer2.Inner2();
   nonst.fun2();
   

    }
}
