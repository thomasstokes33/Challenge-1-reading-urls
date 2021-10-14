import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class urls {
    public static void main(String[] args) {
        System.out.print("Type an input ");
        BufferedReader brInp=new BufferedReader(new InputStreamReader(System.in));
        String username;
        try{
            username=brInp.readLine();
        } catch (IOException ioe) {
            username="";
        }
        String newurl= "https://www.ecs.soton.ac.uk/people/";
        newurl=newurl+username;
        
        System.out.println(newurl);



    }
}