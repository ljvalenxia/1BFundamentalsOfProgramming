import java.util.InputMismatchException;
import java.util.Scanner;

public class PayrollScanner {
    public static void main (String[] args){
        Scanner inputDevice = new Scanner(System.in);

        try{
            System.out.print("Enter hourly pay rate: Php ");
            double rate = inputDevice.nextDouble();

            System.out.print("Enter hours worked: Php ");
            double hours = inputDevice.nextDouble();

            double grossPay = hours * rate;
            double taxRate;

            if ( grossPay <= 2000){
                taxRate = 0.10;
            }else if ( grossPay <= 4000){
                taxRate = 0.12;
            }else if ( grossPay <= 10000){
                taxRate = 0.15;
            }else{
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            System.out.printf("Gross Pay: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
            System.out.printf("Net Pay: Php %.2f%n", netPay);

        }catch (InputMismatchException e){
            System.out.print("Input Error Occured");
        }catch (NumberFormatException e){
            System.out.print("Please input valid number");
        }
    }
}
