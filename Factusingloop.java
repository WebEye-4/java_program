import java.util.*;
public class Factusingloop {
    public static void main(String[] args)
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number for factorial");
int a=sc.nextInt();
 int fact=1;
for(int i=1;i<=a;i++)
{
 
    fact=fact*i;

}
System.out.println(fact);

    }
}
