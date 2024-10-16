import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String[] args)
    {

        //string tokenizer just divided the dtring into tokens

        StringTokenizer st=new StringTokenizer("hello my name is java");
      while(st.hasMoreTokens())//its method use for check token are available or not and its return boolean value
      {
        System.out.println(st.nextToken());
      }
   
    }
}
