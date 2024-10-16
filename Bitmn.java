public class Bitmn 
{
    public static void main(String[] args)
    {
  
  int pos=3;
    int n=5;
    int bitmask=n<<2;
    if((bitmask & n)==0)
    {
        System.out.println("bit was zero");
    }
    else
    {
        System.out.println("bit was not zero");
    }
}
}
