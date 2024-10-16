import java.util.StringTokenizer;
public class CountWord {
    public static void main(String[] args)
    {
       String inputstr="hello i am a java developer";
   CountWord obj=new CountWord();
       int counts=CntTkn(inputstr);
       int crc=CntTkn(inputstr);
     System.out.println("no of word is:- "+counts);

     System.out.println("number of character:-"+crc);


    }

    public static int CntTkn(String inputstr)
    {
         StringTokenizer tokenizer=new StringTokenizer(inputstr);

         int count=tokenizer.countTokens();
         
         boolean tkn=tokenizer.hasMoreElements();

         System.out.println(tkn);

         System.out.println("print all the tokens");
       
         while(tokenizer.hasMoreTokens())
         {
            System.out.println(tokenizer.nextElement());
         }

         int crc=0;
         while (tokenizer.hasMoreElements()) {
            String token=tokenizer.nextToken();
             crc=crc+token.length();
         }
 
         System.out.println("no of character is:="+crc);

         return count;
       
    }
}
