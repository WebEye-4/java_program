import java.net.*;

import java.io.*;
public class Server {
   public static void main(String[] args)
   {
    try{
        System.out.println("waiting for clints...");
        ServerSocket ss=new ServerSocket(9707);
        Socket sos=ss.accept();
        System.out.println("connection established now...");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(sos.getInputStream()));
        String str=br.readLine();
        PrintWriter out=new PrintWriter(sos.getOutputStream(),true);
        out.println(str);

    }
catch(Exception e)
   {
    e.printStackTrace();
   }
   } 
}
