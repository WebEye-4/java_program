package array;
import java.util.*;
//find the largest and smallest number in the array
public class Findlarge {
    public static void main(String[] args)
    { 

        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
           
        }
int large=0;
int smallest=a[0];
        for(int i=0;i<a.length;i++)
        {
            
           if(large<a[i])
           {
            large=a[i];
           }
        }
        for(int i=0;i<a.length;i++)
        {
            if(smallest>a[i])
            {
                smallest=a[i];
            }

        }
     
        
        System.out.println("larget");
        System.out.println(large);

         System.out.println("smallest");
        System.out.println(smallest);
    }    }

