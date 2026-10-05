import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayrollBuffer{
    public static void main (String[] args){
        BufferedReader dataln = new BufferedReader (new InputStreamReader(System.in));

        try{
            System.out.print("Enter hourly pay rate: Php ");
            Double rate = Double.parseDouble(dataln.readLine());

            System.out.print("Enter hours worked: ");
            Double hours = Double.parseDouble(dataln.readLine());    

            double grossPay = hours * rate;
            double taxRate;

            if ( grossPay <= 2000){
                taxRate = 0.10;
            }else if( grossPay <= 4000){
                taxRate = 0.12;
            }else if ( grossPay <= 10000){
                taxRate = 0.15;
            }else{
                taxRate = 0.20;
            }

            double withholdingTax = grossPay *taxRate;
            double netPay = grossPay - withholdingTax;

            System.out.printf("Gross Pay: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax: Php %.2f%n", withholdingTax);
            System.out.printf("Net Pay: Php %.2f%n", netPay);

        }catch (IOException e){
            System.out.println("Input Error Occured");
        }catch (NumberFormatException e) {
            System.out.println("Please input valid numbers");
        }
    }
}