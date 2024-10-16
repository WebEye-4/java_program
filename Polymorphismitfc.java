import javax.security.sasl.SaslException;

class Cellphone{
    void number()
    {
        System.out.println("my phone number");
    }
}
    interface cam{
     void camera();
    }
    interface gps{
        void map();
    }
class Smartphone extends Cellphone implements cam,gps{
    public void camera()//iterface method always start with public
    {
  System.out.println("recording started");
    }
    public void map()
    {
        System.out.println("searching the area...");
    }

}

public class Polymorphismitfc {
    public static void main(String[] args)
    {
        //in polymorphism same method use in different use 
        cam obj=new Smartphone();
        obj.camera();//here we use only camera method and no one else
       // obj.number();//its not allowed 

       //but using smartphone reference we access all method

       Smartphone obj1=new Smartphone();
       obj1.camera();
       obj1.number();
       obj1.map();
       
       
    }
}
