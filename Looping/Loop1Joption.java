import javax.swing.*;

public class Loop1Joption {
    public static void main(String [] args){
        JOptionPane.showMessageDialog(null, "Enter 10 random numbers to find the highest and lowest number.");

        int num = 0;
        int highest = 0;
        int lowest = 0;

        for (int i = 1; i <= 10; i++) {
            String input = JOptionPane.showInputDialog("Enter a random number: ");
            num = Integer.parseInt(input);

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
        JOptionPane.showMessageDialog(null, "Highest: " + highest + "\nLowest: " + lowest);
    }
}