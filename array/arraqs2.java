package array;

public class arraqs2 {
    public static void main(String[] args)
    {
            int [] a=new int[5];

            a[0]=1;
            a[1]=2;
            a[2]=10;
            a[3]=4;
            a[4]=5;
    
        
               insetf(a,10);
            print(a);
    }

    public static void print(int []a)
    {
           for(int i=0;i<a.length;i++)
           {
            System.out.println(a[i]);
           }
    }
  public static  void insetf(int a[],int num)
    {
         for(int i=a.length-1;i>0;i--)
         {
             a[i]=a[i-1];
         }
         a[0]=num;
            }
    }
