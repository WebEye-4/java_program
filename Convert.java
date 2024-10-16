import java.util.*;
public class Convert{
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any integer number");
          int a=sc.nextInt();
          String s=String.valueOf(a);
          System.out.println(s);
          if(a==Integer.parseInt(s))
          {
            System.out.println("Good job");
          }
          else{
            System.out.println("wrong answer");
          }
    }
}