import java.net.MalformedURLException; 
import java.net.*;
public class URL {

    public static void main(String args[]) throws MalformedURLException
    {
        try{
             URL u1=new URL(   "https://www.google.co.in/?gfe_rd=cr&ei=ptYq"
             + "WK26I4fT8gfth6CACg#q=geeks+for+geeks+java");
             
        }
        catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}
