class tryCatch{
    //here we se try catch exception
    void Exptry()
    {
int a=10,b=50;
int c;
    try{
           c=b/0;
    }catch(Exception e){
        System.out.println("its error we found");
    }

    }
}

class throwExp extends tryCatch{
    void Expthrow()
    {
           int a=100;
        int b=200;
     if(b>a)//its condition for exception 
       throw new ArithmeticException("its Arithmetic Exception");//here exception execute and other program will not be executed
                
           System.out.println("after exception"); 
    
    
    }
}


public class Excp {
    public static void main(String[] args)
    {
      
      throwExp obj=new throwExp();


      //try catch exception
      obj.Exptry();

      //throw catch exception

      obj.Expthrow();

    }

    
}
