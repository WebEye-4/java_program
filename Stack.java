import java.util.*;
class St{
static int top=-1;
   int n=5;
   int[] arr=new int[n];
   void pop()
   {
    if(top==-1)
    {
        System.out.println("Stack is underflow");
    }
    else{
        top--;
        
        System.out.println("element deleted");
    }
   }
   void push()
   {
    //System.out.println(arr.length-1);
    if(top==arr.length-1)
    {
        System.out.println("Stack is overflow");
        return;
    }
    else{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        top++;
        arr[top]=a;
        System.out.println("value added!!!");

    }
   }
   void diplay()
   {
      System.out.println("items are:");
    for(int i=0;i<=top;i++)
    {
        System.out.println();
      
        System.out.println(arr[i]);
    }
   }


}

public class Stack{
    public static void main(String[] args)
    {
    St obj=new St();
     int c;
    do{
        Scanner sc=new Scanner(System.in);
        System.out.println("1-push , 2-pop , 3-display");
        int b=sc.nextInt();
        switch (b) {
            case 1:
                obj.push();
                break;
        case 2:
        obj.pop();
        break;
        case 3:
        obj.diplay();
            default:
            System.out.println("choose correct one");
                break;
        }
        System.out.println("If you want exit press 1");
        c=sc.nextInt();
    }while(c!=1);
    }
}
