import java.util.*;
public class StringtoInt {
    public static void main(String[] args)
    {
  System.out.println("Enter any string");
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println("this is string");
  System.out.println(s);
  System.out.println("this is integer type");
  int i=Integer.parseInt(s);
  System.out.println(i);
    }
}
