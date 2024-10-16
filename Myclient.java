import java.net.*;
import java.io.*;
import java.util.*;
public class Myclient
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
          
        Socket s=new Socket("localhost",1018);
          OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
        PrintWriter pw=new PrintWriter(osw);
        System.out.println("Enter  message for server");
        String str=sc.nextLine();
         pw.println(str);
       // pw.println("how are you??");

        pw.flush();
        System.out.println("waiting for server reply..");
        
         InputStreamReader in=new InputStreamReader(s.getInputStream());
         BufferedReader br=new BufferedReader(in);
         String srvr=br.readLine();
         System.out.println("server:"+srvr);
       
   
       pw.close();
         br.close();
         osw.close();
         in.close();
     

    }
}