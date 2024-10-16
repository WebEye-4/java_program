public class Elementocr {
    static int first=-1;
    static int last=-1;
    public static void occr(int idx,String str,char elem){
        if(idx==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        if(str.charAt(idx)==elem)
        {
            if(first==-1)
            {
                first=idx;
            }
            else{
                last=idx;
            }

        }
        occr(idx+1,str,elem);
    }
    public static void main(String[] args){
            String str="jjabcdsajakf";
         occr(0, str, 'a');
    }
}
