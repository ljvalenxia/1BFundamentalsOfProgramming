import java.util.Scanner;

public class Looping1{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    int num = 0;
    int highest = 0;
    int lowest = 0;

     for (int i = 1; i <= 10; i++) {
        System.out.print("Enter a random number: ");
        num = sc.nextInt();

        if (i == 1) {
                highest = num;
                lowest = num;
            }

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
       
    }
}