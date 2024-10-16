import java.io.*;
public class Datainputstream {
    public static void main(String[] args) throws Exception
    {

    FileInputStream fis=new FileInputStream("hello.txt");

    int d;

    while((d=fis.read())!=-1)
    {
        System.out.print((char)d);
       
    }
    fis.close();
    System.out.println();
  


    }
}
