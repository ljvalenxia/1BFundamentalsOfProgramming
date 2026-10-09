import java.util.Scanner;

public class MilitaryScanner {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter your height (in cm): ");
        double height = inputDevice.nextDouble();

        System.out.print("Enter your age: ");
        int age = inputDevice.nextInt();

        System.out.print("Are you citizen of Planet Endor? (C/N): ");
        String citizenship = inputDevice.next();

        System.out.print("Are you Recommendee of Jedi Master Obi wan? (R/N): ");
        boolean isRecommendee = inputDevice.next().equalsIgnoreCase("R");

        if (height >= 200 && age > 21 && age < 25 && (citizenship.equalsIgnoreCase("C"))) {
            System.out.println("You are accepted for military service.");
        } else if (isRecommendee) {
            System.out.println("You are automatically accepted for military service.");
        } else {
            System.out.println("You are rejected for military service.");
        }
    }
}
