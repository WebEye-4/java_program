import java.util.*;
public class MatrixMul {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter then number of row");
        int row=sc.nextInt();
        System.out.println("Enter the no of column");
        int cl=sc.nextInt();
        int arr[][]=new int[row][cl];
        int arr2[][]=new int[row][cl];
        int [][]arr3=new int [row][cl];
System.out.println("enter the value for first mt");
       for(int i=0;i<row;i++)
       {
  for(int j=0;j<arr[i].length;j++)
  {
       arr[i][j]=sc.nextInt();
  }
       }
       System.out.println("enter the value for second mt");

       for(int i=0;i<row;i++)
       {
        for(int j=0;j<arr2[i].length;j++)
        {
             arr2[i][j]=sc.nextInt();

        }
       }
       System.out.println("Display");
          for(int i=0;i<row;i++)
       {
  for(int j=0;j<arr[i].length;j++)
  {
       System.out.print(arr[i][j]+" ");
  }
  System.out.println();
}

   for(int i=0;i<row;i++)
       {
  for(int j=0;j<arr[i].length;j++)
  {
      System.out.print(arr2[i][j]+" ");
  }
     System.out.println();      
}

 for(int i=0;i<arr3.length;i++)
       {
        for(int j=0;j<cl;j++)
        {
            for(int k=0;k<row;k++)
            {
           arr3[i][j]+=arr[i][k]*arr2[k][j];
            }
        }
       }

       System.out.println("result");
for(int i=0;i<row;i++)
       {
        for(int j=0;j<cl;j++)
        {
            System.out.print(arr3[i][j]+" ");

        }
        System.out.println();
       }

    }
}
