class Su{
    void prnt()
    {
        
  System.out.println("i am on parent class");
  
    }
}
class Cld extends Su{
    int a;  //class variable (a)
    void prnt()
    {
        int a=20;

        this.a=10;//its indicate class variable (a)
  
        System.out.println(this.a);//here class variable (a) will be executed

        System.out.println("i am on a child class");

  //if we not use super then funtion going to call itself (recursion)
        super.prnt();
        
    }
}
public class Useofer {
    public static void main(String[] args)
    {
//Cld obj=new Cld();//here we call both class method parent and child

 //  obj.child();

   //if make override function and want to run parent class function 
   //then we use super keyword its also applied on variable

    Cld obj=new Cld();
    obj.prnt();
    
    

    }
}

