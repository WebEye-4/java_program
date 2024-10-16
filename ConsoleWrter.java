import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ConsoleWrter {
    public static void main(String[] args) throws FileNotFoundException
    {

   PrintWriter pw=new PrintWriter(System.out);
    
   pw.write("this is print writer class for writing console");

     pw.flush();
     pw.close();

     PrintWriter pw1=new PrintWriter(new File("D:\\java dev\\fileHandling\\using_pw.txt"));
      
     pw1.write("this is printwriter class for writing in file");
     pw1.flush();
     pw1.close();

    }    
}
