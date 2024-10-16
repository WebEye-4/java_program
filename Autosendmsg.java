import java.util.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class Autosendmsg {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException
    {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Text");
String text=sc.nextLine();
   System.out.println("how many times");
    int number=sc.nextInt();


     String []cmd=new String[]{"C:\\Windows\\System32\\notepad.exe"};
        Runtime run=Runtime.getRuntime();
       StringSelection str=new StringSelection(text);
       Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(str, str);

        run.exec(cmd);
        Robot rbt=new Robot();
        Thread.sleep(1000);
for(int i=0;i<number;i++)
{
          
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
         rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
}

    }
}
