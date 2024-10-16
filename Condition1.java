import java.util.Scanner;
public class Condition1 {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the input for A");
int a=sc.nextInt();
System.out.println("Enter the number for B");
int b=sc.nextInt();
if(a==b)
{
    System.out.println("a is equal to b");
}
else if(a>b)
{
    System.out.println("a is grater");
}
else{
    System.out.println("a is lesser");
}
    }
}
