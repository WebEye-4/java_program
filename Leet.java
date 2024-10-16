import java.util.*;
public class Leet{
    public static void main(String[] args)
    {
        int target=9;
        int nums[]=new int [10];
int j=0;
       Scanner sc=new Scanner(System.in);



    for(int i=0;i<nums.length;i++)
    {
          nums[i]=sc.nextInt();
    }
        for(int i=0;i<nums.length-1;i++)
        {
            if((nums[i]+nums[i+1])==target)
            {
                j=i;
                break;
                    
            }
        }
       if(j!=0)
       { System.out.println("["+j+","+(j+1)+"]");
    }
sc.close();
    }
}