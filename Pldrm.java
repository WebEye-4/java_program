import java.util.*;
public class Pldrm {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
int c=a;
int r=0;
int temp=0;
  while(a>0)
  {
   r=a%10;
   temp=(temp*10)+r;
   a=a/10;
  }
 
  if(c==temp)
  {
    System.out.println("its palindrome number");
  }
  else
  {
    System.out.println("its not palindrome  ");
  }
  


    }
}
