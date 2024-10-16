
import java.util.*;
public class Stringmthd {
    public static void main(String[] args)
    {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter any String");
        String val=scn.nextLine();

        System.out.println("enter the character which you want to check ocurence of character");
        char getchar=scn.next().charAt(0);
        System.out.println("your input character is: "+getchar);
        
int a=0;
        for(int i=0;i<val.length();i++)
        {
             if (val.charAt(i)==getchar) 
             {
              a++;
              System.out.println("At "+i+" index found");
             }
           else
        {
            System.out.println("\nAt "+i+" index not found");
        }
        }
         
        System.out.println("\n Ocurence of your variable in given sentences is: "+a);
      



    }

    
}
