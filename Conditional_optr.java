public class Conditional_optr {
    public static void main(String[] args)
    {

/* 
       int a=Integer.parseInt(args[0]);
       int b=Integer.parseInt(args[1]);
       int c=Integer.parseInt(args[2]);

       //check greater number 
       int d=(a>b?a:b);
       System.out.println(d+" is greater  among two numbers ");
       //conditional operator or ternary operator [ ?  :]
       int e=(a>b?(a>c?a:c):(b>c?b:c));

       System.out.println(e+" is greater among three numbers");
*/

       int x=10,y,z;

       y=x++ + x++;
       z=++x + ++x;
       
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       
    }
}
