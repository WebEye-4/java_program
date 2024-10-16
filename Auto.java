import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Auto {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException,AWTException,InterruptedException
    {
       
        String str="Hello webeye";
        StringSelection strsel=new StringSelection(str);
        Clipboard clp=Toolkit.getDefaultToolkit().getSystemClipboard();
         clp.setContents(strsel,null);

        Thread.sleep(000);
        

         Robot rb=new Robot();

         rb.keyPress(KeyEvent.VK_CONTROL);
         rb.keyPress(KeyEvent.VK_V);
         
         rb.keyRelease(KeyEvent.VK_CONTROL);
         rb.keyRelease(KeyEvent.VK_V);
 


        


    }
}
