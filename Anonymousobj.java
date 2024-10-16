class A{
public A()
  {
    System.out.println("Object created");
  }
    void show()
    {
System.out.println("i am in show");
    }
}
public class Anonymousobj {
    public static void main(String[] args)
    {
        //  A obj=new A();
        //  obj.show();
        //  obj.show();//we call again but here object is not created in second time 
new A().show();//Anonymous obj
new A().show();//here object will be created everytime when we execute this statement


    }
}
