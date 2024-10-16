
import java.io.*;
import java.util.*;

public class PrintfFrmt {
private static String name;
private static int age;
public static void setName_Age(String gName,int gAge)
{
name=gName;
age=gAge;
}
public static String getName()
{

    return name;
}
public static int getAge()
{
    return age;
}

    public static void main(String[] args)
    {
      
      
    Scanner sc=new Scanner(System.in);

     System.out.println("Enter your name");
  String n=sc.nextLine();
     System.out.println("Enter AGe");
   int a=sc.nextInt();
     
   setName_Age(n,a);
 System.out.printf("my name is %s and age %d",getName(),getAge());
      
    }
}
