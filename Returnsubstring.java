import java.util.*;
public class Returnsubstring {
    public static void main(String[] args)
    {
    

     Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of array");
 int size=sc.nextInt();
     String arr[]=new String[size];
System.out.println("Enter the string");

     for(int i=0;i<size;i++)
     {
        arr[i]=sc.next();
     }

     for(int i=0;i<size-1;i++)
     {
        for(int j=i+1;j<size;j++)
        {
            if(arr[i].compareTo(arr[j])>0)
            {
               String temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;

            }
        }
     }

     System.out.println("After arrangement/");
     for(int i=0;i<size;i++)
     {
        System.out.println(arr[i]);
     }
     
 
    
    }
}
