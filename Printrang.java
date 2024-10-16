import java.util.*;
public class Printrang {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int s=sc.nextInt();
        int e=sc.nextInt();

        for(int i=s;i<e;i++)
        {
            System.out.print(str.charAt(i));
        }
 

    }
}
