package array;

public class SumofArray {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i+1;

        } 
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
                
               sum+=a[i];
            
            }
        System.out.println(sum);
    }
}
