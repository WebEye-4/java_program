import javax.swing.*;  
class Form{
 void Form()
{
    JFrame f=new JFrame("Button Example"); 
    JButton c=new JButton();
    c.setBounds(70,80,100,100);
    c.setBackground(null);
    c.setName("Press me");
      f.setSize(400,400); 
      f.add(c); 
    f.setLayout(null);  
    f.setVisible(true);
}
}  
public class Swing {  
public static void main(String[] args) {  
    
 Form obj=new Form();
   obj.Form();


    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
      f.add(b);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
  

}  
}  
