//ssimport java.util.*;
public class Factorial{
    public static int CfacTorial(int n)
    { 
    if(n==1||n==0)
    {
        return 1;
    }
   int fact1=CfacTorial(n-1);

   int fact2=n*fact1;

   return fact2;

    }
    public static void main(String[] args)
    {
  // Scanner sc=new Scanner(System.in);

//System.out.println("enter the number which you want to get factorial");
// int n=sc.nextInt();

   System.out.println(CfacTorial(5));
    }
}