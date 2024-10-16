public class Ocurence {
    static int first=-1;
    static int last=-1;
    public static void ocu(String str,char element)
    {
    for(int i=0;i<=str.length()-1;i++)
    {
       
        if(element==str.charAt(i))
        {
            if(first==-1)
            {
                first=i;
            }
            else{
                last=i;
            }
        }
       
    }
    System.out.println(first);
    System.out.println(last);
    }
    public static void main(String[] args)
    {
  String str="bacdaionvkjdfkerjgachjf";
  ocu(str,'a');
    }
}
