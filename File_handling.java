import java.io.IOException;
import java.io.File;
public class File_handling {
    public static void main(String[] args)throws IOException
    {
      
        File f1=new File("C:/Users/asimq/java dev/fileHandling/firstfile");
       
        f1.createNewFile();//its create new file and take name from path which we given already
       
       //now its show true
        System.out.println("file exist:"+f1.exists());//its check file exist or not (true or fals)
       f1.delete();

       System.out.println("file exist:"+f1.exists());
    }
}
