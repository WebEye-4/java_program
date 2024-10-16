import java.io.IOException;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
public class Rntime {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException
    {
     
     Runtime rn=Runtime.getRuntime();
    String[] a=new String[]{"C:\\WINDOWS\\System32\\notepad.exe"};

         rn.exec(a);

         Thread.sleep(2000);

      Robot robot=new Robot();
        
      robot.keyPress(KeyEvent.VK_H);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_E);
      Thread.sleep(1000);
      robot.keyPress(KeyEvent.VK_L);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_L);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_O);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_ENTER);
      Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_D);
        Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_E);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_V);


     

    }
}
