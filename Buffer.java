import java.util.*;
import java.io.*;
public class Buffer {
    public static void main(String[] args) throws IOException
    {
        //its used for take input from user
      //it used before scanner was invented    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter the number");
     int a=Integer.parseInt(br.readLine());
     System.out.println("Enter the second number");
     int b=Integer.parseInt(br.readLine());
     int c=a+b;
     System.out.println(c);

    }


}
