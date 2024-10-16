import java.util.*;
class Matrix{
public static void main(String[] args)
{
int a=3,b=3;
Scanner sc=new Scanner(System.in);
    int arr[][]=new int[a][b];
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
      // System.out.println("Enter value");
      arr[i][j]=sc.nextInt();
    }
}

for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
     System.out.println();
}

}
}