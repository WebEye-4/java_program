import java.util.*;
class Emp{
private int id;
   public Emp(int id){

         this.id=id;

   }
   public int eid()
   {
      return id;

   }

}


public class Try {
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          int id=sc.nextInt();
        Emp obj=new Emp(id);

        System.out.println(obj.eid());


    }
}
