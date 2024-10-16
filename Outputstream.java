import java.io.*;
import java.util.Scanner;
public class Outputstream {
    public static void main(String[] args) throws IOException
    {
      /* = File f1=new File("c:/Users/asimq/java dev/fileHandling/file3.txt");
   
       f1.createNewFile();
       */
        FileOutputStream fm;
        fm=new FileOutputStream("file3.txt",true);
//if not use true then first compler remove all data and write new data
        String s="its my second file ";

        char []cr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            fm.write(cr[i]);
        }
        

        File obj=new File("file3.txt");

        Scanner sc=new Scanner(obj);
System.out.println();
System.out.println();
        while(sc.hasNextLine())
        {
            String data=sc.nextLine();
            System.out.println(data);
        }
        fm.close();
        sc.close();
    }
}
