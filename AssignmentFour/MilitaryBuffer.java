import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilitaryBuffer{
    public static void main(String[] args) throws IOException{
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your height (in cm): ");
        double height = Double.parseDouble(dataln.readLine());

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(dataln.readLine());

        System.out.print("Are you a citizen of Planet Endor? (C/N): ");
        String citizenship = dataln.readLine();

        System.out.print("Are you Recommendee of Jedi Master Obi wan? (R/N): ");
        boolean isRecommendee = dataln.readLine().equalsIgnoreCase("R") ;

        if (height >= 200 && age > 21 && age < 25 && (citizenship.equalsIgnoreCase("C"))) {
            System.out.println("You are accepted for military service.");
        } else if (isRecommendee) {
            System.out.println("You are automatically accepted for military service.");
        }else {
            System.out.println("You are rejected for military service.");
        }

    }
}