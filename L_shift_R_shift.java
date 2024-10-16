public class L_shift_R_shift {
    public static void main(String args[])
    {

  //<< this is use for left shit
  //i our value is 27 and 
  //we want to shift one bit using left shift then it will become double 54
   
  //n(given number) after left shit n*2^shit(1 time 2 time etc)
  
     int a=10,b;
     b=a<<1;//<<1 show left shit one bit it will become 10*2^1=20

     int c=a<<2;
     
     System.out.println("1 bit left shift "+b);
     System.out.println("2 bit left shift "+c);

     //Right shift

     int x=10,y;
      y=x>>1;

      System.out.println("1 bit right shift "+y);

      //it work like for even number =n/2 for odd= (n-1)/2

     
      int j=13,k;
      k=j>>1;
      System.out.println("1 bit right shift for odd "+k);

      //unsigned right shift or zero filling right shift

      int m=-2,n;
      n=m>>>5;
      System.out.println("5 bit unsigned right shift "+n);
     


    }
}
