public class Handeler{

    public static void main(String[] args)
    {
  
   Handeler hnd=new Handeler();
 
     Runnable r=new Runnable() {
        public  void run()
        {
            try {
                Thread.sleep(5000);
                System.out.println("i am in run method");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
     
        }

     };   

     r.run();
   

            
}
}