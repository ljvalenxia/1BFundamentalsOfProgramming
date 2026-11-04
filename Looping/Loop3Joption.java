import javax.swing.*;

public class Loop3Joption {
    public static void main (String[] args){
        double balance = 20000.00;
        double amount; 

        String input = JOptionPane.showInputDialog("Initial Balance: $" + String.format("%.2f", balance) + "\nEnter the amount (0 to stop): ");
        amount = Double.parseDouble(input);

        while (amount != 0) {
            if (amount > 0) {
                balance += amount;

            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }
            JOptionPane.showMessageDialog(null, "Outstanding Balance: $" + String.format("%.2f", balance));
            input = JOptionPane.showInputDialog("Enter the amount (0 to stop): ");
            amount = Double.parseDouble(input);
        }
        JOptionPane.showMessageDialog(null, "Final Balance: $" + String.format("%.2f", balance));
    }
}
