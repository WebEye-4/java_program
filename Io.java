import java.io.*;
public class Io {
    public static void main(String[] args) throws IOException
    {
            
      
 PrintWriter pw=new PrintWriter(new File("D:\\java dev\\fileHandling\\newt.txt"));
    
  pw.write("hello");

  pw.flush();
  pw.close();




}
}
