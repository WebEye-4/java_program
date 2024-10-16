public class Backtracing {
    public static void permutation(String str, String perm)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permutation(newstr,  perm+currchar);
        }
    }
    public static void main(String[] args)
    {
        String str="ASIM";
   permutation(str,"");
    }
}
