class F{
   public int fct(int n)
    {
       if(n==1&&n==0)
       {
        return 1;
       }
       else{
        return n*fct(n-1);
       }
}
}
public class Factrial {
    public static void main(String[] args)
    {
        F obj=new F();
        System.out.println(obj.fct(5));

    }
}
