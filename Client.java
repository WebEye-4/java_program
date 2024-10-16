import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args)
    {
        try{
            System.out.println("client waiting...");
        Socket sos=new Socket("localhost",9707);
       BufferedReader userinput=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the String.");
         String str=userinput.readLine();
         PrintWriter out=new PrintWriter(sos.getOutputStream(),true);
         out.println(str);
         Bufferedreader in=new Bufferedreader(new InputStreamReader(sos.getInputStream()));
         System.out.println(in.readLine());  


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    }
}
