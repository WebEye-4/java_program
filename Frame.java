import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Frame {
    public static void mian(String[] args)
{

         
    
      JFrame jf=new JFrame();

         jf.setVisible(true);
         jf.setBounds(100, 100, 100, 100);
           jf.setLayout(null);

           JButton btn=new JButton("Hello world");

           btn.setSize(100,500);

           jf.add(btn);
           

    

}

}
