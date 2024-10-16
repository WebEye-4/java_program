class Gnrc{
    //i we want a method use for different type of passing argument every time then we use this
    public <E> void printArray(E []s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
    //we can use any symbol instead of <E>
}

public class Generic {
    public static void main(String[] args)
    {
  
      String counries[]={"india","pakistan","uae","america"};
      Integer number[]={70,50,50,80,40};//we use full name of data tyype. like here we use integer instead of int 
        Gnrc obj=new Gnrc();
        
        obj.printArray(counries);
        obj.printArray(number);

    }
}
