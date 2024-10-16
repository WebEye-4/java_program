import java.net.*;
import java.io.*;
import java.util.*;
public class Myserver 
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc=new Scanner(System.in);

        ServerSocket ss=new ServerSocket(1018);
        System.out.println("server waiting for connection");
        Socket s=ss.accept();
        System.out.println("conncetion established...");
          
        System.out.println("waiting for client message");

 InputStreamReader isr =new InputStreamReader(s.getInputStream());
     BufferedReader br=new BufferedReader(isr);
     String clt=br.readLine();
     System.out.println("client:"+clt);


     OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
     PrintWriter pw=new PrintWriter(osw);
    System.out.println("Enter the message for client");
    String str=sc.nextLine();
    pw.println(str);
     // pw.println("i am fine. what about you?");
    
     pw.flush();

     
     
 
  br.close();
  isr.close();
    osw.close();
  pw.close();
 

    }
}