class myemp{
    int id;
    String name;
  
    public myemp(int a,String b)
    {
        id=a;
        name=b;
    }
 
}
public class Constructor
 {
    public static void main(String[] args)
    {
   
       //myemp obj=new myemp();
        //System.out.println(obj.id);
        //System.out.println(obj.name);
        
        //we can also use parameter with constructor
    myemp obj=new myemp(3,"qazi");
    System.out.println(obj.id);
        System.out.println(obj.name);

    }
    
}
