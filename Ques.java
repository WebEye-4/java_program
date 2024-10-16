public class Ques{
    public static void main(String[] args)
    {
        String str="hello";
        String st="java";


           System.out.println(str.length()+st.length());

           int cmp=str.compareTo(st);

           if(cmp>0)

           {
            System.out.println("Yes");
           }
        if(cmp<0)
        {
            System.out.println("No");
        }
        
        String firstlettr=str.substring(0, 1);
        String remaining=str.substring(1,str.length());

        firstlettr=firstlettr.toUpperCase();

        str=firstlettr+remaining;
        
        String ssl=st.substring(0, 1);
        String srl=st.substring(1,st.length());

        ssl=ssl.toUpperCase();

        st=ssl+srl;
       
        System.out.println(str+" "+st);

    }
}