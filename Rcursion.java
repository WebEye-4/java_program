public class Rcursion {
    public static void Printrec(int n)
    {
      
  if(n==0)
  {
    return;
  }
  else{
    System.out.println(n);
   
  }
   Printrec(n-1);
    }
    public static void main(String[] args)
    {
  Printrec(5);
    }
}
