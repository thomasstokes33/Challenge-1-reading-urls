import java.util.regex.*;
public class Regextest {
    public static void main(String[] args) {
        Pattern rgx=Pattern.compile("a[bc]");
        Matcher results=rgx.matcher("abac");
        if (results.find()==true) {
            System.out.println(results.group());
        }
        
        //System.out.println(results.find());
    }

}
