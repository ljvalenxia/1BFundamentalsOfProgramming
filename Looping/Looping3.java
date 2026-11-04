import java.util.Scanner;

public class Looping3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 20000.00;
        double amount;

        System.out.println("Initial Balance: $" + String.format("%.2f", balance));
        System.out.print("Enter the amount (0 to stop): ");
        amount = sc.nextDouble();

        while (amount != 0) {
            if (amount > 0) {
                balance += amount;

            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
        System.out.printf("Outstanding Balance: $%.2f%n", balance);
        System.out.print("Enter the amount (0 to stop): ");
        amount = sc.nextDouble();
        }
        System.out.printf("Final Balance: $%.2f%n", balance);
    }
}