import java.util.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class Sendmsg {
    public static void main(String[] args) throws Exception
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter msg");
        String msg=sc.nextLine();


        System.out.println("enter size");
        int size=sc.nextInt();


        StringSelection stsl=new StringSelection(msg);
        Clipboard clpb=Toolkit.getDefaultToolkit().getSystemClipboard();

        clpb.setContents(stsl, null);

       Robot rb=new Robot();

       Thread.sleep(5000);
for(int i=0;i<=size;i++)
{
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);

       rb.keyRelease(KeyEvent.VK_CONTROL);
       rb.keyRelease(KeyEvent.VK_V);

       rb.keyPress(KeyEvent.VK_ENTER);
       rb.keyRelease(KeyEvent.VK_ENTER);


}


        

    }
}
