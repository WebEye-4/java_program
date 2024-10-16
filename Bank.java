import java.util.*;
public class Bank {
     
    static int balance;
    public static void bank()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("***Welcome To Bank***");
        System.out.println("Enter the pin");
        int pin=sc.nextInt();
if(pin==123)
      {
          System.out.println("select any option\n1:-check Balance\n2:-withdrawl \n3:-credit Balance");
      
       int key=sc.nextInt();
        switch(key)
        {
            case 1:
            checkbl();
            break;
            case 2:
            withdrawl();
            break;
            case 3:
            creditbl();
            break;
            default:
            System.out.println("choose valid option");
            break;
        }
      }else{
        System.out.println("incorrect pin");
      }

    }
    public static void checkbl()
    {
        System.out.println("Yor current balance is:-");
        System.out.println(balance);
    }
    public static void withdrawl()
    {
        System.out.println("Enter the amount wich you want to withdrawl");
       Scanner sc=new Scanner(System.in);
        int wit=sc.nextInt();
        if(balance>=wit)
        {
       balance=balance-wit;
       System.out.println("withdrawl succesfull!!");
       return;
       
        }
        else{
            System.out.println("Not Enough balance");
            return;
        }
    }
    public static void creditbl()
    {
        System.out.println("Enter the amount wich you want credit your account");
     Scanner sc=new Scanner(System.in);
     int cr=sc.nextInt();
     balance=balance+cr;
     System.out.println("your balance is credit your account");
     System.out.println("your current balance is :-");
     System.out.println(balance);

    }
   public static void deposite(){}
    public static void main(String[] args)
    {
        bank();

    }
}
