import java.io.*;
public class Copy
{
    public static void main(String[] args) throws Exception
    {
      FileInputStream fis=new FileInputStream("hello.txt");
      
      FileOutputStream fos=new FileOutputStream("hello01.txt",true);
 int a;
      while((a=fis.read())!=-1)
      {
        System.out.print((char)a);
         fos.write(a);
         fos.flush();
        
      }
      fos.close();
      fis.close();
      System.out.println("copy file successfully//");


    }
}