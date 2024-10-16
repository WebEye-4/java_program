import java.io.*;
class Printwriter{
    public static void main(String[] args) throws Exception
    {
        try{
        File file=new File("C:\\Users\\asimq\\java dev\\fileHandling\\hello.txt");
      
        PrintWriter pw=new PrintWriter(file);

        pw.print("hello its our file content");
         System.out.println("file successfully generated");
        BufferedReader br=new BufferedReader(new FileReader("hello.txt"));
        String s;
        while((s=br.readLine())!=null)
        {
            System.out.println(s);
           
        }
   
    br.close();
    
    
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       



  
    }
}
