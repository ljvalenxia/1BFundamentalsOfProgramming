import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main (String [] args){
        BufferedReader dataln = new BufferedReader (new InputStreamReader(System.in));
        
        try{
        System.out.print("Please input the Year: ");
        int year = Integer.parseInt(dataln.readLine());

   
        if (year % 400 == 0){
            System.out.println(year + " is a leap year");
            }else if (year % 100 == 0){
            System.out.println(year + " is not a leap year");
            }else if (year % 4 == 0){
            System.out.println(year + " is a leap year");
            }else{
            System.out.println(year + " is not a leap year");
            }
        }catch (IOException e){
            System.out.println("Input error occured");
        }catch (NumberFormatException e){
            System.out.println("Please enter valid year");
        }
    }
}
