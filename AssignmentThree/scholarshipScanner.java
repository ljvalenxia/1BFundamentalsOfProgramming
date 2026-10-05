import java.util.InputMismatchException;
import java.util.Scanner;

public class scholarshipScanner {
    public static void main (String[] args){
        Scanner dataln = new Scanner(System.in);

        try{
            System.out.print("Enter Your NSAT Score: ");
            int NSATscore = dataln.nextInt();

            System.out.print("Enter Your Family's Monthly Salary: ");
            int salary = dataln.nextInt();

            System.out.print("Enter Your Entrance Examination Score:  ");
            int examScore = dataln.nextInt();

            if (NSATscore < 90 || salary > 10000 || examScore < 85){
                System.out.println("You are rejected for the scholarship.");
            } else if (NSATscore > 91 || salary < 3500 || examScore > 91) {
                System.out.println("You are accepted for the scholarship.");
            } else {
                System.out.println("For further study.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numbers only.");
        }catch (Exception e) {
            System.out.println("Input Error Occurred");
        } finally {
            dataln.close();
        }
    }
}
