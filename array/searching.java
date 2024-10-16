package array;
import java.util.*;
public class searching {
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
           System.out.println("enter the sizze of array");

           int s=sc.nextInt();
          int []a=new int[s];
          System.out.println("enter the element of array");
          for(int i=0;i<a.length;i++)
          {
                  a[i]=sc.nextInt();
          }
          System.out.println("Enter n which you want to search");
          int n=sc.nextInt();

          for(int i=0;i<a.length;i++)
          {
            if(a[i]==n)
            {
                System.out.println("found at index:"+(i+1));
                return;
            }
           
          }
           System.out.println("not found");
               
             
         


    }

    
}
