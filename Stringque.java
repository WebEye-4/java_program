import java.util.*;
public class Stringque {
    public static void main(String[] args)
    {
        //reverse the string
        StringBuilder sb=new StringBuilder("hello");

        for(int i=sb.length()-1;i>=0;i--)
        {
      int back=i;
     
      char backchar=sb.charAt(i);

          System.out.println(backchar);
        }

   
    }
}
