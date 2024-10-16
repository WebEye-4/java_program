package array;
import java.util.*;

public class checknumbernature {
    //wap to find how many number -ve,-ve,0,even,odd

    public static void main(String[] args)
    {
        int N=0,P=0,Z=0,E=0,O=0;
        
    Scanner sc=new Scanner(System.in);
          int []a=new int[10];

          System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0) P++;
            else if(a[i]<0) N++;
            else {Z++;}
            if(a[i]%2==0)E++;
            else{O++;}
        }
            System.out.println(P+"  POSITIVE NUMBERS");
            System.out.println(N+"  NEGATIVE NUMBERS");
            System.out.println(E+"  EVEN NUMBERS");
            System.out.println(O+"  ODD NUMBERS");
            System.out.println(Z+"  ZEROS");

    }
}
