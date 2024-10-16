class Monkey{
    void jump()
    {
        System.out.println("monkey is jumping");
    }
    void bite()
   {
    System.out.println("monkey bite a man");
   }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    public void eat()
    {
        System.out.println("monkey is eating something");
    }
    public void sleep()
    {
        System.out.println("mokey is sleeping");
    }
}
public class Cwh2 {
    public static void main(String[] args)
    {
        Human obj=new Human();
        obj.bite();
        obj.eat();
        obj.sleep();
        obj.jump();

    }
}
