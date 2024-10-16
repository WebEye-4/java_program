import java.util.*;
public class Sbbuilder {
    public static void main(String[] args)
    {
        StringBuilder sb= new StringBuilder("hello");
        
        System.out.println(sb);

        System.out.println(sb.charAt(0));//find the character at any index


        //set char at any index

        sb.setCharAt(0, 'b');
System.out.println(sb);

//insert any char.. at any index
sb.insert(2,'l');
System.out.println(sb);
//delete any character from index to any index
sb.delete(2,3);
System.out.println(sb);
//append character (add char at last)
StringBuilder ab= new StringBuilder("h");
ab.append("e");
ab.append("ll");
ab.append("o");
System.out.println(ab);
System.out.println(sb.length());

    }
}
