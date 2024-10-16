class hello{
    int a;
    void seta(int a)
    {
        this.a=a; 
    }
    int geta()
    {
        return a;
    }
}
public class Keyw {
    public static void main(String[] args)
    {
 hello obj=new hello();
 obj.seta(5);
System.out.println(obj.geta());
    }
}
