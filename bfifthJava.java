import java.util.InputMismatchException;
import java.util.Scanner;

public class bfifthJava {
        public static void main(String[] args) {

        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please enter your name: ");
            name = inputDevice.nextLine();

            System.out.print("Please enter your age: ");
            //If the user typs text instead of number, it throws an error here 
            age = inputDevice.nextInt();

            //this only print if the age ewas entered correctly
            System.out.println("Your name is " + name +  " and you are " + age + " years old.");

        } catch (InputMismatchException e) {
            //Catches the crash and displays a friendly error message instead
            System.out.println("Error: Age must be a whole number.");
        } finally {
            //Always run, ensuring te scanner is closed to prevent memory leaks
            inputDevice.close();
        }
    }
}