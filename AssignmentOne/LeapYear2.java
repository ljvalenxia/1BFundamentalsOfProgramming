import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear2 {
    public static void main (String[] args){
        Scanner inputDevice = new Scanner(System.in);
        int year;
        try {
            System.out.print("Please Input the Year: ");
            year = inputDevice.nextInt();

            if ( year % 400 == 0){
                System.out.println(year + " is a leap year");
            }else if ( year % 100 == 0){
                System.out.println(year + " is not a leap year");
            }else if ( year % 4 == 0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }catch(InputMismatchException e){
            System.out.println("Error: Year must be a whole number");
        }finally{
            inputDevice.close();
        }
    }
}
