class Pnt{
   /* 
    public Pnt()
          {
            System.out.println("its a constructor of parent class");
           }   
            */
public Pnt(int a)
{
    //its also a cons with different parameters 
    //if i want to call him so we add super methos with parameter 
System.out.println("Its another constructorn of class prnt with differnt parametes a="+a);
}
}
class Cld extends Pnt{
    //if we create without argumetn constructor then child class 
    //automaticly called super class constructor
    //but parent class have argument cons then we use super keyword for calling him
 
    public Cld()
    {
        super(5);
System.out.println("Its child class constructor");
    }
}

public class Cntctr_inhrtnc {
    public static void main(String[] args)
    {
  Cld obj=new Cld();
    }
}
