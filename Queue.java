import java.util.*;
class Data{
    static int n=5;
    static int f=-1;
    static int r=-1;
  static int[] arr=new int[n];
    Scanner sc=new Scanner(System.in);
    
    void enqueue()
    {
        if(r==arr.length-1){
      System.out.println("Queue is overf flow");
        }
        else if(r==-1&&f==-1){
        r++;
        f++;
        System.out.println("Enter fthe value");
  int  a=sc.nextInt();
     arr[r]=a;
     System.out.println("value added!!");
    
        }
        else{
            System.out.println("Enter fthe value");
    int c=sc.nextInt();
            r++;
     arr[r]=c;
     System.out.println("value added!!");
     
        }
    }
    void dequeue()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("Queue is underflow");
        }
        else{
            f++;
            System.out.println("value Deleted");
        }
    }
    void display()
    {
        if(r==-1&&f==-1)
        {
            System.out.println("Queue id underflow");

        }
        else{
            System.out.println("Items are:");
            for(int i=f;i<=r;i++)
            { 
               
              System.out.println(arr[i]);  
            }
        }
    }
}


public class Queue {
    public static void main(String[] args)
    {
         int c;
   do{
   Data obj=new Data();
    Scanner sc=new Scanner(System.in);
    System.out.println("1-EnQ 2-DQ 3-Disp");
    int b=sc.nextInt();
    switch (b) {
        case 1:
            obj.enqueue();
            break;
    case 2:
    obj.dequeue();
    break;
    case 3:
    obj.display();
    break;
        default:
        System.out.println("choose correct one");
            break;
    }
    System.out.println("if you want exit press 1 else press 2");
    c=sc.nextInt();
   }while(c!=1);
    }

}
