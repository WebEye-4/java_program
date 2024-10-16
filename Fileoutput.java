import java.io.*;
public class Fileoutput
{
    public static void main(String[] args) throws Exception
    {
         FileOutputStream fos=new FileOutputStream("hello12.txt");
        
         fos.write(50);
         fos.flush();
         System.err.println("data saved in file");
         fos.close();
    }
}