public class ReverseString{
    public static void revst(String str ,int indx){
        if(indx==0)
        {
            System.out.print(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        revst(str,indx-1);
    }
    public static void main(String[] args){
    
        String str="abcd";
      revst(str,str.length()-1);
    }
}