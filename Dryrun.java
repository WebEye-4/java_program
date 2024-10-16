public class Dryrun {
    public static void main(String[] args)
    {
        String str="hello";
        for(int i=0;i<=str.length()-1;i++)
        {
            if('o'==str.charAt(i))
            {
                System.out.println(i);
                return;
            }
           
        }
    }
}
