import java.util.*;
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
       
if(N%2!=0)
{
    System.out.println("Weird01");
}
if(N%2==0 && N>=2&&N<=5)
{
    System.out.println("Not Weird1");
}
 if(N%2==0&&N>=6&&N<=20)
{
    System.out.println("Weird2");
}
if(N>20)
{
    System.out.println("Not Weird3");
}
        scanner.close();
    }
}
