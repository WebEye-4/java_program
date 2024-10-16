import java.util.*;
class Dowhile{
  public static void main(String[] args)
  {

    int n;
  do{
    Scanner sc=new Scanner(System.in);
    System.out.println("hello");
    System.out.println("if you want to exit the hello loop press 2");
     n=sc.nextInt();
   
  }while(n!=1);

  }
}