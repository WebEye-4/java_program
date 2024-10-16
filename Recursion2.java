public class Recursion2{
    public static void Fibo(int n)
    {
        if(n==0)
        {
            return;
        }
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        Fibo(n-1);

    }
    public static void main(String[] args)
    {
        Fibo(5);
    }
}