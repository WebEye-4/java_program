import java.util.*;
public class Func{
    public static void printMyname(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args)
    {
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter your name");
  String name=sc.next();


printMyname(name);
    }
}
