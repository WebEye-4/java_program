public class Bitwise_optr {
    public static void main(String[] args)
    {

        int a=10;
        int b=20;
          

        int c=a|b;   //here | means (OR-gate) 
        //a=1010
       //b=10100
        //c=a or b => c=(11110)=>in integer (30)
        System.out.println(c);

        int d=a&b;
         //a=01010
         //b=10100
        //c=a and b => c=(00000)=>in integer(0)
        System.out.println(d);
        
        int e=a^b;
         //a=01010
         //b=10100
         //c=a ex-or b => c=(11110)=> in integer(30)
         System.out.println(e);


         //*important note a|b=(a&b)+(a^b)












    }
}
