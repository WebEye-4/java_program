class hlo{
    public static int y=20;
    static class hii{//its called inner class
        public static String cntry="INDIA";
    }
}
public class Stc_instnc {
  static int a=10;
  
    public static void main(String[] args)
    {
  System.out.println(a);
  System.out.println(hlo.y);//here we directly access the static variable 
                            //or class or method using class name (without inheritance)
    
    
    System.out.println(hlo.hii.cntry);
                        }
}
