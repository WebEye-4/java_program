import java.io.*;
public class Printwr {
    public static void main(String[] args) throws Exception
    {
        PrintWriter pw=new PrintWriter("printwriter.txt");

        pw.print("its a file text which is inside the file");

        pw.flush();
        pw.close();

        System.out.println("data saved successfully");

    }
}
