public class Sumofnatural {
    public static void Sumofn(int n ,int i,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Sumofn(n,i+1,sum);

    }
    public static void main(String[] args)
    {
Sumofn(5,1,0);
    }
}
