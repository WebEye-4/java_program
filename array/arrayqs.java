package array;

public class arrayqs {
      static int []a=new int[5];
public static void main(String[] args)
{
                

           for(int i=0;i<a.length;i++)
          {
            a[i]=i+1;
          }
        // //   value which i want to insetrt at first
          

         insertAtfirst(10);
    
        //value which i want to isnert at last

       insertAtlast(70);

     //   insetAtposition(4,90) ;
          printarray(); 
    
}
public static void insertAtfirst(int val)
{

   for(int i=a.length-1;i>0;i--)
   {
      a[i]=a[i-1];

   }
   a[0]=val;

}
public static void insertAtlast(int n)
{
       //first slide all element then add value at last0
       
     for(int i=0;i<a.length-1;i++)
     {
             a[i]=a[i+1];
     }
     a[a.length-1]=n;
     


}

        public static void printarray()
{
          for(int i=0;i<a.length;i++)
          {
                  System.out.println(a[i]);

          }
}

public static void insetAtposition(int pos,int v)
{
    for(int i=pos;i<a.length;i++)
    {
        if(i!=a.length-1)
        {
             a[i]=a[i+1]; 
        }
    }
    a[pos-1]=v;
}


}
