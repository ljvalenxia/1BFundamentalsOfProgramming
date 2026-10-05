import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scholarshipBuffer{
    public static void main (String[] args){
        BufferedReader dataln = new BufferedReader (new InputStreamReader(System.in));

        try{
            System.out.print("Enter Your NSAT Score: ");
            int NSATscore = Integer.parseInt(dataln.readLine());

            System.out.print("Enter Your Family's Monthly Salary: ");
            int salary = Integer.parseInt(dataln.readLine());

            System.out.print("Enter Your Entrance Examination Score: ");
            int examScore = Integer.parseInt(dataln.readLine());

            int average = (NSATscore + examScore) / 2;

            if (NSATscore < 90 || salary > 10000 || examScore < 85){
                System.out.println("You are rejected for the scholarship.");
            } else if (NSATscore > 91 || salary < 3500 || examScore > 91) {
                System.out.println("You are accepted for the scholarship.");
            }else{
                System.out.println("For further study.");
            }
        }catch(IOException e){
            System.out.println("Input Error Occured");
        }catch(NumberFormatException e){
            System.out.println("Please enter valid numbers only.");
        }
    }
}