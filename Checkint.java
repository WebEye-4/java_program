import java.util.Scanner;
public class Checkint {
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
         System.out.println("Enter the  number");
         boolean a=sc.hasNextInt();//the hasNextInt() function check that enterd input is integer or not 
         System.out.println(a);

    }
}
