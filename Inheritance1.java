class inherit{
    void hello()
    {
        System.out.println("i am hello method on inherit class");
    }
}
class derived extends inherit{
void hello1()
{
    System.out.println("i am hello1 method in derived class");
}
}
class Inheritance{
    public static void main(String[] args)
    {
  derived obj=new derived();
  obj.hello();
    }
}