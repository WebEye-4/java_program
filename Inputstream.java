import java.io.*;
public class Inputstream {
    public static void main(String[] args)
    {

        //it is a input stream which use to take input and print
        try{
            InputStreamReader ir=new InputStreamReader(System.in); 
            System.out.println("entr some letters");//tack as int 
            int s=ir.read();

            while(ir.ready())
            {
                System.out.println((char) s);//print as char
                s=ir.read();
            }
      ir.close();
      System.out.println();
                
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //its read method which is used read data from file

 try{
         FileReader fr=new FileReader("hello.txt");
         int a=fr.read();
  while(fr.ready())
 {
       System.out.println((char) a);//if we use int the its print ascii value
       //thats why we use char

       a=fr.read();

 }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }
}
