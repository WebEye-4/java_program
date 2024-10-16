class Mdfr{
    private int a;//private member only acces from this class
    protected void fun()//protected can acces from this class and child class
    {
        System.out.println("hello i am on protected function");
     a=10;
     System.out.println(a);
    }
}
public class Accsmdfr extends Mdfr  {//in one java file can contain only one public class
    public static void main(String[] args)
    {
 Mdfr obj=new Mdfr();
 obj.fun();
    }
}
