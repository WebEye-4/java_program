//question- write a abstract class pen and create two method refil and writ

abstract class pen{
abstract void refil();
abstract void write();
}
class Fountain extends pen{
    void refil()
    {
        System.out.println("refiling");
    }
    void write()
    {
        System.out.println("writing something");
    }
}
public class Cwh {
    public static void main(String[] args)
    {
 Fountain obj=new Fountain();
 obj.refil();
 obj.write();
    }
}
