public class patter20 {
    public static void main(String[] args)
{
    for(int i=1;i<=4;i++)
    {
        for(int j=i;j<=4-i;j++)
        {
          System.out.print(" ");
        }
       for(int k=0;k<i;k++)
       {
        System.out.print("*");
       }
        
        System.out.println();
    }
}

}
