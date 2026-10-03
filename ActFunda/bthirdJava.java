import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bthirdJava{
    public static void main (String[] args){
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        String name =""; System.out.print("Please enter Your Name: ");

        try{
            name = dataln.readLine();
        }catch( IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello " +name+ "!");
    }

}