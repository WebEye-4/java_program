class Prt{
    void print(int n)
    {
      

        if(n%2!=0)
        {
            System.out.println(n);
       }
       if(n==100)
       {
        System.out.println("the end  ('_')   ");
        return;
       }
        print(n+1);
}
}
public class Print_odd_re {
    public static void main(String[] args)
    {
        Prt obj=new Prt();
       obj.print(1);
    }
}
