public class Arrcopy {
  
        public static void main(String[] args)
        {
            int []a=new int[5];
            int []b=new int[5];
    
            for(int i=0;i<a.length;i++)
            {
                 a[i]=i+1;
            }
            int j=0;
            for(int i=a.length-1;i>=0;i--)
            {
                
                    b[j]=a[i];
                    j++;
                 
            }


            for(int i=0;i<a.length;i++)
            {
                System.out.println(b[i]);
            }
    
        }
    }
    
    

