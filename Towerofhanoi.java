public class Towerofhanoi {
    public static void hanoi(int n,String src,String dest,String helper)
    {
        if(n==1)
        {
          
            System.out.println("disk "+n+" moved from "+src+" " +dest);
            return;
        } 
        hanoi(n-1,src,helper,dest);
       System.out.println("disk "+n+" moved from "+src+" to " +dest);
        hanoi(n-1,helper,dest,src);
    }
    public static void main(String[] args)
    {
     int n=2;
     hanoi(n,"S","d","h");   
    }
}
