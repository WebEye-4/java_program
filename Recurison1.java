
import java.util.*;
public class Recurison1{
  static int fact(int n)
   {
 if(n==1||n==0)
 {
    return 1;
 }
 else{
    return n*fact(n-1);
 }

   }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number for factorial");
      int a=sc.nextInt();
  System.out.println("Ans:"+fact(a));
    }
}
